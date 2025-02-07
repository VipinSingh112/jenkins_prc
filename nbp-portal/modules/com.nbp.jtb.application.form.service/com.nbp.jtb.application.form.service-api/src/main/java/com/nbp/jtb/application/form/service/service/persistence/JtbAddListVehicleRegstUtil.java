/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.jtb.application.form.service.model.JtbAddListVehicleRegst;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the jtb add list vehicle regst service. This utility wraps <code>com.nbp.jtb.application.form.service.service.persistence.impl.JtbAddListVehicleRegstPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JtbAddListVehicleRegstPersistence
 * @generated
 */
public class JtbAddListVehicleRegstUtil {

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
		JtbAddListVehicleRegst jtbAddListVehicleRegst) {

		getPersistence().clearCache(jtbAddListVehicleRegst);
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
	public static Map<Serializable, JtbAddListVehicleRegst> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<JtbAddListVehicleRegst> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<JtbAddListVehicleRegst> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<JtbAddListVehicleRegst> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<JtbAddListVehicleRegst> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static JtbAddListVehicleRegst update(
		JtbAddListVehicleRegst jtbAddListVehicleRegst) {

		return getPersistence().update(jtbAddListVehicleRegst);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static JtbAddListVehicleRegst update(
		JtbAddListVehicleRegst jtbAddListVehicleRegst,
		ServiceContext serviceContext) {

		return getPersistence().update(jtbAddListVehicleRegst, serviceContext);
	}

	/**
	 * Returns all the jtb add list vehicle regsts where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching jtb add list vehicle regsts
	 */
	public static List<JtbAddListVehicleRegst> findBygetByJtbAppId(
		long jtbApplicationId) {

		return getPersistence().findBygetByJtbAppId(jtbApplicationId);
	}

	/**
	 * Returns a range of all the jtb add list vehicle regsts where jtbApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbAddListVehicleRegstModelImpl</code>.
	 * </p>
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param start the lower bound of the range of jtb add list vehicle regsts
	 * @param end the upper bound of the range of jtb add list vehicle regsts (not inclusive)
	 * @return the range of matching jtb add list vehicle regsts
	 */
	public static List<JtbAddListVehicleRegst> findBygetByJtbAppId(
		long jtbApplicationId, int start, int end) {

		return getPersistence().findBygetByJtbAppId(
			jtbApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the jtb add list vehicle regsts where jtbApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbAddListVehicleRegstModelImpl</code>.
	 * </p>
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param start the lower bound of the range of jtb add list vehicle regsts
	 * @param end the upper bound of the range of jtb add list vehicle regsts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jtb add list vehicle regsts
	 */
	public static List<JtbAddListVehicleRegst> findBygetByJtbAppId(
		long jtbApplicationId, int start, int end,
		OrderByComparator<JtbAddListVehicleRegst> orderByComparator) {

		return getPersistence().findBygetByJtbAppId(
			jtbApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the jtb add list vehicle regsts where jtbApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbAddListVehicleRegstModelImpl</code>.
	 * </p>
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param start the lower bound of the range of jtb add list vehicle regsts
	 * @param end the upper bound of the range of jtb add list vehicle regsts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jtb add list vehicle regsts
	 */
	public static List<JtbAddListVehicleRegst> findBygetByJtbAppId(
		long jtbApplicationId, int start, int end,
		OrderByComparator<JtbAddListVehicleRegst> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetByJtbAppId(
			jtbApplicationId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first jtb add list vehicle regst in the ordered set where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb add list vehicle regst
	 * @throws NoSuchJtbAddListVehicleRegstException if a matching jtb add list vehicle regst could not be found
	 */
	public static JtbAddListVehicleRegst findBygetByJtbAppId_First(
			long jtbApplicationId,
			OrderByComparator<JtbAddListVehicleRegst> orderByComparator)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchJtbAddListVehicleRegstException {

		return getPersistence().findBygetByJtbAppId_First(
			jtbApplicationId, orderByComparator);
	}

	/**
	 * Returns the first jtb add list vehicle regst in the ordered set where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb add list vehicle regst, or <code>null</code> if a matching jtb add list vehicle regst could not be found
	 */
	public static JtbAddListVehicleRegst fetchBygetByJtbAppId_First(
		long jtbApplicationId,
		OrderByComparator<JtbAddListVehicleRegst> orderByComparator) {

		return getPersistence().fetchBygetByJtbAppId_First(
			jtbApplicationId, orderByComparator);
	}

	/**
	 * Returns the last jtb add list vehicle regst in the ordered set where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb add list vehicle regst
	 * @throws NoSuchJtbAddListVehicleRegstException if a matching jtb add list vehicle regst could not be found
	 */
	public static JtbAddListVehicleRegst findBygetByJtbAppId_Last(
			long jtbApplicationId,
			OrderByComparator<JtbAddListVehicleRegst> orderByComparator)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchJtbAddListVehicleRegstException {

		return getPersistence().findBygetByJtbAppId_Last(
			jtbApplicationId, orderByComparator);
	}

	/**
	 * Returns the last jtb add list vehicle regst in the ordered set where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb add list vehicle regst, or <code>null</code> if a matching jtb add list vehicle regst could not be found
	 */
	public static JtbAddListVehicleRegst fetchBygetByJtbAppId_Last(
		long jtbApplicationId,
		OrderByComparator<JtbAddListVehicleRegst> orderByComparator) {

		return getPersistence().fetchBygetByJtbAppId_Last(
			jtbApplicationId, orderByComparator);
	}

	/**
	 * Returns the jtb add list vehicle regsts before and after the current jtb add list vehicle regst in the ordered set where jtbApplicationId = &#63;.
	 *
	 * @param jtbAddListVehicleRegstId the primary key of the current jtb add list vehicle regst
	 * @param jtbApplicationId the jtb application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jtb add list vehicle regst
	 * @throws NoSuchJtbAddListVehicleRegstException if a jtb add list vehicle regst with the primary key could not be found
	 */
	public static JtbAddListVehicleRegst[] findBygetByJtbAppId_PrevAndNext(
			long jtbAddListVehicleRegstId, long jtbApplicationId,
			OrderByComparator<JtbAddListVehicleRegst> orderByComparator)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchJtbAddListVehicleRegstException {

		return getPersistence().findBygetByJtbAppId_PrevAndNext(
			jtbAddListVehicleRegstId, jtbApplicationId, orderByComparator);
	}

	/**
	 * Removes all the jtb add list vehicle regsts where jtbApplicationId = &#63; from the database.
	 *
	 * @param jtbApplicationId the jtb application ID
	 */
	public static void removeBygetByJtbAppId(long jtbApplicationId) {
		getPersistence().removeBygetByJtbAppId(jtbApplicationId);
	}

	/**
	 * Returns the number of jtb add list vehicle regsts where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the number of matching jtb add list vehicle regsts
	 */
	public static int countBygetByJtbAppId(long jtbApplicationId) {
		return getPersistence().countBygetByJtbAppId(jtbApplicationId);
	}

	/**
	 * Caches the jtb add list vehicle regst in the entity cache if it is enabled.
	 *
	 * @param jtbAddListVehicleRegst the jtb add list vehicle regst
	 */
	public static void cacheResult(
		JtbAddListVehicleRegst jtbAddListVehicleRegst) {

		getPersistence().cacheResult(jtbAddListVehicleRegst);
	}

	/**
	 * Caches the jtb add list vehicle regsts in the entity cache if it is enabled.
	 *
	 * @param jtbAddListVehicleRegsts the jtb add list vehicle regsts
	 */
	public static void cacheResult(
		List<JtbAddListVehicleRegst> jtbAddListVehicleRegsts) {

		getPersistence().cacheResult(jtbAddListVehicleRegsts);
	}

	/**
	 * Creates a new jtb add list vehicle regst with the primary key. Does not add the jtb add list vehicle regst to the database.
	 *
	 * @param jtbAddListVehicleRegstId the primary key for the new jtb add list vehicle regst
	 * @return the new jtb add list vehicle regst
	 */
	public static JtbAddListVehicleRegst create(long jtbAddListVehicleRegstId) {
		return getPersistence().create(jtbAddListVehicleRegstId);
	}

	/**
	 * Removes the jtb add list vehicle regst with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param jtbAddListVehicleRegstId the primary key of the jtb add list vehicle regst
	 * @return the jtb add list vehicle regst that was removed
	 * @throws NoSuchJtbAddListVehicleRegstException if a jtb add list vehicle regst with the primary key could not be found
	 */
	public static JtbAddListVehicleRegst remove(long jtbAddListVehicleRegstId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchJtbAddListVehicleRegstException {

		return getPersistence().remove(jtbAddListVehicleRegstId);
	}

	public static JtbAddListVehicleRegst updateImpl(
		JtbAddListVehicleRegst jtbAddListVehicleRegst) {

		return getPersistence().updateImpl(jtbAddListVehicleRegst);
	}

	/**
	 * Returns the jtb add list vehicle regst with the primary key or throws a <code>NoSuchJtbAddListVehicleRegstException</code> if it could not be found.
	 *
	 * @param jtbAddListVehicleRegstId the primary key of the jtb add list vehicle regst
	 * @return the jtb add list vehicle regst
	 * @throws NoSuchJtbAddListVehicleRegstException if a jtb add list vehicle regst with the primary key could not be found
	 */
	public static JtbAddListVehicleRegst findByPrimaryKey(
			long jtbAddListVehicleRegstId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchJtbAddListVehicleRegstException {

		return getPersistence().findByPrimaryKey(jtbAddListVehicleRegstId);
	}

	/**
	 * Returns the jtb add list vehicle regst with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param jtbAddListVehicleRegstId the primary key of the jtb add list vehicle regst
	 * @return the jtb add list vehicle regst, or <code>null</code> if a jtb add list vehicle regst with the primary key could not be found
	 */
	public static JtbAddListVehicleRegst fetchByPrimaryKey(
		long jtbAddListVehicleRegstId) {

		return getPersistence().fetchByPrimaryKey(jtbAddListVehicleRegstId);
	}

	/**
	 * Returns all the jtb add list vehicle regsts.
	 *
	 * @return the jtb add list vehicle regsts
	 */
	public static List<JtbAddListVehicleRegst> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the jtb add list vehicle regsts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbAddListVehicleRegstModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb add list vehicle regsts
	 * @param end the upper bound of the range of jtb add list vehicle regsts (not inclusive)
	 * @return the range of jtb add list vehicle regsts
	 */
	public static List<JtbAddListVehicleRegst> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the jtb add list vehicle regsts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbAddListVehicleRegstModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb add list vehicle regsts
	 * @param end the upper bound of the range of jtb add list vehicle regsts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of jtb add list vehicle regsts
	 */
	public static List<JtbAddListVehicleRegst> findAll(
		int start, int end,
		OrderByComparator<JtbAddListVehicleRegst> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the jtb add list vehicle regsts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbAddListVehicleRegstModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb add list vehicle regsts
	 * @param end the upper bound of the range of jtb add list vehicle regsts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of jtb add list vehicle regsts
	 */
	public static List<JtbAddListVehicleRegst> findAll(
		int start, int end,
		OrderByComparator<JtbAddListVehicleRegst> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the jtb add list vehicle regsts from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of jtb add list vehicle regsts.
	 *
	 * @return the number of jtb add list vehicle regsts
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static JtbAddListVehicleRegstPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		JtbAddListVehicleRegstPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile JtbAddListVehicleRegstPersistence _persistence;

}