/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.ncbj.application.form.service.model.NcbjCompanyDetail;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the ncbj company detail service. This utility wraps <code>com.nbp.ncbj.application.form.service.service.persistence.impl.NcbjCompanyDetailPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NcbjCompanyDetailPersistence
 * @generated
 */
public class NcbjCompanyDetailUtil {

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
	public static void clearCache(NcbjCompanyDetail ncbjCompanyDetail) {
		getPersistence().clearCache(ncbjCompanyDetail);
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
	public static Map<Serializable, NcbjCompanyDetail> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<NcbjCompanyDetail> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<NcbjCompanyDetail> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<NcbjCompanyDetail> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<NcbjCompanyDetail> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static NcbjCompanyDetail update(
		NcbjCompanyDetail ncbjCompanyDetail) {

		return getPersistence().update(ncbjCompanyDetail);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static NcbjCompanyDetail update(
		NcbjCompanyDetail ncbjCompanyDetail, ServiceContext serviceContext) {

		return getPersistence().update(ncbjCompanyDetail, serviceContext);
	}

	/**
	 * Returns the ncbj company detail where ncbjApplicationId = &#63; or throws a <code>NoSuchNcbjCompanyDetailException</code> if it could not be found.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj company detail
	 * @throws NoSuchNcbjCompanyDetailException if a matching ncbj company detail could not be found
	 */
	public static NcbjCompanyDetail findBygetNCBJById(long ncbjApplicationId)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjCompanyDetailException {

		return getPersistence().findBygetNCBJById(ncbjApplicationId);
	}

	/**
	 * Returns the ncbj company detail where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj company detail, or <code>null</code> if a matching ncbj company detail could not be found
	 */
	public static NcbjCompanyDetail fetchBygetNCBJById(long ncbjApplicationId) {
		return getPersistence().fetchBygetNCBJById(ncbjApplicationId);
	}

	/**
	 * Returns the ncbj company detail where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncbj company detail, or <code>null</code> if a matching ncbj company detail could not be found
	 */
	public static NcbjCompanyDetail fetchBygetNCBJById(
		long ncbjApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetNCBJById(
			ncbjApplicationId, useFinderCache);
	}

	/**
	 * Removes the ncbj company detail where ncbjApplicationId = &#63; from the database.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the ncbj company detail that was removed
	 */
	public static NcbjCompanyDetail removeBygetNCBJById(long ncbjApplicationId)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjCompanyDetailException {

		return getPersistence().removeBygetNCBJById(ncbjApplicationId);
	}

	/**
	 * Returns the number of ncbj company details where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the number of matching ncbj company details
	 */
	public static int countBygetNCBJById(long ncbjApplicationId) {
		return getPersistence().countBygetNCBJById(ncbjApplicationId);
	}

	/**
	 * Caches the ncbj company detail in the entity cache if it is enabled.
	 *
	 * @param ncbjCompanyDetail the ncbj company detail
	 */
	public static void cacheResult(NcbjCompanyDetail ncbjCompanyDetail) {
		getPersistence().cacheResult(ncbjCompanyDetail);
	}

	/**
	 * Caches the ncbj company details in the entity cache if it is enabled.
	 *
	 * @param ncbjCompanyDetails the ncbj company details
	 */
	public static void cacheResult(List<NcbjCompanyDetail> ncbjCompanyDetails) {
		getPersistence().cacheResult(ncbjCompanyDetails);
	}

	/**
	 * Creates a new ncbj company detail with the primary key. Does not add the ncbj company detail to the database.
	 *
	 * @param ncbjCompanyDetailId the primary key for the new ncbj company detail
	 * @return the new ncbj company detail
	 */
	public static NcbjCompanyDetail create(long ncbjCompanyDetailId) {
		return getPersistence().create(ncbjCompanyDetailId);
	}

	/**
	 * Removes the ncbj company detail with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ncbjCompanyDetailId the primary key of the ncbj company detail
	 * @return the ncbj company detail that was removed
	 * @throws NoSuchNcbjCompanyDetailException if a ncbj company detail with the primary key could not be found
	 */
	public static NcbjCompanyDetail remove(long ncbjCompanyDetailId)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjCompanyDetailException {

		return getPersistence().remove(ncbjCompanyDetailId);
	}

	public static NcbjCompanyDetail updateImpl(
		NcbjCompanyDetail ncbjCompanyDetail) {

		return getPersistence().updateImpl(ncbjCompanyDetail);
	}

	/**
	 * Returns the ncbj company detail with the primary key or throws a <code>NoSuchNcbjCompanyDetailException</code> if it could not be found.
	 *
	 * @param ncbjCompanyDetailId the primary key of the ncbj company detail
	 * @return the ncbj company detail
	 * @throws NoSuchNcbjCompanyDetailException if a ncbj company detail with the primary key could not be found
	 */
	public static NcbjCompanyDetail findByPrimaryKey(long ncbjCompanyDetailId)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjCompanyDetailException {

		return getPersistence().findByPrimaryKey(ncbjCompanyDetailId);
	}

	/**
	 * Returns the ncbj company detail with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ncbjCompanyDetailId the primary key of the ncbj company detail
	 * @return the ncbj company detail, or <code>null</code> if a ncbj company detail with the primary key could not be found
	 */
	public static NcbjCompanyDetail fetchByPrimaryKey(
		long ncbjCompanyDetailId) {

		return getPersistence().fetchByPrimaryKey(ncbjCompanyDetailId);
	}

	/**
	 * Returns all the ncbj company details.
	 *
	 * @return the ncbj company details
	 */
	public static List<NcbjCompanyDetail> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the ncbj company details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjCompanyDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj company details
	 * @param end the upper bound of the range of ncbj company details (not inclusive)
	 * @return the range of ncbj company details
	 */
	public static List<NcbjCompanyDetail> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the ncbj company details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjCompanyDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj company details
	 * @param end the upper bound of the range of ncbj company details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ncbj company details
	 */
	public static List<NcbjCompanyDetail> findAll(
		int start, int end,
		OrderByComparator<NcbjCompanyDetail> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the ncbj company details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjCompanyDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj company details
	 * @param end the upper bound of the range of ncbj company details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ncbj company details
	 */
	public static List<NcbjCompanyDetail> findAll(
		int start, int end,
		OrderByComparator<NcbjCompanyDetail> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the ncbj company details from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of ncbj company details.
	 *
	 * @return the number of ncbj company details
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static NcbjCompanyDetailPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		NcbjCompanyDetailPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile NcbjCompanyDetailPersistence _persistence;

}