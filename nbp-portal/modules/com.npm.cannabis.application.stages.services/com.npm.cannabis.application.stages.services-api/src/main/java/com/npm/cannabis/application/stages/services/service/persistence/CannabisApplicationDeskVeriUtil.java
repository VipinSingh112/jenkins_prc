/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.npm.cannabis.application.stages.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.npm.cannabis.application.stages.services.model.CannabisApplicationDeskVeri;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the cannabis application desk veri service. This utility wraps <code>com.npm.cannabis.application.stages.services.service.persistence.impl.CannabisApplicationDeskVeriPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CannabisApplicationDeskVeriPersistence
 * @generated
 */
public class CannabisApplicationDeskVeriUtil {

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
		CannabisApplicationDeskVeri cannabisApplicationDeskVeri) {

		getPersistence().clearCache(cannabisApplicationDeskVeri);
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
	public static Map<Serializable, CannabisApplicationDeskVeri>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<CannabisApplicationDeskVeri> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CannabisApplicationDeskVeri> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CannabisApplicationDeskVeri> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<CannabisApplicationDeskVeri> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static CannabisApplicationDeskVeri update(
		CannabisApplicationDeskVeri cannabisApplicationDeskVeri) {

		return getPersistence().update(cannabisApplicationDeskVeri);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static CannabisApplicationDeskVeri update(
		CannabisApplicationDeskVeri cannabisApplicationDeskVeri,
		ServiceContext serviceContext) {

		return getPersistence().update(
			cannabisApplicationDeskVeri, serviceContext);
	}

	/**
	 * Returns all the cannabis application desk veris where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the matching cannabis application desk veris
	 */
	public static List<CannabisApplicationDeskVeri> findBygetCannabisAppDV_ById(
		long cannabisApplicationId) {

		return getPersistence().findBygetCannabisAppDV_ById(
			cannabisApplicationId);
	}

	/**
	 * Returns a range of all the cannabis application desk veris where cannabisApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationDeskVeriModelImpl</code>.
	 * </p>
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param start the lower bound of the range of cannabis application desk veris
	 * @param end the upper bound of the range of cannabis application desk veris (not inclusive)
	 * @return the range of matching cannabis application desk veris
	 */
	public static List<CannabisApplicationDeskVeri> findBygetCannabisAppDV_ById(
		long cannabisApplicationId, int start, int end) {

		return getPersistence().findBygetCannabisAppDV_ById(
			cannabisApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the cannabis application desk veris where cannabisApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationDeskVeriModelImpl</code>.
	 * </p>
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param start the lower bound of the range of cannabis application desk veris
	 * @param end the upper bound of the range of cannabis application desk veris (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis application desk veris
	 */
	public static List<CannabisApplicationDeskVeri> findBygetCannabisAppDV_ById(
		long cannabisApplicationId, int start, int end,
		OrderByComparator<CannabisApplicationDeskVeri> orderByComparator) {

		return getPersistence().findBygetCannabisAppDV_ById(
			cannabisApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the cannabis application desk veris where cannabisApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationDeskVeriModelImpl</code>.
	 * </p>
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param start the lower bound of the range of cannabis application desk veris
	 * @param end the upper bound of the range of cannabis application desk veris (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis application desk veris
	 */
	public static List<CannabisApplicationDeskVeri> findBygetCannabisAppDV_ById(
		long cannabisApplicationId, int start, int end,
		OrderByComparator<CannabisApplicationDeskVeri> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetCannabisAppDV_ById(
			cannabisApplicationId, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first cannabis application desk veri in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application desk veri
	 * @throws NoSuchCannabisApplicationDeskVeriException if a matching cannabis application desk veri could not be found
	 */
	public static CannabisApplicationDeskVeri findBygetCannabisAppDV_ById_First(
			long cannabisApplicationId,
			OrderByComparator<CannabisApplicationDeskVeri> orderByComparator)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisApplicationDeskVeriException {

		return getPersistence().findBygetCannabisAppDV_ById_First(
			cannabisApplicationId, orderByComparator);
	}

	/**
	 * Returns the first cannabis application desk veri in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application desk veri, or <code>null</code> if a matching cannabis application desk veri could not be found
	 */
	public static CannabisApplicationDeskVeri
		fetchBygetCannabisAppDV_ById_First(
			long cannabisApplicationId,
			OrderByComparator<CannabisApplicationDeskVeri> orderByComparator) {

		return getPersistence().fetchBygetCannabisAppDV_ById_First(
			cannabisApplicationId, orderByComparator);
	}

	/**
	 * Returns the last cannabis application desk veri in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application desk veri
	 * @throws NoSuchCannabisApplicationDeskVeriException if a matching cannabis application desk veri could not be found
	 */
	public static CannabisApplicationDeskVeri findBygetCannabisAppDV_ById_Last(
			long cannabisApplicationId,
			OrderByComparator<CannabisApplicationDeskVeri> orderByComparator)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisApplicationDeskVeriException {

		return getPersistence().findBygetCannabisAppDV_ById_Last(
			cannabisApplicationId, orderByComparator);
	}

	/**
	 * Returns the last cannabis application desk veri in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application desk veri, or <code>null</code> if a matching cannabis application desk veri could not be found
	 */
	public static CannabisApplicationDeskVeri fetchBygetCannabisAppDV_ById_Last(
		long cannabisApplicationId,
		OrderByComparator<CannabisApplicationDeskVeri> orderByComparator) {

		return getPersistence().fetchBygetCannabisAppDV_ById_Last(
			cannabisApplicationId, orderByComparator);
	}

	/**
	 * Returns the cannabis application desk veris before and after the current cannabis application desk veri in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisDeskVeriId the primary key of the current cannabis application desk veri
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis application desk veri
	 * @throws NoSuchCannabisApplicationDeskVeriException if a cannabis application desk veri with the primary key could not be found
	 */
	public static CannabisApplicationDeskVeri[]
			findBygetCannabisAppDV_ById_PrevAndNext(
				long cannabisDeskVeriId, long cannabisApplicationId,
				OrderByComparator<CannabisApplicationDeskVeri>
					orderByComparator)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisApplicationDeskVeriException {

		return getPersistence().findBygetCannabisAppDV_ById_PrevAndNext(
			cannabisDeskVeriId, cannabisApplicationId, orderByComparator);
	}

	/**
	 * Removes all the cannabis application desk veris where cannabisApplicationId = &#63; from the database.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 */
	public static void removeBygetCannabisAppDV_ById(
		long cannabisApplicationId) {

		getPersistence().removeBygetCannabisAppDV_ById(cannabisApplicationId);
	}

	/**
	 * Returns the number of cannabis application desk veris where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the number of matching cannabis application desk veris
	 */
	public static int countBygetCannabisAppDV_ById(long cannabisApplicationId) {
		return getPersistence().countBygetCannabisAppDV_ById(
			cannabisApplicationId);
	}

	/**
	 * Caches the cannabis application desk veri in the entity cache if it is enabled.
	 *
	 * @param cannabisApplicationDeskVeri the cannabis application desk veri
	 */
	public static void cacheResult(
		CannabisApplicationDeskVeri cannabisApplicationDeskVeri) {

		getPersistence().cacheResult(cannabisApplicationDeskVeri);
	}

	/**
	 * Caches the cannabis application desk veris in the entity cache if it is enabled.
	 *
	 * @param cannabisApplicationDeskVeris the cannabis application desk veris
	 */
	public static void cacheResult(
		List<CannabisApplicationDeskVeri> cannabisApplicationDeskVeris) {

		getPersistence().cacheResult(cannabisApplicationDeskVeris);
	}

	/**
	 * Creates a new cannabis application desk veri with the primary key. Does not add the cannabis application desk veri to the database.
	 *
	 * @param cannabisDeskVeriId the primary key for the new cannabis application desk veri
	 * @return the new cannabis application desk veri
	 */
	public static CannabisApplicationDeskVeri create(long cannabisDeskVeriId) {
		return getPersistence().create(cannabisDeskVeriId);
	}

	/**
	 * Removes the cannabis application desk veri with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param cannabisDeskVeriId the primary key of the cannabis application desk veri
	 * @return the cannabis application desk veri that was removed
	 * @throws NoSuchCannabisApplicationDeskVeriException if a cannabis application desk veri with the primary key could not be found
	 */
	public static CannabisApplicationDeskVeri remove(long cannabisDeskVeriId)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisApplicationDeskVeriException {

		return getPersistence().remove(cannabisDeskVeriId);
	}

	public static CannabisApplicationDeskVeri updateImpl(
		CannabisApplicationDeskVeri cannabisApplicationDeskVeri) {

		return getPersistence().updateImpl(cannabisApplicationDeskVeri);
	}

	/**
	 * Returns the cannabis application desk veri with the primary key or throws a <code>NoSuchCannabisApplicationDeskVeriException</code> if it could not be found.
	 *
	 * @param cannabisDeskVeriId the primary key of the cannabis application desk veri
	 * @return the cannabis application desk veri
	 * @throws NoSuchCannabisApplicationDeskVeriException if a cannabis application desk veri with the primary key could not be found
	 */
	public static CannabisApplicationDeskVeri findByPrimaryKey(
			long cannabisDeskVeriId)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisApplicationDeskVeriException {

		return getPersistence().findByPrimaryKey(cannabisDeskVeriId);
	}

	/**
	 * Returns the cannabis application desk veri with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param cannabisDeskVeriId the primary key of the cannabis application desk veri
	 * @return the cannabis application desk veri, or <code>null</code> if a cannabis application desk veri with the primary key could not be found
	 */
	public static CannabisApplicationDeskVeri fetchByPrimaryKey(
		long cannabisDeskVeriId) {

		return getPersistence().fetchByPrimaryKey(cannabisDeskVeriId);
	}

	/**
	 * Returns all the cannabis application desk veris.
	 *
	 * @return the cannabis application desk veris
	 */
	public static List<CannabisApplicationDeskVeri> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the cannabis application desk veris.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationDeskVeriModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis application desk veris
	 * @param end the upper bound of the range of cannabis application desk veris (not inclusive)
	 * @return the range of cannabis application desk veris
	 */
	public static List<CannabisApplicationDeskVeri> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the cannabis application desk veris.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationDeskVeriModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis application desk veris
	 * @param end the upper bound of the range of cannabis application desk veris (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of cannabis application desk veris
	 */
	public static List<CannabisApplicationDeskVeri> findAll(
		int start, int end,
		OrderByComparator<CannabisApplicationDeskVeri> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the cannabis application desk veris.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationDeskVeriModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis application desk veris
	 * @param end the upper bound of the range of cannabis application desk veris (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of cannabis application desk veris
	 */
	public static List<CannabisApplicationDeskVeri> findAll(
		int start, int end,
		OrderByComparator<CannabisApplicationDeskVeri> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the cannabis application desk veris from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of cannabis application desk veris.
	 *
	 * @return the number of cannabis application desk veris
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static CannabisApplicationDeskVeriPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		CannabisApplicationDeskVeriPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile CannabisApplicationDeskVeriPersistence _persistence;

}