/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncra.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.ncra.application.form.service.model.NcraVerifyWeighingDeviceInfo;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the ncra verify weighing device info service. This utility wraps <code>com.nbp.ncra.application.form.service.service.persistence.impl.NcraVerifyWeighingDeviceInfoPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NcraVerifyWeighingDeviceInfoPersistence
 * @generated
 */
public class NcraVerifyWeighingDeviceInfoUtil {

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
		NcraVerifyWeighingDeviceInfo ncraVerifyWeighingDeviceInfo) {

		getPersistence().clearCache(ncraVerifyWeighingDeviceInfo);
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
	public static Map<Serializable, NcraVerifyWeighingDeviceInfo>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<NcraVerifyWeighingDeviceInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<NcraVerifyWeighingDeviceInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<NcraVerifyWeighingDeviceInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<NcraVerifyWeighingDeviceInfo> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static NcraVerifyWeighingDeviceInfo update(
		NcraVerifyWeighingDeviceInfo ncraVerifyWeighingDeviceInfo) {

		return getPersistence().update(ncraVerifyWeighingDeviceInfo);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static NcraVerifyWeighingDeviceInfo update(
		NcraVerifyWeighingDeviceInfo ncraVerifyWeighingDeviceInfo,
		ServiceContext serviceContext) {

		return getPersistence().update(
			ncraVerifyWeighingDeviceInfo, serviceContext);
	}

	/**
	 * Returns the ncra verify weighing device info where ncraApplicationId = &#63; or throws a <code>NoSuchNcraVerifyWeighingDeviceInfoException</code> if it could not be found.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @return the matching ncra verify weighing device info
	 * @throws NoSuchNcraVerifyWeighingDeviceInfoException if a matching ncra verify weighing device info could not be found
	 */
	public static NcraVerifyWeighingDeviceInfo findBygetNcraVerify_By_NCRA_Id(
			long ncraApplicationId)
		throws com.nbp.ncra.application.form.service.exception.
			NoSuchNcraVerifyWeighingDeviceInfoException {

		return getPersistence().findBygetNcraVerify_By_NCRA_Id(
			ncraApplicationId);
	}

	/**
	 * Returns the ncra verify weighing device info where ncraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @return the matching ncra verify weighing device info, or <code>null</code> if a matching ncra verify weighing device info could not be found
	 */
	public static NcraVerifyWeighingDeviceInfo fetchBygetNcraVerify_By_NCRA_Id(
		long ncraApplicationId) {

		return getPersistence().fetchBygetNcraVerify_By_NCRA_Id(
			ncraApplicationId);
	}

	/**
	 * Returns the ncra verify weighing device info where ncraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncra verify weighing device info, or <code>null</code> if a matching ncra verify weighing device info could not be found
	 */
	public static NcraVerifyWeighingDeviceInfo fetchBygetNcraVerify_By_NCRA_Id(
		long ncraApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetNcraVerify_By_NCRA_Id(
			ncraApplicationId, useFinderCache);
	}

	/**
	 * Removes the ncra verify weighing device info where ncraApplicationId = &#63; from the database.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @return the ncra verify weighing device info that was removed
	 */
	public static NcraVerifyWeighingDeviceInfo removeBygetNcraVerify_By_NCRA_Id(
			long ncraApplicationId)
		throws com.nbp.ncra.application.form.service.exception.
			NoSuchNcraVerifyWeighingDeviceInfoException {

		return getPersistence().removeBygetNcraVerify_By_NCRA_Id(
			ncraApplicationId);
	}

	/**
	 * Returns the number of ncra verify weighing device infos where ncraApplicationId = &#63;.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @return the number of matching ncra verify weighing device infos
	 */
	public static int countBygetNcraVerify_By_NCRA_Id(long ncraApplicationId) {
		return getPersistence().countBygetNcraVerify_By_NCRA_Id(
			ncraApplicationId);
	}

	/**
	 * Returns all the ncra verify weighing device infos where ncraApplicationId = &#63;.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @return the matching ncra verify weighing device infos
	 */
	public static List<NcraVerifyWeighingDeviceInfo>
		findBygetNcraVerify_By_DataList(long ncraApplicationId) {

		return getPersistence().findBygetNcraVerify_By_DataList(
			ncraApplicationId);
	}

	/**
	 * Returns a range of all the ncra verify weighing device infos where ncraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraVerifyWeighingDeviceInfoModelImpl</code>.
	 * </p>
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @param start the lower bound of the range of ncra verify weighing device infos
	 * @param end the upper bound of the range of ncra verify weighing device infos (not inclusive)
	 * @return the range of matching ncra verify weighing device infos
	 */
	public static List<NcraVerifyWeighingDeviceInfo>
		findBygetNcraVerify_By_DataList(
			long ncraApplicationId, int start, int end) {

		return getPersistence().findBygetNcraVerify_By_DataList(
			ncraApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the ncra verify weighing device infos where ncraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraVerifyWeighingDeviceInfoModelImpl</code>.
	 * </p>
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @param start the lower bound of the range of ncra verify weighing device infos
	 * @param end the upper bound of the range of ncra verify weighing device infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncra verify weighing device infos
	 */
	public static List<NcraVerifyWeighingDeviceInfo>
		findBygetNcraVerify_By_DataList(
			long ncraApplicationId, int start, int end,
			OrderByComparator<NcraVerifyWeighingDeviceInfo> orderByComparator) {

		return getPersistence().findBygetNcraVerify_By_DataList(
			ncraApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the ncra verify weighing device infos where ncraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraVerifyWeighingDeviceInfoModelImpl</code>.
	 * </p>
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @param start the lower bound of the range of ncra verify weighing device infos
	 * @param end the upper bound of the range of ncra verify weighing device infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncra verify weighing device infos
	 */
	public static List<NcraVerifyWeighingDeviceInfo>
		findBygetNcraVerify_By_DataList(
			long ncraApplicationId, int start, int end,
			OrderByComparator<NcraVerifyWeighingDeviceInfo> orderByComparator,
			boolean useFinderCache) {

		return getPersistence().findBygetNcraVerify_By_DataList(
			ncraApplicationId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first ncra verify weighing device info in the ordered set where ncraApplicationId = &#63;.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncra verify weighing device info
	 * @throws NoSuchNcraVerifyWeighingDeviceInfoException if a matching ncra verify weighing device info could not be found
	 */
	public static NcraVerifyWeighingDeviceInfo
			findBygetNcraVerify_By_DataList_First(
				long ncraApplicationId,
				OrderByComparator<NcraVerifyWeighingDeviceInfo>
					orderByComparator)
		throws com.nbp.ncra.application.form.service.exception.
			NoSuchNcraVerifyWeighingDeviceInfoException {

		return getPersistence().findBygetNcraVerify_By_DataList_First(
			ncraApplicationId, orderByComparator);
	}

	/**
	 * Returns the first ncra verify weighing device info in the ordered set where ncraApplicationId = &#63;.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncra verify weighing device info, or <code>null</code> if a matching ncra verify weighing device info could not be found
	 */
	public static NcraVerifyWeighingDeviceInfo
		fetchBygetNcraVerify_By_DataList_First(
			long ncraApplicationId,
			OrderByComparator<NcraVerifyWeighingDeviceInfo> orderByComparator) {

		return getPersistence().fetchBygetNcraVerify_By_DataList_First(
			ncraApplicationId, orderByComparator);
	}

	/**
	 * Returns the last ncra verify weighing device info in the ordered set where ncraApplicationId = &#63;.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncra verify weighing device info
	 * @throws NoSuchNcraVerifyWeighingDeviceInfoException if a matching ncra verify weighing device info could not be found
	 */
	public static NcraVerifyWeighingDeviceInfo
			findBygetNcraVerify_By_DataList_Last(
				long ncraApplicationId,
				OrderByComparator<NcraVerifyWeighingDeviceInfo>
					orderByComparator)
		throws com.nbp.ncra.application.form.service.exception.
			NoSuchNcraVerifyWeighingDeviceInfoException {

		return getPersistence().findBygetNcraVerify_By_DataList_Last(
			ncraApplicationId, orderByComparator);
	}

	/**
	 * Returns the last ncra verify weighing device info in the ordered set where ncraApplicationId = &#63;.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncra verify weighing device info, or <code>null</code> if a matching ncra verify weighing device info could not be found
	 */
	public static NcraVerifyWeighingDeviceInfo
		fetchBygetNcraVerify_By_DataList_Last(
			long ncraApplicationId,
			OrderByComparator<NcraVerifyWeighingDeviceInfo> orderByComparator) {

		return getPersistence().fetchBygetNcraVerify_By_DataList_Last(
			ncraApplicationId, orderByComparator);
	}

	/**
	 * Returns the ncra verify weighing device infos before and after the current ncra verify weighing device info in the ordered set where ncraApplicationId = &#63;.
	 *
	 * @param ncraVerifyWeighingDeviceInfoId the primary key of the current ncra verify weighing device info
	 * @param ncraApplicationId the ncra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncra verify weighing device info
	 * @throws NoSuchNcraVerifyWeighingDeviceInfoException if a ncra verify weighing device info with the primary key could not be found
	 */
	public static NcraVerifyWeighingDeviceInfo[]
			findBygetNcraVerify_By_DataList_PrevAndNext(
				long ncraVerifyWeighingDeviceInfoId, long ncraApplicationId,
				OrderByComparator<NcraVerifyWeighingDeviceInfo>
					orderByComparator)
		throws com.nbp.ncra.application.form.service.exception.
			NoSuchNcraVerifyWeighingDeviceInfoException {

		return getPersistence().findBygetNcraVerify_By_DataList_PrevAndNext(
			ncraVerifyWeighingDeviceInfoId, ncraApplicationId,
			orderByComparator);
	}

	/**
	 * Removes all the ncra verify weighing device infos where ncraApplicationId = &#63; from the database.
	 *
	 * @param ncraApplicationId the ncra application ID
	 */
	public static void removeBygetNcraVerify_By_DataList(
		long ncraApplicationId) {

		getPersistence().removeBygetNcraVerify_By_DataList(ncraApplicationId);
	}

	/**
	 * Returns the number of ncra verify weighing device infos where ncraApplicationId = &#63;.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @return the number of matching ncra verify weighing device infos
	 */
	public static int countBygetNcraVerify_By_DataList(long ncraApplicationId) {
		return getPersistence().countBygetNcraVerify_By_DataList(
			ncraApplicationId);
	}

	/**
	 * Caches the ncra verify weighing device info in the entity cache if it is enabled.
	 *
	 * @param ncraVerifyWeighingDeviceInfo the ncra verify weighing device info
	 */
	public static void cacheResult(
		NcraVerifyWeighingDeviceInfo ncraVerifyWeighingDeviceInfo) {

		getPersistence().cacheResult(ncraVerifyWeighingDeviceInfo);
	}

	/**
	 * Caches the ncra verify weighing device infos in the entity cache if it is enabled.
	 *
	 * @param ncraVerifyWeighingDeviceInfos the ncra verify weighing device infos
	 */
	public static void cacheResult(
		List<NcraVerifyWeighingDeviceInfo> ncraVerifyWeighingDeviceInfos) {

		getPersistence().cacheResult(ncraVerifyWeighingDeviceInfos);
	}

	/**
	 * Creates a new ncra verify weighing device info with the primary key. Does not add the ncra verify weighing device info to the database.
	 *
	 * @param ncraVerifyWeighingDeviceInfoId the primary key for the new ncra verify weighing device info
	 * @return the new ncra verify weighing device info
	 */
	public static NcraVerifyWeighingDeviceInfo create(
		long ncraVerifyWeighingDeviceInfoId) {

		return getPersistence().create(ncraVerifyWeighingDeviceInfoId);
	}

	/**
	 * Removes the ncra verify weighing device info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ncraVerifyWeighingDeviceInfoId the primary key of the ncra verify weighing device info
	 * @return the ncra verify weighing device info that was removed
	 * @throws NoSuchNcraVerifyWeighingDeviceInfoException if a ncra verify weighing device info with the primary key could not be found
	 */
	public static NcraVerifyWeighingDeviceInfo remove(
			long ncraVerifyWeighingDeviceInfoId)
		throws com.nbp.ncra.application.form.service.exception.
			NoSuchNcraVerifyWeighingDeviceInfoException {

		return getPersistence().remove(ncraVerifyWeighingDeviceInfoId);
	}

	public static NcraVerifyWeighingDeviceInfo updateImpl(
		NcraVerifyWeighingDeviceInfo ncraVerifyWeighingDeviceInfo) {

		return getPersistence().updateImpl(ncraVerifyWeighingDeviceInfo);
	}

	/**
	 * Returns the ncra verify weighing device info with the primary key or throws a <code>NoSuchNcraVerifyWeighingDeviceInfoException</code> if it could not be found.
	 *
	 * @param ncraVerifyWeighingDeviceInfoId the primary key of the ncra verify weighing device info
	 * @return the ncra verify weighing device info
	 * @throws NoSuchNcraVerifyWeighingDeviceInfoException if a ncra verify weighing device info with the primary key could not be found
	 */
	public static NcraVerifyWeighingDeviceInfo findByPrimaryKey(
			long ncraVerifyWeighingDeviceInfoId)
		throws com.nbp.ncra.application.form.service.exception.
			NoSuchNcraVerifyWeighingDeviceInfoException {

		return getPersistence().findByPrimaryKey(
			ncraVerifyWeighingDeviceInfoId);
	}

	/**
	 * Returns the ncra verify weighing device info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ncraVerifyWeighingDeviceInfoId the primary key of the ncra verify weighing device info
	 * @return the ncra verify weighing device info, or <code>null</code> if a ncra verify weighing device info with the primary key could not be found
	 */
	public static NcraVerifyWeighingDeviceInfo fetchByPrimaryKey(
		long ncraVerifyWeighingDeviceInfoId) {

		return getPersistence().fetchByPrimaryKey(
			ncraVerifyWeighingDeviceInfoId);
	}

	/**
	 * Returns all the ncra verify weighing device infos.
	 *
	 * @return the ncra verify weighing device infos
	 */
	public static List<NcraVerifyWeighingDeviceInfo> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the ncra verify weighing device infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraVerifyWeighingDeviceInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncra verify weighing device infos
	 * @param end the upper bound of the range of ncra verify weighing device infos (not inclusive)
	 * @return the range of ncra verify weighing device infos
	 */
	public static List<NcraVerifyWeighingDeviceInfo> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the ncra verify weighing device infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraVerifyWeighingDeviceInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncra verify weighing device infos
	 * @param end the upper bound of the range of ncra verify weighing device infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ncra verify weighing device infos
	 */
	public static List<NcraVerifyWeighingDeviceInfo> findAll(
		int start, int end,
		OrderByComparator<NcraVerifyWeighingDeviceInfo> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the ncra verify weighing device infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraVerifyWeighingDeviceInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncra verify weighing device infos
	 * @param end the upper bound of the range of ncra verify weighing device infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ncra verify weighing device infos
	 */
	public static List<NcraVerifyWeighingDeviceInfo> findAll(
		int start, int end,
		OrderByComparator<NcraVerifyWeighingDeviceInfo> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the ncra verify weighing device infos from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of ncra verify weighing device infos.
	 *
	 * @return the number of ncra verify weighing device infos
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static NcraVerifyWeighingDeviceInfoPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		NcraVerifyWeighingDeviceInfoPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile NcraVerifyWeighingDeviceInfoPersistence
		_persistence;

}