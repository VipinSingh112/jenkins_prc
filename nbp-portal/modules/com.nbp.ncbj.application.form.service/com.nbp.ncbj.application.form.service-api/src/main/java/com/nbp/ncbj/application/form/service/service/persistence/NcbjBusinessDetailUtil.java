/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.ncbj.application.form.service.model.NcbjBusinessDetail;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the ncbj business detail service. This utility wraps <code>com.nbp.ncbj.application.form.service.service.persistence.impl.NcbjBusinessDetailPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NcbjBusinessDetailPersistence
 * @generated
 */
public class NcbjBusinessDetailUtil {

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
	public static void clearCache(NcbjBusinessDetail ncbjBusinessDetail) {
		getPersistence().clearCache(ncbjBusinessDetail);
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
	public static Map<Serializable, NcbjBusinessDetail> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<NcbjBusinessDetail> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<NcbjBusinessDetail> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<NcbjBusinessDetail> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<NcbjBusinessDetail> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static NcbjBusinessDetail update(
		NcbjBusinessDetail ncbjBusinessDetail) {

		return getPersistence().update(ncbjBusinessDetail);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static NcbjBusinessDetail update(
		NcbjBusinessDetail ncbjBusinessDetail, ServiceContext serviceContext) {

		return getPersistence().update(ncbjBusinessDetail, serviceContext);
	}

	/**
	 * Returns all the ncbj business details where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj business details
	 */
	public static List<NcbjBusinessDetail> findBygetByNcbjBusiDetail(
		long ncbjApplicationId) {

		return getPersistence().findBygetByNcbjBusiDetail(ncbjApplicationId);
	}

	/**
	 * Returns a range of all the ncbj business details where ncbjApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjBusinessDetailModelImpl</code>.
	 * </p>
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param start the lower bound of the range of ncbj business details
	 * @param end the upper bound of the range of ncbj business details (not inclusive)
	 * @return the range of matching ncbj business details
	 */
	public static List<NcbjBusinessDetail> findBygetByNcbjBusiDetail(
		long ncbjApplicationId, int start, int end) {

		return getPersistence().findBygetByNcbjBusiDetail(
			ncbjApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the ncbj business details where ncbjApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjBusinessDetailModelImpl</code>.
	 * </p>
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param start the lower bound of the range of ncbj business details
	 * @param end the upper bound of the range of ncbj business details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncbj business details
	 */
	public static List<NcbjBusinessDetail> findBygetByNcbjBusiDetail(
		long ncbjApplicationId, int start, int end,
		OrderByComparator<NcbjBusinessDetail> orderByComparator) {

		return getPersistence().findBygetByNcbjBusiDetail(
			ncbjApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the ncbj business details where ncbjApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjBusinessDetailModelImpl</code>.
	 * </p>
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param start the lower bound of the range of ncbj business details
	 * @param end the upper bound of the range of ncbj business details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncbj business details
	 */
	public static List<NcbjBusinessDetail> findBygetByNcbjBusiDetail(
		long ncbjApplicationId, int start, int end,
		OrderByComparator<NcbjBusinessDetail> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetByNcbjBusiDetail(
			ncbjApplicationId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first ncbj business detail in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj business detail
	 * @throws NoSuchNcbjBusinessDetailException if a matching ncbj business detail could not be found
	 */
	public static NcbjBusinessDetail findBygetByNcbjBusiDetail_First(
			long ncbjApplicationId,
			OrderByComparator<NcbjBusinessDetail> orderByComparator)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjBusinessDetailException {

		return getPersistence().findBygetByNcbjBusiDetail_First(
			ncbjApplicationId, orderByComparator);
	}

	/**
	 * Returns the first ncbj business detail in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj business detail, or <code>null</code> if a matching ncbj business detail could not be found
	 */
	public static NcbjBusinessDetail fetchBygetByNcbjBusiDetail_First(
		long ncbjApplicationId,
		OrderByComparator<NcbjBusinessDetail> orderByComparator) {

		return getPersistence().fetchBygetByNcbjBusiDetail_First(
			ncbjApplicationId, orderByComparator);
	}

	/**
	 * Returns the last ncbj business detail in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj business detail
	 * @throws NoSuchNcbjBusinessDetailException if a matching ncbj business detail could not be found
	 */
	public static NcbjBusinessDetail findBygetByNcbjBusiDetail_Last(
			long ncbjApplicationId,
			OrderByComparator<NcbjBusinessDetail> orderByComparator)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjBusinessDetailException {

		return getPersistence().findBygetByNcbjBusiDetail_Last(
			ncbjApplicationId, orderByComparator);
	}

	/**
	 * Returns the last ncbj business detail in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj business detail, or <code>null</code> if a matching ncbj business detail could not be found
	 */
	public static NcbjBusinessDetail fetchBygetByNcbjBusiDetail_Last(
		long ncbjApplicationId,
		OrderByComparator<NcbjBusinessDetail> orderByComparator) {

		return getPersistence().fetchBygetByNcbjBusiDetail_Last(
			ncbjApplicationId, orderByComparator);
	}

	/**
	 * Returns the ncbj business details before and after the current ncbj business detail in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjBusinessDetailId the primary key of the current ncbj business detail
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncbj business detail
	 * @throws NoSuchNcbjBusinessDetailException if a ncbj business detail with the primary key could not be found
	 */
	public static NcbjBusinessDetail[] findBygetByNcbjBusiDetail_PrevAndNext(
			long ncbjBusinessDetailId, long ncbjApplicationId,
			OrderByComparator<NcbjBusinessDetail> orderByComparator)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjBusinessDetailException {

		return getPersistence().findBygetByNcbjBusiDetail_PrevAndNext(
			ncbjBusinessDetailId, ncbjApplicationId, orderByComparator);
	}

	/**
	 * Removes all the ncbj business details where ncbjApplicationId = &#63; from the database.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 */
	public static void removeBygetByNcbjBusiDetail(long ncbjApplicationId) {
		getPersistence().removeBygetByNcbjBusiDetail(ncbjApplicationId);
	}

	/**
	 * Returns the number of ncbj business details where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the number of matching ncbj business details
	 */
	public static int countBygetByNcbjBusiDetail(long ncbjApplicationId) {
		return getPersistence().countBygetByNcbjBusiDetail(ncbjApplicationId);
	}

	/**
	 * Caches the ncbj business detail in the entity cache if it is enabled.
	 *
	 * @param ncbjBusinessDetail the ncbj business detail
	 */
	public static void cacheResult(NcbjBusinessDetail ncbjBusinessDetail) {
		getPersistence().cacheResult(ncbjBusinessDetail);
	}

	/**
	 * Caches the ncbj business details in the entity cache if it is enabled.
	 *
	 * @param ncbjBusinessDetails the ncbj business details
	 */
	public static void cacheResult(
		List<NcbjBusinessDetail> ncbjBusinessDetails) {

		getPersistence().cacheResult(ncbjBusinessDetails);
	}

	/**
	 * Creates a new ncbj business detail with the primary key. Does not add the ncbj business detail to the database.
	 *
	 * @param ncbjBusinessDetailId the primary key for the new ncbj business detail
	 * @return the new ncbj business detail
	 */
	public static NcbjBusinessDetail create(long ncbjBusinessDetailId) {
		return getPersistence().create(ncbjBusinessDetailId);
	}

	/**
	 * Removes the ncbj business detail with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ncbjBusinessDetailId the primary key of the ncbj business detail
	 * @return the ncbj business detail that was removed
	 * @throws NoSuchNcbjBusinessDetailException if a ncbj business detail with the primary key could not be found
	 */
	public static NcbjBusinessDetail remove(long ncbjBusinessDetailId)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjBusinessDetailException {

		return getPersistence().remove(ncbjBusinessDetailId);
	}

	public static NcbjBusinessDetail updateImpl(
		NcbjBusinessDetail ncbjBusinessDetail) {

		return getPersistence().updateImpl(ncbjBusinessDetail);
	}

	/**
	 * Returns the ncbj business detail with the primary key or throws a <code>NoSuchNcbjBusinessDetailException</code> if it could not be found.
	 *
	 * @param ncbjBusinessDetailId the primary key of the ncbj business detail
	 * @return the ncbj business detail
	 * @throws NoSuchNcbjBusinessDetailException if a ncbj business detail with the primary key could not be found
	 */
	public static NcbjBusinessDetail findByPrimaryKey(long ncbjBusinessDetailId)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjBusinessDetailException {

		return getPersistence().findByPrimaryKey(ncbjBusinessDetailId);
	}

	/**
	 * Returns the ncbj business detail with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ncbjBusinessDetailId the primary key of the ncbj business detail
	 * @return the ncbj business detail, or <code>null</code> if a ncbj business detail with the primary key could not be found
	 */
	public static NcbjBusinessDetail fetchByPrimaryKey(
		long ncbjBusinessDetailId) {

		return getPersistence().fetchByPrimaryKey(ncbjBusinessDetailId);
	}

	/**
	 * Returns all the ncbj business details.
	 *
	 * @return the ncbj business details
	 */
	public static List<NcbjBusinessDetail> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the ncbj business details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjBusinessDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj business details
	 * @param end the upper bound of the range of ncbj business details (not inclusive)
	 * @return the range of ncbj business details
	 */
	public static List<NcbjBusinessDetail> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the ncbj business details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjBusinessDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj business details
	 * @param end the upper bound of the range of ncbj business details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ncbj business details
	 */
	public static List<NcbjBusinessDetail> findAll(
		int start, int end,
		OrderByComparator<NcbjBusinessDetail> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the ncbj business details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjBusinessDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj business details
	 * @param end the upper bound of the range of ncbj business details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ncbj business details
	 */
	public static List<NcbjBusinessDetail> findAll(
		int start, int end,
		OrderByComparator<NcbjBusinessDetail> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the ncbj business details from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of ncbj business details.
	 *
	 * @return the number of ncbj business details
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static NcbjBusinessDetailPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		NcbjBusinessDetailPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile NcbjBusinessDetailPersistence _persistence;

}