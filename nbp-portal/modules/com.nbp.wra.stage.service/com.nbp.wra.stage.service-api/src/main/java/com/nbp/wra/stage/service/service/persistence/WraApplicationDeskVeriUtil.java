/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.stage.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.wra.stage.service.model.WraApplicationDeskVeri;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the wra application desk veri service. This utility wraps <code>com.nbp.wra.stage.service.service.persistence.impl.WraApplicationDeskVeriPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see WraApplicationDeskVeriPersistence
 * @generated
 */
public class WraApplicationDeskVeriUtil {

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
		WraApplicationDeskVeri wraApplicationDeskVeri) {

		getPersistence().clearCache(wraApplicationDeskVeri);
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
	public static Map<Serializable, WraApplicationDeskVeri> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<WraApplicationDeskVeri> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<WraApplicationDeskVeri> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<WraApplicationDeskVeri> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<WraApplicationDeskVeri> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static WraApplicationDeskVeri update(
		WraApplicationDeskVeri wraApplicationDeskVeri) {

		return getPersistence().update(wraApplicationDeskVeri);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static WraApplicationDeskVeri update(
		WraApplicationDeskVeri wraApplicationDeskVeri,
		ServiceContext serviceContext) {

		return getPersistence().update(wraApplicationDeskVeri, serviceContext);
	}

	/**
	 * Returns all the wra application desk veris where wraApplicationId = &#63;.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the matching wra application desk veris
	 */
	public static List<WraApplicationDeskVeri> findBygetWraAppDV_ById(
		long wraApplicationId) {

		return getPersistence().findBygetWraAppDV_ById(wraApplicationId);
	}

	/**
	 * Returns a range of all the wra application desk veris where wraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraApplicationDeskVeriModelImpl</code>.
	 * </p>
	 *
	 * @param wraApplicationId the wra application ID
	 * @param start the lower bound of the range of wra application desk veris
	 * @param end the upper bound of the range of wra application desk veris (not inclusive)
	 * @return the range of matching wra application desk veris
	 */
	public static List<WraApplicationDeskVeri> findBygetWraAppDV_ById(
		long wraApplicationId, int start, int end) {

		return getPersistence().findBygetWraAppDV_ById(
			wraApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the wra application desk veris where wraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraApplicationDeskVeriModelImpl</code>.
	 * </p>
	 *
	 * @param wraApplicationId the wra application ID
	 * @param start the lower bound of the range of wra application desk veris
	 * @param end the upper bound of the range of wra application desk veris (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching wra application desk veris
	 */
	public static List<WraApplicationDeskVeri> findBygetWraAppDV_ById(
		long wraApplicationId, int start, int end,
		OrderByComparator<WraApplicationDeskVeri> orderByComparator) {

		return getPersistence().findBygetWraAppDV_ById(
			wraApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the wra application desk veris where wraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraApplicationDeskVeriModelImpl</code>.
	 * </p>
	 *
	 * @param wraApplicationId the wra application ID
	 * @param start the lower bound of the range of wra application desk veris
	 * @param end the upper bound of the range of wra application desk veris (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching wra application desk veris
	 */
	public static List<WraApplicationDeskVeri> findBygetWraAppDV_ById(
		long wraApplicationId, int start, int end,
		OrderByComparator<WraApplicationDeskVeri> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetWraAppDV_ById(
			wraApplicationId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first wra application desk veri in the ordered set where wraApplicationId = &#63;.
	 *
	 * @param wraApplicationId the wra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra application desk veri
	 * @throws NoSuchWraApplicationDeskVeriException if a matching wra application desk veri could not be found
	 */
	public static WraApplicationDeskVeri findBygetWraAppDV_ById_First(
			long wraApplicationId,
			OrderByComparator<WraApplicationDeskVeri> orderByComparator)
		throws com.nbp.wra.stage.service.exception.
			NoSuchWraApplicationDeskVeriException {

		return getPersistence().findBygetWraAppDV_ById_First(
			wraApplicationId, orderByComparator);
	}

	/**
	 * Returns the first wra application desk veri in the ordered set where wraApplicationId = &#63;.
	 *
	 * @param wraApplicationId the wra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra application desk veri, or <code>null</code> if a matching wra application desk veri could not be found
	 */
	public static WraApplicationDeskVeri fetchBygetWraAppDV_ById_First(
		long wraApplicationId,
		OrderByComparator<WraApplicationDeskVeri> orderByComparator) {

		return getPersistence().fetchBygetWraAppDV_ById_First(
			wraApplicationId, orderByComparator);
	}

	/**
	 * Returns the last wra application desk veri in the ordered set where wraApplicationId = &#63;.
	 *
	 * @param wraApplicationId the wra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra application desk veri
	 * @throws NoSuchWraApplicationDeskVeriException if a matching wra application desk veri could not be found
	 */
	public static WraApplicationDeskVeri findBygetWraAppDV_ById_Last(
			long wraApplicationId,
			OrderByComparator<WraApplicationDeskVeri> orderByComparator)
		throws com.nbp.wra.stage.service.exception.
			NoSuchWraApplicationDeskVeriException {

		return getPersistence().findBygetWraAppDV_ById_Last(
			wraApplicationId, orderByComparator);
	}

	/**
	 * Returns the last wra application desk veri in the ordered set where wraApplicationId = &#63;.
	 *
	 * @param wraApplicationId the wra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra application desk veri, or <code>null</code> if a matching wra application desk veri could not be found
	 */
	public static WraApplicationDeskVeri fetchBygetWraAppDV_ById_Last(
		long wraApplicationId,
		OrderByComparator<WraApplicationDeskVeri> orderByComparator) {

		return getPersistence().fetchBygetWraAppDV_ById_Last(
			wraApplicationId, orderByComparator);
	}

	/**
	 * Returns the wra application desk veris before and after the current wra application desk veri in the ordered set where wraApplicationId = &#63;.
	 *
	 * @param wraApplicationDeskVeriId the primary key of the current wra application desk veri
	 * @param wraApplicationId the wra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next wra application desk veri
	 * @throws NoSuchWraApplicationDeskVeriException if a wra application desk veri with the primary key could not be found
	 */
	public static WraApplicationDeskVeri[] findBygetWraAppDV_ById_PrevAndNext(
			long wraApplicationDeskVeriId, long wraApplicationId,
			OrderByComparator<WraApplicationDeskVeri> orderByComparator)
		throws com.nbp.wra.stage.service.exception.
			NoSuchWraApplicationDeskVeriException {

		return getPersistence().findBygetWraAppDV_ById_PrevAndNext(
			wraApplicationDeskVeriId, wraApplicationId, orderByComparator);
	}

	/**
	 * Removes all the wra application desk veris where wraApplicationId = &#63; from the database.
	 *
	 * @param wraApplicationId the wra application ID
	 */
	public static void removeBygetWraAppDV_ById(long wraApplicationId) {
		getPersistence().removeBygetWraAppDV_ById(wraApplicationId);
	}

	/**
	 * Returns the number of wra application desk veris where wraApplicationId = &#63;.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the number of matching wra application desk veris
	 */
	public static int countBygetWraAppDV_ById(long wraApplicationId) {
		return getPersistence().countBygetWraAppDV_ById(wraApplicationId);
	}

	/**
	 * Caches the wra application desk veri in the entity cache if it is enabled.
	 *
	 * @param wraApplicationDeskVeri the wra application desk veri
	 */
	public static void cacheResult(
		WraApplicationDeskVeri wraApplicationDeskVeri) {

		getPersistence().cacheResult(wraApplicationDeskVeri);
	}

	/**
	 * Caches the wra application desk veris in the entity cache if it is enabled.
	 *
	 * @param wraApplicationDeskVeris the wra application desk veris
	 */
	public static void cacheResult(
		List<WraApplicationDeskVeri> wraApplicationDeskVeris) {

		getPersistence().cacheResult(wraApplicationDeskVeris);
	}

	/**
	 * Creates a new wra application desk veri with the primary key. Does not add the wra application desk veri to the database.
	 *
	 * @param wraApplicationDeskVeriId the primary key for the new wra application desk veri
	 * @return the new wra application desk veri
	 */
	public static WraApplicationDeskVeri create(long wraApplicationDeskVeriId) {
		return getPersistence().create(wraApplicationDeskVeriId);
	}

	/**
	 * Removes the wra application desk veri with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param wraApplicationDeskVeriId the primary key of the wra application desk veri
	 * @return the wra application desk veri that was removed
	 * @throws NoSuchWraApplicationDeskVeriException if a wra application desk veri with the primary key could not be found
	 */
	public static WraApplicationDeskVeri remove(long wraApplicationDeskVeriId)
		throws com.nbp.wra.stage.service.exception.
			NoSuchWraApplicationDeskVeriException {

		return getPersistence().remove(wraApplicationDeskVeriId);
	}

	public static WraApplicationDeskVeri updateImpl(
		WraApplicationDeskVeri wraApplicationDeskVeri) {

		return getPersistence().updateImpl(wraApplicationDeskVeri);
	}

	/**
	 * Returns the wra application desk veri with the primary key or throws a <code>NoSuchWraApplicationDeskVeriException</code> if it could not be found.
	 *
	 * @param wraApplicationDeskVeriId the primary key of the wra application desk veri
	 * @return the wra application desk veri
	 * @throws NoSuchWraApplicationDeskVeriException if a wra application desk veri with the primary key could not be found
	 */
	public static WraApplicationDeskVeri findByPrimaryKey(
			long wraApplicationDeskVeriId)
		throws com.nbp.wra.stage.service.exception.
			NoSuchWraApplicationDeskVeriException {

		return getPersistence().findByPrimaryKey(wraApplicationDeskVeriId);
	}

	/**
	 * Returns the wra application desk veri with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param wraApplicationDeskVeriId the primary key of the wra application desk veri
	 * @return the wra application desk veri, or <code>null</code> if a wra application desk veri with the primary key could not be found
	 */
	public static WraApplicationDeskVeri fetchByPrimaryKey(
		long wraApplicationDeskVeriId) {

		return getPersistence().fetchByPrimaryKey(wraApplicationDeskVeriId);
	}

	/**
	 * Returns all the wra application desk veris.
	 *
	 * @return the wra application desk veris
	 */
	public static List<WraApplicationDeskVeri> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the wra application desk veris.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraApplicationDeskVeriModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of wra application desk veris
	 * @param end the upper bound of the range of wra application desk veris (not inclusive)
	 * @return the range of wra application desk veris
	 */
	public static List<WraApplicationDeskVeri> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the wra application desk veris.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraApplicationDeskVeriModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of wra application desk veris
	 * @param end the upper bound of the range of wra application desk veris (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of wra application desk veris
	 */
	public static List<WraApplicationDeskVeri> findAll(
		int start, int end,
		OrderByComparator<WraApplicationDeskVeri> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the wra application desk veris.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraApplicationDeskVeriModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of wra application desk veris
	 * @param end the upper bound of the range of wra application desk veris (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of wra application desk veris
	 */
	public static List<WraApplicationDeskVeri> findAll(
		int start, int end,
		OrderByComparator<WraApplicationDeskVeri> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the wra application desk veris from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of wra application desk veris.
	 *
	 * @return the number of wra application desk veris
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static WraApplicationDeskVeriPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		WraApplicationDeskVeriPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile WraApplicationDeskVeriPersistence _persistence;

}