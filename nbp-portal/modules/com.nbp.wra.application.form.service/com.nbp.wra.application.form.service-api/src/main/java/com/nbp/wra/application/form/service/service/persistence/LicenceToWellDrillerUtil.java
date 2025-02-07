/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.wra.application.form.service.model.LicenceToWellDriller;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the licence to well driller service. This utility wraps <code>com.nbp.wra.application.form.service.service.persistence.impl.LicenceToWellDrillerPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LicenceToWellDrillerPersistence
 * @generated
 */
public class LicenceToWellDrillerUtil {

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
	public static void clearCache(LicenceToWellDriller licenceToWellDriller) {
		getPersistence().clearCache(licenceToWellDriller);
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
	public static Map<Serializable, LicenceToWellDriller> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<LicenceToWellDriller> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<LicenceToWellDriller> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<LicenceToWellDriller> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<LicenceToWellDriller> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static LicenceToWellDriller update(
		LicenceToWellDriller licenceToWellDriller) {

		return getPersistence().update(licenceToWellDriller);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static LicenceToWellDriller update(
		LicenceToWellDriller licenceToWellDriller,
		ServiceContext serviceContext) {

		return getPersistence().update(licenceToWellDriller, serviceContext);
	}

	/**
	 * Returns the licence to well driller where wraApplicationId = &#63; or throws a <code>NoSuchLicenceToWellDrillerException</code> if it could not be found.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the matching licence to well driller
	 * @throws NoSuchLicenceToWellDrillerException if a matching licence to well driller could not be found
	 */
	public static LicenceToWellDriller findBygetWRA_By_Id(long wraApplicationId)
		throws com.nbp.wra.application.form.service.exception.
			NoSuchLicenceToWellDrillerException {

		return getPersistence().findBygetWRA_By_Id(wraApplicationId);
	}

	/**
	 * Returns the licence to well driller where wraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the matching licence to well driller, or <code>null</code> if a matching licence to well driller could not be found
	 */
	public static LicenceToWellDriller fetchBygetWRA_By_Id(
		long wraApplicationId) {

		return getPersistence().fetchBygetWRA_By_Id(wraApplicationId);
	}

	/**
	 * Returns the licence to well driller where wraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param wraApplicationId the wra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching licence to well driller, or <code>null</code> if a matching licence to well driller could not be found
	 */
	public static LicenceToWellDriller fetchBygetWRA_By_Id(
		long wraApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetWRA_By_Id(
			wraApplicationId, useFinderCache);
	}

	/**
	 * Removes the licence to well driller where wraApplicationId = &#63; from the database.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the licence to well driller that was removed
	 */
	public static LicenceToWellDriller removeBygetWRA_By_Id(
			long wraApplicationId)
		throws com.nbp.wra.application.form.service.exception.
			NoSuchLicenceToWellDrillerException {

		return getPersistence().removeBygetWRA_By_Id(wraApplicationId);
	}

	/**
	 * Returns the number of licence to well drillers where wraApplicationId = &#63;.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the number of matching licence to well drillers
	 */
	public static int countBygetWRA_By_Id(long wraApplicationId) {
		return getPersistence().countBygetWRA_By_Id(wraApplicationId);
	}

	/**
	 * Caches the licence to well driller in the entity cache if it is enabled.
	 *
	 * @param licenceToWellDriller the licence to well driller
	 */
	public static void cacheResult(LicenceToWellDriller licenceToWellDriller) {
		getPersistence().cacheResult(licenceToWellDriller);
	}

	/**
	 * Caches the licence to well drillers in the entity cache if it is enabled.
	 *
	 * @param licenceToWellDrillers the licence to well drillers
	 */
	public static void cacheResult(
		List<LicenceToWellDriller> licenceToWellDrillers) {

		getPersistence().cacheResult(licenceToWellDrillers);
	}

	/**
	 * Creates a new licence to well driller with the primary key. Does not add the licence to well driller to the database.
	 *
	 * @param licenceToWellDrillerId the primary key for the new licence to well driller
	 * @return the new licence to well driller
	 */
	public static LicenceToWellDriller create(long licenceToWellDrillerId) {
		return getPersistence().create(licenceToWellDrillerId);
	}

	/**
	 * Removes the licence to well driller with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param licenceToWellDrillerId the primary key of the licence to well driller
	 * @return the licence to well driller that was removed
	 * @throws NoSuchLicenceToWellDrillerException if a licence to well driller with the primary key could not be found
	 */
	public static LicenceToWellDriller remove(long licenceToWellDrillerId)
		throws com.nbp.wra.application.form.service.exception.
			NoSuchLicenceToWellDrillerException {

		return getPersistence().remove(licenceToWellDrillerId);
	}

	public static LicenceToWellDriller updateImpl(
		LicenceToWellDriller licenceToWellDriller) {

		return getPersistence().updateImpl(licenceToWellDriller);
	}

	/**
	 * Returns the licence to well driller with the primary key or throws a <code>NoSuchLicenceToWellDrillerException</code> if it could not be found.
	 *
	 * @param licenceToWellDrillerId the primary key of the licence to well driller
	 * @return the licence to well driller
	 * @throws NoSuchLicenceToWellDrillerException if a licence to well driller with the primary key could not be found
	 */
	public static LicenceToWellDriller findByPrimaryKey(
			long licenceToWellDrillerId)
		throws com.nbp.wra.application.form.service.exception.
			NoSuchLicenceToWellDrillerException {

		return getPersistence().findByPrimaryKey(licenceToWellDrillerId);
	}

	/**
	 * Returns the licence to well driller with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param licenceToWellDrillerId the primary key of the licence to well driller
	 * @return the licence to well driller, or <code>null</code> if a licence to well driller with the primary key could not be found
	 */
	public static LicenceToWellDriller fetchByPrimaryKey(
		long licenceToWellDrillerId) {

		return getPersistence().fetchByPrimaryKey(licenceToWellDrillerId);
	}

	/**
	 * Returns all the licence to well drillers.
	 *
	 * @return the licence to well drillers
	 */
	public static List<LicenceToWellDriller> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the licence to well drillers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LicenceToWellDrillerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of licence to well drillers
	 * @param end the upper bound of the range of licence to well drillers (not inclusive)
	 * @return the range of licence to well drillers
	 */
	public static List<LicenceToWellDriller> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the licence to well drillers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LicenceToWellDrillerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of licence to well drillers
	 * @param end the upper bound of the range of licence to well drillers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of licence to well drillers
	 */
	public static List<LicenceToWellDriller> findAll(
		int start, int end,
		OrderByComparator<LicenceToWellDriller> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the licence to well drillers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LicenceToWellDrillerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of licence to well drillers
	 * @param end the upper bound of the range of licence to well drillers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of licence to well drillers
	 */
	public static List<LicenceToWellDriller> findAll(
		int start, int end,
		OrderByComparator<LicenceToWellDriller> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the licence to well drillers from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of licence to well drillers.
	 *
	 * @return the number of licence to well drillers
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static LicenceToWellDrillerPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		LicenceToWellDrillerPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile LicenceToWellDrillerPersistence _persistence;

}