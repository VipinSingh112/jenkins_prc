/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.sez.status.application.form.service.model.SezZoneProposedProjectInfo;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the sez zone proposed project info service. This utility wraps <code>com.nbp.sez.status.application.form.service.service.persistence.impl.SezZoneProposedProjectInfoPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezZoneProposedProjectInfoPersistence
 * @generated
 */
public class SezZoneProposedProjectInfoUtil {

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
		SezZoneProposedProjectInfo sezZoneProposedProjectInfo) {

		getPersistence().clearCache(sezZoneProposedProjectInfo);
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
	public static Map<Serializable, SezZoneProposedProjectInfo>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<SezZoneProposedProjectInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<SezZoneProposedProjectInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<SezZoneProposedProjectInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<SezZoneProposedProjectInfo> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static SezZoneProposedProjectInfo update(
		SezZoneProposedProjectInfo sezZoneProposedProjectInfo) {

		return getPersistence().update(sezZoneProposedProjectInfo);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static SezZoneProposedProjectInfo update(
		SezZoneProposedProjectInfo sezZoneProposedProjectInfo,
		ServiceContext serviceContext) {

		return getPersistence().update(
			sezZoneProposedProjectInfo, serviceContext);
	}

	/**
	 * Returns the sez zone proposed project info where sezStatusApplicationId = &#63; or throws a <code>NoSuchSezZoneProposedProjectInfoException</code> if it could not be found.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez zone proposed project info
	 * @throws NoSuchSezZoneProposedProjectInfoException if a matching sez zone proposed project info could not be found
	 */
	public static SezZoneProposedProjectInfo findBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezZoneProposedProjectInfoException {

		return getPersistence().findBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Returns the sez zone proposed project info where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez zone proposed project info, or <code>null</code> if a matching sez zone proposed project info could not be found
	 */
	public static SezZoneProposedProjectInfo fetchBygetSezStatusByAppId(
		long sezStatusApplicationId) {

		return getPersistence().fetchBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Returns the sez zone proposed project info where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez zone proposed project info, or <code>null</code> if a matching sez zone proposed project info could not be found
	 */
	public static SezZoneProposedProjectInfo fetchBygetSezStatusByAppId(
		long sezStatusApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetSezStatusByAppId(
			sezStatusApplicationId, useFinderCache);
	}

	/**
	 * Removes the sez zone proposed project info where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the sez zone proposed project info that was removed
	 */
	public static SezZoneProposedProjectInfo removeBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezZoneProposedProjectInfoException {

		return getPersistence().removeBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Returns the number of sez zone proposed project infos where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez zone proposed project infos
	 */
	public static int countBygetSezStatusByAppId(long sezStatusApplicationId) {
		return getPersistence().countBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Caches the sez zone proposed project info in the entity cache if it is enabled.
	 *
	 * @param sezZoneProposedProjectInfo the sez zone proposed project info
	 */
	public static void cacheResult(
		SezZoneProposedProjectInfo sezZoneProposedProjectInfo) {

		getPersistence().cacheResult(sezZoneProposedProjectInfo);
	}

	/**
	 * Caches the sez zone proposed project infos in the entity cache if it is enabled.
	 *
	 * @param sezZoneProposedProjectInfos the sez zone proposed project infos
	 */
	public static void cacheResult(
		List<SezZoneProposedProjectInfo> sezZoneProposedProjectInfos) {

		getPersistence().cacheResult(sezZoneProposedProjectInfos);
	}

	/**
	 * Creates a new sez zone proposed project info with the primary key. Does not add the sez zone proposed project info to the database.
	 *
	 * @param sezZoneProposedProjectInfoId the primary key for the new sez zone proposed project info
	 * @return the new sez zone proposed project info
	 */
	public static SezZoneProposedProjectInfo create(
		long sezZoneProposedProjectInfoId) {

		return getPersistence().create(sezZoneProposedProjectInfoId);
	}

	/**
	 * Removes the sez zone proposed project info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezZoneProposedProjectInfoId the primary key of the sez zone proposed project info
	 * @return the sez zone proposed project info that was removed
	 * @throws NoSuchSezZoneProposedProjectInfoException if a sez zone proposed project info with the primary key could not be found
	 */
	public static SezZoneProposedProjectInfo remove(
			long sezZoneProposedProjectInfoId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezZoneProposedProjectInfoException {

		return getPersistence().remove(sezZoneProposedProjectInfoId);
	}

	public static SezZoneProposedProjectInfo updateImpl(
		SezZoneProposedProjectInfo sezZoneProposedProjectInfo) {

		return getPersistence().updateImpl(sezZoneProposedProjectInfo);
	}

	/**
	 * Returns the sez zone proposed project info with the primary key or throws a <code>NoSuchSezZoneProposedProjectInfoException</code> if it could not be found.
	 *
	 * @param sezZoneProposedProjectInfoId the primary key of the sez zone proposed project info
	 * @return the sez zone proposed project info
	 * @throws NoSuchSezZoneProposedProjectInfoException if a sez zone proposed project info with the primary key could not be found
	 */
	public static SezZoneProposedProjectInfo findByPrimaryKey(
			long sezZoneProposedProjectInfoId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezZoneProposedProjectInfoException {

		return getPersistence().findByPrimaryKey(sezZoneProposedProjectInfoId);
	}

	/**
	 * Returns the sez zone proposed project info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezZoneProposedProjectInfoId the primary key of the sez zone proposed project info
	 * @return the sez zone proposed project info, or <code>null</code> if a sez zone proposed project info with the primary key could not be found
	 */
	public static SezZoneProposedProjectInfo fetchByPrimaryKey(
		long sezZoneProposedProjectInfoId) {

		return getPersistence().fetchByPrimaryKey(sezZoneProposedProjectInfoId);
	}

	/**
	 * Returns all the sez zone proposed project infos.
	 *
	 * @return the sez zone proposed project infos
	 */
	public static List<SezZoneProposedProjectInfo> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the sez zone proposed project infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezZoneProposedProjectInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez zone proposed project infos
	 * @param end the upper bound of the range of sez zone proposed project infos (not inclusive)
	 * @return the range of sez zone proposed project infos
	 */
	public static List<SezZoneProposedProjectInfo> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the sez zone proposed project infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezZoneProposedProjectInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez zone proposed project infos
	 * @param end the upper bound of the range of sez zone proposed project infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez zone proposed project infos
	 */
	public static List<SezZoneProposedProjectInfo> findAll(
		int start, int end,
		OrderByComparator<SezZoneProposedProjectInfo> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the sez zone proposed project infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezZoneProposedProjectInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez zone proposed project infos
	 * @param end the upper bound of the range of sez zone proposed project infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez zone proposed project infos
	 */
	public static List<SezZoneProposedProjectInfo> findAll(
		int start, int end,
		OrderByComparator<SezZoneProposedProjectInfo> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the sez zone proposed project infos from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of sez zone proposed project infos.
	 *
	 * @return the number of sez zone proposed project infos
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static SezZoneProposedProjectInfoPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		SezZoneProposedProjectInfoPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile SezZoneProposedProjectInfoPersistence _persistence;

}