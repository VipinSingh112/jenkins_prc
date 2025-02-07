/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.wra.application.form.service.model.LicenceToAbstractInfo;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the licence to abstract info service. This utility wraps <code>com.nbp.wra.application.form.service.service.persistence.impl.LicenceToAbstractInfoPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LicenceToAbstractInfoPersistence
 * @generated
 */
public class LicenceToAbstractInfoUtil {

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
	public static void clearCache(LicenceToAbstractInfo licenceToAbstractInfo) {
		getPersistence().clearCache(licenceToAbstractInfo);
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
	public static Map<Serializable, LicenceToAbstractInfo> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<LicenceToAbstractInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<LicenceToAbstractInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<LicenceToAbstractInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<LicenceToAbstractInfo> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static LicenceToAbstractInfo update(
		LicenceToAbstractInfo licenceToAbstractInfo) {

		return getPersistence().update(licenceToAbstractInfo);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static LicenceToAbstractInfo update(
		LicenceToAbstractInfo licenceToAbstractInfo,
		ServiceContext serviceContext) {

		return getPersistence().update(licenceToAbstractInfo, serviceContext);
	}

	/**
	 * Returns the licence to abstract info where wraApplicationId = &#63; or throws a <code>NoSuchLicenceToAbstractInfoException</code> if it could not be found.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the matching licence to abstract info
	 * @throws NoSuchLicenceToAbstractInfoException if a matching licence to abstract info could not be found
	 */
	public static LicenceToAbstractInfo findBygetWRA_By_Id(
			long wraApplicationId)
		throws com.nbp.wra.application.form.service.exception.
			NoSuchLicenceToAbstractInfoException {

		return getPersistence().findBygetWRA_By_Id(wraApplicationId);
	}

	/**
	 * Returns the licence to abstract info where wraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the matching licence to abstract info, or <code>null</code> if a matching licence to abstract info could not be found
	 */
	public static LicenceToAbstractInfo fetchBygetWRA_By_Id(
		long wraApplicationId) {

		return getPersistence().fetchBygetWRA_By_Id(wraApplicationId);
	}

	/**
	 * Returns the licence to abstract info where wraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param wraApplicationId the wra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching licence to abstract info, or <code>null</code> if a matching licence to abstract info could not be found
	 */
	public static LicenceToAbstractInfo fetchBygetWRA_By_Id(
		long wraApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetWRA_By_Id(
			wraApplicationId, useFinderCache);
	}

	/**
	 * Removes the licence to abstract info where wraApplicationId = &#63; from the database.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the licence to abstract info that was removed
	 */
	public static LicenceToAbstractInfo removeBygetWRA_By_Id(
			long wraApplicationId)
		throws com.nbp.wra.application.form.service.exception.
			NoSuchLicenceToAbstractInfoException {

		return getPersistence().removeBygetWRA_By_Id(wraApplicationId);
	}

	/**
	 * Returns the number of licence to abstract infos where wraApplicationId = &#63;.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the number of matching licence to abstract infos
	 */
	public static int countBygetWRA_By_Id(long wraApplicationId) {
		return getPersistence().countBygetWRA_By_Id(wraApplicationId);
	}

	/**
	 * Caches the licence to abstract info in the entity cache if it is enabled.
	 *
	 * @param licenceToAbstractInfo the licence to abstract info
	 */
	public static void cacheResult(
		LicenceToAbstractInfo licenceToAbstractInfo) {

		getPersistence().cacheResult(licenceToAbstractInfo);
	}

	/**
	 * Caches the licence to abstract infos in the entity cache if it is enabled.
	 *
	 * @param licenceToAbstractInfos the licence to abstract infos
	 */
	public static void cacheResult(
		List<LicenceToAbstractInfo> licenceToAbstractInfos) {

		getPersistence().cacheResult(licenceToAbstractInfos);
	}

	/**
	 * Creates a new licence to abstract info with the primary key. Does not add the licence to abstract info to the database.
	 *
	 * @param abstractLicenceId the primary key for the new licence to abstract info
	 * @return the new licence to abstract info
	 */
	public static LicenceToAbstractInfo create(long abstractLicenceId) {
		return getPersistence().create(abstractLicenceId);
	}

	/**
	 * Removes the licence to abstract info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param abstractLicenceId the primary key of the licence to abstract info
	 * @return the licence to abstract info that was removed
	 * @throws NoSuchLicenceToAbstractInfoException if a licence to abstract info with the primary key could not be found
	 */
	public static LicenceToAbstractInfo remove(long abstractLicenceId)
		throws com.nbp.wra.application.form.service.exception.
			NoSuchLicenceToAbstractInfoException {

		return getPersistence().remove(abstractLicenceId);
	}

	public static LicenceToAbstractInfo updateImpl(
		LicenceToAbstractInfo licenceToAbstractInfo) {

		return getPersistence().updateImpl(licenceToAbstractInfo);
	}

	/**
	 * Returns the licence to abstract info with the primary key or throws a <code>NoSuchLicenceToAbstractInfoException</code> if it could not be found.
	 *
	 * @param abstractLicenceId the primary key of the licence to abstract info
	 * @return the licence to abstract info
	 * @throws NoSuchLicenceToAbstractInfoException if a licence to abstract info with the primary key could not be found
	 */
	public static LicenceToAbstractInfo findByPrimaryKey(long abstractLicenceId)
		throws com.nbp.wra.application.form.service.exception.
			NoSuchLicenceToAbstractInfoException {

		return getPersistence().findByPrimaryKey(abstractLicenceId);
	}

	/**
	 * Returns the licence to abstract info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param abstractLicenceId the primary key of the licence to abstract info
	 * @return the licence to abstract info, or <code>null</code> if a licence to abstract info with the primary key could not be found
	 */
	public static LicenceToAbstractInfo fetchByPrimaryKey(
		long abstractLicenceId) {

		return getPersistence().fetchByPrimaryKey(abstractLicenceId);
	}

	/**
	 * Returns all the licence to abstract infos.
	 *
	 * @return the licence to abstract infos
	 */
	public static List<LicenceToAbstractInfo> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the licence to abstract infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LicenceToAbstractInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of licence to abstract infos
	 * @param end the upper bound of the range of licence to abstract infos (not inclusive)
	 * @return the range of licence to abstract infos
	 */
	public static List<LicenceToAbstractInfo> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the licence to abstract infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LicenceToAbstractInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of licence to abstract infos
	 * @param end the upper bound of the range of licence to abstract infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of licence to abstract infos
	 */
	public static List<LicenceToAbstractInfo> findAll(
		int start, int end,
		OrderByComparator<LicenceToAbstractInfo> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the licence to abstract infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LicenceToAbstractInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of licence to abstract infos
	 * @param end the upper bound of the range of licence to abstract infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of licence to abstract infos
	 */
	public static List<LicenceToAbstractInfo> findAll(
		int start, int end,
		OrderByComparator<LicenceToAbstractInfo> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the licence to abstract infos from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of licence to abstract infos.
	 *
	 * @return the number of licence to abstract infos
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static LicenceToAbstractInfoPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		LicenceToAbstractInfoPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile LicenceToAbstractInfoPersistence _persistence;

}