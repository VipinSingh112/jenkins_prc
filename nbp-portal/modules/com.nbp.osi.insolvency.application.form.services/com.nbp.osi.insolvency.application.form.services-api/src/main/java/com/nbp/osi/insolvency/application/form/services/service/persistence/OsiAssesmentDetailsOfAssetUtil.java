/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.osi.insolvency.application.form.services.model.OsiAssesmentDetailsOfAsset;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the osi assesment details of asset service. This utility wraps <code>com.nbp.osi.insolvency.application.form.services.service.persistence.impl.OsiAssesmentDetailsOfAssetPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OsiAssesmentDetailsOfAssetPersistence
 * @generated
 */
public class OsiAssesmentDetailsOfAssetUtil {

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
		OsiAssesmentDetailsOfAsset osiAssesmentDetailsOfAsset) {

		getPersistence().clearCache(osiAssesmentDetailsOfAsset);
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
	public static Map<Serializable, OsiAssesmentDetailsOfAsset>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<OsiAssesmentDetailsOfAsset> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<OsiAssesmentDetailsOfAsset> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<OsiAssesmentDetailsOfAsset> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<OsiAssesmentDetailsOfAsset> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static OsiAssesmentDetailsOfAsset update(
		OsiAssesmentDetailsOfAsset osiAssesmentDetailsOfAsset) {

		return getPersistence().update(osiAssesmentDetailsOfAsset);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static OsiAssesmentDetailsOfAsset update(
		OsiAssesmentDetailsOfAsset osiAssesmentDetailsOfAsset,
		ServiceContext serviceContext) {

		return getPersistence().update(
			osiAssesmentDetailsOfAsset, serviceContext);
	}

	/**
	 * Returns the osi assesment details of asset where osiInsolvencyId = &#63; or throws a <code>NoSuchOsiAssesmentDetailsOfAssetException</code> if it could not be found.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching osi assesment details of asset
	 * @throws NoSuchOsiAssesmentDetailsOfAssetException if a matching osi assesment details of asset could not be found
	 */
	public static OsiAssesmentDetailsOfAsset findBygetOIP_OII(
			long osiInsolvencyId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchOsiAssesmentDetailsOfAssetException {

		return getPersistence().findBygetOIP_OII(osiInsolvencyId);
	}

	/**
	 * Returns the osi assesment details of asset where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching osi assesment details of asset, or <code>null</code> if a matching osi assesment details of asset could not be found
	 */
	public static OsiAssesmentDetailsOfAsset fetchBygetOIP_OII(
		long osiInsolvencyId) {

		return getPersistence().fetchBygetOIP_OII(osiInsolvencyId);
	}

	/**
	 * Returns the osi assesment details of asset where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi assesment details of asset, or <code>null</code> if a matching osi assesment details of asset could not be found
	 */
	public static OsiAssesmentDetailsOfAsset fetchBygetOIP_OII(
		long osiInsolvencyId, boolean useFinderCache) {

		return getPersistence().fetchBygetOIP_OII(
			osiInsolvencyId, useFinderCache);
	}

	/**
	 * Removes the osi assesment details of asset where osiInsolvencyId = &#63; from the database.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the osi assesment details of asset that was removed
	 */
	public static OsiAssesmentDetailsOfAsset removeBygetOIP_OII(
			long osiInsolvencyId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchOsiAssesmentDetailsOfAssetException {

		return getPersistence().removeBygetOIP_OII(osiInsolvencyId);
	}

	/**
	 * Returns the number of osi assesment details of assets where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the number of matching osi assesment details of assets
	 */
	public static int countBygetOIP_OII(long osiInsolvencyId) {
		return getPersistence().countBygetOIP_OII(osiInsolvencyId);
	}

	/**
	 * Caches the osi assesment details of asset in the entity cache if it is enabled.
	 *
	 * @param osiAssesmentDetailsOfAsset the osi assesment details of asset
	 */
	public static void cacheResult(
		OsiAssesmentDetailsOfAsset osiAssesmentDetailsOfAsset) {

		getPersistence().cacheResult(osiAssesmentDetailsOfAsset);
	}

	/**
	 * Caches the osi assesment details of assets in the entity cache if it is enabled.
	 *
	 * @param osiAssesmentDetailsOfAssets the osi assesment details of assets
	 */
	public static void cacheResult(
		List<OsiAssesmentDetailsOfAsset> osiAssesmentDetailsOfAssets) {

		getPersistence().cacheResult(osiAssesmentDetailsOfAssets);
	}

	/**
	 * Creates a new osi assesment details of asset with the primary key. Does not add the osi assesment details of asset to the database.
	 *
	 * @param osiAssetDetailsId the primary key for the new osi assesment details of asset
	 * @return the new osi assesment details of asset
	 */
	public static OsiAssesmentDetailsOfAsset create(long osiAssetDetailsId) {
		return getPersistence().create(osiAssetDetailsId);
	}

	/**
	 * Removes the osi assesment details of asset with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param osiAssetDetailsId the primary key of the osi assesment details of asset
	 * @return the osi assesment details of asset that was removed
	 * @throws NoSuchOsiAssesmentDetailsOfAssetException if a osi assesment details of asset with the primary key could not be found
	 */
	public static OsiAssesmentDetailsOfAsset remove(long osiAssetDetailsId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchOsiAssesmentDetailsOfAssetException {

		return getPersistence().remove(osiAssetDetailsId);
	}

	public static OsiAssesmentDetailsOfAsset updateImpl(
		OsiAssesmentDetailsOfAsset osiAssesmentDetailsOfAsset) {

		return getPersistence().updateImpl(osiAssesmentDetailsOfAsset);
	}

	/**
	 * Returns the osi assesment details of asset with the primary key or throws a <code>NoSuchOsiAssesmentDetailsOfAssetException</code> if it could not be found.
	 *
	 * @param osiAssetDetailsId the primary key of the osi assesment details of asset
	 * @return the osi assesment details of asset
	 * @throws NoSuchOsiAssesmentDetailsOfAssetException if a osi assesment details of asset with the primary key could not be found
	 */
	public static OsiAssesmentDetailsOfAsset findByPrimaryKey(
			long osiAssetDetailsId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchOsiAssesmentDetailsOfAssetException {

		return getPersistence().findByPrimaryKey(osiAssetDetailsId);
	}

	/**
	 * Returns the osi assesment details of asset with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param osiAssetDetailsId the primary key of the osi assesment details of asset
	 * @return the osi assesment details of asset, or <code>null</code> if a osi assesment details of asset with the primary key could not be found
	 */
	public static OsiAssesmentDetailsOfAsset fetchByPrimaryKey(
		long osiAssetDetailsId) {

		return getPersistence().fetchByPrimaryKey(osiAssetDetailsId);
	}

	/**
	 * Returns all the osi assesment details of assets.
	 *
	 * @return the osi assesment details of assets
	 */
	public static List<OsiAssesmentDetailsOfAsset> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the osi assesment details of assets.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiAssesmentDetailsOfAssetModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi assesment details of assets
	 * @param end the upper bound of the range of osi assesment details of assets (not inclusive)
	 * @return the range of osi assesment details of assets
	 */
	public static List<OsiAssesmentDetailsOfAsset> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the osi assesment details of assets.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiAssesmentDetailsOfAssetModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi assesment details of assets
	 * @param end the upper bound of the range of osi assesment details of assets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of osi assesment details of assets
	 */
	public static List<OsiAssesmentDetailsOfAsset> findAll(
		int start, int end,
		OrderByComparator<OsiAssesmentDetailsOfAsset> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the osi assesment details of assets.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiAssesmentDetailsOfAssetModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi assesment details of assets
	 * @param end the upper bound of the range of osi assesment details of assets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of osi assesment details of assets
	 */
	public static List<OsiAssesmentDetailsOfAsset> findAll(
		int start, int end,
		OrderByComparator<OsiAssesmentDetailsOfAsset> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the osi assesment details of assets from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of osi assesment details of assets.
	 *
	 * @return the number of osi assesment details of assets
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static OsiAssesmentDetailsOfAssetPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		OsiAssesmentDetailsOfAssetPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile OsiAssesmentDetailsOfAssetPersistence _persistence;

}