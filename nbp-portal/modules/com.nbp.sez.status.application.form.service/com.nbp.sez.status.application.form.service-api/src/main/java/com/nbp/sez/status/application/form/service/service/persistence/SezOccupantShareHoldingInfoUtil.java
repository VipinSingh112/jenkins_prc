/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.sez.status.application.form.service.model.SezOccupantShareHoldingInfo;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the sez occupant share holding info service. This utility wraps <code>com.nbp.sez.status.application.form.service.service.persistence.impl.SezOccupantShareHoldingInfoPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezOccupantShareHoldingInfoPersistence
 * @generated
 */
public class SezOccupantShareHoldingInfoUtil {

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
		SezOccupantShareHoldingInfo sezOccupantShareHoldingInfo) {

		getPersistence().clearCache(sezOccupantShareHoldingInfo);
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
	public static Map<Serializable, SezOccupantShareHoldingInfo>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<SezOccupantShareHoldingInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<SezOccupantShareHoldingInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<SezOccupantShareHoldingInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<SezOccupantShareHoldingInfo> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static SezOccupantShareHoldingInfo update(
		SezOccupantShareHoldingInfo sezOccupantShareHoldingInfo) {

		return getPersistence().update(sezOccupantShareHoldingInfo);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static SezOccupantShareHoldingInfo update(
		SezOccupantShareHoldingInfo sezOccupantShareHoldingInfo,
		ServiceContext serviceContext) {

		return getPersistence().update(
			sezOccupantShareHoldingInfo, serviceContext);
	}

	/**
	 * Returns all the sez occupant share holding infos where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez occupant share holding infos
	 */
	public static List<SezOccupantShareHoldingInfo> findBygetSezStatusByAppId(
		long sezStatusApplicationId) {

		return getPersistence().findBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Returns a range of all the sez occupant share holding infos where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantShareHoldingInfoModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez occupant share holding infos
	 * @param end the upper bound of the range of sez occupant share holding infos (not inclusive)
	 * @return the range of matching sez occupant share holding infos
	 */
	public static List<SezOccupantShareHoldingInfo> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end) {

		return getPersistence().findBygetSezStatusByAppId(
			sezStatusApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the sez occupant share holding infos where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantShareHoldingInfoModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez occupant share holding infos
	 * @param end the upper bound of the range of sez occupant share holding infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez occupant share holding infos
	 */
	public static List<SezOccupantShareHoldingInfo> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end,
		OrderByComparator<SezOccupantShareHoldingInfo> orderByComparator) {

		return getPersistence().findBygetSezStatusByAppId(
			sezStatusApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the sez occupant share holding infos where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantShareHoldingInfoModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez occupant share holding infos
	 * @param end the upper bound of the range of sez occupant share holding infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez occupant share holding infos
	 */
	public static List<SezOccupantShareHoldingInfo> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end,
		OrderByComparator<SezOccupantShareHoldingInfo> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetSezStatusByAppId(
			sezStatusApplicationId, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first sez occupant share holding info in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez occupant share holding info
	 * @throws NoSuchSezOccupantShareHoldingInfoException if a matching sez occupant share holding info could not be found
	 */
	public static SezOccupantShareHoldingInfo findBygetSezStatusByAppId_First(
			long sezStatusApplicationId,
			OrderByComparator<SezOccupantShareHoldingInfo> orderByComparator)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezOccupantShareHoldingInfoException {

		return getPersistence().findBygetSezStatusByAppId_First(
			sezStatusApplicationId, orderByComparator);
	}

	/**
	 * Returns the first sez occupant share holding info in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez occupant share holding info, or <code>null</code> if a matching sez occupant share holding info could not be found
	 */
	public static SezOccupantShareHoldingInfo fetchBygetSezStatusByAppId_First(
		long sezStatusApplicationId,
		OrderByComparator<SezOccupantShareHoldingInfo> orderByComparator) {

		return getPersistence().fetchBygetSezStatusByAppId_First(
			sezStatusApplicationId, orderByComparator);
	}

	/**
	 * Returns the last sez occupant share holding info in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez occupant share holding info
	 * @throws NoSuchSezOccupantShareHoldingInfoException if a matching sez occupant share holding info could not be found
	 */
	public static SezOccupantShareHoldingInfo findBygetSezStatusByAppId_Last(
			long sezStatusApplicationId,
			OrderByComparator<SezOccupantShareHoldingInfo> orderByComparator)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezOccupantShareHoldingInfoException {

		return getPersistence().findBygetSezStatusByAppId_Last(
			sezStatusApplicationId, orderByComparator);
	}

	/**
	 * Returns the last sez occupant share holding info in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez occupant share holding info, or <code>null</code> if a matching sez occupant share holding info could not be found
	 */
	public static SezOccupantShareHoldingInfo fetchBygetSezStatusByAppId_Last(
		long sezStatusApplicationId,
		OrderByComparator<SezOccupantShareHoldingInfo> orderByComparator) {

		return getPersistence().fetchBygetSezStatusByAppId_Last(
			sezStatusApplicationId, orderByComparator);
	}

	/**
	 * Returns the sez occupant share holding infos before and after the current sez occupant share holding info in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezOccShareHolderId the primary key of the current sez occupant share holding info
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez occupant share holding info
	 * @throws NoSuchSezOccupantShareHoldingInfoException if a sez occupant share holding info with the primary key could not be found
	 */
	public static SezOccupantShareHoldingInfo[]
			findBygetSezStatusByAppId_PrevAndNext(
				long sezOccShareHolderId, long sezStatusApplicationId,
				OrderByComparator<SezOccupantShareHoldingInfo>
					orderByComparator)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezOccupantShareHoldingInfoException {

		return getPersistence().findBygetSezStatusByAppId_PrevAndNext(
			sezOccShareHolderId, sezStatusApplicationId, orderByComparator);
	}

	/**
	 * Removes all the sez occupant share holding infos where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 */
	public static void removeBygetSezStatusByAppId(
		long sezStatusApplicationId) {

		getPersistence().removeBygetSezStatusByAppId(sezStatusApplicationId);
	}

	/**
	 * Returns the number of sez occupant share holding infos where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez occupant share holding infos
	 */
	public static int countBygetSezStatusByAppId(long sezStatusApplicationId) {
		return getPersistence().countBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Returns the sez occupant share holding info where sezStatusApplicationId = &#63; or throws a <code>NoSuchSezOccupantShareHoldingInfoException</code> if it could not be found.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez occupant share holding info
	 * @throws NoSuchSezOccupantShareHoldingInfoException if a matching sez occupant share holding info could not be found
	 */
	public static SezOccupantShareHoldingInfo findBygetSezStatusBy_App_Id(
			long sezStatusApplicationId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezOccupantShareHoldingInfoException {

		return getPersistence().findBygetSezStatusBy_App_Id(
			sezStatusApplicationId);
	}

	/**
	 * Returns the sez occupant share holding info where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez occupant share holding info, or <code>null</code> if a matching sez occupant share holding info could not be found
	 */
	public static SezOccupantShareHoldingInfo fetchBygetSezStatusBy_App_Id(
		long sezStatusApplicationId) {

		return getPersistence().fetchBygetSezStatusBy_App_Id(
			sezStatusApplicationId);
	}

	/**
	 * Returns the sez occupant share holding info where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez occupant share holding info, or <code>null</code> if a matching sez occupant share holding info could not be found
	 */
	public static SezOccupantShareHoldingInfo fetchBygetSezStatusBy_App_Id(
		long sezStatusApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetSezStatusBy_App_Id(
			sezStatusApplicationId, useFinderCache);
	}

	/**
	 * Removes the sez occupant share holding info where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the sez occupant share holding info that was removed
	 */
	public static SezOccupantShareHoldingInfo removeBygetSezStatusBy_App_Id(
			long sezStatusApplicationId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezOccupantShareHoldingInfoException {

		return getPersistence().removeBygetSezStatusBy_App_Id(
			sezStatusApplicationId);
	}

	/**
	 * Returns the number of sez occupant share holding infos where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez occupant share holding infos
	 */
	public static int countBygetSezStatusBy_App_Id(
		long sezStatusApplicationId) {

		return getPersistence().countBygetSezStatusBy_App_Id(
			sezStatusApplicationId);
	}

	/**
	 * Caches the sez occupant share holding info in the entity cache if it is enabled.
	 *
	 * @param sezOccupantShareHoldingInfo the sez occupant share holding info
	 */
	public static void cacheResult(
		SezOccupantShareHoldingInfo sezOccupantShareHoldingInfo) {

		getPersistence().cacheResult(sezOccupantShareHoldingInfo);
	}

	/**
	 * Caches the sez occupant share holding infos in the entity cache if it is enabled.
	 *
	 * @param sezOccupantShareHoldingInfos the sez occupant share holding infos
	 */
	public static void cacheResult(
		List<SezOccupantShareHoldingInfo> sezOccupantShareHoldingInfos) {

		getPersistence().cacheResult(sezOccupantShareHoldingInfos);
	}

	/**
	 * Creates a new sez occupant share holding info with the primary key. Does not add the sez occupant share holding info to the database.
	 *
	 * @param sezOccShareHolderId the primary key for the new sez occupant share holding info
	 * @return the new sez occupant share holding info
	 */
	public static SezOccupantShareHoldingInfo create(long sezOccShareHolderId) {
		return getPersistence().create(sezOccShareHolderId);
	}

	/**
	 * Removes the sez occupant share holding info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezOccShareHolderId the primary key of the sez occupant share holding info
	 * @return the sez occupant share holding info that was removed
	 * @throws NoSuchSezOccupantShareHoldingInfoException if a sez occupant share holding info with the primary key could not be found
	 */
	public static SezOccupantShareHoldingInfo remove(long sezOccShareHolderId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezOccupantShareHoldingInfoException {

		return getPersistence().remove(sezOccShareHolderId);
	}

	public static SezOccupantShareHoldingInfo updateImpl(
		SezOccupantShareHoldingInfo sezOccupantShareHoldingInfo) {

		return getPersistence().updateImpl(sezOccupantShareHoldingInfo);
	}

	/**
	 * Returns the sez occupant share holding info with the primary key or throws a <code>NoSuchSezOccupantShareHoldingInfoException</code> if it could not be found.
	 *
	 * @param sezOccShareHolderId the primary key of the sez occupant share holding info
	 * @return the sez occupant share holding info
	 * @throws NoSuchSezOccupantShareHoldingInfoException if a sez occupant share holding info with the primary key could not be found
	 */
	public static SezOccupantShareHoldingInfo findByPrimaryKey(
			long sezOccShareHolderId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezOccupantShareHoldingInfoException {

		return getPersistence().findByPrimaryKey(sezOccShareHolderId);
	}

	/**
	 * Returns the sez occupant share holding info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezOccShareHolderId the primary key of the sez occupant share holding info
	 * @return the sez occupant share holding info, or <code>null</code> if a sez occupant share holding info with the primary key could not be found
	 */
	public static SezOccupantShareHoldingInfo fetchByPrimaryKey(
		long sezOccShareHolderId) {

		return getPersistence().fetchByPrimaryKey(sezOccShareHolderId);
	}

	/**
	 * Returns all the sez occupant share holding infos.
	 *
	 * @return the sez occupant share holding infos
	 */
	public static List<SezOccupantShareHoldingInfo> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the sez occupant share holding infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantShareHoldingInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupant share holding infos
	 * @param end the upper bound of the range of sez occupant share holding infos (not inclusive)
	 * @return the range of sez occupant share holding infos
	 */
	public static List<SezOccupantShareHoldingInfo> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the sez occupant share holding infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantShareHoldingInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupant share holding infos
	 * @param end the upper bound of the range of sez occupant share holding infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez occupant share holding infos
	 */
	public static List<SezOccupantShareHoldingInfo> findAll(
		int start, int end,
		OrderByComparator<SezOccupantShareHoldingInfo> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the sez occupant share holding infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantShareHoldingInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupant share holding infos
	 * @param end the upper bound of the range of sez occupant share holding infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez occupant share holding infos
	 */
	public static List<SezOccupantShareHoldingInfo> findAll(
		int start, int end,
		OrderByComparator<SezOccupantShareHoldingInfo> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the sez occupant share holding infos from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of sez occupant share holding infos.
	 *
	 * @return the number of sez occupant share holding infos
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static SezOccupantShareHoldingInfoPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		SezOccupantShareHoldingInfoPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile SezOccupantShareHoldingInfoPersistence _persistence;

}