/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.stage.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.hsra.stage.services.model.HsraApplicationDeskVeri;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the hsra application desk veri service. This utility wraps <code>com.nbp.hsra.stage.services.service.persistence.impl.HsraApplicationDeskVeriPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HsraApplicationDeskVeriPersistence
 * @generated
 */
public class HsraApplicationDeskVeriUtil {

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
		HsraApplicationDeskVeri hsraApplicationDeskVeri) {

		getPersistence().clearCache(hsraApplicationDeskVeri);
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
	public static Map<Serializable, HsraApplicationDeskVeri> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<HsraApplicationDeskVeri> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<HsraApplicationDeskVeri> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<HsraApplicationDeskVeri> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<HsraApplicationDeskVeri> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static HsraApplicationDeskVeri update(
		HsraApplicationDeskVeri hsraApplicationDeskVeri) {

		return getPersistence().update(hsraApplicationDeskVeri);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static HsraApplicationDeskVeri update(
		HsraApplicationDeskVeri hsraApplicationDeskVeri,
		ServiceContext serviceContext) {

		return getPersistence().update(hsraApplicationDeskVeri, serviceContext);
	}

	/**
	 * Returns all the hsra application desk veris where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching hsra application desk veris
	 */
	public static List<HsraApplicationDeskVeri> findBygetHsraAppDV_ById(
		long hsraApplicationId) {

		return getPersistence().findBygetHsraAppDV_ById(hsraApplicationId);
	}

	/**
	 * Returns a range of all the hsra application desk veris where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationDeskVeriModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of hsra application desk veris
	 * @param end the upper bound of the range of hsra application desk veris (not inclusive)
	 * @return the range of matching hsra application desk veris
	 */
	public static List<HsraApplicationDeskVeri> findBygetHsraAppDV_ById(
		long hsraApplicationId, int start, int end) {

		return getPersistence().findBygetHsraAppDV_ById(
			hsraApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the hsra application desk veris where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationDeskVeriModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of hsra application desk veris
	 * @param end the upper bound of the range of hsra application desk veris (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching hsra application desk veris
	 */
	public static List<HsraApplicationDeskVeri> findBygetHsraAppDV_ById(
		long hsraApplicationId, int start, int end,
		OrderByComparator<HsraApplicationDeskVeri> orderByComparator) {

		return getPersistence().findBygetHsraAppDV_ById(
			hsraApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the hsra application desk veris where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationDeskVeriModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of hsra application desk veris
	 * @param end the upper bound of the range of hsra application desk veris (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching hsra application desk veris
	 */
	public static List<HsraApplicationDeskVeri> findBygetHsraAppDV_ById(
		long hsraApplicationId, int start, int end,
		OrderByComparator<HsraApplicationDeskVeri> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetHsraAppDV_ById(
			hsraApplicationId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first hsra application desk veri in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra application desk veri
	 * @throws NoSuchHsraApplicationDeskVeriException if a matching hsra application desk veri could not be found
	 */
	public static HsraApplicationDeskVeri findBygetHsraAppDV_ById_First(
			long hsraApplicationId,
			OrderByComparator<HsraApplicationDeskVeri> orderByComparator)
		throws com.nbp.hsra.stage.services.exception.
			NoSuchHsraApplicationDeskVeriException {

		return getPersistence().findBygetHsraAppDV_ById_First(
			hsraApplicationId, orderByComparator);
	}

	/**
	 * Returns the first hsra application desk veri in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra application desk veri, or <code>null</code> if a matching hsra application desk veri could not be found
	 */
	public static HsraApplicationDeskVeri fetchBygetHsraAppDV_ById_First(
		long hsraApplicationId,
		OrderByComparator<HsraApplicationDeskVeri> orderByComparator) {

		return getPersistence().fetchBygetHsraAppDV_ById_First(
			hsraApplicationId, orderByComparator);
	}

	/**
	 * Returns the last hsra application desk veri in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra application desk veri
	 * @throws NoSuchHsraApplicationDeskVeriException if a matching hsra application desk veri could not be found
	 */
	public static HsraApplicationDeskVeri findBygetHsraAppDV_ById_Last(
			long hsraApplicationId,
			OrderByComparator<HsraApplicationDeskVeri> orderByComparator)
		throws com.nbp.hsra.stage.services.exception.
			NoSuchHsraApplicationDeskVeriException {

		return getPersistence().findBygetHsraAppDV_ById_Last(
			hsraApplicationId, orderByComparator);
	}

	/**
	 * Returns the last hsra application desk veri in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra application desk veri, or <code>null</code> if a matching hsra application desk veri could not be found
	 */
	public static HsraApplicationDeskVeri fetchBygetHsraAppDV_ById_Last(
		long hsraApplicationId,
		OrderByComparator<HsraApplicationDeskVeri> orderByComparator) {

		return getPersistence().fetchBygetHsraAppDV_ById_Last(
			hsraApplicationId, orderByComparator);
	}

	/**
	 * Returns the hsra application desk veris before and after the current hsra application desk veri in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationDeskVeriId the primary key of the current hsra application desk veri
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next hsra application desk veri
	 * @throws NoSuchHsraApplicationDeskVeriException if a hsra application desk veri with the primary key could not be found
	 */
	public static HsraApplicationDeskVeri[] findBygetHsraAppDV_ById_PrevAndNext(
			long hsraApplicationDeskVeriId, long hsraApplicationId,
			OrderByComparator<HsraApplicationDeskVeri> orderByComparator)
		throws com.nbp.hsra.stage.services.exception.
			NoSuchHsraApplicationDeskVeriException {

		return getPersistence().findBygetHsraAppDV_ById_PrevAndNext(
			hsraApplicationDeskVeriId, hsraApplicationId, orderByComparator);
	}

	/**
	 * Removes all the hsra application desk veris where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 */
	public static void removeBygetHsraAppDV_ById(long hsraApplicationId) {
		getPersistence().removeBygetHsraAppDV_ById(hsraApplicationId);
	}

	/**
	 * Returns the number of hsra application desk veris where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching hsra application desk veris
	 */
	public static int countBygetHsraAppDV_ById(long hsraApplicationId) {
		return getPersistence().countBygetHsraAppDV_ById(hsraApplicationId);
	}

	/**
	 * Caches the hsra application desk veri in the entity cache if it is enabled.
	 *
	 * @param hsraApplicationDeskVeri the hsra application desk veri
	 */
	public static void cacheResult(
		HsraApplicationDeskVeri hsraApplicationDeskVeri) {

		getPersistence().cacheResult(hsraApplicationDeskVeri);
	}

	/**
	 * Caches the hsra application desk veris in the entity cache if it is enabled.
	 *
	 * @param hsraApplicationDeskVeris the hsra application desk veris
	 */
	public static void cacheResult(
		List<HsraApplicationDeskVeri> hsraApplicationDeskVeris) {

		getPersistence().cacheResult(hsraApplicationDeskVeris);
	}

	/**
	 * Creates a new hsra application desk veri with the primary key. Does not add the hsra application desk veri to the database.
	 *
	 * @param hsraApplicationDeskVeriId the primary key for the new hsra application desk veri
	 * @return the new hsra application desk veri
	 */
	public static HsraApplicationDeskVeri create(
		long hsraApplicationDeskVeriId) {

		return getPersistence().create(hsraApplicationDeskVeriId);
	}

	/**
	 * Removes the hsra application desk veri with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param hsraApplicationDeskVeriId the primary key of the hsra application desk veri
	 * @return the hsra application desk veri that was removed
	 * @throws NoSuchHsraApplicationDeskVeriException if a hsra application desk veri with the primary key could not be found
	 */
	public static HsraApplicationDeskVeri remove(long hsraApplicationDeskVeriId)
		throws com.nbp.hsra.stage.services.exception.
			NoSuchHsraApplicationDeskVeriException {

		return getPersistence().remove(hsraApplicationDeskVeriId);
	}

	public static HsraApplicationDeskVeri updateImpl(
		HsraApplicationDeskVeri hsraApplicationDeskVeri) {

		return getPersistence().updateImpl(hsraApplicationDeskVeri);
	}

	/**
	 * Returns the hsra application desk veri with the primary key or throws a <code>NoSuchHsraApplicationDeskVeriException</code> if it could not be found.
	 *
	 * @param hsraApplicationDeskVeriId the primary key of the hsra application desk veri
	 * @return the hsra application desk veri
	 * @throws NoSuchHsraApplicationDeskVeriException if a hsra application desk veri with the primary key could not be found
	 */
	public static HsraApplicationDeskVeri findByPrimaryKey(
			long hsraApplicationDeskVeriId)
		throws com.nbp.hsra.stage.services.exception.
			NoSuchHsraApplicationDeskVeriException {

		return getPersistence().findByPrimaryKey(hsraApplicationDeskVeriId);
	}

	/**
	 * Returns the hsra application desk veri with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param hsraApplicationDeskVeriId the primary key of the hsra application desk veri
	 * @return the hsra application desk veri, or <code>null</code> if a hsra application desk veri with the primary key could not be found
	 */
	public static HsraApplicationDeskVeri fetchByPrimaryKey(
		long hsraApplicationDeskVeriId) {

		return getPersistence().fetchByPrimaryKey(hsraApplicationDeskVeriId);
	}

	/**
	 * Returns all the hsra application desk veris.
	 *
	 * @return the hsra application desk veris
	 */
	public static List<HsraApplicationDeskVeri> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the hsra application desk veris.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationDeskVeriModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of hsra application desk veris
	 * @param end the upper bound of the range of hsra application desk veris (not inclusive)
	 * @return the range of hsra application desk veris
	 */
	public static List<HsraApplicationDeskVeri> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the hsra application desk veris.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationDeskVeriModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of hsra application desk veris
	 * @param end the upper bound of the range of hsra application desk veris (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of hsra application desk veris
	 */
	public static List<HsraApplicationDeskVeri> findAll(
		int start, int end,
		OrderByComparator<HsraApplicationDeskVeri> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the hsra application desk veris.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationDeskVeriModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of hsra application desk veris
	 * @param end the upper bound of the range of hsra application desk veris (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of hsra application desk veris
	 */
	public static List<HsraApplicationDeskVeri> findAll(
		int start, int end,
		OrderByComparator<HsraApplicationDeskVeri> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the hsra application desk veris from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of hsra application desk veris.
	 *
	 * @return the number of hsra application desk veris
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static HsraApplicationDeskVeriPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		HsraApplicationDeskVeriPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile HsraApplicationDeskVeriPersistence _persistence;

}