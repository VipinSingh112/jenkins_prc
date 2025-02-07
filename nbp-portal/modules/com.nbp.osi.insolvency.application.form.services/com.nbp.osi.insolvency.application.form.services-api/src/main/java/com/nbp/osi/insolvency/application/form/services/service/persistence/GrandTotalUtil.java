/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.osi.insolvency.application.form.services.model.GrandTotal;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the grand total service. This utility wraps <code>com.nbp.osi.insolvency.application.form.services.service.persistence.impl.GrandTotalPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see GrandTotalPersistence
 * @generated
 */
public class GrandTotalUtil {

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
	public static void clearCache(GrandTotal grandTotal) {
		getPersistence().clearCache(grandTotal);
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
	public static Map<Serializable, GrandTotal> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<GrandTotal> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<GrandTotal> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<GrandTotal> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<GrandTotal> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static GrandTotal update(GrandTotal grandTotal) {
		return getPersistence().update(grandTotal);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static GrandTotal update(
		GrandTotal grandTotal, ServiceContext serviceContext) {

		return getPersistence().update(grandTotal, serviceContext);
	}

	/**
	 * Returns the grand total where osiInsolvencyId = &#63; or throws a <code>NoSuchGrandTotalException</code> if it could not be found.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching grand total
	 * @throws NoSuchGrandTotalException if a matching grand total could not be found
	 */
	public static GrandTotal findBygetOsiById(long osiInsolvencyId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchGrandTotalException {

		return getPersistence().findBygetOsiById(osiInsolvencyId);
	}

	/**
	 * Returns the grand total where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching grand total, or <code>null</code> if a matching grand total could not be found
	 */
	public static GrandTotal fetchBygetOsiById(long osiInsolvencyId) {
		return getPersistence().fetchBygetOsiById(osiInsolvencyId);
	}

	/**
	 * Returns the grand total where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching grand total, or <code>null</code> if a matching grand total could not be found
	 */
	public static GrandTotal fetchBygetOsiById(
		long osiInsolvencyId, boolean useFinderCache) {

		return getPersistence().fetchBygetOsiById(
			osiInsolvencyId, useFinderCache);
	}

	/**
	 * Removes the grand total where osiInsolvencyId = &#63; from the database.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the grand total that was removed
	 */
	public static GrandTotal removeBygetOsiById(long osiInsolvencyId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchGrandTotalException {

		return getPersistence().removeBygetOsiById(osiInsolvencyId);
	}

	/**
	 * Returns the number of grand totals where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the number of matching grand totals
	 */
	public static int countBygetOsiById(long osiInsolvencyId) {
		return getPersistence().countBygetOsiById(osiInsolvencyId);
	}

	/**
	 * Caches the grand total in the entity cache if it is enabled.
	 *
	 * @param grandTotal the grand total
	 */
	public static void cacheResult(GrandTotal grandTotal) {
		getPersistence().cacheResult(grandTotal);
	}

	/**
	 * Caches the grand totals in the entity cache if it is enabled.
	 *
	 * @param grandTotals the grand totals
	 */
	public static void cacheResult(List<GrandTotal> grandTotals) {
		getPersistence().cacheResult(grandTotals);
	}

	/**
	 * Creates a new grand total with the primary key. Does not add the grand total to the database.
	 *
	 * @param grandTotalId the primary key for the new grand total
	 * @return the new grand total
	 */
	public static GrandTotal create(long grandTotalId) {
		return getPersistence().create(grandTotalId);
	}

	/**
	 * Removes the grand total with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param grandTotalId the primary key of the grand total
	 * @return the grand total that was removed
	 * @throws NoSuchGrandTotalException if a grand total with the primary key could not be found
	 */
	public static GrandTotal remove(long grandTotalId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchGrandTotalException {

		return getPersistence().remove(grandTotalId);
	}

	public static GrandTotal updateImpl(GrandTotal grandTotal) {
		return getPersistence().updateImpl(grandTotal);
	}

	/**
	 * Returns the grand total with the primary key or throws a <code>NoSuchGrandTotalException</code> if it could not be found.
	 *
	 * @param grandTotalId the primary key of the grand total
	 * @return the grand total
	 * @throws NoSuchGrandTotalException if a grand total with the primary key could not be found
	 */
	public static GrandTotal findByPrimaryKey(long grandTotalId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchGrandTotalException {

		return getPersistence().findByPrimaryKey(grandTotalId);
	}

	/**
	 * Returns the grand total with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param grandTotalId the primary key of the grand total
	 * @return the grand total, or <code>null</code> if a grand total with the primary key could not be found
	 */
	public static GrandTotal fetchByPrimaryKey(long grandTotalId) {
		return getPersistence().fetchByPrimaryKey(grandTotalId);
	}

	/**
	 * Returns all the grand totals.
	 *
	 * @return the grand totals
	 */
	public static List<GrandTotal> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the grand totals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GrandTotalModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of grand totals
	 * @param end the upper bound of the range of grand totals (not inclusive)
	 * @return the range of grand totals
	 */
	public static List<GrandTotal> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the grand totals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GrandTotalModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of grand totals
	 * @param end the upper bound of the range of grand totals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of grand totals
	 */
	public static List<GrandTotal> findAll(
		int start, int end, OrderByComparator<GrandTotal> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the grand totals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GrandTotalModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of grand totals
	 * @param end the upper bound of the range of grand totals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of grand totals
	 */
	public static List<GrandTotal> findAll(
		int start, int end, OrderByComparator<GrandTotal> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the grand totals from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of grand totals.
	 *
	 * @return the number of grand totals
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static GrandTotalPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(GrandTotalPersistence persistence) {
		_persistence = persistence;
	}

	private static volatile GrandTotalPersistence _persistence;

}