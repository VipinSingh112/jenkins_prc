/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.ncbj.application.form.service.model.NcbjOrganizationDetail;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the ncbj organization detail service. This utility wraps <code>com.nbp.ncbj.application.form.service.service.persistence.impl.NcbjOrganizationDetailPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NcbjOrganizationDetailPersistence
 * @generated
 */
public class NcbjOrganizationDetailUtil {

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
		NcbjOrganizationDetail ncbjOrganizationDetail) {

		getPersistence().clearCache(ncbjOrganizationDetail);
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
	public static Map<Serializable, NcbjOrganizationDetail> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<NcbjOrganizationDetail> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<NcbjOrganizationDetail> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<NcbjOrganizationDetail> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<NcbjOrganizationDetail> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static NcbjOrganizationDetail update(
		NcbjOrganizationDetail ncbjOrganizationDetail) {

		return getPersistence().update(ncbjOrganizationDetail);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static NcbjOrganizationDetail update(
		NcbjOrganizationDetail ncbjOrganizationDetail,
		ServiceContext serviceContext) {

		return getPersistence().update(ncbjOrganizationDetail, serviceContext);
	}

	/**
	 * Returns the ncbj organization detail where ncbjApplicationId = &#63; or throws a <code>NoSuchNcbjOrganizationDetailException</code> if it could not be found.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj organization detail
	 * @throws NoSuchNcbjOrganizationDetailException if a matching ncbj organization detail could not be found
	 */
	public static NcbjOrganizationDetail findBygetNCBJById(
			long ncbjApplicationId)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjOrganizationDetailException {

		return getPersistence().findBygetNCBJById(ncbjApplicationId);
	}

	/**
	 * Returns the ncbj organization detail where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj organization detail, or <code>null</code> if a matching ncbj organization detail could not be found
	 */
	public static NcbjOrganizationDetail fetchBygetNCBJById(
		long ncbjApplicationId) {

		return getPersistence().fetchBygetNCBJById(ncbjApplicationId);
	}

	/**
	 * Returns the ncbj organization detail where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncbj organization detail, or <code>null</code> if a matching ncbj organization detail could not be found
	 */
	public static NcbjOrganizationDetail fetchBygetNCBJById(
		long ncbjApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetNCBJById(
			ncbjApplicationId, useFinderCache);
	}

	/**
	 * Removes the ncbj organization detail where ncbjApplicationId = &#63; from the database.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the ncbj organization detail that was removed
	 */
	public static NcbjOrganizationDetail removeBygetNCBJById(
			long ncbjApplicationId)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjOrganizationDetailException {

		return getPersistence().removeBygetNCBJById(ncbjApplicationId);
	}

	/**
	 * Returns the number of ncbj organization details where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the number of matching ncbj organization details
	 */
	public static int countBygetNCBJById(long ncbjApplicationId) {
		return getPersistence().countBygetNCBJById(ncbjApplicationId);
	}

	/**
	 * Returns the ncbj organization detail where ncbjApplicationId = &#63; or throws a <code>NoSuchNcbjOrganizationDetailException</code> if it could not be found.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj organization detail
	 * @throws NoSuchNcbjOrganizationDetailException if a matching ncbj organization detail could not be found
	 */
	public static NcbjOrganizationDetail findBygetNCBJ_ByAppId(
			long ncbjApplicationId)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjOrganizationDetailException {

		return getPersistence().findBygetNCBJ_ByAppId(ncbjApplicationId);
	}

	/**
	 * Returns the ncbj organization detail where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj organization detail, or <code>null</code> if a matching ncbj organization detail could not be found
	 */
	public static NcbjOrganizationDetail fetchBygetNCBJ_ByAppId(
		long ncbjApplicationId) {

		return getPersistence().fetchBygetNCBJ_ByAppId(ncbjApplicationId);
	}

	/**
	 * Returns the ncbj organization detail where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncbj organization detail, or <code>null</code> if a matching ncbj organization detail could not be found
	 */
	public static NcbjOrganizationDetail fetchBygetNCBJ_ByAppId(
		long ncbjApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetNCBJ_ByAppId(
			ncbjApplicationId, useFinderCache);
	}

	/**
	 * Removes the ncbj organization detail where ncbjApplicationId = &#63; from the database.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the ncbj organization detail that was removed
	 */
	public static NcbjOrganizationDetail removeBygetNCBJ_ByAppId(
			long ncbjApplicationId)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjOrganizationDetailException {

		return getPersistence().removeBygetNCBJ_ByAppId(ncbjApplicationId);
	}

	/**
	 * Returns the number of ncbj organization details where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the number of matching ncbj organization details
	 */
	public static int countBygetNCBJ_ByAppId(long ncbjApplicationId) {
		return getPersistence().countBygetNCBJ_ByAppId(ncbjApplicationId);
	}

	/**
	 * Caches the ncbj organization detail in the entity cache if it is enabled.
	 *
	 * @param ncbjOrganizationDetail the ncbj organization detail
	 */
	public static void cacheResult(
		NcbjOrganizationDetail ncbjOrganizationDetail) {

		getPersistence().cacheResult(ncbjOrganizationDetail);
	}

	/**
	 * Caches the ncbj organization details in the entity cache if it is enabled.
	 *
	 * @param ncbjOrganizationDetails the ncbj organization details
	 */
	public static void cacheResult(
		List<NcbjOrganizationDetail> ncbjOrganizationDetails) {

		getPersistence().cacheResult(ncbjOrganizationDetails);
	}

	/**
	 * Creates a new ncbj organization detail with the primary key. Does not add the ncbj organization detail to the database.
	 *
	 * @param ncbjOrganizationDetailId the primary key for the new ncbj organization detail
	 * @return the new ncbj organization detail
	 */
	public static NcbjOrganizationDetail create(long ncbjOrganizationDetailId) {
		return getPersistence().create(ncbjOrganizationDetailId);
	}

	/**
	 * Removes the ncbj organization detail with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ncbjOrganizationDetailId the primary key of the ncbj organization detail
	 * @return the ncbj organization detail that was removed
	 * @throws NoSuchNcbjOrganizationDetailException if a ncbj organization detail with the primary key could not be found
	 */
	public static NcbjOrganizationDetail remove(long ncbjOrganizationDetailId)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjOrganizationDetailException {

		return getPersistence().remove(ncbjOrganizationDetailId);
	}

	public static NcbjOrganizationDetail updateImpl(
		NcbjOrganizationDetail ncbjOrganizationDetail) {

		return getPersistence().updateImpl(ncbjOrganizationDetail);
	}

	/**
	 * Returns the ncbj organization detail with the primary key or throws a <code>NoSuchNcbjOrganizationDetailException</code> if it could not be found.
	 *
	 * @param ncbjOrganizationDetailId the primary key of the ncbj organization detail
	 * @return the ncbj organization detail
	 * @throws NoSuchNcbjOrganizationDetailException if a ncbj organization detail with the primary key could not be found
	 */
	public static NcbjOrganizationDetail findByPrimaryKey(
			long ncbjOrganizationDetailId)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjOrganizationDetailException {

		return getPersistence().findByPrimaryKey(ncbjOrganizationDetailId);
	}

	/**
	 * Returns the ncbj organization detail with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ncbjOrganizationDetailId the primary key of the ncbj organization detail
	 * @return the ncbj organization detail, or <code>null</code> if a ncbj organization detail with the primary key could not be found
	 */
	public static NcbjOrganizationDetail fetchByPrimaryKey(
		long ncbjOrganizationDetailId) {

		return getPersistence().fetchByPrimaryKey(ncbjOrganizationDetailId);
	}

	/**
	 * Returns all the ncbj organization details.
	 *
	 * @return the ncbj organization details
	 */
	public static List<NcbjOrganizationDetail> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the ncbj organization details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjOrganizationDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj organization details
	 * @param end the upper bound of the range of ncbj organization details (not inclusive)
	 * @return the range of ncbj organization details
	 */
	public static List<NcbjOrganizationDetail> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the ncbj organization details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjOrganizationDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj organization details
	 * @param end the upper bound of the range of ncbj organization details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ncbj organization details
	 */
	public static List<NcbjOrganizationDetail> findAll(
		int start, int end,
		OrderByComparator<NcbjOrganizationDetail> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the ncbj organization details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjOrganizationDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj organization details
	 * @param end the upper bound of the range of ncbj organization details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ncbj organization details
	 */
	public static List<NcbjOrganizationDetail> findAll(
		int start, int end,
		OrderByComparator<NcbjOrganizationDetail> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the ncbj organization details from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of ncbj organization details.
	 *
	 * @return the number of ncbj organization details
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static NcbjOrganizationDetailPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		NcbjOrganizationDetailPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile NcbjOrganizationDetailPersistence _persistence;

}