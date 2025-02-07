/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.osi.insolvency.application.form.services.model.AssetsNotUsedAsSecurity;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the assets not used as security service. This utility wraps <code>com.nbp.osi.insolvency.application.form.services.service.persistence.impl.AssetsNotUsedAsSecurityPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AssetsNotUsedAsSecurityPersistence
 * @generated
 */
public class AssetsNotUsedAsSecurityUtil {

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
		AssetsNotUsedAsSecurity assetsNotUsedAsSecurity) {

		getPersistence().clearCache(assetsNotUsedAsSecurity);
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
	public static Map<Serializable, AssetsNotUsedAsSecurity> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AssetsNotUsedAsSecurity> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AssetsNotUsedAsSecurity> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AssetsNotUsedAsSecurity> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AssetsNotUsedAsSecurity> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AssetsNotUsedAsSecurity update(
		AssetsNotUsedAsSecurity assetsNotUsedAsSecurity) {

		return getPersistence().update(assetsNotUsedAsSecurity);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AssetsNotUsedAsSecurity update(
		AssetsNotUsedAsSecurity assetsNotUsedAsSecurity,
		ServiceContext serviceContext) {

		return getPersistence().update(assetsNotUsedAsSecurity, serviceContext);
	}

	/**
	 * Returns all the assets not used as securities where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching assets not used as securities
	 */
	public static List<AssetsNotUsedAsSecurity> findBygetOsiById(
		long osiInsolvencyId) {

		return getPersistence().findBygetOsiById(osiInsolvencyId);
	}

	/**
	 * Returns a range of all the assets not used as securities where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssetsNotUsedAsSecurityModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of assets not used as securities
	 * @param end the upper bound of the range of assets not used as securities (not inclusive)
	 * @return the range of matching assets not used as securities
	 */
	public static List<AssetsNotUsedAsSecurity> findBygetOsiById(
		long osiInsolvencyId, int start, int end) {

		return getPersistence().findBygetOsiById(osiInsolvencyId, start, end);
	}

	/**
	 * Returns an ordered range of all the assets not used as securities where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssetsNotUsedAsSecurityModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of assets not used as securities
	 * @param end the upper bound of the range of assets not used as securities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching assets not used as securities
	 */
	public static List<AssetsNotUsedAsSecurity> findBygetOsiById(
		long osiInsolvencyId, int start, int end,
		OrderByComparator<AssetsNotUsedAsSecurity> orderByComparator) {

		return getPersistence().findBygetOsiById(
			osiInsolvencyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the assets not used as securities where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssetsNotUsedAsSecurityModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of assets not used as securities
	 * @param end the upper bound of the range of assets not used as securities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching assets not used as securities
	 */
	public static List<AssetsNotUsedAsSecurity> findBygetOsiById(
		long osiInsolvencyId, int start, int end,
		OrderByComparator<AssetsNotUsedAsSecurity> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetOsiById(
			osiInsolvencyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first assets not used as security in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assets not used as security
	 * @throws NoSuchAssetsNotUsedAsSecurityException if a matching assets not used as security could not be found
	 */
	public static AssetsNotUsedAsSecurity findBygetOsiById_First(
			long osiInsolvencyId,
			OrderByComparator<AssetsNotUsedAsSecurity> orderByComparator)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchAssetsNotUsedAsSecurityException {

		return getPersistence().findBygetOsiById_First(
			osiInsolvencyId, orderByComparator);
	}

	/**
	 * Returns the first assets not used as security in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assets not used as security, or <code>null</code> if a matching assets not used as security could not be found
	 */
	public static AssetsNotUsedAsSecurity fetchBygetOsiById_First(
		long osiInsolvencyId,
		OrderByComparator<AssetsNotUsedAsSecurity> orderByComparator) {

		return getPersistence().fetchBygetOsiById_First(
			osiInsolvencyId, orderByComparator);
	}

	/**
	 * Returns the last assets not used as security in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assets not used as security
	 * @throws NoSuchAssetsNotUsedAsSecurityException if a matching assets not used as security could not be found
	 */
	public static AssetsNotUsedAsSecurity findBygetOsiById_Last(
			long osiInsolvencyId,
			OrderByComparator<AssetsNotUsedAsSecurity> orderByComparator)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchAssetsNotUsedAsSecurityException {

		return getPersistence().findBygetOsiById_Last(
			osiInsolvencyId, orderByComparator);
	}

	/**
	 * Returns the last assets not used as security in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assets not used as security, or <code>null</code> if a matching assets not used as security could not be found
	 */
	public static AssetsNotUsedAsSecurity fetchBygetOsiById_Last(
		long osiInsolvencyId,
		OrderByComparator<AssetsNotUsedAsSecurity> orderByComparator) {

		return getPersistence().fetchBygetOsiById_Last(
			osiInsolvencyId, orderByComparator);
	}

	/**
	 * Returns the assets not used as securities before and after the current assets not used as security in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param assetsNotUsedAsSecurityId the primary key of the current assets not used as security
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next assets not used as security
	 * @throws NoSuchAssetsNotUsedAsSecurityException if a assets not used as security with the primary key could not be found
	 */
	public static AssetsNotUsedAsSecurity[] findBygetOsiById_PrevAndNext(
			long assetsNotUsedAsSecurityId, long osiInsolvencyId,
			OrderByComparator<AssetsNotUsedAsSecurity> orderByComparator)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchAssetsNotUsedAsSecurityException {

		return getPersistence().findBygetOsiById_PrevAndNext(
			assetsNotUsedAsSecurityId, osiInsolvencyId, orderByComparator);
	}

	/**
	 * Removes all the assets not used as securities where osiInsolvencyId = &#63; from the database.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 */
	public static void removeBygetOsiById(long osiInsolvencyId) {
		getPersistence().removeBygetOsiById(osiInsolvencyId);
	}

	/**
	 * Returns the number of assets not used as securities where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the number of matching assets not used as securities
	 */
	public static int countBygetOsiById(long osiInsolvencyId) {
		return getPersistence().countBygetOsiById(osiInsolvencyId);
	}

	/**
	 * Caches the assets not used as security in the entity cache if it is enabled.
	 *
	 * @param assetsNotUsedAsSecurity the assets not used as security
	 */
	public static void cacheResult(
		AssetsNotUsedAsSecurity assetsNotUsedAsSecurity) {

		getPersistence().cacheResult(assetsNotUsedAsSecurity);
	}

	/**
	 * Caches the assets not used as securities in the entity cache if it is enabled.
	 *
	 * @param assetsNotUsedAsSecurities the assets not used as securities
	 */
	public static void cacheResult(
		List<AssetsNotUsedAsSecurity> assetsNotUsedAsSecurities) {

		getPersistence().cacheResult(assetsNotUsedAsSecurities);
	}

	/**
	 * Creates a new assets not used as security with the primary key. Does not add the assets not used as security to the database.
	 *
	 * @param assetsNotUsedAsSecurityId the primary key for the new assets not used as security
	 * @return the new assets not used as security
	 */
	public static AssetsNotUsedAsSecurity create(
		long assetsNotUsedAsSecurityId) {

		return getPersistence().create(assetsNotUsedAsSecurityId);
	}

	/**
	 * Removes the assets not used as security with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param assetsNotUsedAsSecurityId the primary key of the assets not used as security
	 * @return the assets not used as security that was removed
	 * @throws NoSuchAssetsNotUsedAsSecurityException if a assets not used as security with the primary key could not be found
	 */
	public static AssetsNotUsedAsSecurity remove(long assetsNotUsedAsSecurityId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchAssetsNotUsedAsSecurityException {

		return getPersistence().remove(assetsNotUsedAsSecurityId);
	}

	public static AssetsNotUsedAsSecurity updateImpl(
		AssetsNotUsedAsSecurity assetsNotUsedAsSecurity) {

		return getPersistence().updateImpl(assetsNotUsedAsSecurity);
	}

	/**
	 * Returns the assets not used as security with the primary key or throws a <code>NoSuchAssetsNotUsedAsSecurityException</code> if it could not be found.
	 *
	 * @param assetsNotUsedAsSecurityId the primary key of the assets not used as security
	 * @return the assets not used as security
	 * @throws NoSuchAssetsNotUsedAsSecurityException if a assets not used as security with the primary key could not be found
	 */
	public static AssetsNotUsedAsSecurity findByPrimaryKey(
			long assetsNotUsedAsSecurityId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchAssetsNotUsedAsSecurityException {

		return getPersistence().findByPrimaryKey(assetsNotUsedAsSecurityId);
	}

	/**
	 * Returns the assets not used as security with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param assetsNotUsedAsSecurityId the primary key of the assets not used as security
	 * @return the assets not used as security, or <code>null</code> if a assets not used as security with the primary key could not be found
	 */
	public static AssetsNotUsedAsSecurity fetchByPrimaryKey(
		long assetsNotUsedAsSecurityId) {

		return getPersistence().fetchByPrimaryKey(assetsNotUsedAsSecurityId);
	}

	/**
	 * Returns all the assets not used as securities.
	 *
	 * @return the assets not used as securities
	 */
	public static List<AssetsNotUsedAsSecurity> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the assets not used as securities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssetsNotUsedAsSecurityModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of assets not used as securities
	 * @param end the upper bound of the range of assets not used as securities (not inclusive)
	 * @return the range of assets not used as securities
	 */
	public static List<AssetsNotUsedAsSecurity> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the assets not used as securities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssetsNotUsedAsSecurityModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of assets not used as securities
	 * @param end the upper bound of the range of assets not used as securities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of assets not used as securities
	 */
	public static List<AssetsNotUsedAsSecurity> findAll(
		int start, int end,
		OrderByComparator<AssetsNotUsedAsSecurity> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the assets not used as securities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssetsNotUsedAsSecurityModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of assets not used as securities
	 * @param end the upper bound of the range of assets not used as securities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of assets not used as securities
	 */
	public static List<AssetsNotUsedAsSecurity> findAll(
		int start, int end,
		OrderByComparator<AssetsNotUsedAsSecurity> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the assets not used as securities from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of assets not used as securities.
	 *
	 * @return the number of assets not used as securities
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AssetsNotUsedAsSecurityPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		AssetsNotUsedAsSecurityPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile AssetsNotUsedAsSecurityPersistence _persistence;

}