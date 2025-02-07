/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.wra.application.form.service.model.WRAReqIrrigation;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the wra req irrigation service. This utility wraps <code>com.nbp.wra.application.form.service.service.persistence.impl.WRAReqIrrigationPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see WRAReqIrrigationPersistence
 * @generated
 */
public class WRAReqIrrigationUtil {

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
	public static void clearCache(WRAReqIrrigation wraReqIrrigation) {
		getPersistence().clearCache(wraReqIrrigation);
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
	public static Map<Serializable, WRAReqIrrigation> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<WRAReqIrrigation> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<WRAReqIrrigation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<WRAReqIrrigation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<WRAReqIrrigation> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static WRAReqIrrigation update(WRAReqIrrigation wraReqIrrigation) {
		return getPersistence().update(wraReqIrrigation);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static WRAReqIrrigation update(
		WRAReqIrrigation wraReqIrrigation, ServiceContext serviceContext) {

		return getPersistence().update(wraReqIrrigation, serviceContext);
	}

	/**
	 * Returns the wra req irrigation where wraApplicationId = &#63; or throws a <code>NoSuchWRAReqIrrigationException</code> if it could not be found.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the matching wra req irrigation
	 * @throws NoSuchWRAReqIrrigationException if a matching wra req irrigation could not be found
	 */
	public static WRAReqIrrigation findBygetWRA_By_Id(long wraApplicationId)
		throws com.nbp.wra.application.form.service.exception.
			NoSuchWRAReqIrrigationException {

		return getPersistence().findBygetWRA_By_Id(wraApplicationId);
	}

	/**
	 * Returns the wra req irrigation where wraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the matching wra req irrigation, or <code>null</code> if a matching wra req irrigation could not be found
	 */
	public static WRAReqIrrigation fetchBygetWRA_By_Id(long wraApplicationId) {
		return getPersistence().fetchBygetWRA_By_Id(wraApplicationId);
	}

	/**
	 * Returns the wra req irrigation where wraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param wraApplicationId the wra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching wra req irrigation, or <code>null</code> if a matching wra req irrigation could not be found
	 */
	public static WRAReqIrrigation fetchBygetWRA_By_Id(
		long wraApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetWRA_By_Id(
			wraApplicationId, useFinderCache);
	}

	/**
	 * Removes the wra req irrigation where wraApplicationId = &#63; from the database.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the wra req irrigation that was removed
	 */
	public static WRAReqIrrigation removeBygetWRA_By_Id(long wraApplicationId)
		throws com.nbp.wra.application.form.service.exception.
			NoSuchWRAReqIrrigationException {

		return getPersistence().removeBygetWRA_By_Id(wraApplicationId);
	}

	/**
	 * Returns the number of wra req irrigations where wraApplicationId = &#63;.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the number of matching wra req irrigations
	 */
	public static int countBygetWRA_By_Id(long wraApplicationId) {
		return getPersistence().countBygetWRA_By_Id(wraApplicationId);
	}

	/**
	 * Returns all the wra req irrigations where wraApplicationId = &#63;.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the matching wra req irrigations
	 */
	public static List<WRAReqIrrigation> findBygetWRA_By_AppId(
		long wraApplicationId) {

		return getPersistence().findBygetWRA_By_AppId(wraApplicationId);
	}

	/**
	 * Returns a range of all the wra req irrigations where wraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAReqIrrigationModelImpl</code>.
	 * </p>
	 *
	 * @param wraApplicationId the wra application ID
	 * @param start the lower bound of the range of wra req irrigations
	 * @param end the upper bound of the range of wra req irrigations (not inclusive)
	 * @return the range of matching wra req irrigations
	 */
	public static List<WRAReqIrrigation> findBygetWRA_By_AppId(
		long wraApplicationId, int start, int end) {

		return getPersistence().findBygetWRA_By_AppId(
			wraApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the wra req irrigations where wraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAReqIrrigationModelImpl</code>.
	 * </p>
	 *
	 * @param wraApplicationId the wra application ID
	 * @param start the lower bound of the range of wra req irrigations
	 * @param end the upper bound of the range of wra req irrigations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching wra req irrigations
	 */
	public static List<WRAReqIrrigation> findBygetWRA_By_AppId(
		long wraApplicationId, int start, int end,
		OrderByComparator<WRAReqIrrigation> orderByComparator) {

		return getPersistence().findBygetWRA_By_AppId(
			wraApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the wra req irrigations where wraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAReqIrrigationModelImpl</code>.
	 * </p>
	 *
	 * @param wraApplicationId the wra application ID
	 * @param start the lower bound of the range of wra req irrigations
	 * @param end the upper bound of the range of wra req irrigations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching wra req irrigations
	 */
	public static List<WRAReqIrrigation> findBygetWRA_By_AppId(
		long wraApplicationId, int start, int end,
		OrderByComparator<WRAReqIrrigation> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetWRA_By_AppId(
			wraApplicationId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first wra req irrigation in the ordered set where wraApplicationId = &#63;.
	 *
	 * @param wraApplicationId the wra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra req irrigation
	 * @throws NoSuchWRAReqIrrigationException if a matching wra req irrigation could not be found
	 */
	public static WRAReqIrrigation findBygetWRA_By_AppId_First(
			long wraApplicationId,
			OrderByComparator<WRAReqIrrigation> orderByComparator)
		throws com.nbp.wra.application.form.service.exception.
			NoSuchWRAReqIrrigationException {

		return getPersistence().findBygetWRA_By_AppId_First(
			wraApplicationId, orderByComparator);
	}

	/**
	 * Returns the first wra req irrigation in the ordered set where wraApplicationId = &#63;.
	 *
	 * @param wraApplicationId the wra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra req irrigation, or <code>null</code> if a matching wra req irrigation could not be found
	 */
	public static WRAReqIrrigation fetchBygetWRA_By_AppId_First(
		long wraApplicationId,
		OrderByComparator<WRAReqIrrigation> orderByComparator) {

		return getPersistence().fetchBygetWRA_By_AppId_First(
			wraApplicationId, orderByComparator);
	}

	/**
	 * Returns the last wra req irrigation in the ordered set where wraApplicationId = &#63;.
	 *
	 * @param wraApplicationId the wra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra req irrigation
	 * @throws NoSuchWRAReqIrrigationException if a matching wra req irrigation could not be found
	 */
	public static WRAReqIrrigation findBygetWRA_By_AppId_Last(
			long wraApplicationId,
			OrderByComparator<WRAReqIrrigation> orderByComparator)
		throws com.nbp.wra.application.form.service.exception.
			NoSuchWRAReqIrrigationException {

		return getPersistence().findBygetWRA_By_AppId_Last(
			wraApplicationId, orderByComparator);
	}

	/**
	 * Returns the last wra req irrigation in the ordered set where wraApplicationId = &#63;.
	 *
	 * @param wraApplicationId the wra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra req irrigation, or <code>null</code> if a matching wra req irrigation could not be found
	 */
	public static WRAReqIrrigation fetchBygetWRA_By_AppId_Last(
		long wraApplicationId,
		OrderByComparator<WRAReqIrrigation> orderByComparator) {

		return getPersistence().fetchBygetWRA_By_AppId_Last(
			wraApplicationId, orderByComparator);
	}

	/**
	 * Returns the wra req irrigations before and after the current wra req irrigation in the ordered set where wraApplicationId = &#63;.
	 *
	 * @param wraReqIrrigationId the primary key of the current wra req irrigation
	 * @param wraApplicationId the wra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next wra req irrigation
	 * @throws NoSuchWRAReqIrrigationException if a wra req irrigation with the primary key could not be found
	 */
	public static WRAReqIrrigation[] findBygetWRA_By_AppId_PrevAndNext(
			long wraReqIrrigationId, long wraApplicationId,
			OrderByComparator<WRAReqIrrigation> orderByComparator)
		throws com.nbp.wra.application.form.service.exception.
			NoSuchWRAReqIrrigationException {

		return getPersistence().findBygetWRA_By_AppId_PrevAndNext(
			wraReqIrrigationId, wraApplicationId, orderByComparator);
	}

	/**
	 * Removes all the wra req irrigations where wraApplicationId = &#63; from the database.
	 *
	 * @param wraApplicationId the wra application ID
	 */
	public static void removeBygetWRA_By_AppId(long wraApplicationId) {
		getPersistence().removeBygetWRA_By_AppId(wraApplicationId);
	}

	/**
	 * Returns the number of wra req irrigations where wraApplicationId = &#63;.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the number of matching wra req irrigations
	 */
	public static int countBygetWRA_By_AppId(long wraApplicationId) {
		return getPersistence().countBygetWRA_By_AppId(wraApplicationId);
	}

	/**
	 * Returns all the wra req irrigations where wraApplicationId = &#63;.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the matching wra req irrigations
	 */
	public static List<WRAReqIrrigation> findBygetWRA_By_CtrAppId(
		long wraApplicationId) {

		return getPersistence().findBygetWRA_By_CtrAppId(wraApplicationId);
	}

	/**
	 * Returns a range of all the wra req irrigations where wraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAReqIrrigationModelImpl</code>.
	 * </p>
	 *
	 * @param wraApplicationId the wra application ID
	 * @param start the lower bound of the range of wra req irrigations
	 * @param end the upper bound of the range of wra req irrigations (not inclusive)
	 * @return the range of matching wra req irrigations
	 */
	public static List<WRAReqIrrigation> findBygetWRA_By_CtrAppId(
		long wraApplicationId, int start, int end) {

		return getPersistence().findBygetWRA_By_CtrAppId(
			wraApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the wra req irrigations where wraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAReqIrrigationModelImpl</code>.
	 * </p>
	 *
	 * @param wraApplicationId the wra application ID
	 * @param start the lower bound of the range of wra req irrigations
	 * @param end the upper bound of the range of wra req irrigations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching wra req irrigations
	 */
	public static List<WRAReqIrrigation> findBygetWRA_By_CtrAppId(
		long wraApplicationId, int start, int end,
		OrderByComparator<WRAReqIrrigation> orderByComparator) {

		return getPersistence().findBygetWRA_By_CtrAppId(
			wraApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the wra req irrigations where wraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAReqIrrigationModelImpl</code>.
	 * </p>
	 *
	 * @param wraApplicationId the wra application ID
	 * @param start the lower bound of the range of wra req irrigations
	 * @param end the upper bound of the range of wra req irrigations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching wra req irrigations
	 */
	public static List<WRAReqIrrigation> findBygetWRA_By_CtrAppId(
		long wraApplicationId, int start, int end,
		OrderByComparator<WRAReqIrrigation> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetWRA_By_CtrAppId(
			wraApplicationId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first wra req irrigation in the ordered set where wraApplicationId = &#63;.
	 *
	 * @param wraApplicationId the wra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra req irrigation
	 * @throws NoSuchWRAReqIrrigationException if a matching wra req irrigation could not be found
	 */
	public static WRAReqIrrigation findBygetWRA_By_CtrAppId_First(
			long wraApplicationId,
			OrderByComparator<WRAReqIrrigation> orderByComparator)
		throws com.nbp.wra.application.form.service.exception.
			NoSuchWRAReqIrrigationException {

		return getPersistence().findBygetWRA_By_CtrAppId_First(
			wraApplicationId, orderByComparator);
	}

	/**
	 * Returns the first wra req irrigation in the ordered set where wraApplicationId = &#63;.
	 *
	 * @param wraApplicationId the wra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra req irrigation, or <code>null</code> if a matching wra req irrigation could not be found
	 */
	public static WRAReqIrrigation fetchBygetWRA_By_CtrAppId_First(
		long wraApplicationId,
		OrderByComparator<WRAReqIrrigation> orderByComparator) {

		return getPersistence().fetchBygetWRA_By_CtrAppId_First(
			wraApplicationId, orderByComparator);
	}

	/**
	 * Returns the last wra req irrigation in the ordered set where wraApplicationId = &#63;.
	 *
	 * @param wraApplicationId the wra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra req irrigation
	 * @throws NoSuchWRAReqIrrigationException if a matching wra req irrigation could not be found
	 */
	public static WRAReqIrrigation findBygetWRA_By_CtrAppId_Last(
			long wraApplicationId,
			OrderByComparator<WRAReqIrrigation> orderByComparator)
		throws com.nbp.wra.application.form.service.exception.
			NoSuchWRAReqIrrigationException {

		return getPersistence().findBygetWRA_By_CtrAppId_Last(
			wraApplicationId, orderByComparator);
	}

	/**
	 * Returns the last wra req irrigation in the ordered set where wraApplicationId = &#63;.
	 *
	 * @param wraApplicationId the wra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra req irrigation, or <code>null</code> if a matching wra req irrigation could not be found
	 */
	public static WRAReqIrrigation fetchBygetWRA_By_CtrAppId_Last(
		long wraApplicationId,
		OrderByComparator<WRAReqIrrigation> orderByComparator) {

		return getPersistence().fetchBygetWRA_By_CtrAppId_Last(
			wraApplicationId, orderByComparator);
	}

	/**
	 * Returns the wra req irrigations before and after the current wra req irrigation in the ordered set where wraApplicationId = &#63;.
	 *
	 * @param wraReqIrrigationId the primary key of the current wra req irrigation
	 * @param wraApplicationId the wra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next wra req irrigation
	 * @throws NoSuchWRAReqIrrigationException if a wra req irrigation with the primary key could not be found
	 */
	public static WRAReqIrrigation[] findBygetWRA_By_CtrAppId_PrevAndNext(
			long wraReqIrrigationId, long wraApplicationId,
			OrderByComparator<WRAReqIrrigation> orderByComparator)
		throws com.nbp.wra.application.form.service.exception.
			NoSuchWRAReqIrrigationException {

		return getPersistence().findBygetWRA_By_CtrAppId_PrevAndNext(
			wraReqIrrigationId, wraApplicationId, orderByComparator);
	}

	/**
	 * Removes all the wra req irrigations where wraApplicationId = &#63; from the database.
	 *
	 * @param wraApplicationId the wra application ID
	 */
	public static void removeBygetWRA_By_CtrAppId(long wraApplicationId) {
		getPersistence().removeBygetWRA_By_CtrAppId(wraApplicationId);
	}

	/**
	 * Returns the number of wra req irrigations where wraApplicationId = &#63;.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the number of matching wra req irrigations
	 */
	public static int countBygetWRA_By_CtrAppId(long wraApplicationId) {
		return getPersistence().countBygetWRA_By_CtrAppId(wraApplicationId);
	}

	/**
	 * Caches the wra req irrigation in the entity cache if it is enabled.
	 *
	 * @param wraReqIrrigation the wra req irrigation
	 */
	public static void cacheResult(WRAReqIrrigation wraReqIrrigation) {
		getPersistence().cacheResult(wraReqIrrigation);
	}

	/**
	 * Caches the wra req irrigations in the entity cache if it is enabled.
	 *
	 * @param wraReqIrrigations the wra req irrigations
	 */
	public static void cacheResult(List<WRAReqIrrigation> wraReqIrrigations) {
		getPersistence().cacheResult(wraReqIrrigations);
	}

	/**
	 * Creates a new wra req irrigation with the primary key. Does not add the wra req irrigation to the database.
	 *
	 * @param wraReqIrrigationId the primary key for the new wra req irrigation
	 * @return the new wra req irrigation
	 */
	public static WRAReqIrrigation create(long wraReqIrrigationId) {
		return getPersistence().create(wraReqIrrigationId);
	}

	/**
	 * Removes the wra req irrigation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param wraReqIrrigationId the primary key of the wra req irrigation
	 * @return the wra req irrigation that was removed
	 * @throws NoSuchWRAReqIrrigationException if a wra req irrigation with the primary key could not be found
	 */
	public static WRAReqIrrigation remove(long wraReqIrrigationId)
		throws com.nbp.wra.application.form.service.exception.
			NoSuchWRAReqIrrigationException {

		return getPersistence().remove(wraReqIrrigationId);
	}

	public static WRAReqIrrigation updateImpl(
		WRAReqIrrigation wraReqIrrigation) {

		return getPersistence().updateImpl(wraReqIrrigation);
	}

	/**
	 * Returns the wra req irrigation with the primary key or throws a <code>NoSuchWRAReqIrrigationException</code> if it could not be found.
	 *
	 * @param wraReqIrrigationId the primary key of the wra req irrigation
	 * @return the wra req irrigation
	 * @throws NoSuchWRAReqIrrigationException if a wra req irrigation with the primary key could not be found
	 */
	public static WRAReqIrrigation findByPrimaryKey(long wraReqIrrigationId)
		throws com.nbp.wra.application.form.service.exception.
			NoSuchWRAReqIrrigationException {

		return getPersistence().findByPrimaryKey(wraReqIrrigationId);
	}

	/**
	 * Returns the wra req irrigation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param wraReqIrrigationId the primary key of the wra req irrigation
	 * @return the wra req irrigation, or <code>null</code> if a wra req irrigation with the primary key could not be found
	 */
	public static WRAReqIrrigation fetchByPrimaryKey(long wraReqIrrigationId) {
		return getPersistence().fetchByPrimaryKey(wraReqIrrigationId);
	}

	/**
	 * Returns all the wra req irrigations.
	 *
	 * @return the wra req irrigations
	 */
	public static List<WRAReqIrrigation> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the wra req irrigations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAReqIrrigationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of wra req irrigations
	 * @param end the upper bound of the range of wra req irrigations (not inclusive)
	 * @return the range of wra req irrigations
	 */
	public static List<WRAReqIrrigation> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the wra req irrigations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAReqIrrigationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of wra req irrigations
	 * @param end the upper bound of the range of wra req irrigations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of wra req irrigations
	 */
	public static List<WRAReqIrrigation> findAll(
		int start, int end,
		OrderByComparator<WRAReqIrrigation> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the wra req irrigations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAReqIrrigationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of wra req irrigations
	 * @param end the upper bound of the range of wra req irrigations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of wra req irrigations
	 */
	public static List<WRAReqIrrigation> findAll(
		int start, int end,
		OrderByComparator<WRAReqIrrigation> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the wra req irrigations from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of wra req irrigations.
	 *
	 * @return the number of wra req irrigations
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static WRAReqIrrigationPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(WRAReqIrrigationPersistence persistence) {
		_persistence = persistence;
	}

	private static volatile WRAReqIrrigationPersistence _persistence;

}