/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.jtb.application.form.service.model.JtbAddListDriverInfo;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the jtb add list driver info service. This utility wraps <code>com.nbp.jtb.application.form.service.service.persistence.impl.JtbAddListDriverInfoPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JtbAddListDriverInfoPersistence
 * @generated
 */
public class JtbAddListDriverInfoUtil {

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
	public static void clearCache(JtbAddListDriverInfo jtbAddListDriverInfo) {
		getPersistence().clearCache(jtbAddListDriverInfo);
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
	public static Map<Serializable, JtbAddListDriverInfo> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<JtbAddListDriverInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<JtbAddListDriverInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<JtbAddListDriverInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<JtbAddListDriverInfo> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static JtbAddListDriverInfo update(
		JtbAddListDriverInfo jtbAddListDriverInfo) {

		return getPersistence().update(jtbAddListDriverInfo);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static JtbAddListDriverInfo update(
		JtbAddListDriverInfo jtbAddListDriverInfo,
		ServiceContext serviceContext) {

		return getPersistence().update(jtbAddListDriverInfo, serviceContext);
	}

	/**
	 * Returns all the jtb add list driver infos where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching jtb add list driver infos
	 */
	public static List<JtbAddListDriverInfo> findBygetByJtbAppId(
		long jtbApplicationId) {

		return getPersistence().findBygetByJtbAppId(jtbApplicationId);
	}

	/**
	 * Returns a range of all the jtb add list driver infos where jtbApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbAddListDriverInfoModelImpl</code>.
	 * </p>
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param start the lower bound of the range of jtb add list driver infos
	 * @param end the upper bound of the range of jtb add list driver infos (not inclusive)
	 * @return the range of matching jtb add list driver infos
	 */
	public static List<JtbAddListDriverInfo> findBygetByJtbAppId(
		long jtbApplicationId, int start, int end) {

		return getPersistence().findBygetByJtbAppId(
			jtbApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the jtb add list driver infos where jtbApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbAddListDriverInfoModelImpl</code>.
	 * </p>
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param start the lower bound of the range of jtb add list driver infos
	 * @param end the upper bound of the range of jtb add list driver infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jtb add list driver infos
	 */
	public static List<JtbAddListDriverInfo> findBygetByJtbAppId(
		long jtbApplicationId, int start, int end,
		OrderByComparator<JtbAddListDriverInfo> orderByComparator) {

		return getPersistence().findBygetByJtbAppId(
			jtbApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the jtb add list driver infos where jtbApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbAddListDriverInfoModelImpl</code>.
	 * </p>
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param start the lower bound of the range of jtb add list driver infos
	 * @param end the upper bound of the range of jtb add list driver infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jtb add list driver infos
	 */
	public static List<JtbAddListDriverInfo> findBygetByJtbAppId(
		long jtbApplicationId, int start, int end,
		OrderByComparator<JtbAddListDriverInfo> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetByJtbAppId(
			jtbApplicationId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first jtb add list driver info in the ordered set where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb add list driver info
	 * @throws NoSuchJtbAddListDriverInfoException if a matching jtb add list driver info could not be found
	 */
	public static JtbAddListDriverInfo findBygetByJtbAppId_First(
			long jtbApplicationId,
			OrderByComparator<JtbAddListDriverInfo> orderByComparator)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchJtbAddListDriverInfoException {

		return getPersistence().findBygetByJtbAppId_First(
			jtbApplicationId, orderByComparator);
	}

	/**
	 * Returns the first jtb add list driver info in the ordered set where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb add list driver info, or <code>null</code> if a matching jtb add list driver info could not be found
	 */
	public static JtbAddListDriverInfo fetchBygetByJtbAppId_First(
		long jtbApplicationId,
		OrderByComparator<JtbAddListDriverInfo> orderByComparator) {

		return getPersistence().fetchBygetByJtbAppId_First(
			jtbApplicationId, orderByComparator);
	}

	/**
	 * Returns the last jtb add list driver info in the ordered set where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb add list driver info
	 * @throws NoSuchJtbAddListDriverInfoException if a matching jtb add list driver info could not be found
	 */
	public static JtbAddListDriverInfo findBygetByJtbAppId_Last(
			long jtbApplicationId,
			OrderByComparator<JtbAddListDriverInfo> orderByComparator)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchJtbAddListDriverInfoException {

		return getPersistence().findBygetByJtbAppId_Last(
			jtbApplicationId, orderByComparator);
	}

	/**
	 * Returns the last jtb add list driver info in the ordered set where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb add list driver info, or <code>null</code> if a matching jtb add list driver info could not be found
	 */
	public static JtbAddListDriverInfo fetchBygetByJtbAppId_Last(
		long jtbApplicationId,
		OrderByComparator<JtbAddListDriverInfo> orderByComparator) {

		return getPersistence().fetchBygetByJtbAppId_Last(
			jtbApplicationId, orderByComparator);
	}

	/**
	 * Returns the jtb add list driver infos before and after the current jtb add list driver info in the ordered set where jtbApplicationId = &#63;.
	 *
	 * @param jtbAddListDriverInfoId the primary key of the current jtb add list driver info
	 * @param jtbApplicationId the jtb application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jtb add list driver info
	 * @throws NoSuchJtbAddListDriverInfoException if a jtb add list driver info with the primary key could not be found
	 */
	public static JtbAddListDriverInfo[] findBygetByJtbAppId_PrevAndNext(
			long jtbAddListDriverInfoId, long jtbApplicationId,
			OrderByComparator<JtbAddListDriverInfo> orderByComparator)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchJtbAddListDriverInfoException {

		return getPersistence().findBygetByJtbAppId_PrevAndNext(
			jtbAddListDriverInfoId, jtbApplicationId, orderByComparator);
	}

	/**
	 * Removes all the jtb add list driver infos where jtbApplicationId = &#63; from the database.
	 *
	 * @param jtbApplicationId the jtb application ID
	 */
	public static void removeBygetByJtbAppId(long jtbApplicationId) {
		getPersistence().removeBygetByJtbAppId(jtbApplicationId);
	}

	/**
	 * Returns the number of jtb add list driver infos where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the number of matching jtb add list driver infos
	 */
	public static int countBygetByJtbAppId(long jtbApplicationId) {
		return getPersistence().countBygetByJtbAppId(jtbApplicationId);
	}

	/**
	 * Caches the jtb add list driver info in the entity cache if it is enabled.
	 *
	 * @param jtbAddListDriverInfo the jtb add list driver info
	 */
	public static void cacheResult(JtbAddListDriverInfo jtbAddListDriverInfo) {
		getPersistence().cacheResult(jtbAddListDriverInfo);
	}

	/**
	 * Caches the jtb add list driver infos in the entity cache if it is enabled.
	 *
	 * @param jtbAddListDriverInfos the jtb add list driver infos
	 */
	public static void cacheResult(
		List<JtbAddListDriverInfo> jtbAddListDriverInfos) {

		getPersistence().cacheResult(jtbAddListDriverInfos);
	}

	/**
	 * Creates a new jtb add list driver info with the primary key. Does not add the jtb add list driver info to the database.
	 *
	 * @param jtbAddListDriverInfoId the primary key for the new jtb add list driver info
	 * @return the new jtb add list driver info
	 */
	public static JtbAddListDriverInfo create(long jtbAddListDriverInfoId) {
		return getPersistence().create(jtbAddListDriverInfoId);
	}

	/**
	 * Removes the jtb add list driver info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param jtbAddListDriverInfoId the primary key of the jtb add list driver info
	 * @return the jtb add list driver info that was removed
	 * @throws NoSuchJtbAddListDriverInfoException if a jtb add list driver info with the primary key could not be found
	 */
	public static JtbAddListDriverInfo remove(long jtbAddListDriverInfoId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchJtbAddListDriverInfoException {

		return getPersistence().remove(jtbAddListDriverInfoId);
	}

	public static JtbAddListDriverInfo updateImpl(
		JtbAddListDriverInfo jtbAddListDriverInfo) {

		return getPersistence().updateImpl(jtbAddListDriverInfo);
	}

	/**
	 * Returns the jtb add list driver info with the primary key or throws a <code>NoSuchJtbAddListDriverInfoException</code> if it could not be found.
	 *
	 * @param jtbAddListDriverInfoId the primary key of the jtb add list driver info
	 * @return the jtb add list driver info
	 * @throws NoSuchJtbAddListDriverInfoException if a jtb add list driver info with the primary key could not be found
	 */
	public static JtbAddListDriverInfo findByPrimaryKey(
			long jtbAddListDriverInfoId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchJtbAddListDriverInfoException {

		return getPersistence().findByPrimaryKey(jtbAddListDriverInfoId);
	}

	/**
	 * Returns the jtb add list driver info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param jtbAddListDriverInfoId the primary key of the jtb add list driver info
	 * @return the jtb add list driver info, or <code>null</code> if a jtb add list driver info with the primary key could not be found
	 */
	public static JtbAddListDriverInfo fetchByPrimaryKey(
		long jtbAddListDriverInfoId) {

		return getPersistence().fetchByPrimaryKey(jtbAddListDriverInfoId);
	}

	/**
	 * Returns all the jtb add list driver infos.
	 *
	 * @return the jtb add list driver infos
	 */
	public static List<JtbAddListDriverInfo> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the jtb add list driver infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbAddListDriverInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb add list driver infos
	 * @param end the upper bound of the range of jtb add list driver infos (not inclusive)
	 * @return the range of jtb add list driver infos
	 */
	public static List<JtbAddListDriverInfo> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the jtb add list driver infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbAddListDriverInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb add list driver infos
	 * @param end the upper bound of the range of jtb add list driver infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of jtb add list driver infos
	 */
	public static List<JtbAddListDriverInfo> findAll(
		int start, int end,
		OrderByComparator<JtbAddListDriverInfo> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the jtb add list driver infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbAddListDriverInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb add list driver infos
	 * @param end the upper bound of the range of jtb add list driver infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of jtb add list driver infos
	 */
	public static List<JtbAddListDriverInfo> findAll(
		int start, int end,
		OrderByComparator<JtbAddListDriverInfo> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the jtb add list driver infos from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of jtb add list driver infos.
	 *
	 * @return the number of jtb add list driver infos
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static JtbAddListDriverInfoPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		JtbAddListDriverInfoPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile JtbAddListDriverInfoPersistence _persistence;

}