/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.osi.insolvency.application.form.services.model.AssetsUsedAsSecurity;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the assets used as security service. This utility wraps <code>com.nbp.osi.insolvency.application.form.services.service.persistence.impl.AssetsUsedAsSecurityPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AssetsUsedAsSecurityPersistence
 * @generated
 */
public class AssetsUsedAsSecurityUtil {

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
	public static void clearCache(AssetsUsedAsSecurity assetsUsedAsSecurity) {
		getPersistence().clearCache(assetsUsedAsSecurity);
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
	public static Map<Serializable, AssetsUsedAsSecurity> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AssetsUsedAsSecurity> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AssetsUsedAsSecurity> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AssetsUsedAsSecurity> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AssetsUsedAsSecurity> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AssetsUsedAsSecurity update(
		AssetsUsedAsSecurity assetsUsedAsSecurity) {

		return getPersistence().update(assetsUsedAsSecurity);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AssetsUsedAsSecurity update(
		AssetsUsedAsSecurity assetsUsedAsSecurity,
		ServiceContext serviceContext) {

		return getPersistence().update(assetsUsedAsSecurity, serviceContext);
	}

	/**
	 * Returns all the assets used as securities where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching assets used as securities
	 */
	public static List<AssetsUsedAsSecurity> findBygetOsiById(
		long osiInsolvencyId) {

		return getPersistence().findBygetOsiById(osiInsolvencyId);
	}

	/**
	 * Returns a range of all the assets used as securities where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssetsUsedAsSecurityModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of assets used as securities
	 * @param end the upper bound of the range of assets used as securities (not inclusive)
	 * @return the range of matching assets used as securities
	 */
	public static List<AssetsUsedAsSecurity> findBygetOsiById(
		long osiInsolvencyId, int start, int end) {

		return getPersistence().findBygetOsiById(osiInsolvencyId, start, end);
	}

	/**
	 * Returns an ordered range of all the assets used as securities where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssetsUsedAsSecurityModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of assets used as securities
	 * @param end the upper bound of the range of assets used as securities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching assets used as securities
	 */
	public static List<AssetsUsedAsSecurity> findBygetOsiById(
		long osiInsolvencyId, int start, int end,
		OrderByComparator<AssetsUsedAsSecurity> orderByComparator) {

		return getPersistence().findBygetOsiById(
			osiInsolvencyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the assets used as securities where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssetsUsedAsSecurityModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of assets used as securities
	 * @param end the upper bound of the range of assets used as securities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching assets used as securities
	 */
	public static List<AssetsUsedAsSecurity> findBygetOsiById(
		long osiInsolvencyId, int start, int end,
		OrderByComparator<AssetsUsedAsSecurity> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetOsiById(
			osiInsolvencyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first assets used as security in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assets used as security
	 * @throws NoSuchAssetsUsedAsSecurityException if a matching assets used as security could not be found
	 */
	public static AssetsUsedAsSecurity findBygetOsiById_First(
			long osiInsolvencyId,
			OrderByComparator<AssetsUsedAsSecurity> orderByComparator)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchAssetsUsedAsSecurityException {

		return getPersistence().findBygetOsiById_First(
			osiInsolvencyId, orderByComparator);
	}

	/**
	 * Returns the first assets used as security in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assets used as security, or <code>null</code> if a matching assets used as security could not be found
	 */
	public static AssetsUsedAsSecurity fetchBygetOsiById_First(
		long osiInsolvencyId,
		OrderByComparator<AssetsUsedAsSecurity> orderByComparator) {

		return getPersistence().fetchBygetOsiById_First(
			osiInsolvencyId, orderByComparator);
	}

	/**
	 * Returns the last assets used as security in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assets used as security
	 * @throws NoSuchAssetsUsedAsSecurityException if a matching assets used as security could not be found
	 */
	public static AssetsUsedAsSecurity findBygetOsiById_Last(
			long osiInsolvencyId,
			OrderByComparator<AssetsUsedAsSecurity> orderByComparator)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchAssetsUsedAsSecurityException {

		return getPersistence().findBygetOsiById_Last(
			osiInsolvencyId, orderByComparator);
	}

	/**
	 * Returns the last assets used as security in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assets used as security, or <code>null</code> if a matching assets used as security could not be found
	 */
	public static AssetsUsedAsSecurity fetchBygetOsiById_Last(
		long osiInsolvencyId,
		OrderByComparator<AssetsUsedAsSecurity> orderByComparator) {

		return getPersistence().fetchBygetOsiById_Last(
			osiInsolvencyId, orderByComparator);
	}

	/**
	 * Returns the assets used as securities before and after the current assets used as security in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param assetsUsedAsSecurityId the primary key of the current assets used as security
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next assets used as security
	 * @throws NoSuchAssetsUsedAsSecurityException if a assets used as security with the primary key could not be found
	 */
	public static AssetsUsedAsSecurity[] findBygetOsiById_PrevAndNext(
			long assetsUsedAsSecurityId, long osiInsolvencyId,
			OrderByComparator<AssetsUsedAsSecurity> orderByComparator)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchAssetsUsedAsSecurityException {

		return getPersistence().findBygetOsiById_PrevAndNext(
			assetsUsedAsSecurityId, osiInsolvencyId, orderByComparator);
	}

	/**
	 * Removes all the assets used as securities where osiInsolvencyId = &#63; from the database.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 */
	public static void removeBygetOsiById(long osiInsolvencyId) {
		getPersistence().removeBygetOsiById(osiInsolvencyId);
	}

	/**
	 * Returns the number of assets used as securities where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the number of matching assets used as securities
	 */
	public static int countBygetOsiById(long osiInsolvencyId) {
		return getPersistence().countBygetOsiById(osiInsolvencyId);
	}

	/**
	 * Caches the assets used as security in the entity cache if it is enabled.
	 *
	 * @param assetsUsedAsSecurity the assets used as security
	 */
	public static void cacheResult(AssetsUsedAsSecurity assetsUsedAsSecurity) {
		getPersistence().cacheResult(assetsUsedAsSecurity);
	}

	/**
	 * Caches the assets used as securities in the entity cache if it is enabled.
	 *
	 * @param assetsUsedAsSecurities the assets used as securities
	 */
	public static void cacheResult(
		List<AssetsUsedAsSecurity> assetsUsedAsSecurities) {

		getPersistence().cacheResult(assetsUsedAsSecurities);
	}

	/**
	 * Creates a new assets used as security with the primary key. Does not add the assets used as security to the database.
	 *
	 * @param assetsUsedAsSecurityId the primary key for the new assets used as security
	 * @return the new assets used as security
	 */
	public static AssetsUsedAsSecurity create(long assetsUsedAsSecurityId) {
		return getPersistence().create(assetsUsedAsSecurityId);
	}

	/**
	 * Removes the assets used as security with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param assetsUsedAsSecurityId the primary key of the assets used as security
	 * @return the assets used as security that was removed
	 * @throws NoSuchAssetsUsedAsSecurityException if a assets used as security with the primary key could not be found
	 */
	public static AssetsUsedAsSecurity remove(long assetsUsedAsSecurityId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchAssetsUsedAsSecurityException {

		return getPersistence().remove(assetsUsedAsSecurityId);
	}

	public static AssetsUsedAsSecurity updateImpl(
		AssetsUsedAsSecurity assetsUsedAsSecurity) {

		return getPersistence().updateImpl(assetsUsedAsSecurity);
	}

	/**
	 * Returns the assets used as security with the primary key or throws a <code>NoSuchAssetsUsedAsSecurityException</code> if it could not be found.
	 *
	 * @param assetsUsedAsSecurityId the primary key of the assets used as security
	 * @return the assets used as security
	 * @throws NoSuchAssetsUsedAsSecurityException if a assets used as security with the primary key could not be found
	 */
	public static AssetsUsedAsSecurity findByPrimaryKey(
			long assetsUsedAsSecurityId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchAssetsUsedAsSecurityException {

		return getPersistence().findByPrimaryKey(assetsUsedAsSecurityId);
	}

	/**
	 * Returns the assets used as security with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param assetsUsedAsSecurityId the primary key of the assets used as security
	 * @return the assets used as security, or <code>null</code> if a assets used as security with the primary key could not be found
	 */
	public static AssetsUsedAsSecurity fetchByPrimaryKey(
		long assetsUsedAsSecurityId) {

		return getPersistence().fetchByPrimaryKey(assetsUsedAsSecurityId);
	}

	/**
	 * Returns all the assets used as securities.
	 *
	 * @return the assets used as securities
	 */
	public static List<AssetsUsedAsSecurity> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the assets used as securities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssetsUsedAsSecurityModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of assets used as securities
	 * @param end the upper bound of the range of assets used as securities (not inclusive)
	 * @return the range of assets used as securities
	 */
	public static List<AssetsUsedAsSecurity> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the assets used as securities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssetsUsedAsSecurityModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of assets used as securities
	 * @param end the upper bound of the range of assets used as securities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of assets used as securities
	 */
	public static List<AssetsUsedAsSecurity> findAll(
		int start, int end,
		OrderByComparator<AssetsUsedAsSecurity> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the assets used as securities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssetsUsedAsSecurityModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of assets used as securities
	 * @param end the upper bound of the range of assets used as securities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of assets used as securities
	 */
	public static List<AssetsUsedAsSecurity> findAll(
		int start, int end,
		OrderByComparator<AssetsUsedAsSecurity> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the assets used as securities from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of assets used as securities.
	 *
	 * @return the number of assets used as securities
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AssetsUsedAsSecurityPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		AssetsUsedAsSecurityPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile AssetsUsedAsSecurityPersistence _persistence;

}