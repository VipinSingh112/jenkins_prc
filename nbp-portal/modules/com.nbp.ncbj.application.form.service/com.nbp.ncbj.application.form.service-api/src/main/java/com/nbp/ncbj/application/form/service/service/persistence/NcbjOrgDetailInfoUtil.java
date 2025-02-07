/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.ncbj.application.form.service.model.NcbjOrgDetailInfo;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the ncbj org detail info service. This utility wraps <code>com.nbp.ncbj.application.form.service.service.persistence.impl.NcbjOrgDetailInfoPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NcbjOrgDetailInfoPersistence
 * @generated
 */
public class NcbjOrgDetailInfoUtil {

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
	public static void clearCache(NcbjOrgDetailInfo ncbjOrgDetailInfo) {
		getPersistence().clearCache(ncbjOrgDetailInfo);
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
	public static Map<Serializable, NcbjOrgDetailInfo> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<NcbjOrgDetailInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<NcbjOrgDetailInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<NcbjOrgDetailInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<NcbjOrgDetailInfo> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static NcbjOrgDetailInfo update(
		NcbjOrgDetailInfo ncbjOrgDetailInfo) {

		return getPersistence().update(ncbjOrgDetailInfo);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static NcbjOrgDetailInfo update(
		NcbjOrgDetailInfo ncbjOrgDetailInfo, ServiceContext serviceContext) {

		return getPersistence().update(ncbjOrgDetailInfo, serviceContext);
	}

	/**
	 * Returns the ncbj org detail info where ncbjApplicationId = &#63; or throws a <code>NoSuchNcbjOrgDetailInfoException</code> if it could not be found.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj org detail info
	 * @throws NoSuchNcbjOrgDetailInfoException if a matching ncbj org detail info could not be found
	 */
	public static NcbjOrgDetailInfo findBygetNCBJByAppId(long ncbjApplicationId)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjOrgDetailInfoException {

		return getPersistence().findBygetNCBJByAppId(ncbjApplicationId);
	}

	/**
	 * Returns the ncbj org detail info where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj org detail info, or <code>null</code> if a matching ncbj org detail info could not be found
	 */
	public static NcbjOrgDetailInfo fetchBygetNCBJByAppId(
		long ncbjApplicationId) {

		return getPersistence().fetchBygetNCBJByAppId(ncbjApplicationId);
	}

	/**
	 * Returns the ncbj org detail info where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncbj org detail info, or <code>null</code> if a matching ncbj org detail info could not be found
	 */
	public static NcbjOrgDetailInfo fetchBygetNCBJByAppId(
		long ncbjApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetNCBJByAppId(
			ncbjApplicationId, useFinderCache);
	}

	/**
	 * Removes the ncbj org detail info where ncbjApplicationId = &#63; from the database.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the ncbj org detail info that was removed
	 */
	public static NcbjOrgDetailInfo removeBygetNCBJByAppId(
			long ncbjApplicationId)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjOrgDetailInfoException {

		return getPersistence().removeBygetNCBJByAppId(ncbjApplicationId);
	}

	/**
	 * Returns the number of ncbj org detail infos where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the number of matching ncbj org detail infos
	 */
	public static int countBygetNCBJByAppId(long ncbjApplicationId) {
		return getPersistence().countBygetNCBJByAppId(ncbjApplicationId);
	}

	/**
	 * Caches the ncbj org detail info in the entity cache if it is enabled.
	 *
	 * @param ncbjOrgDetailInfo the ncbj org detail info
	 */
	public static void cacheResult(NcbjOrgDetailInfo ncbjOrgDetailInfo) {
		getPersistence().cacheResult(ncbjOrgDetailInfo);
	}

	/**
	 * Caches the ncbj org detail infos in the entity cache if it is enabled.
	 *
	 * @param ncbjOrgDetailInfos the ncbj org detail infos
	 */
	public static void cacheResult(List<NcbjOrgDetailInfo> ncbjOrgDetailInfos) {
		getPersistence().cacheResult(ncbjOrgDetailInfos);
	}

	/**
	 * Creates a new ncbj org detail info with the primary key. Does not add the ncbj org detail info to the database.
	 *
	 * @param ncbjOrgDetailInfoId the primary key for the new ncbj org detail info
	 * @return the new ncbj org detail info
	 */
	public static NcbjOrgDetailInfo create(long ncbjOrgDetailInfoId) {
		return getPersistence().create(ncbjOrgDetailInfoId);
	}

	/**
	 * Removes the ncbj org detail info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ncbjOrgDetailInfoId the primary key of the ncbj org detail info
	 * @return the ncbj org detail info that was removed
	 * @throws NoSuchNcbjOrgDetailInfoException if a ncbj org detail info with the primary key could not be found
	 */
	public static NcbjOrgDetailInfo remove(long ncbjOrgDetailInfoId)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjOrgDetailInfoException {

		return getPersistence().remove(ncbjOrgDetailInfoId);
	}

	public static NcbjOrgDetailInfo updateImpl(
		NcbjOrgDetailInfo ncbjOrgDetailInfo) {

		return getPersistence().updateImpl(ncbjOrgDetailInfo);
	}

	/**
	 * Returns the ncbj org detail info with the primary key or throws a <code>NoSuchNcbjOrgDetailInfoException</code> if it could not be found.
	 *
	 * @param ncbjOrgDetailInfoId the primary key of the ncbj org detail info
	 * @return the ncbj org detail info
	 * @throws NoSuchNcbjOrgDetailInfoException if a ncbj org detail info with the primary key could not be found
	 */
	public static NcbjOrgDetailInfo findByPrimaryKey(long ncbjOrgDetailInfoId)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjOrgDetailInfoException {

		return getPersistence().findByPrimaryKey(ncbjOrgDetailInfoId);
	}

	/**
	 * Returns the ncbj org detail info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ncbjOrgDetailInfoId the primary key of the ncbj org detail info
	 * @return the ncbj org detail info, or <code>null</code> if a ncbj org detail info with the primary key could not be found
	 */
	public static NcbjOrgDetailInfo fetchByPrimaryKey(
		long ncbjOrgDetailInfoId) {

		return getPersistence().fetchByPrimaryKey(ncbjOrgDetailInfoId);
	}

	/**
	 * Returns all the ncbj org detail infos.
	 *
	 * @return the ncbj org detail infos
	 */
	public static List<NcbjOrgDetailInfo> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the ncbj org detail infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjOrgDetailInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj org detail infos
	 * @param end the upper bound of the range of ncbj org detail infos (not inclusive)
	 * @return the range of ncbj org detail infos
	 */
	public static List<NcbjOrgDetailInfo> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the ncbj org detail infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjOrgDetailInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj org detail infos
	 * @param end the upper bound of the range of ncbj org detail infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ncbj org detail infos
	 */
	public static List<NcbjOrgDetailInfo> findAll(
		int start, int end,
		OrderByComparator<NcbjOrgDetailInfo> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the ncbj org detail infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjOrgDetailInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj org detail infos
	 * @param end the upper bound of the range of ncbj org detail infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ncbj org detail infos
	 */
	public static List<NcbjOrgDetailInfo> findAll(
		int start, int end,
		OrderByComparator<NcbjOrgDetailInfo> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the ncbj org detail infos from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of ncbj org detail infos.
	 *
	 * @return the number of ncbj org detail infos
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static NcbjOrgDetailInfoPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		NcbjOrgDetailInfoPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile NcbjOrgDetailInfoPersistence _persistence;

}