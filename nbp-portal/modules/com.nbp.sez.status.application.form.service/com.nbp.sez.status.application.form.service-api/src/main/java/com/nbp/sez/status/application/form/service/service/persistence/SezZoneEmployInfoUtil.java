/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.sez.status.application.form.service.model.SezZoneEmployInfo;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the sez zone employ info service. This utility wraps <code>com.nbp.sez.status.application.form.service.service.persistence.impl.SezZoneEmployInfoPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezZoneEmployInfoPersistence
 * @generated
 */
public class SezZoneEmployInfoUtil {

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
	public static void clearCache(SezZoneEmployInfo sezZoneEmployInfo) {
		getPersistence().clearCache(sezZoneEmployInfo);
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
	public static Map<Serializable, SezZoneEmployInfo> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<SezZoneEmployInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<SezZoneEmployInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<SezZoneEmployInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<SezZoneEmployInfo> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static SezZoneEmployInfo update(
		SezZoneEmployInfo sezZoneEmployInfo) {

		return getPersistence().update(sezZoneEmployInfo);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static SezZoneEmployInfo update(
		SezZoneEmployInfo sezZoneEmployInfo, ServiceContext serviceContext) {

		return getPersistence().update(sezZoneEmployInfo, serviceContext);
	}

	/**
	 * Returns all the sez zone employ infos where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez zone employ infos
	 */
	public static List<SezZoneEmployInfo> findBygetSezStatusByAppId(
		long sezStatusApplicationId) {

		return getPersistence().findBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Returns a range of all the sez zone employ infos where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezZoneEmployInfoModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez zone employ infos
	 * @param end the upper bound of the range of sez zone employ infos (not inclusive)
	 * @return the range of matching sez zone employ infos
	 */
	public static List<SezZoneEmployInfo> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end) {

		return getPersistence().findBygetSezStatusByAppId(
			sezStatusApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the sez zone employ infos where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezZoneEmployInfoModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez zone employ infos
	 * @param end the upper bound of the range of sez zone employ infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez zone employ infos
	 */
	public static List<SezZoneEmployInfo> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end,
		OrderByComparator<SezZoneEmployInfo> orderByComparator) {

		return getPersistence().findBygetSezStatusByAppId(
			sezStatusApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the sez zone employ infos where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezZoneEmployInfoModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez zone employ infos
	 * @param end the upper bound of the range of sez zone employ infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez zone employ infos
	 */
	public static List<SezZoneEmployInfo> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end,
		OrderByComparator<SezZoneEmployInfo> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetSezStatusByAppId(
			sezStatusApplicationId, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first sez zone employ info in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez zone employ info
	 * @throws NoSuchSezZoneEmployInfoException if a matching sez zone employ info could not be found
	 */
	public static SezZoneEmployInfo findBygetSezStatusByAppId_First(
			long sezStatusApplicationId,
			OrderByComparator<SezZoneEmployInfo> orderByComparator)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezZoneEmployInfoException {

		return getPersistence().findBygetSezStatusByAppId_First(
			sezStatusApplicationId, orderByComparator);
	}

	/**
	 * Returns the first sez zone employ info in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez zone employ info, or <code>null</code> if a matching sez zone employ info could not be found
	 */
	public static SezZoneEmployInfo fetchBygetSezStatusByAppId_First(
		long sezStatusApplicationId,
		OrderByComparator<SezZoneEmployInfo> orderByComparator) {

		return getPersistence().fetchBygetSezStatusByAppId_First(
			sezStatusApplicationId, orderByComparator);
	}

	/**
	 * Returns the last sez zone employ info in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez zone employ info
	 * @throws NoSuchSezZoneEmployInfoException if a matching sez zone employ info could not be found
	 */
	public static SezZoneEmployInfo findBygetSezStatusByAppId_Last(
			long sezStatusApplicationId,
			OrderByComparator<SezZoneEmployInfo> orderByComparator)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezZoneEmployInfoException {

		return getPersistence().findBygetSezStatusByAppId_Last(
			sezStatusApplicationId, orderByComparator);
	}

	/**
	 * Returns the last sez zone employ info in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez zone employ info, or <code>null</code> if a matching sez zone employ info could not be found
	 */
	public static SezZoneEmployInfo fetchBygetSezStatusByAppId_Last(
		long sezStatusApplicationId,
		OrderByComparator<SezZoneEmployInfo> orderByComparator) {

		return getPersistence().fetchBygetSezStatusByAppId_Last(
			sezStatusApplicationId, orderByComparator);
	}

	/**
	 * Returns the sez zone employ infos before and after the current sez zone employ info in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezZoneEmpInfoId the primary key of the current sez zone employ info
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez zone employ info
	 * @throws NoSuchSezZoneEmployInfoException if a sez zone employ info with the primary key could not be found
	 */
	public static SezZoneEmployInfo[] findBygetSezStatusByAppId_PrevAndNext(
			long sezZoneEmpInfoId, long sezStatusApplicationId,
			OrderByComparator<SezZoneEmployInfo> orderByComparator)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezZoneEmployInfoException {

		return getPersistence().findBygetSezStatusByAppId_PrevAndNext(
			sezZoneEmpInfoId, sezStatusApplicationId, orderByComparator);
	}

	/**
	 * Removes all the sez zone employ infos where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 */
	public static void removeBygetSezStatusByAppId(
		long sezStatusApplicationId) {

		getPersistence().removeBygetSezStatusByAppId(sezStatusApplicationId);
	}

	/**
	 * Returns the number of sez zone employ infos where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez zone employ infos
	 */
	public static int countBygetSezStatusByAppId(long sezStatusApplicationId) {
		return getPersistence().countBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Caches the sez zone employ info in the entity cache if it is enabled.
	 *
	 * @param sezZoneEmployInfo the sez zone employ info
	 */
	public static void cacheResult(SezZoneEmployInfo sezZoneEmployInfo) {
		getPersistence().cacheResult(sezZoneEmployInfo);
	}

	/**
	 * Caches the sez zone employ infos in the entity cache if it is enabled.
	 *
	 * @param sezZoneEmployInfos the sez zone employ infos
	 */
	public static void cacheResult(List<SezZoneEmployInfo> sezZoneEmployInfos) {
		getPersistence().cacheResult(sezZoneEmployInfos);
	}

	/**
	 * Creates a new sez zone employ info with the primary key. Does not add the sez zone employ info to the database.
	 *
	 * @param sezZoneEmpInfoId the primary key for the new sez zone employ info
	 * @return the new sez zone employ info
	 */
	public static SezZoneEmployInfo create(long sezZoneEmpInfoId) {
		return getPersistence().create(sezZoneEmpInfoId);
	}

	/**
	 * Removes the sez zone employ info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezZoneEmpInfoId the primary key of the sez zone employ info
	 * @return the sez zone employ info that was removed
	 * @throws NoSuchSezZoneEmployInfoException if a sez zone employ info with the primary key could not be found
	 */
	public static SezZoneEmployInfo remove(long sezZoneEmpInfoId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezZoneEmployInfoException {

		return getPersistence().remove(sezZoneEmpInfoId);
	}

	public static SezZoneEmployInfo updateImpl(
		SezZoneEmployInfo sezZoneEmployInfo) {

		return getPersistence().updateImpl(sezZoneEmployInfo);
	}

	/**
	 * Returns the sez zone employ info with the primary key or throws a <code>NoSuchSezZoneEmployInfoException</code> if it could not be found.
	 *
	 * @param sezZoneEmpInfoId the primary key of the sez zone employ info
	 * @return the sez zone employ info
	 * @throws NoSuchSezZoneEmployInfoException if a sez zone employ info with the primary key could not be found
	 */
	public static SezZoneEmployInfo findByPrimaryKey(long sezZoneEmpInfoId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezZoneEmployInfoException {

		return getPersistence().findByPrimaryKey(sezZoneEmpInfoId);
	}

	/**
	 * Returns the sez zone employ info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezZoneEmpInfoId the primary key of the sez zone employ info
	 * @return the sez zone employ info, or <code>null</code> if a sez zone employ info with the primary key could not be found
	 */
	public static SezZoneEmployInfo fetchByPrimaryKey(long sezZoneEmpInfoId) {
		return getPersistence().fetchByPrimaryKey(sezZoneEmpInfoId);
	}

	/**
	 * Returns all the sez zone employ infos.
	 *
	 * @return the sez zone employ infos
	 */
	public static List<SezZoneEmployInfo> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the sez zone employ infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezZoneEmployInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez zone employ infos
	 * @param end the upper bound of the range of sez zone employ infos (not inclusive)
	 * @return the range of sez zone employ infos
	 */
	public static List<SezZoneEmployInfo> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the sez zone employ infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezZoneEmployInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez zone employ infos
	 * @param end the upper bound of the range of sez zone employ infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez zone employ infos
	 */
	public static List<SezZoneEmployInfo> findAll(
		int start, int end,
		OrderByComparator<SezZoneEmployInfo> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the sez zone employ infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezZoneEmployInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez zone employ infos
	 * @param end the upper bound of the range of sez zone employ infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez zone employ infos
	 */
	public static List<SezZoneEmployInfo> findAll(
		int start, int end,
		OrderByComparator<SezZoneEmployInfo> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the sez zone employ infos from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of sez zone employ infos.
	 *
	 * @return the number of sez zone employ infos
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static SezZoneEmployInfoPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		SezZoneEmployInfoPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile SezZoneEmployInfoPersistence _persistence;

}