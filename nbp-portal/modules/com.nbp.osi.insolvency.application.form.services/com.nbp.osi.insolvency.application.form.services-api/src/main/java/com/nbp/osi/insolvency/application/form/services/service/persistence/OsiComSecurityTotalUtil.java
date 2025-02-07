/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.osi.insolvency.application.form.services.model.OsiComSecurityTotal;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the osi com security total service. This utility wraps <code>com.nbp.osi.insolvency.application.form.services.service.persistence.impl.OsiComSecurityTotalPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OsiComSecurityTotalPersistence
 * @generated
 */
public class OsiComSecurityTotalUtil {

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
	public static void clearCache(OsiComSecurityTotal osiComSecurityTotal) {
		getPersistence().clearCache(osiComSecurityTotal);
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
	public static Map<Serializable, OsiComSecurityTotal> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<OsiComSecurityTotal> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<OsiComSecurityTotal> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<OsiComSecurityTotal> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<OsiComSecurityTotal> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static OsiComSecurityTotal update(
		OsiComSecurityTotal osiComSecurityTotal) {

		return getPersistence().update(osiComSecurityTotal);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static OsiComSecurityTotal update(
		OsiComSecurityTotal osiComSecurityTotal,
		ServiceContext serviceContext) {

		return getPersistence().update(osiComSecurityTotal, serviceContext);
	}

	/**
	 * Returns the osi com security total where osiInsolvencyId = &#63; or throws a <code>NoSuchOsiComSecurityTotalException</code> if it could not be found.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching osi com security total
	 * @throws NoSuchOsiComSecurityTotalException if a matching osi com security total could not be found
	 */
	public static OsiComSecurityTotal findBygetOsiById(long osiInsolvencyId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchOsiComSecurityTotalException {

		return getPersistence().findBygetOsiById(osiInsolvencyId);
	}

	/**
	 * Returns the osi com security total where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching osi com security total, or <code>null</code> if a matching osi com security total could not be found
	 */
	public static OsiComSecurityTotal fetchBygetOsiById(long osiInsolvencyId) {
		return getPersistence().fetchBygetOsiById(osiInsolvencyId);
	}

	/**
	 * Returns the osi com security total where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi com security total, or <code>null</code> if a matching osi com security total could not be found
	 */
	public static OsiComSecurityTotal fetchBygetOsiById(
		long osiInsolvencyId, boolean useFinderCache) {

		return getPersistence().fetchBygetOsiById(
			osiInsolvencyId, useFinderCache);
	}

	/**
	 * Removes the osi com security total where osiInsolvencyId = &#63; from the database.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the osi com security total that was removed
	 */
	public static OsiComSecurityTotal removeBygetOsiById(long osiInsolvencyId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchOsiComSecurityTotalException {

		return getPersistence().removeBygetOsiById(osiInsolvencyId);
	}

	/**
	 * Returns the number of osi com security totals where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the number of matching osi com security totals
	 */
	public static int countBygetOsiById(long osiInsolvencyId) {
		return getPersistence().countBygetOsiById(osiInsolvencyId);
	}

	/**
	 * Caches the osi com security total in the entity cache if it is enabled.
	 *
	 * @param osiComSecurityTotal the osi com security total
	 */
	public static void cacheResult(OsiComSecurityTotal osiComSecurityTotal) {
		getPersistence().cacheResult(osiComSecurityTotal);
	}

	/**
	 * Caches the osi com security totals in the entity cache if it is enabled.
	 *
	 * @param osiComSecurityTotals the osi com security totals
	 */
	public static void cacheResult(
		List<OsiComSecurityTotal> osiComSecurityTotals) {

		getPersistence().cacheResult(osiComSecurityTotals);
	}

	/**
	 * Creates a new osi com security total with the primary key. Does not add the osi com security total to the database.
	 *
	 * @param osiComSecurityTotalId the primary key for the new osi com security total
	 * @return the new osi com security total
	 */
	public static OsiComSecurityTotal create(long osiComSecurityTotalId) {
		return getPersistence().create(osiComSecurityTotalId);
	}

	/**
	 * Removes the osi com security total with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param osiComSecurityTotalId the primary key of the osi com security total
	 * @return the osi com security total that was removed
	 * @throws NoSuchOsiComSecurityTotalException if a osi com security total with the primary key could not be found
	 */
	public static OsiComSecurityTotal remove(long osiComSecurityTotalId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchOsiComSecurityTotalException {

		return getPersistence().remove(osiComSecurityTotalId);
	}

	public static OsiComSecurityTotal updateImpl(
		OsiComSecurityTotal osiComSecurityTotal) {

		return getPersistence().updateImpl(osiComSecurityTotal);
	}

	/**
	 * Returns the osi com security total with the primary key or throws a <code>NoSuchOsiComSecurityTotalException</code> if it could not be found.
	 *
	 * @param osiComSecurityTotalId the primary key of the osi com security total
	 * @return the osi com security total
	 * @throws NoSuchOsiComSecurityTotalException if a osi com security total with the primary key could not be found
	 */
	public static OsiComSecurityTotal findByPrimaryKey(
			long osiComSecurityTotalId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchOsiComSecurityTotalException {

		return getPersistence().findByPrimaryKey(osiComSecurityTotalId);
	}

	/**
	 * Returns the osi com security total with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param osiComSecurityTotalId the primary key of the osi com security total
	 * @return the osi com security total, or <code>null</code> if a osi com security total with the primary key could not be found
	 */
	public static OsiComSecurityTotal fetchByPrimaryKey(
		long osiComSecurityTotalId) {

		return getPersistence().fetchByPrimaryKey(osiComSecurityTotalId);
	}

	/**
	 * Returns all the osi com security totals.
	 *
	 * @return the osi com security totals
	 */
	public static List<OsiComSecurityTotal> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the osi com security totals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiComSecurityTotalModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi com security totals
	 * @param end the upper bound of the range of osi com security totals (not inclusive)
	 * @return the range of osi com security totals
	 */
	public static List<OsiComSecurityTotal> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the osi com security totals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiComSecurityTotalModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi com security totals
	 * @param end the upper bound of the range of osi com security totals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of osi com security totals
	 */
	public static List<OsiComSecurityTotal> findAll(
		int start, int end,
		OrderByComparator<OsiComSecurityTotal> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the osi com security totals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiComSecurityTotalModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi com security totals
	 * @param end the upper bound of the range of osi com security totals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of osi com security totals
	 */
	public static List<OsiComSecurityTotal> findAll(
		int start, int end,
		OrderByComparator<OsiComSecurityTotal> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the osi com security totals from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of osi com security totals.
	 *
	 * @return the number of osi com security totals
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static OsiComSecurityTotalPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		OsiComSecurityTotalPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile OsiComSecurityTotalPersistence _persistence;

}