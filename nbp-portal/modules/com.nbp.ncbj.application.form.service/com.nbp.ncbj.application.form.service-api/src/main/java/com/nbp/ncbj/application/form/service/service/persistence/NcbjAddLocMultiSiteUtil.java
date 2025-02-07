/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.ncbj.application.form.service.model.NcbjAddLocMultiSite;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the ncbj add loc multi site service. This utility wraps <code>com.nbp.ncbj.application.form.service.service.persistence.impl.NcbjAddLocMultiSitePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NcbjAddLocMultiSitePersistence
 * @generated
 */
public class NcbjAddLocMultiSiteUtil {

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
	public static void clearCache(NcbjAddLocMultiSite ncbjAddLocMultiSite) {
		getPersistence().clearCache(ncbjAddLocMultiSite);
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
	public static Map<Serializable, NcbjAddLocMultiSite> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<NcbjAddLocMultiSite> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<NcbjAddLocMultiSite> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<NcbjAddLocMultiSite> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<NcbjAddLocMultiSite> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static NcbjAddLocMultiSite update(
		NcbjAddLocMultiSite ncbjAddLocMultiSite) {

		return getPersistence().update(ncbjAddLocMultiSite);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static NcbjAddLocMultiSite update(
		NcbjAddLocMultiSite ncbjAddLocMultiSite,
		ServiceContext serviceContext) {

		return getPersistence().update(ncbjAddLocMultiSite, serviceContext);
	}

	/**
	 * Returns the ncbj add loc multi site where ncbjApplicationId = &#63; or throws a <code>NoSuchNcbjAddLocMultiSiteException</code> if it could not be found.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj add loc multi site
	 * @throws NoSuchNcbjAddLocMultiSiteException if a matching ncbj add loc multi site could not be found
	 */
	public static NcbjAddLocMultiSite findBygetNCBJByAppId(
			long ncbjApplicationId)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjAddLocMultiSiteException {

		return getPersistence().findBygetNCBJByAppId(ncbjApplicationId);
	}

	/**
	 * Returns the ncbj add loc multi site where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj add loc multi site, or <code>null</code> if a matching ncbj add loc multi site could not be found
	 */
	public static NcbjAddLocMultiSite fetchBygetNCBJByAppId(
		long ncbjApplicationId) {

		return getPersistence().fetchBygetNCBJByAppId(ncbjApplicationId);
	}

	/**
	 * Returns the ncbj add loc multi site where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncbj add loc multi site, or <code>null</code> if a matching ncbj add loc multi site could not be found
	 */
	public static NcbjAddLocMultiSite fetchBygetNCBJByAppId(
		long ncbjApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetNCBJByAppId(
			ncbjApplicationId, useFinderCache);
	}

	/**
	 * Removes the ncbj add loc multi site where ncbjApplicationId = &#63; from the database.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the ncbj add loc multi site that was removed
	 */
	public static NcbjAddLocMultiSite removeBygetNCBJByAppId(
			long ncbjApplicationId)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjAddLocMultiSiteException {

		return getPersistence().removeBygetNCBJByAppId(ncbjApplicationId);
	}

	/**
	 * Returns the number of ncbj add loc multi sites where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the number of matching ncbj add loc multi sites
	 */
	public static int countBygetNCBJByAppId(long ncbjApplicationId) {
		return getPersistence().countBygetNCBJByAppId(ncbjApplicationId);
	}

	/**
	 * Caches the ncbj add loc multi site in the entity cache if it is enabled.
	 *
	 * @param ncbjAddLocMultiSite the ncbj add loc multi site
	 */
	public static void cacheResult(NcbjAddLocMultiSite ncbjAddLocMultiSite) {
		getPersistence().cacheResult(ncbjAddLocMultiSite);
	}

	/**
	 * Caches the ncbj add loc multi sites in the entity cache if it is enabled.
	 *
	 * @param ncbjAddLocMultiSites the ncbj add loc multi sites
	 */
	public static void cacheResult(
		List<NcbjAddLocMultiSite> ncbjAddLocMultiSites) {

		getPersistence().cacheResult(ncbjAddLocMultiSites);
	}

	/**
	 * Creates a new ncbj add loc multi site with the primary key. Does not add the ncbj add loc multi site to the database.
	 *
	 * @param ncbjAddLocMultiSiteId the primary key for the new ncbj add loc multi site
	 * @return the new ncbj add loc multi site
	 */
	public static NcbjAddLocMultiSite create(long ncbjAddLocMultiSiteId) {
		return getPersistence().create(ncbjAddLocMultiSiteId);
	}

	/**
	 * Removes the ncbj add loc multi site with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ncbjAddLocMultiSiteId the primary key of the ncbj add loc multi site
	 * @return the ncbj add loc multi site that was removed
	 * @throws NoSuchNcbjAddLocMultiSiteException if a ncbj add loc multi site with the primary key could not be found
	 */
	public static NcbjAddLocMultiSite remove(long ncbjAddLocMultiSiteId)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjAddLocMultiSiteException {

		return getPersistence().remove(ncbjAddLocMultiSiteId);
	}

	public static NcbjAddLocMultiSite updateImpl(
		NcbjAddLocMultiSite ncbjAddLocMultiSite) {

		return getPersistence().updateImpl(ncbjAddLocMultiSite);
	}

	/**
	 * Returns the ncbj add loc multi site with the primary key or throws a <code>NoSuchNcbjAddLocMultiSiteException</code> if it could not be found.
	 *
	 * @param ncbjAddLocMultiSiteId the primary key of the ncbj add loc multi site
	 * @return the ncbj add loc multi site
	 * @throws NoSuchNcbjAddLocMultiSiteException if a ncbj add loc multi site with the primary key could not be found
	 */
	public static NcbjAddLocMultiSite findByPrimaryKey(
			long ncbjAddLocMultiSiteId)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjAddLocMultiSiteException {

		return getPersistence().findByPrimaryKey(ncbjAddLocMultiSiteId);
	}

	/**
	 * Returns the ncbj add loc multi site with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ncbjAddLocMultiSiteId the primary key of the ncbj add loc multi site
	 * @return the ncbj add loc multi site, or <code>null</code> if a ncbj add loc multi site with the primary key could not be found
	 */
	public static NcbjAddLocMultiSite fetchByPrimaryKey(
		long ncbjAddLocMultiSiteId) {

		return getPersistence().fetchByPrimaryKey(ncbjAddLocMultiSiteId);
	}

	/**
	 * Returns all the ncbj add loc multi sites.
	 *
	 * @return the ncbj add loc multi sites
	 */
	public static List<NcbjAddLocMultiSite> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the ncbj add loc multi sites.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjAddLocMultiSiteModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj add loc multi sites
	 * @param end the upper bound of the range of ncbj add loc multi sites (not inclusive)
	 * @return the range of ncbj add loc multi sites
	 */
	public static List<NcbjAddLocMultiSite> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the ncbj add loc multi sites.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjAddLocMultiSiteModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj add loc multi sites
	 * @param end the upper bound of the range of ncbj add loc multi sites (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ncbj add loc multi sites
	 */
	public static List<NcbjAddLocMultiSite> findAll(
		int start, int end,
		OrderByComparator<NcbjAddLocMultiSite> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the ncbj add loc multi sites.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjAddLocMultiSiteModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj add loc multi sites
	 * @param end the upper bound of the range of ncbj add loc multi sites (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ncbj add loc multi sites
	 */
	public static List<NcbjAddLocMultiSite> findAll(
		int start, int end,
		OrderByComparator<NcbjAddLocMultiSite> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the ncbj add loc multi sites from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of ncbj add loc multi sites.
	 *
	 * @return the number of ncbj add loc multi sites
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static NcbjAddLocMultiSitePersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		NcbjAddLocMultiSitePersistence persistence) {

		_persistence = persistence;
	}

	private static volatile NcbjAddLocMultiSitePersistence _persistence;

}