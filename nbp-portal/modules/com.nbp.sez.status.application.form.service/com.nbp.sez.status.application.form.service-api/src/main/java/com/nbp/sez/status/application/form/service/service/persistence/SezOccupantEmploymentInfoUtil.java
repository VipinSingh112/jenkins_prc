/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.sez.status.application.form.service.model.SezOccupantEmploymentInfo;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the sez occupant employment info service. This utility wraps <code>com.nbp.sez.status.application.form.service.service.persistence.impl.SezOccupantEmploymentInfoPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezOccupantEmploymentInfoPersistence
 * @generated
 */
public class SezOccupantEmploymentInfoUtil {

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
		SezOccupantEmploymentInfo sezOccupantEmploymentInfo) {

		getPersistence().clearCache(sezOccupantEmploymentInfo);
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
	public static Map<Serializable, SezOccupantEmploymentInfo>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<SezOccupantEmploymentInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<SezOccupantEmploymentInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<SezOccupantEmploymentInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<SezOccupantEmploymentInfo> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static SezOccupantEmploymentInfo update(
		SezOccupantEmploymentInfo sezOccupantEmploymentInfo) {

		return getPersistence().update(sezOccupantEmploymentInfo);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static SezOccupantEmploymentInfo update(
		SezOccupantEmploymentInfo sezOccupantEmploymentInfo,
		ServiceContext serviceContext) {

		return getPersistence().update(
			sezOccupantEmploymentInfo, serviceContext);
	}

	/**
	 * Returns the sez occupant employment info where sezStatusApplicationId = &#63; or throws a <code>NoSuchSezOccupantEmploymentInfoException</code> if it could not be found.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez occupant employment info
	 * @throws NoSuchSezOccupantEmploymentInfoException if a matching sez occupant employment info could not be found
	 */
	public static SezOccupantEmploymentInfo findBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezOccupantEmploymentInfoException {

		return getPersistence().findBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Returns the sez occupant employment info where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez occupant employment info, or <code>null</code> if a matching sez occupant employment info could not be found
	 */
	public static SezOccupantEmploymentInfo fetchBygetSezStatusByAppId(
		long sezStatusApplicationId) {

		return getPersistence().fetchBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Returns the sez occupant employment info where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez occupant employment info, or <code>null</code> if a matching sez occupant employment info could not be found
	 */
	public static SezOccupantEmploymentInfo fetchBygetSezStatusByAppId(
		long sezStatusApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetSezStatusByAppId(
			sezStatusApplicationId, useFinderCache);
	}

	/**
	 * Removes the sez occupant employment info where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the sez occupant employment info that was removed
	 */
	public static SezOccupantEmploymentInfo removeBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezOccupantEmploymentInfoException {

		return getPersistence().removeBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Returns the number of sez occupant employment infos where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez occupant employment infos
	 */
	public static int countBygetSezStatusByAppId(long sezStatusApplicationId) {
		return getPersistence().countBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Returns all the sez occupant employment infos where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez occupant employment infos
	 */
	public static List<SezOccupantEmploymentInfo>
		findBygetSezStatusByApplicationId(long sezStatusApplicationId) {

		return getPersistence().findBygetSezStatusByApplicationId(
			sezStatusApplicationId);
	}

	/**
	 * Returns a range of all the sez occupant employment infos where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantEmploymentInfoModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez occupant employment infos
	 * @param end the upper bound of the range of sez occupant employment infos (not inclusive)
	 * @return the range of matching sez occupant employment infos
	 */
	public static List<SezOccupantEmploymentInfo>
		findBygetSezStatusByApplicationId(
			long sezStatusApplicationId, int start, int end) {

		return getPersistence().findBygetSezStatusByApplicationId(
			sezStatusApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the sez occupant employment infos where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantEmploymentInfoModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez occupant employment infos
	 * @param end the upper bound of the range of sez occupant employment infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez occupant employment infos
	 */
	public static List<SezOccupantEmploymentInfo>
		findBygetSezStatusByApplicationId(
			long sezStatusApplicationId, int start, int end,
			OrderByComparator<SezOccupantEmploymentInfo> orderByComparator) {

		return getPersistence().findBygetSezStatusByApplicationId(
			sezStatusApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the sez occupant employment infos where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantEmploymentInfoModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez occupant employment infos
	 * @param end the upper bound of the range of sez occupant employment infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez occupant employment infos
	 */
	public static List<SezOccupantEmploymentInfo>
		findBygetSezStatusByApplicationId(
			long sezStatusApplicationId, int start, int end,
			OrderByComparator<SezOccupantEmploymentInfo> orderByComparator,
			boolean useFinderCache) {

		return getPersistence().findBygetSezStatusByApplicationId(
			sezStatusApplicationId, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first sez occupant employment info in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez occupant employment info
	 * @throws NoSuchSezOccupantEmploymentInfoException if a matching sez occupant employment info could not be found
	 */
	public static SezOccupantEmploymentInfo
			findBygetSezStatusByApplicationId_First(
				long sezStatusApplicationId,
				OrderByComparator<SezOccupantEmploymentInfo> orderByComparator)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezOccupantEmploymentInfoException {

		return getPersistence().findBygetSezStatusByApplicationId_First(
			sezStatusApplicationId, orderByComparator);
	}

	/**
	 * Returns the first sez occupant employment info in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez occupant employment info, or <code>null</code> if a matching sez occupant employment info could not be found
	 */
	public static SezOccupantEmploymentInfo
		fetchBygetSezStatusByApplicationId_First(
			long sezStatusApplicationId,
			OrderByComparator<SezOccupantEmploymentInfo> orderByComparator) {

		return getPersistence().fetchBygetSezStatusByApplicationId_First(
			sezStatusApplicationId, orderByComparator);
	}

	/**
	 * Returns the last sez occupant employment info in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez occupant employment info
	 * @throws NoSuchSezOccupantEmploymentInfoException if a matching sez occupant employment info could not be found
	 */
	public static SezOccupantEmploymentInfo
			findBygetSezStatusByApplicationId_Last(
				long sezStatusApplicationId,
				OrderByComparator<SezOccupantEmploymentInfo> orderByComparator)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezOccupantEmploymentInfoException {

		return getPersistence().findBygetSezStatusByApplicationId_Last(
			sezStatusApplicationId, orderByComparator);
	}

	/**
	 * Returns the last sez occupant employment info in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez occupant employment info, or <code>null</code> if a matching sez occupant employment info could not be found
	 */
	public static SezOccupantEmploymentInfo
		fetchBygetSezStatusByApplicationId_Last(
			long sezStatusApplicationId,
			OrderByComparator<SezOccupantEmploymentInfo> orderByComparator) {

		return getPersistence().fetchBygetSezStatusByApplicationId_Last(
			sezStatusApplicationId, orderByComparator);
	}

	/**
	 * Returns the sez occupant employment infos before and after the current sez occupant employment info in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezOccEmpId the primary key of the current sez occupant employment info
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez occupant employment info
	 * @throws NoSuchSezOccupantEmploymentInfoException if a sez occupant employment info with the primary key could not be found
	 */
	public static SezOccupantEmploymentInfo[]
			findBygetSezStatusByApplicationId_PrevAndNext(
				long sezOccEmpId, long sezStatusApplicationId,
				OrderByComparator<SezOccupantEmploymentInfo> orderByComparator)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezOccupantEmploymentInfoException {

		return getPersistence().findBygetSezStatusByApplicationId_PrevAndNext(
			sezOccEmpId, sezStatusApplicationId, orderByComparator);
	}

	/**
	 * Removes all the sez occupant employment infos where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 */
	public static void removeBygetSezStatusByApplicationId(
		long sezStatusApplicationId) {

		getPersistence().removeBygetSezStatusByApplicationId(
			sezStatusApplicationId);
	}

	/**
	 * Returns the number of sez occupant employment infos where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez occupant employment infos
	 */
	public static int countBygetSezStatusByApplicationId(
		long sezStatusApplicationId) {

		return getPersistence().countBygetSezStatusByApplicationId(
			sezStatusApplicationId);
	}

	/**
	 * Caches the sez occupant employment info in the entity cache if it is enabled.
	 *
	 * @param sezOccupantEmploymentInfo the sez occupant employment info
	 */
	public static void cacheResult(
		SezOccupantEmploymentInfo sezOccupantEmploymentInfo) {

		getPersistence().cacheResult(sezOccupantEmploymentInfo);
	}

	/**
	 * Caches the sez occupant employment infos in the entity cache if it is enabled.
	 *
	 * @param sezOccupantEmploymentInfos the sez occupant employment infos
	 */
	public static void cacheResult(
		List<SezOccupantEmploymentInfo> sezOccupantEmploymentInfos) {

		getPersistence().cacheResult(sezOccupantEmploymentInfos);
	}

	/**
	 * Creates a new sez occupant employment info with the primary key. Does not add the sez occupant employment info to the database.
	 *
	 * @param sezOccEmpId the primary key for the new sez occupant employment info
	 * @return the new sez occupant employment info
	 */
	public static SezOccupantEmploymentInfo create(long sezOccEmpId) {
		return getPersistence().create(sezOccEmpId);
	}

	/**
	 * Removes the sez occupant employment info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezOccEmpId the primary key of the sez occupant employment info
	 * @return the sez occupant employment info that was removed
	 * @throws NoSuchSezOccupantEmploymentInfoException if a sez occupant employment info with the primary key could not be found
	 */
	public static SezOccupantEmploymentInfo remove(long sezOccEmpId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezOccupantEmploymentInfoException {

		return getPersistence().remove(sezOccEmpId);
	}

	public static SezOccupantEmploymentInfo updateImpl(
		SezOccupantEmploymentInfo sezOccupantEmploymentInfo) {

		return getPersistence().updateImpl(sezOccupantEmploymentInfo);
	}

	/**
	 * Returns the sez occupant employment info with the primary key or throws a <code>NoSuchSezOccupantEmploymentInfoException</code> if it could not be found.
	 *
	 * @param sezOccEmpId the primary key of the sez occupant employment info
	 * @return the sez occupant employment info
	 * @throws NoSuchSezOccupantEmploymentInfoException if a sez occupant employment info with the primary key could not be found
	 */
	public static SezOccupantEmploymentInfo findByPrimaryKey(long sezOccEmpId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezOccupantEmploymentInfoException {

		return getPersistence().findByPrimaryKey(sezOccEmpId);
	}

	/**
	 * Returns the sez occupant employment info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezOccEmpId the primary key of the sez occupant employment info
	 * @return the sez occupant employment info, or <code>null</code> if a sez occupant employment info with the primary key could not be found
	 */
	public static SezOccupantEmploymentInfo fetchByPrimaryKey(
		long sezOccEmpId) {

		return getPersistence().fetchByPrimaryKey(sezOccEmpId);
	}

	/**
	 * Returns all the sez occupant employment infos.
	 *
	 * @return the sez occupant employment infos
	 */
	public static List<SezOccupantEmploymentInfo> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the sez occupant employment infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantEmploymentInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupant employment infos
	 * @param end the upper bound of the range of sez occupant employment infos (not inclusive)
	 * @return the range of sez occupant employment infos
	 */
	public static List<SezOccupantEmploymentInfo> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the sez occupant employment infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantEmploymentInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupant employment infos
	 * @param end the upper bound of the range of sez occupant employment infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez occupant employment infos
	 */
	public static List<SezOccupantEmploymentInfo> findAll(
		int start, int end,
		OrderByComparator<SezOccupantEmploymentInfo> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the sez occupant employment infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantEmploymentInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupant employment infos
	 * @param end the upper bound of the range of sez occupant employment infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez occupant employment infos
	 */
	public static List<SezOccupantEmploymentInfo> findAll(
		int start, int end,
		OrderByComparator<SezOccupantEmploymentInfo> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the sez occupant employment infos from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of sez occupant employment infos.
	 *
	 * @return the number of sez occupant employment infos
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static SezOccupantEmploymentInfoPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		SezOccupantEmploymentInfoPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile SezOccupantEmploymentInfoPersistence _persistence;

}