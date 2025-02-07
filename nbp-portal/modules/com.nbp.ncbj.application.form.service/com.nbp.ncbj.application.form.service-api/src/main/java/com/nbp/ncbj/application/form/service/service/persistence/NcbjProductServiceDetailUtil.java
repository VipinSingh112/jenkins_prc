/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.ncbj.application.form.service.model.NcbjProductServiceDetail;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the ncbj product service detail service. This utility wraps <code>com.nbp.ncbj.application.form.service.service.persistence.impl.NcbjProductServiceDetailPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NcbjProductServiceDetailPersistence
 * @generated
 */
public class NcbjProductServiceDetailUtil {

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
		NcbjProductServiceDetail ncbjProductServiceDetail) {

		getPersistence().clearCache(ncbjProductServiceDetail);
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
	public static Map<Serializable, NcbjProductServiceDetail>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<NcbjProductServiceDetail> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<NcbjProductServiceDetail> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<NcbjProductServiceDetail> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<NcbjProductServiceDetail> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static NcbjProductServiceDetail update(
		NcbjProductServiceDetail ncbjProductServiceDetail) {

		return getPersistence().update(ncbjProductServiceDetail);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static NcbjProductServiceDetail update(
		NcbjProductServiceDetail ncbjProductServiceDetail,
		ServiceContext serviceContext) {

		return getPersistence().update(
			ncbjProductServiceDetail, serviceContext);
	}

	/**
	 * Returns the ncbj product service detail where ncbjApplicationId = &#63; or throws a <code>NoSuchNcbjProductServiceDetailException</code> if it could not be found.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj product service detail
	 * @throws NoSuchNcbjProductServiceDetailException if a matching ncbj product service detail could not be found
	 */
	public static NcbjProductServiceDetail findBygetNCBJ_ById(
			long ncbjApplicationId)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjProductServiceDetailException {

		return getPersistence().findBygetNCBJ_ById(ncbjApplicationId);
	}

	/**
	 * Returns the ncbj product service detail where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj product service detail, or <code>null</code> if a matching ncbj product service detail could not be found
	 */
	public static NcbjProductServiceDetail fetchBygetNCBJ_ById(
		long ncbjApplicationId) {

		return getPersistence().fetchBygetNCBJ_ById(ncbjApplicationId);
	}

	/**
	 * Returns the ncbj product service detail where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncbj product service detail, or <code>null</code> if a matching ncbj product service detail could not be found
	 */
	public static NcbjProductServiceDetail fetchBygetNCBJ_ById(
		long ncbjApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetNCBJ_ById(
			ncbjApplicationId, useFinderCache);
	}

	/**
	 * Removes the ncbj product service detail where ncbjApplicationId = &#63; from the database.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the ncbj product service detail that was removed
	 */
	public static NcbjProductServiceDetail removeBygetNCBJ_ById(
			long ncbjApplicationId)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjProductServiceDetailException {

		return getPersistence().removeBygetNCBJ_ById(ncbjApplicationId);
	}

	/**
	 * Returns the number of ncbj product service details where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the number of matching ncbj product service details
	 */
	public static int countBygetNCBJ_ById(long ncbjApplicationId) {
		return getPersistence().countBygetNCBJ_ById(ncbjApplicationId);
	}

	/**
	 * Returns all the ncbj product service details where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj product service details
	 */
	public static List<NcbjProductServiceDetail> findBygetNCBJ_ByAppId(
		long ncbjApplicationId) {

		return getPersistence().findBygetNCBJ_ByAppId(ncbjApplicationId);
	}

	/**
	 * Returns a range of all the ncbj product service details where ncbjApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjProductServiceDetailModelImpl</code>.
	 * </p>
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param start the lower bound of the range of ncbj product service details
	 * @param end the upper bound of the range of ncbj product service details (not inclusive)
	 * @return the range of matching ncbj product service details
	 */
	public static List<NcbjProductServiceDetail> findBygetNCBJ_ByAppId(
		long ncbjApplicationId, int start, int end) {

		return getPersistence().findBygetNCBJ_ByAppId(
			ncbjApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the ncbj product service details where ncbjApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjProductServiceDetailModelImpl</code>.
	 * </p>
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param start the lower bound of the range of ncbj product service details
	 * @param end the upper bound of the range of ncbj product service details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncbj product service details
	 */
	public static List<NcbjProductServiceDetail> findBygetNCBJ_ByAppId(
		long ncbjApplicationId, int start, int end,
		OrderByComparator<NcbjProductServiceDetail> orderByComparator) {

		return getPersistence().findBygetNCBJ_ByAppId(
			ncbjApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the ncbj product service details where ncbjApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjProductServiceDetailModelImpl</code>.
	 * </p>
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param start the lower bound of the range of ncbj product service details
	 * @param end the upper bound of the range of ncbj product service details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncbj product service details
	 */
	public static List<NcbjProductServiceDetail> findBygetNCBJ_ByAppId(
		long ncbjApplicationId, int start, int end,
		OrderByComparator<NcbjProductServiceDetail> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetNCBJ_ByAppId(
			ncbjApplicationId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first ncbj product service detail in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj product service detail
	 * @throws NoSuchNcbjProductServiceDetailException if a matching ncbj product service detail could not be found
	 */
	public static NcbjProductServiceDetail findBygetNCBJ_ByAppId_First(
			long ncbjApplicationId,
			OrderByComparator<NcbjProductServiceDetail> orderByComparator)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjProductServiceDetailException {

		return getPersistence().findBygetNCBJ_ByAppId_First(
			ncbjApplicationId, orderByComparator);
	}

	/**
	 * Returns the first ncbj product service detail in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj product service detail, or <code>null</code> if a matching ncbj product service detail could not be found
	 */
	public static NcbjProductServiceDetail fetchBygetNCBJ_ByAppId_First(
		long ncbjApplicationId,
		OrderByComparator<NcbjProductServiceDetail> orderByComparator) {

		return getPersistence().fetchBygetNCBJ_ByAppId_First(
			ncbjApplicationId, orderByComparator);
	}

	/**
	 * Returns the last ncbj product service detail in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj product service detail
	 * @throws NoSuchNcbjProductServiceDetailException if a matching ncbj product service detail could not be found
	 */
	public static NcbjProductServiceDetail findBygetNCBJ_ByAppId_Last(
			long ncbjApplicationId,
			OrderByComparator<NcbjProductServiceDetail> orderByComparator)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjProductServiceDetailException {

		return getPersistence().findBygetNCBJ_ByAppId_Last(
			ncbjApplicationId, orderByComparator);
	}

	/**
	 * Returns the last ncbj product service detail in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj product service detail, or <code>null</code> if a matching ncbj product service detail could not be found
	 */
	public static NcbjProductServiceDetail fetchBygetNCBJ_ByAppId_Last(
		long ncbjApplicationId,
		OrderByComparator<NcbjProductServiceDetail> orderByComparator) {

		return getPersistence().fetchBygetNCBJ_ByAppId_Last(
			ncbjApplicationId, orderByComparator);
	}

	/**
	 * Returns the ncbj product service details before and after the current ncbj product service detail in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjProductServiceDetailId the primary key of the current ncbj product service detail
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncbj product service detail
	 * @throws NoSuchNcbjProductServiceDetailException if a ncbj product service detail with the primary key could not be found
	 */
	public static NcbjProductServiceDetail[] findBygetNCBJ_ByAppId_PrevAndNext(
			long ncbjProductServiceDetailId, long ncbjApplicationId,
			OrderByComparator<NcbjProductServiceDetail> orderByComparator)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjProductServiceDetailException {

		return getPersistence().findBygetNCBJ_ByAppId_PrevAndNext(
			ncbjProductServiceDetailId, ncbjApplicationId, orderByComparator);
	}

	/**
	 * Removes all the ncbj product service details where ncbjApplicationId = &#63; from the database.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 */
	public static void removeBygetNCBJ_ByAppId(long ncbjApplicationId) {
		getPersistence().removeBygetNCBJ_ByAppId(ncbjApplicationId);
	}

	/**
	 * Returns the number of ncbj product service details where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the number of matching ncbj product service details
	 */
	public static int countBygetNCBJ_ByAppId(long ncbjApplicationId) {
		return getPersistence().countBygetNCBJ_ByAppId(ncbjApplicationId);
	}

	/**
	 * Caches the ncbj product service detail in the entity cache if it is enabled.
	 *
	 * @param ncbjProductServiceDetail the ncbj product service detail
	 */
	public static void cacheResult(
		NcbjProductServiceDetail ncbjProductServiceDetail) {

		getPersistence().cacheResult(ncbjProductServiceDetail);
	}

	/**
	 * Caches the ncbj product service details in the entity cache if it is enabled.
	 *
	 * @param ncbjProductServiceDetails the ncbj product service details
	 */
	public static void cacheResult(
		List<NcbjProductServiceDetail> ncbjProductServiceDetails) {

		getPersistence().cacheResult(ncbjProductServiceDetails);
	}

	/**
	 * Creates a new ncbj product service detail with the primary key. Does not add the ncbj product service detail to the database.
	 *
	 * @param ncbjProductServiceDetailId the primary key for the new ncbj product service detail
	 * @return the new ncbj product service detail
	 */
	public static NcbjProductServiceDetail create(
		long ncbjProductServiceDetailId) {

		return getPersistence().create(ncbjProductServiceDetailId);
	}

	/**
	 * Removes the ncbj product service detail with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ncbjProductServiceDetailId the primary key of the ncbj product service detail
	 * @return the ncbj product service detail that was removed
	 * @throws NoSuchNcbjProductServiceDetailException if a ncbj product service detail with the primary key could not be found
	 */
	public static NcbjProductServiceDetail remove(
			long ncbjProductServiceDetailId)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjProductServiceDetailException {

		return getPersistence().remove(ncbjProductServiceDetailId);
	}

	public static NcbjProductServiceDetail updateImpl(
		NcbjProductServiceDetail ncbjProductServiceDetail) {

		return getPersistence().updateImpl(ncbjProductServiceDetail);
	}

	/**
	 * Returns the ncbj product service detail with the primary key or throws a <code>NoSuchNcbjProductServiceDetailException</code> if it could not be found.
	 *
	 * @param ncbjProductServiceDetailId the primary key of the ncbj product service detail
	 * @return the ncbj product service detail
	 * @throws NoSuchNcbjProductServiceDetailException if a ncbj product service detail with the primary key could not be found
	 */
	public static NcbjProductServiceDetail findByPrimaryKey(
			long ncbjProductServiceDetailId)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjProductServiceDetailException {

		return getPersistence().findByPrimaryKey(ncbjProductServiceDetailId);
	}

	/**
	 * Returns the ncbj product service detail with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ncbjProductServiceDetailId the primary key of the ncbj product service detail
	 * @return the ncbj product service detail, or <code>null</code> if a ncbj product service detail with the primary key could not be found
	 */
	public static NcbjProductServiceDetail fetchByPrimaryKey(
		long ncbjProductServiceDetailId) {

		return getPersistence().fetchByPrimaryKey(ncbjProductServiceDetailId);
	}

	/**
	 * Returns all the ncbj product service details.
	 *
	 * @return the ncbj product service details
	 */
	public static List<NcbjProductServiceDetail> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the ncbj product service details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjProductServiceDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj product service details
	 * @param end the upper bound of the range of ncbj product service details (not inclusive)
	 * @return the range of ncbj product service details
	 */
	public static List<NcbjProductServiceDetail> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the ncbj product service details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjProductServiceDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj product service details
	 * @param end the upper bound of the range of ncbj product service details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ncbj product service details
	 */
	public static List<NcbjProductServiceDetail> findAll(
		int start, int end,
		OrderByComparator<NcbjProductServiceDetail> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the ncbj product service details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjProductServiceDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj product service details
	 * @param end the upper bound of the range of ncbj product service details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ncbj product service details
	 */
	public static List<NcbjProductServiceDetail> findAll(
		int start, int end,
		OrderByComparator<NcbjProductServiceDetail> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the ncbj product service details from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of ncbj product service details.
	 *
	 * @return the number of ncbj product service details
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static NcbjProductServiceDetailPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		NcbjProductServiceDetailPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile NcbjProductServiceDetailPersistence _persistence;

}