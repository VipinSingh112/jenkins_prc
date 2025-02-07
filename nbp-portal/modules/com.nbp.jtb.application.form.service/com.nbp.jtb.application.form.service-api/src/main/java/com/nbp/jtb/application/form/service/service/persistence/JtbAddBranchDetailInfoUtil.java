/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.jtb.application.form.service.model.JtbAddBranchDetailInfo;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the jtb add branch detail info service. This utility wraps <code>com.nbp.jtb.application.form.service.service.persistence.impl.JtbAddBranchDetailInfoPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JtbAddBranchDetailInfoPersistence
 * @generated
 */
public class JtbAddBranchDetailInfoUtil {

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
		JtbAddBranchDetailInfo jtbAddBranchDetailInfo) {

		getPersistence().clearCache(jtbAddBranchDetailInfo);
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
	public static Map<Serializable, JtbAddBranchDetailInfo> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<JtbAddBranchDetailInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<JtbAddBranchDetailInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<JtbAddBranchDetailInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<JtbAddBranchDetailInfo> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static JtbAddBranchDetailInfo update(
		JtbAddBranchDetailInfo jtbAddBranchDetailInfo) {

		return getPersistence().update(jtbAddBranchDetailInfo);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static JtbAddBranchDetailInfo update(
		JtbAddBranchDetailInfo jtbAddBranchDetailInfo,
		ServiceContext serviceContext) {

		return getPersistence().update(jtbAddBranchDetailInfo, serviceContext);
	}

	/**
	 * Returns the jtb add branch detail info where jtbApplicationId = &#63; or throws a <code>NoSuchJtbAddBranchDetailInfoException</code> if it could not be found.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching jtb add branch detail info
	 * @throws NoSuchJtbAddBranchDetailInfoException if a matching jtb add branch detail info could not be found
	 */
	public static JtbAddBranchDetailInfo findBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchJtbAddBranchDetailInfoException {

		return getPersistence().findBygetJTB_ByApplicationId(jtbApplicationId);
	}

	/**
	 * Returns the jtb add branch detail info where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching jtb add branch detail info, or <code>null</code> if a matching jtb add branch detail info could not be found
	 */
	public static JtbAddBranchDetailInfo fetchBygetJTB_ByApplicationId(
		long jtbApplicationId) {

		return getPersistence().fetchBygetJTB_ByApplicationId(jtbApplicationId);
	}

	/**
	 * Returns the jtb add branch detail info where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jtb add branch detail info, or <code>null</code> if a matching jtb add branch detail info could not be found
	 */
	public static JtbAddBranchDetailInfo fetchBygetJTB_ByApplicationId(
		long jtbApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetJTB_ByApplicationId(
			jtbApplicationId, useFinderCache);
	}

	/**
	 * Removes the jtb add branch detail info where jtbApplicationId = &#63; from the database.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the jtb add branch detail info that was removed
	 */
	public static JtbAddBranchDetailInfo removeBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchJtbAddBranchDetailInfoException {

		return getPersistence().removeBygetJTB_ByApplicationId(
			jtbApplicationId);
	}

	/**
	 * Returns the number of jtb add branch detail infos where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the number of matching jtb add branch detail infos
	 */
	public static int countBygetJTB_ByApplicationId(long jtbApplicationId) {
		return getPersistence().countBygetJTB_ByApplicationId(jtbApplicationId);
	}

	/**
	 * Returns all the jtb add branch detail infos where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching jtb add branch detail infos
	 */
	public static List<JtbAddBranchDetailInfo> findBygetByJtbAppId(
		long jtbApplicationId) {

		return getPersistence().findBygetByJtbAppId(jtbApplicationId);
	}

	/**
	 * Returns a range of all the jtb add branch detail infos where jtbApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbAddBranchDetailInfoModelImpl</code>.
	 * </p>
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param start the lower bound of the range of jtb add branch detail infos
	 * @param end the upper bound of the range of jtb add branch detail infos (not inclusive)
	 * @return the range of matching jtb add branch detail infos
	 */
	public static List<JtbAddBranchDetailInfo> findBygetByJtbAppId(
		long jtbApplicationId, int start, int end) {

		return getPersistence().findBygetByJtbAppId(
			jtbApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the jtb add branch detail infos where jtbApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbAddBranchDetailInfoModelImpl</code>.
	 * </p>
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param start the lower bound of the range of jtb add branch detail infos
	 * @param end the upper bound of the range of jtb add branch detail infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jtb add branch detail infos
	 */
	public static List<JtbAddBranchDetailInfo> findBygetByJtbAppId(
		long jtbApplicationId, int start, int end,
		OrderByComparator<JtbAddBranchDetailInfo> orderByComparator) {

		return getPersistence().findBygetByJtbAppId(
			jtbApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the jtb add branch detail infos where jtbApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbAddBranchDetailInfoModelImpl</code>.
	 * </p>
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param start the lower bound of the range of jtb add branch detail infos
	 * @param end the upper bound of the range of jtb add branch detail infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jtb add branch detail infos
	 */
	public static List<JtbAddBranchDetailInfo> findBygetByJtbAppId(
		long jtbApplicationId, int start, int end,
		OrderByComparator<JtbAddBranchDetailInfo> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetByJtbAppId(
			jtbApplicationId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first jtb add branch detail info in the ordered set where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb add branch detail info
	 * @throws NoSuchJtbAddBranchDetailInfoException if a matching jtb add branch detail info could not be found
	 */
	public static JtbAddBranchDetailInfo findBygetByJtbAppId_First(
			long jtbApplicationId,
			OrderByComparator<JtbAddBranchDetailInfo> orderByComparator)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchJtbAddBranchDetailInfoException {

		return getPersistence().findBygetByJtbAppId_First(
			jtbApplicationId, orderByComparator);
	}

	/**
	 * Returns the first jtb add branch detail info in the ordered set where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb add branch detail info, or <code>null</code> if a matching jtb add branch detail info could not be found
	 */
	public static JtbAddBranchDetailInfo fetchBygetByJtbAppId_First(
		long jtbApplicationId,
		OrderByComparator<JtbAddBranchDetailInfo> orderByComparator) {

		return getPersistence().fetchBygetByJtbAppId_First(
			jtbApplicationId, orderByComparator);
	}

	/**
	 * Returns the last jtb add branch detail info in the ordered set where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb add branch detail info
	 * @throws NoSuchJtbAddBranchDetailInfoException if a matching jtb add branch detail info could not be found
	 */
	public static JtbAddBranchDetailInfo findBygetByJtbAppId_Last(
			long jtbApplicationId,
			OrderByComparator<JtbAddBranchDetailInfo> orderByComparator)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchJtbAddBranchDetailInfoException {

		return getPersistence().findBygetByJtbAppId_Last(
			jtbApplicationId, orderByComparator);
	}

	/**
	 * Returns the last jtb add branch detail info in the ordered set where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb add branch detail info, or <code>null</code> if a matching jtb add branch detail info could not be found
	 */
	public static JtbAddBranchDetailInfo fetchBygetByJtbAppId_Last(
		long jtbApplicationId,
		OrderByComparator<JtbAddBranchDetailInfo> orderByComparator) {

		return getPersistence().fetchBygetByJtbAppId_Last(
			jtbApplicationId, orderByComparator);
	}

	/**
	 * Returns the jtb add branch detail infos before and after the current jtb add branch detail info in the ordered set where jtbApplicationId = &#63;.
	 *
	 * @param jtbBranchDetailInfoId the primary key of the current jtb add branch detail info
	 * @param jtbApplicationId the jtb application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jtb add branch detail info
	 * @throws NoSuchJtbAddBranchDetailInfoException if a jtb add branch detail info with the primary key could not be found
	 */
	public static JtbAddBranchDetailInfo[] findBygetByJtbAppId_PrevAndNext(
			long jtbBranchDetailInfoId, long jtbApplicationId,
			OrderByComparator<JtbAddBranchDetailInfo> orderByComparator)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchJtbAddBranchDetailInfoException {

		return getPersistence().findBygetByJtbAppId_PrevAndNext(
			jtbBranchDetailInfoId, jtbApplicationId, orderByComparator);
	}

	/**
	 * Removes all the jtb add branch detail infos where jtbApplicationId = &#63; from the database.
	 *
	 * @param jtbApplicationId the jtb application ID
	 */
	public static void removeBygetByJtbAppId(long jtbApplicationId) {
		getPersistence().removeBygetByJtbAppId(jtbApplicationId);
	}

	/**
	 * Returns the number of jtb add branch detail infos where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the number of matching jtb add branch detail infos
	 */
	public static int countBygetByJtbAppId(long jtbApplicationId) {
		return getPersistence().countBygetByJtbAppId(jtbApplicationId);
	}

	/**
	 * Caches the jtb add branch detail info in the entity cache if it is enabled.
	 *
	 * @param jtbAddBranchDetailInfo the jtb add branch detail info
	 */
	public static void cacheResult(
		JtbAddBranchDetailInfo jtbAddBranchDetailInfo) {

		getPersistence().cacheResult(jtbAddBranchDetailInfo);
	}

	/**
	 * Caches the jtb add branch detail infos in the entity cache if it is enabled.
	 *
	 * @param jtbAddBranchDetailInfos the jtb add branch detail infos
	 */
	public static void cacheResult(
		List<JtbAddBranchDetailInfo> jtbAddBranchDetailInfos) {

		getPersistence().cacheResult(jtbAddBranchDetailInfos);
	}

	/**
	 * Creates a new jtb add branch detail info with the primary key. Does not add the jtb add branch detail info to the database.
	 *
	 * @param jtbBranchDetailInfoId the primary key for the new jtb add branch detail info
	 * @return the new jtb add branch detail info
	 */
	public static JtbAddBranchDetailInfo create(long jtbBranchDetailInfoId) {
		return getPersistence().create(jtbBranchDetailInfoId);
	}

	/**
	 * Removes the jtb add branch detail info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param jtbBranchDetailInfoId the primary key of the jtb add branch detail info
	 * @return the jtb add branch detail info that was removed
	 * @throws NoSuchJtbAddBranchDetailInfoException if a jtb add branch detail info with the primary key could not be found
	 */
	public static JtbAddBranchDetailInfo remove(long jtbBranchDetailInfoId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchJtbAddBranchDetailInfoException {

		return getPersistence().remove(jtbBranchDetailInfoId);
	}

	public static JtbAddBranchDetailInfo updateImpl(
		JtbAddBranchDetailInfo jtbAddBranchDetailInfo) {

		return getPersistence().updateImpl(jtbAddBranchDetailInfo);
	}

	/**
	 * Returns the jtb add branch detail info with the primary key or throws a <code>NoSuchJtbAddBranchDetailInfoException</code> if it could not be found.
	 *
	 * @param jtbBranchDetailInfoId the primary key of the jtb add branch detail info
	 * @return the jtb add branch detail info
	 * @throws NoSuchJtbAddBranchDetailInfoException if a jtb add branch detail info with the primary key could not be found
	 */
	public static JtbAddBranchDetailInfo findByPrimaryKey(
			long jtbBranchDetailInfoId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchJtbAddBranchDetailInfoException {

		return getPersistence().findByPrimaryKey(jtbBranchDetailInfoId);
	}

	/**
	 * Returns the jtb add branch detail info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param jtbBranchDetailInfoId the primary key of the jtb add branch detail info
	 * @return the jtb add branch detail info, or <code>null</code> if a jtb add branch detail info with the primary key could not be found
	 */
	public static JtbAddBranchDetailInfo fetchByPrimaryKey(
		long jtbBranchDetailInfoId) {

		return getPersistence().fetchByPrimaryKey(jtbBranchDetailInfoId);
	}

	/**
	 * Returns all the jtb add branch detail infos.
	 *
	 * @return the jtb add branch detail infos
	 */
	public static List<JtbAddBranchDetailInfo> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the jtb add branch detail infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbAddBranchDetailInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb add branch detail infos
	 * @param end the upper bound of the range of jtb add branch detail infos (not inclusive)
	 * @return the range of jtb add branch detail infos
	 */
	public static List<JtbAddBranchDetailInfo> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the jtb add branch detail infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbAddBranchDetailInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb add branch detail infos
	 * @param end the upper bound of the range of jtb add branch detail infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of jtb add branch detail infos
	 */
	public static List<JtbAddBranchDetailInfo> findAll(
		int start, int end,
		OrderByComparator<JtbAddBranchDetailInfo> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the jtb add branch detail infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbAddBranchDetailInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb add branch detail infos
	 * @param end the upper bound of the range of jtb add branch detail infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of jtb add branch detail infos
	 */
	public static List<JtbAddBranchDetailInfo> findAll(
		int start, int end,
		OrderByComparator<JtbAddBranchDetailInfo> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the jtb add branch detail infos from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of jtb add branch detail infos.
	 *
	 * @return the number of jtb add branch detail infos
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static JtbAddBranchDetailInfoPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		JtbAddBranchDetailInfoPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile JtbAddBranchDetailInfoPersistence _persistence;

}