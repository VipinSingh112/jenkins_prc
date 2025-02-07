/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.nbp.jtb.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.jtb.application.form.service.model.JtbBranchDetailInfo;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the jtb branch detail info service. This utility wraps <code>com.nbp.jtb.application.form.service.service.persistence.impl.JtbBranchDetailInfoPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JtbBranchDetailInfoPersistence
 * @generated
 */
public class JtbBranchDetailInfoUtil {

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
	public static void clearCache(JtbBranchDetailInfo jtbBranchDetailInfo) {
		getPersistence().clearCache(jtbBranchDetailInfo);
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
	public static Map<Serializable, JtbBranchDetailInfo> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<JtbBranchDetailInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<JtbBranchDetailInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<JtbBranchDetailInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<JtbBranchDetailInfo> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static JtbBranchDetailInfo update(
		JtbBranchDetailInfo jtbBranchDetailInfo) {

		return getPersistence().update(jtbBranchDetailInfo);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static JtbBranchDetailInfo update(
		JtbBranchDetailInfo jtbBranchDetailInfo,
		ServiceContext serviceContext) {

		return getPersistence().update(jtbBranchDetailInfo, serviceContext);
	}

	/**
	 * Returns the jtb branch detail info where jtbApplicationId = &#63; or throws a <code>NoSuchJtbBranchDetailInfoException</code> if it could not be found.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching jtb branch detail info
	 * @throws NoSuchJtbBranchDetailInfoException if a matching jtb branch detail info could not be found
	 */
	public static JtbBranchDetailInfo findBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchJtbBranchDetailInfoException {

		return getPersistence().findBygetJTB_ByApplicationId(jtbApplicationId);
	}

	/**
	 * Returns the jtb branch detail info where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching jtb branch detail info, or <code>null</code> if a matching jtb branch detail info could not be found
	 */
	public static JtbBranchDetailInfo fetchBygetJTB_ByApplicationId(
		long jtbApplicationId) {

		return getPersistence().fetchBygetJTB_ByApplicationId(jtbApplicationId);
	}

	/**
	 * Returns the jtb branch detail info where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jtb branch detail info, or <code>null</code> if a matching jtb branch detail info could not be found
	 */
	public static JtbBranchDetailInfo fetchBygetJTB_ByApplicationId(
		long jtbApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetJTB_ByApplicationId(
			jtbApplicationId, useFinderCache);
	}

	/**
	 * Removes the jtb branch detail info where jtbApplicationId = &#63; from the database.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the jtb branch detail info that was removed
	 */
	public static JtbBranchDetailInfo removeBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchJtbBranchDetailInfoException {

		return getPersistence().removeBygetJTB_ByApplicationId(
			jtbApplicationId);
	}

	/**
	 * Returns the number of jtb branch detail infos where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the number of matching jtb branch detail infos
	 */
	public static int countBygetJTB_ByApplicationId(long jtbApplicationId) {
		return getPersistence().countBygetJTB_ByApplicationId(jtbApplicationId);
	}

	/**
	 * Caches the jtb branch detail info in the entity cache if it is enabled.
	 *
	 * @param jtbBranchDetailInfo the jtb branch detail info
	 */
	public static void cacheResult(JtbBranchDetailInfo jtbBranchDetailInfo) {
		getPersistence().cacheResult(jtbBranchDetailInfo);
	}

	/**
	 * Caches the jtb branch detail infos in the entity cache if it is enabled.
	 *
	 * @param jtbBranchDetailInfos the jtb branch detail infos
	 */
	public static void cacheResult(
		List<JtbBranchDetailInfo> jtbBranchDetailInfos) {

		getPersistence().cacheResult(jtbBranchDetailInfos);
	}

	/**
	 * Creates a new jtb branch detail info with the primary key. Does not add the jtb branch detail info to the database.
	 *
	 * @param jtbBranchDetailInfoId the primary key for the new jtb branch detail info
	 * @return the new jtb branch detail info
	 */
	public static JtbBranchDetailInfo create(long jtbBranchDetailInfoId) {
		return getPersistence().create(jtbBranchDetailInfoId);
	}

	/**
	 * Removes the jtb branch detail info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param jtbBranchDetailInfoId the primary key of the jtb branch detail info
	 * @return the jtb branch detail info that was removed
	 * @throws NoSuchJtbBranchDetailInfoException if a jtb branch detail info with the primary key could not be found
	 */
	public static JtbBranchDetailInfo remove(long jtbBranchDetailInfoId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchJtbBranchDetailInfoException {

		return getPersistence().remove(jtbBranchDetailInfoId);
	}

	public static JtbBranchDetailInfo updateImpl(
		JtbBranchDetailInfo jtbBranchDetailInfo) {

		return getPersistence().updateImpl(jtbBranchDetailInfo);
	}

	/**
	 * Returns the jtb branch detail info with the primary key or throws a <code>NoSuchJtbBranchDetailInfoException</code> if it could not be found.
	 *
	 * @param jtbBranchDetailInfoId the primary key of the jtb branch detail info
	 * @return the jtb branch detail info
	 * @throws NoSuchJtbBranchDetailInfoException if a jtb branch detail info with the primary key could not be found
	 */
	public static JtbBranchDetailInfo findByPrimaryKey(
			long jtbBranchDetailInfoId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchJtbBranchDetailInfoException {

		return getPersistence().findByPrimaryKey(jtbBranchDetailInfoId);
	}

	/**
	 * Returns the jtb branch detail info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param jtbBranchDetailInfoId the primary key of the jtb branch detail info
	 * @return the jtb branch detail info, or <code>null</code> if a jtb branch detail info with the primary key could not be found
	 */
	public static JtbBranchDetailInfo fetchByPrimaryKey(
		long jtbBranchDetailInfoId) {

		return getPersistence().fetchByPrimaryKey(jtbBranchDetailInfoId);
	}

	/**
	 * Returns all the jtb branch detail infos.
	 *
	 * @return the jtb branch detail infos
	 */
	public static List<JtbBranchDetailInfo> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the jtb branch detail infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbBranchDetailInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb branch detail infos
	 * @param end the upper bound of the range of jtb branch detail infos (not inclusive)
	 * @return the range of jtb branch detail infos
	 */
	public static List<JtbBranchDetailInfo> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the jtb branch detail infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbBranchDetailInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb branch detail infos
	 * @param end the upper bound of the range of jtb branch detail infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of jtb branch detail infos
	 */
	public static List<JtbBranchDetailInfo> findAll(
		int start, int end,
		OrderByComparator<JtbBranchDetailInfo> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the jtb branch detail infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbBranchDetailInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb branch detail infos
	 * @param end the upper bound of the range of jtb branch detail infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of jtb branch detail infos
	 */
	public static List<JtbBranchDetailInfo> findAll(
		int start, int end,
		OrderByComparator<JtbBranchDetailInfo> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the jtb branch detail infos from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of jtb branch detail infos.
	 *
	 * @return the number of jtb branch detail infos
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static JtbBranchDetailInfoPersistence getPersistence() {
		return _persistence;
	}

	private static volatile JtbBranchDetailInfoPersistence _persistence;

}