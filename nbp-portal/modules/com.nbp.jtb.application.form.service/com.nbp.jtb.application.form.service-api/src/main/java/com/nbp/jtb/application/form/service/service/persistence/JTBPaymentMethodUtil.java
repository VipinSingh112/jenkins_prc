/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.jtb.application.form.service.model.JTBPaymentMethod;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the jtb payment method service. This utility wraps <code>com.nbp.jtb.application.form.service.service.persistence.impl.JTBPaymentMethodPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JTBPaymentMethodPersistence
 * @generated
 */
public class JTBPaymentMethodUtil {

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
	public static void clearCache(JTBPaymentMethod jtbPaymentMethod) {
		getPersistence().clearCache(jtbPaymentMethod);
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
	public static Map<Serializable, JTBPaymentMethod> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<JTBPaymentMethod> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<JTBPaymentMethod> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<JTBPaymentMethod> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<JTBPaymentMethod> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static JTBPaymentMethod update(JTBPaymentMethod jtbPaymentMethod) {
		return getPersistence().update(jtbPaymentMethod);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static JTBPaymentMethod update(
		JTBPaymentMethod jtbPaymentMethod, ServiceContext serviceContext) {

		return getPersistence().update(jtbPaymentMethod, serviceContext);
	}

	/**
	 * Returns the jtb payment method where jtbApplicationId = &#63; or throws a <code>NoSuchJTBPaymentMethodException</code> if it could not be found.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching jtb payment method
	 * @throws NoSuchJTBPaymentMethodException if a matching jtb payment method could not be found
	 */
	public static JTBPaymentMethod findBygetJTBById(long jtbApplicationId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchJTBPaymentMethodException {

		return getPersistence().findBygetJTBById(jtbApplicationId);
	}

	/**
	 * Returns the jtb payment method where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching jtb payment method, or <code>null</code> if a matching jtb payment method could not be found
	 */
	public static JTBPaymentMethod fetchBygetJTBById(long jtbApplicationId) {
		return getPersistence().fetchBygetJTBById(jtbApplicationId);
	}

	/**
	 * Returns the jtb payment method where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jtb payment method, or <code>null</code> if a matching jtb payment method could not be found
	 */
	public static JTBPaymentMethod fetchBygetJTBById(
		long jtbApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetJTBById(
			jtbApplicationId, useFinderCache);
	}

	/**
	 * Removes the jtb payment method where jtbApplicationId = &#63; from the database.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the jtb payment method that was removed
	 */
	public static JTBPaymentMethod removeBygetJTBById(long jtbApplicationId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchJTBPaymentMethodException {

		return getPersistence().removeBygetJTBById(jtbApplicationId);
	}

	/**
	 * Returns the number of jtb payment methods where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the number of matching jtb payment methods
	 */
	public static int countBygetJTBById(long jtbApplicationId) {
		return getPersistence().countBygetJTBById(jtbApplicationId);
	}

	/**
	 * Caches the jtb payment method in the entity cache if it is enabled.
	 *
	 * @param jtbPaymentMethod the jtb payment method
	 */
	public static void cacheResult(JTBPaymentMethod jtbPaymentMethod) {
		getPersistence().cacheResult(jtbPaymentMethod);
	}

	/**
	 * Caches the jtb payment methods in the entity cache if it is enabled.
	 *
	 * @param jtbPaymentMethods the jtb payment methods
	 */
	public static void cacheResult(List<JTBPaymentMethod> jtbPaymentMethods) {
		getPersistence().cacheResult(jtbPaymentMethods);
	}

	/**
	 * Creates a new jtb payment method with the primary key. Does not add the jtb payment method to the database.
	 *
	 * @param jTBPaymentMethodId the primary key for the new jtb payment method
	 * @return the new jtb payment method
	 */
	public static JTBPaymentMethod create(long jTBPaymentMethodId) {
		return getPersistence().create(jTBPaymentMethodId);
	}

	/**
	 * Removes the jtb payment method with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param jTBPaymentMethodId the primary key of the jtb payment method
	 * @return the jtb payment method that was removed
	 * @throws NoSuchJTBPaymentMethodException if a jtb payment method with the primary key could not be found
	 */
	public static JTBPaymentMethod remove(long jTBPaymentMethodId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchJTBPaymentMethodException {

		return getPersistence().remove(jTBPaymentMethodId);
	}

	public static JTBPaymentMethod updateImpl(
		JTBPaymentMethod jtbPaymentMethod) {

		return getPersistence().updateImpl(jtbPaymentMethod);
	}

	/**
	 * Returns the jtb payment method with the primary key or throws a <code>NoSuchJTBPaymentMethodException</code> if it could not be found.
	 *
	 * @param jTBPaymentMethodId the primary key of the jtb payment method
	 * @return the jtb payment method
	 * @throws NoSuchJTBPaymentMethodException if a jtb payment method with the primary key could not be found
	 */
	public static JTBPaymentMethod findByPrimaryKey(long jTBPaymentMethodId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchJTBPaymentMethodException {

		return getPersistence().findByPrimaryKey(jTBPaymentMethodId);
	}

	/**
	 * Returns the jtb payment method with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param jTBPaymentMethodId the primary key of the jtb payment method
	 * @return the jtb payment method, or <code>null</code> if a jtb payment method with the primary key could not be found
	 */
	public static JTBPaymentMethod fetchByPrimaryKey(long jTBPaymentMethodId) {
		return getPersistence().fetchByPrimaryKey(jTBPaymentMethodId);
	}

	/**
	 * Returns all the jtb payment methods.
	 *
	 * @return the jtb payment methods
	 */
	public static List<JTBPaymentMethod> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the jtb payment methods.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JTBPaymentMethodModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb payment methods
	 * @param end the upper bound of the range of jtb payment methods (not inclusive)
	 * @return the range of jtb payment methods
	 */
	public static List<JTBPaymentMethod> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the jtb payment methods.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JTBPaymentMethodModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb payment methods
	 * @param end the upper bound of the range of jtb payment methods (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of jtb payment methods
	 */
	public static List<JTBPaymentMethod> findAll(
		int start, int end,
		OrderByComparator<JTBPaymentMethod> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the jtb payment methods.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JTBPaymentMethodModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb payment methods
	 * @param end the upper bound of the range of jtb payment methods (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of jtb payment methods
	 */
	public static List<JTBPaymentMethod> findAll(
		int start, int end,
		OrderByComparator<JTBPaymentMethod> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the jtb payment methods from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of jtb payment methods.
	 *
	 * @return the number of jtb payment methods
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static JTBPaymentMethodPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(JTBPaymentMethodPersistence persistence) {
		_persistence = persistence;
	}

	private static volatile JTBPaymentMethodPersistence _persistence;

}