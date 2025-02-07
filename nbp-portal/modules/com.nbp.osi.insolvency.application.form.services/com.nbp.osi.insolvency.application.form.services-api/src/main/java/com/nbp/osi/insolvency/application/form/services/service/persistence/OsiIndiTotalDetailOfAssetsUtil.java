/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.osi.insolvency.application.form.services.model.OsiIndiTotalDetailOfAssets;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the osi indi total detail of assets service. This utility wraps <code>com.nbp.osi.insolvency.application.form.services.service.persistence.impl.OsiIndiTotalDetailOfAssetsPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OsiIndiTotalDetailOfAssetsPersistence
 * @generated
 */
public class OsiIndiTotalDetailOfAssetsUtil {

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
		OsiIndiTotalDetailOfAssets osiIndiTotalDetailOfAssets) {

		getPersistence().clearCache(osiIndiTotalDetailOfAssets);
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
	public static Map<Serializable, OsiIndiTotalDetailOfAssets>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<OsiIndiTotalDetailOfAssets> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<OsiIndiTotalDetailOfAssets> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<OsiIndiTotalDetailOfAssets> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<OsiIndiTotalDetailOfAssets> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static OsiIndiTotalDetailOfAssets update(
		OsiIndiTotalDetailOfAssets osiIndiTotalDetailOfAssets) {

		return getPersistence().update(osiIndiTotalDetailOfAssets);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static OsiIndiTotalDetailOfAssets update(
		OsiIndiTotalDetailOfAssets osiIndiTotalDetailOfAssets,
		ServiceContext serviceContext) {

		return getPersistence().update(
			osiIndiTotalDetailOfAssets, serviceContext);
	}

	/**
	 * Returns the osi indi total detail of assets where osiInsolvencyId = &#63; or throws a <code>NoSuchOsiIndiTotalDetailOfAssetsException</code> if it could not be found.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching osi indi total detail of assets
	 * @throws NoSuchOsiIndiTotalDetailOfAssetsException if a matching osi indi total detail of assets could not be found
	 */
	public static OsiIndiTotalDetailOfAssets findBygetOsiById(
			long osiInsolvencyId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchOsiIndiTotalDetailOfAssetsException {

		return getPersistence().findBygetOsiById(osiInsolvencyId);
	}

	/**
	 * Returns the osi indi total detail of assets where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching osi indi total detail of assets, or <code>null</code> if a matching osi indi total detail of assets could not be found
	 */
	public static OsiIndiTotalDetailOfAssets fetchBygetOsiById(
		long osiInsolvencyId) {

		return getPersistence().fetchBygetOsiById(osiInsolvencyId);
	}

	/**
	 * Returns the osi indi total detail of assets where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi indi total detail of assets, or <code>null</code> if a matching osi indi total detail of assets could not be found
	 */
	public static OsiIndiTotalDetailOfAssets fetchBygetOsiById(
		long osiInsolvencyId, boolean useFinderCache) {

		return getPersistence().fetchBygetOsiById(
			osiInsolvencyId, useFinderCache);
	}

	/**
	 * Removes the osi indi total detail of assets where osiInsolvencyId = &#63; from the database.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the osi indi total detail of assets that was removed
	 */
	public static OsiIndiTotalDetailOfAssets removeBygetOsiById(
			long osiInsolvencyId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchOsiIndiTotalDetailOfAssetsException {

		return getPersistence().removeBygetOsiById(osiInsolvencyId);
	}

	/**
	 * Returns the number of osi indi total detail of assetses where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the number of matching osi indi total detail of assetses
	 */
	public static int countBygetOsiById(long osiInsolvencyId) {
		return getPersistence().countBygetOsiById(osiInsolvencyId);
	}

	/**
	 * Caches the osi indi total detail of assets in the entity cache if it is enabled.
	 *
	 * @param osiIndiTotalDetailOfAssets the osi indi total detail of assets
	 */
	public static void cacheResult(
		OsiIndiTotalDetailOfAssets osiIndiTotalDetailOfAssets) {

		getPersistence().cacheResult(osiIndiTotalDetailOfAssets);
	}

	/**
	 * Caches the osi indi total detail of assetses in the entity cache if it is enabled.
	 *
	 * @param osiIndiTotalDetailOfAssetses the osi indi total detail of assetses
	 */
	public static void cacheResult(
		List<OsiIndiTotalDetailOfAssets> osiIndiTotalDetailOfAssetses) {

		getPersistence().cacheResult(osiIndiTotalDetailOfAssetses);
	}

	/**
	 * Creates a new osi indi total detail of assets with the primary key. Does not add the osi indi total detail of assets to the database.
	 *
	 * @param osiIndiTotalDetailOfAssetsId the primary key for the new osi indi total detail of assets
	 * @return the new osi indi total detail of assets
	 */
	public static OsiIndiTotalDetailOfAssets create(
		long osiIndiTotalDetailOfAssetsId) {

		return getPersistence().create(osiIndiTotalDetailOfAssetsId);
	}

	/**
	 * Removes the osi indi total detail of assets with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param osiIndiTotalDetailOfAssetsId the primary key of the osi indi total detail of assets
	 * @return the osi indi total detail of assets that was removed
	 * @throws NoSuchOsiIndiTotalDetailOfAssetsException if a osi indi total detail of assets with the primary key could not be found
	 */
	public static OsiIndiTotalDetailOfAssets remove(
			long osiIndiTotalDetailOfAssetsId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchOsiIndiTotalDetailOfAssetsException {

		return getPersistence().remove(osiIndiTotalDetailOfAssetsId);
	}

	public static OsiIndiTotalDetailOfAssets updateImpl(
		OsiIndiTotalDetailOfAssets osiIndiTotalDetailOfAssets) {

		return getPersistence().updateImpl(osiIndiTotalDetailOfAssets);
	}

	/**
	 * Returns the osi indi total detail of assets with the primary key or throws a <code>NoSuchOsiIndiTotalDetailOfAssetsException</code> if it could not be found.
	 *
	 * @param osiIndiTotalDetailOfAssetsId the primary key of the osi indi total detail of assets
	 * @return the osi indi total detail of assets
	 * @throws NoSuchOsiIndiTotalDetailOfAssetsException if a osi indi total detail of assets with the primary key could not be found
	 */
	public static OsiIndiTotalDetailOfAssets findByPrimaryKey(
			long osiIndiTotalDetailOfAssetsId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchOsiIndiTotalDetailOfAssetsException {

		return getPersistence().findByPrimaryKey(osiIndiTotalDetailOfAssetsId);
	}

	/**
	 * Returns the osi indi total detail of assets with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param osiIndiTotalDetailOfAssetsId the primary key of the osi indi total detail of assets
	 * @return the osi indi total detail of assets, or <code>null</code> if a osi indi total detail of assets with the primary key could not be found
	 */
	public static OsiIndiTotalDetailOfAssets fetchByPrimaryKey(
		long osiIndiTotalDetailOfAssetsId) {

		return getPersistence().fetchByPrimaryKey(osiIndiTotalDetailOfAssetsId);
	}

	/**
	 * Returns all the osi indi total detail of assetses.
	 *
	 * @return the osi indi total detail of assetses
	 */
	public static List<OsiIndiTotalDetailOfAssets> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the osi indi total detail of assetses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiIndiTotalDetailOfAssetsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi indi total detail of assetses
	 * @param end the upper bound of the range of osi indi total detail of assetses (not inclusive)
	 * @return the range of osi indi total detail of assetses
	 */
	public static List<OsiIndiTotalDetailOfAssets> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the osi indi total detail of assetses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiIndiTotalDetailOfAssetsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi indi total detail of assetses
	 * @param end the upper bound of the range of osi indi total detail of assetses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of osi indi total detail of assetses
	 */
	public static List<OsiIndiTotalDetailOfAssets> findAll(
		int start, int end,
		OrderByComparator<OsiIndiTotalDetailOfAssets> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the osi indi total detail of assetses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiIndiTotalDetailOfAssetsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi indi total detail of assetses
	 * @param end the upper bound of the range of osi indi total detail of assetses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of osi indi total detail of assetses
	 */
	public static List<OsiIndiTotalDetailOfAssets> findAll(
		int start, int end,
		OrderByComparator<OsiIndiTotalDetailOfAssets> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the osi indi total detail of assetses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of osi indi total detail of assetses.
	 *
	 * @return the number of osi indi total detail of assetses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static OsiIndiTotalDetailOfAssetsPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		OsiIndiTotalDetailOfAssetsPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile OsiIndiTotalDetailOfAssetsPersistence _persistence;

}