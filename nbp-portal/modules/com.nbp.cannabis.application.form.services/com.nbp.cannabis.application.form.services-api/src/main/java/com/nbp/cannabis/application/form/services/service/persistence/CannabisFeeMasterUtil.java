/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.cannabis.application.form.services.model.CannabisFeeMaster;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the cannabis fee master service. This utility wraps <code>com.nbp.cannabis.application.form.services.service.persistence.impl.CannabisFeeMasterPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CannabisFeeMasterPersistence
 * @generated
 */
public class CannabisFeeMasterUtil {

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
	public static void clearCache(CannabisFeeMaster cannabisFeeMaster) {
		getPersistence().clearCache(cannabisFeeMaster);
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
	public static Map<Serializable, CannabisFeeMaster> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<CannabisFeeMaster> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CannabisFeeMaster> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CannabisFeeMaster> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<CannabisFeeMaster> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static CannabisFeeMaster update(
		CannabisFeeMaster cannabisFeeMaster) {

		return getPersistence().update(cannabisFeeMaster);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static CannabisFeeMaster update(
		CannabisFeeMaster cannabisFeeMaster, ServiceContext serviceContext) {

		return getPersistence().update(cannabisFeeMaster, serviceContext);
	}

	/**
	 * Returns the cannabis fee master where category = &#63; and subCategory = &#63; or throws a <code>NoSuchCannabisFeeMasterException</code> if it could not be found.
	 *
	 * @param category the category
	 * @param subCategory the sub category
	 * @return the matching cannabis fee master
	 * @throws NoSuchCannabisFeeMasterException if a matching cannabis fee master could not be found
	 */
	public static CannabisFeeMaster findBygetFee_by_CS(
			String category, String subCategory)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisFeeMasterException {

		return getPersistence().findBygetFee_by_CS(category, subCategory);
	}

	/**
	 * Returns the cannabis fee master where category = &#63; and subCategory = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param category the category
	 * @param subCategory the sub category
	 * @return the matching cannabis fee master, or <code>null</code> if a matching cannabis fee master could not be found
	 */
	public static CannabisFeeMaster fetchBygetFee_by_CS(
		String category, String subCategory) {

		return getPersistence().fetchBygetFee_by_CS(category, subCategory);
	}

	/**
	 * Returns the cannabis fee master where category = &#63; and subCategory = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param category the category
	 * @param subCategory the sub category
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cannabis fee master, or <code>null</code> if a matching cannabis fee master could not be found
	 */
	public static CannabisFeeMaster fetchBygetFee_by_CS(
		String category, String subCategory, boolean useFinderCache) {

		return getPersistence().fetchBygetFee_by_CS(
			category, subCategory, useFinderCache);
	}

	/**
	 * Removes the cannabis fee master where category = &#63; and subCategory = &#63; from the database.
	 *
	 * @param category the category
	 * @param subCategory the sub category
	 * @return the cannabis fee master that was removed
	 */
	public static CannabisFeeMaster removeBygetFee_by_CS(
			String category, String subCategory)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisFeeMasterException {

		return getPersistence().removeBygetFee_by_CS(category, subCategory);
	}

	/**
	 * Returns the number of cannabis fee masters where category = &#63; and subCategory = &#63;.
	 *
	 * @param category the category
	 * @param subCategory the sub category
	 * @return the number of matching cannabis fee masters
	 */
	public static int countBygetFee_by_CS(String category, String subCategory) {
		return getPersistence().countBygetFee_by_CS(category, subCategory);
	}

	/**
	 * Caches the cannabis fee master in the entity cache if it is enabled.
	 *
	 * @param cannabisFeeMaster the cannabis fee master
	 */
	public static void cacheResult(CannabisFeeMaster cannabisFeeMaster) {
		getPersistence().cacheResult(cannabisFeeMaster);
	}

	/**
	 * Caches the cannabis fee masters in the entity cache if it is enabled.
	 *
	 * @param cannabisFeeMasters the cannabis fee masters
	 */
	public static void cacheResult(List<CannabisFeeMaster> cannabisFeeMasters) {
		getPersistence().cacheResult(cannabisFeeMasters);
	}

	/**
	 * Creates a new cannabis fee master with the primary key. Does not add the cannabis fee master to the database.
	 *
	 * @param cannabisFeeMasterId the primary key for the new cannabis fee master
	 * @return the new cannabis fee master
	 */
	public static CannabisFeeMaster create(long cannabisFeeMasterId) {
		return getPersistence().create(cannabisFeeMasterId);
	}

	/**
	 * Removes the cannabis fee master with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param cannabisFeeMasterId the primary key of the cannabis fee master
	 * @return the cannabis fee master that was removed
	 * @throws NoSuchCannabisFeeMasterException if a cannabis fee master with the primary key could not be found
	 */
	public static CannabisFeeMaster remove(long cannabisFeeMasterId)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisFeeMasterException {

		return getPersistence().remove(cannabisFeeMasterId);
	}

	public static CannabisFeeMaster updateImpl(
		CannabisFeeMaster cannabisFeeMaster) {

		return getPersistence().updateImpl(cannabisFeeMaster);
	}

	/**
	 * Returns the cannabis fee master with the primary key or throws a <code>NoSuchCannabisFeeMasterException</code> if it could not be found.
	 *
	 * @param cannabisFeeMasterId the primary key of the cannabis fee master
	 * @return the cannabis fee master
	 * @throws NoSuchCannabisFeeMasterException if a cannabis fee master with the primary key could not be found
	 */
	public static CannabisFeeMaster findByPrimaryKey(long cannabisFeeMasterId)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisFeeMasterException {

		return getPersistence().findByPrimaryKey(cannabisFeeMasterId);
	}

	/**
	 * Returns the cannabis fee master with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param cannabisFeeMasterId the primary key of the cannabis fee master
	 * @return the cannabis fee master, or <code>null</code> if a cannabis fee master with the primary key could not be found
	 */
	public static CannabisFeeMaster fetchByPrimaryKey(
		long cannabisFeeMasterId) {

		return getPersistence().fetchByPrimaryKey(cannabisFeeMasterId);
	}

	/**
	 * Returns all the cannabis fee masters.
	 *
	 * @return the cannabis fee masters
	 */
	public static List<CannabisFeeMaster> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the cannabis fee masters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisFeeMasterModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis fee masters
	 * @param end the upper bound of the range of cannabis fee masters (not inclusive)
	 * @return the range of cannabis fee masters
	 */
	public static List<CannabisFeeMaster> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the cannabis fee masters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisFeeMasterModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis fee masters
	 * @param end the upper bound of the range of cannabis fee masters (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of cannabis fee masters
	 */
	public static List<CannabisFeeMaster> findAll(
		int start, int end,
		OrderByComparator<CannabisFeeMaster> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the cannabis fee masters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisFeeMasterModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis fee masters
	 * @param end the upper bound of the range of cannabis fee masters (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of cannabis fee masters
	 */
	public static List<CannabisFeeMaster> findAll(
		int start, int end,
		OrderByComparator<CannabisFeeMaster> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the cannabis fee masters from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of cannabis fee masters.
	 *
	 * @return the number of cannabis fee masters
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static CannabisFeeMasterPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		CannabisFeeMasterPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile CannabisFeeMasterPersistence _persistence;

}