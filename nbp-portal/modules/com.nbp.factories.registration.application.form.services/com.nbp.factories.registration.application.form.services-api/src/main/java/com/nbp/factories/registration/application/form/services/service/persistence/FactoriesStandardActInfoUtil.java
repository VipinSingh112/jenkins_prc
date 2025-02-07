/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.factories.registration.application.form.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.factories.registration.application.form.services.model.FactoriesStandardActInfo;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the factories standard act info service. This utility wraps <code>com.nbp.factories.registration.application.form.services.service.persistence.impl.FactoriesStandardActInfoPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FactoriesStandardActInfoPersistence
 * @generated
 */
public class FactoriesStandardActInfoUtil {

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
		FactoriesStandardActInfo factoriesStandardActInfo) {

		getPersistence().clearCache(factoriesStandardActInfo);
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
	public static Map<Serializable, FactoriesStandardActInfo>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<FactoriesStandardActInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<FactoriesStandardActInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<FactoriesStandardActInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<FactoriesStandardActInfo> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static FactoriesStandardActInfo update(
		FactoriesStandardActInfo factoriesStandardActInfo) {

		return getPersistence().update(factoriesStandardActInfo);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static FactoriesStandardActInfo update(
		FactoriesStandardActInfo factoriesStandardActInfo,
		ServiceContext serviceContext) {

		return getPersistence().update(
			factoriesStandardActInfo, serviceContext);
	}

	/**
	 * Returns the factories standard act info where factoriesApplicationId = &#63; or throws a <code>NoSuchFactoriesStandardActInfoException</code> if it could not be found.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @return the matching factories standard act info
	 * @throws NoSuchFactoriesStandardActInfoException if a matching factories standard act info could not be found
	 */
	public static FactoriesStandardActInfo findBygetFactoriesById(
			long factoriesApplicationId)
		throws com.nbp.factories.registration.application.form.services.
			exception.NoSuchFactoriesStandardActInfoException {

		return getPersistence().findBygetFactoriesById(factoriesApplicationId);
	}

	/**
	 * Returns the factories standard act info where factoriesApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @return the matching factories standard act info, or <code>null</code> if a matching factories standard act info could not be found
	 */
	public static FactoriesStandardActInfo fetchBygetFactoriesById(
		long factoriesApplicationId) {

		return getPersistence().fetchBygetFactoriesById(factoriesApplicationId);
	}

	/**
	 * Returns the factories standard act info where factoriesApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching factories standard act info, or <code>null</code> if a matching factories standard act info could not be found
	 */
	public static FactoriesStandardActInfo fetchBygetFactoriesById(
		long factoriesApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetFactoriesById(
			factoriesApplicationId, useFinderCache);
	}

	/**
	 * Removes the factories standard act info where factoriesApplicationId = &#63; from the database.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @return the factories standard act info that was removed
	 */
	public static FactoriesStandardActInfo removeBygetFactoriesById(
			long factoriesApplicationId)
		throws com.nbp.factories.registration.application.form.services.
			exception.NoSuchFactoriesStandardActInfoException {

		return getPersistence().removeBygetFactoriesById(
			factoriesApplicationId);
	}

	/**
	 * Returns the number of factories standard act infos where factoriesApplicationId = &#63;.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @return the number of matching factories standard act infos
	 */
	public static int countBygetFactoriesById(long factoriesApplicationId) {
		return getPersistence().countBygetFactoriesById(factoriesApplicationId);
	}

	/**
	 * Caches the factories standard act info in the entity cache if it is enabled.
	 *
	 * @param factoriesStandardActInfo the factories standard act info
	 */
	public static void cacheResult(
		FactoriesStandardActInfo factoriesStandardActInfo) {

		getPersistence().cacheResult(factoriesStandardActInfo);
	}

	/**
	 * Caches the factories standard act infos in the entity cache if it is enabled.
	 *
	 * @param factoriesStandardActInfos the factories standard act infos
	 */
	public static void cacheResult(
		List<FactoriesStandardActInfo> factoriesStandardActInfos) {

		getPersistence().cacheResult(factoriesStandardActInfos);
	}

	/**
	 * Creates a new factories standard act info with the primary key. Does not add the factories standard act info to the database.
	 *
	 * @param factoriesStandardActId the primary key for the new factories standard act info
	 * @return the new factories standard act info
	 */
	public static FactoriesStandardActInfo create(long factoriesStandardActId) {
		return getPersistence().create(factoriesStandardActId);
	}

	/**
	 * Removes the factories standard act info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param factoriesStandardActId the primary key of the factories standard act info
	 * @return the factories standard act info that was removed
	 * @throws NoSuchFactoriesStandardActInfoException if a factories standard act info with the primary key could not be found
	 */
	public static FactoriesStandardActInfo remove(long factoriesStandardActId)
		throws com.nbp.factories.registration.application.form.services.
			exception.NoSuchFactoriesStandardActInfoException {

		return getPersistence().remove(factoriesStandardActId);
	}

	public static FactoriesStandardActInfo updateImpl(
		FactoriesStandardActInfo factoriesStandardActInfo) {

		return getPersistence().updateImpl(factoriesStandardActInfo);
	}

	/**
	 * Returns the factories standard act info with the primary key or throws a <code>NoSuchFactoriesStandardActInfoException</code> if it could not be found.
	 *
	 * @param factoriesStandardActId the primary key of the factories standard act info
	 * @return the factories standard act info
	 * @throws NoSuchFactoriesStandardActInfoException if a factories standard act info with the primary key could not be found
	 */
	public static FactoriesStandardActInfo findByPrimaryKey(
			long factoriesStandardActId)
		throws com.nbp.factories.registration.application.form.services.
			exception.NoSuchFactoriesStandardActInfoException {

		return getPersistence().findByPrimaryKey(factoriesStandardActId);
	}

	/**
	 * Returns the factories standard act info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param factoriesStandardActId the primary key of the factories standard act info
	 * @return the factories standard act info, or <code>null</code> if a factories standard act info with the primary key could not be found
	 */
	public static FactoriesStandardActInfo fetchByPrimaryKey(
		long factoriesStandardActId) {

		return getPersistence().fetchByPrimaryKey(factoriesStandardActId);
	}

	/**
	 * Returns all the factories standard act infos.
	 *
	 * @return the factories standard act infos
	 */
	public static List<FactoriesStandardActInfo> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the factories standard act infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesStandardActInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factories standard act infos
	 * @param end the upper bound of the range of factories standard act infos (not inclusive)
	 * @return the range of factories standard act infos
	 */
	public static List<FactoriesStandardActInfo> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the factories standard act infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesStandardActInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factories standard act infos
	 * @param end the upper bound of the range of factories standard act infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of factories standard act infos
	 */
	public static List<FactoriesStandardActInfo> findAll(
		int start, int end,
		OrderByComparator<FactoriesStandardActInfo> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the factories standard act infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesStandardActInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factories standard act infos
	 * @param end the upper bound of the range of factories standard act infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of factories standard act infos
	 */
	public static List<FactoriesStandardActInfo> findAll(
		int start, int end,
		OrderByComparator<FactoriesStandardActInfo> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the factories standard act infos from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of factories standard act infos.
	 *
	 * @return the number of factories standard act infos
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static FactoriesStandardActInfoPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		FactoriesStandardActInfoPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile FactoriesStandardActInfoPersistence _persistence;

}