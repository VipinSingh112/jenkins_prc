/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.ncbj.application.form.service.model.NcbjApplicantDetail;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the ncbj applicant detail service. This utility wraps <code>com.nbp.ncbj.application.form.service.service.persistence.impl.NcbjApplicantDetailPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NcbjApplicantDetailPersistence
 * @generated
 */
public class NcbjApplicantDetailUtil {

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
	public static void clearCache(NcbjApplicantDetail ncbjApplicantDetail) {
		getPersistence().clearCache(ncbjApplicantDetail);
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
	public static Map<Serializable, NcbjApplicantDetail> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<NcbjApplicantDetail> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<NcbjApplicantDetail> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<NcbjApplicantDetail> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<NcbjApplicantDetail> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static NcbjApplicantDetail update(
		NcbjApplicantDetail ncbjApplicantDetail) {

		return getPersistence().update(ncbjApplicantDetail);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static NcbjApplicantDetail update(
		NcbjApplicantDetail ncbjApplicantDetail,
		ServiceContext serviceContext) {

		return getPersistence().update(ncbjApplicantDetail, serviceContext);
	}

	/**
	 * Returns the ncbj applicant detail where ncbjApplicationId = &#63; or throws a <code>NoSuchNcbjApplicantDetailException</code> if it could not be found.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj applicant detail
	 * @throws NoSuchNcbjApplicantDetailException if a matching ncbj applicant detail could not be found
	 */
	public static NcbjApplicantDetail findBygetNCBJById(long ncbjApplicationId)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjApplicantDetailException {

		return getPersistence().findBygetNCBJById(ncbjApplicationId);
	}

	/**
	 * Returns the ncbj applicant detail where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj applicant detail, or <code>null</code> if a matching ncbj applicant detail could not be found
	 */
	public static NcbjApplicantDetail fetchBygetNCBJById(
		long ncbjApplicationId) {

		return getPersistence().fetchBygetNCBJById(ncbjApplicationId);
	}

	/**
	 * Returns the ncbj applicant detail where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncbj applicant detail, or <code>null</code> if a matching ncbj applicant detail could not be found
	 */
	public static NcbjApplicantDetail fetchBygetNCBJById(
		long ncbjApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetNCBJById(
			ncbjApplicationId, useFinderCache);
	}

	/**
	 * Removes the ncbj applicant detail where ncbjApplicationId = &#63; from the database.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the ncbj applicant detail that was removed
	 */
	public static NcbjApplicantDetail removeBygetNCBJById(
			long ncbjApplicationId)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjApplicantDetailException {

		return getPersistence().removeBygetNCBJById(ncbjApplicationId);
	}

	/**
	 * Returns the number of ncbj applicant details where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the number of matching ncbj applicant details
	 */
	public static int countBygetNCBJById(long ncbjApplicationId) {
		return getPersistence().countBygetNCBJById(ncbjApplicationId);
	}

	/**
	 * Caches the ncbj applicant detail in the entity cache if it is enabled.
	 *
	 * @param ncbjApplicantDetail the ncbj applicant detail
	 */
	public static void cacheResult(NcbjApplicantDetail ncbjApplicantDetail) {
		getPersistence().cacheResult(ncbjApplicantDetail);
	}

	/**
	 * Caches the ncbj applicant details in the entity cache if it is enabled.
	 *
	 * @param ncbjApplicantDetails the ncbj applicant details
	 */
	public static void cacheResult(
		List<NcbjApplicantDetail> ncbjApplicantDetails) {

		getPersistence().cacheResult(ncbjApplicantDetails);
	}

	/**
	 * Creates a new ncbj applicant detail with the primary key. Does not add the ncbj applicant detail to the database.
	 *
	 * @param ncbjApplicantDetailId the primary key for the new ncbj applicant detail
	 * @return the new ncbj applicant detail
	 */
	public static NcbjApplicantDetail create(long ncbjApplicantDetailId) {
		return getPersistence().create(ncbjApplicantDetailId);
	}

	/**
	 * Removes the ncbj applicant detail with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ncbjApplicantDetailId the primary key of the ncbj applicant detail
	 * @return the ncbj applicant detail that was removed
	 * @throws NoSuchNcbjApplicantDetailException if a ncbj applicant detail with the primary key could not be found
	 */
	public static NcbjApplicantDetail remove(long ncbjApplicantDetailId)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjApplicantDetailException {

		return getPersistence().remove(ncbjApplicantDetailId);
	}

	public static NcbjApplicantDetail updateImpl(
		NcbjApplicantDetail ncbjApplicantDetail) {

		return getPersistence().updateImpl(ncbjApplicantDetail);
	}

	/**
	 * Returns the ncbj applicant detail with the primary key or throws a <code>NoSuchNcbjApplicantDetailException</code> if it could not be found.
	 *
	 * @param ncbjApplicantDetailId the primary key of the ncbj applicant detail
	 * @return the ncbj applicant detail
	 * @throws NoSuchNcbjApplicantDetailException if a ncbj applicant detail with the primary key could not be found
	 */
	public static NcbjApplicantDetail findByPrimaryKey(
			long ncbjApplicantDetailId)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjApplicantDetailException {

		return getPersistence().findByPrimaryKey(ncbjApplicantDetailId);
	}

	/**
	 * Returns the ncbj applicant detail with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ncbjApplicantDetailId the primary key of the ncbj applicant detail
	 * @return the ncbj applicant detail, or <code>null</code> if a ncbj applicant detail with the primary key could not be found
	 */
	public static NcbjApplicantDetail fetchByPrimaryKey(
		long ncbjApplicantDetailId) {

		return getPersistence().fetchByPrimaryKey(ncbjApplicantDetailId);
	}

	/**
	 * Returns all the ncbj applicant details.
	 *
	 * @return the ncbj applicant details
	 */
	public static List<NcbjApplicantDetail> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the ncbj applicant details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicantDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj applicant details
	 * @param end the upper bound of the range of ncbj applicant details (not inclusive)
	 * @return the range of ncbj applicant details
	 */
	public static List<NcbjApplicantDetail> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the ncbj applicant details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicantDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj applicant details
	 * @param end the upper bound of the range of ncbj applicant details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ncbj applicant details
	 */
	public static List<NcbjApplicantDetail> findAll(
		int start, int end,
		OrderByComparator<NcbjApplicantDetail> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the ncbj applicant details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicantDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj applicant details
	 * @param end the upper bound of the range of ncbj applicant details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ncbj applicant details
	 */
	public static List<NcbjApplicantDetail> findAll(
		int start, int end,
		OrderByComparator<NcbjApplicantDetail> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the ncbj applicant details from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of ncbj applicant details.
	 *
	 * @return the number of ncbj applicant details
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static NcbjApplicantDetailPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		NcbjApplicantDetailPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile NcbjApplicantDetailPersistence _persistence;

}