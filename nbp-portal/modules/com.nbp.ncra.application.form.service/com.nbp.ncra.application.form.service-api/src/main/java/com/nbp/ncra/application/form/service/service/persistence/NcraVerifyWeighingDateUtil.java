/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncra.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.ncra.application.form.service.model.NcraVerifyWeighingDate;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the ncra verify weighing date service. This utility wraps <code>com.nbp.ncra.application.form.service.service.persistence.impl.NcraVerifyWeighingDatePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NcraVerifyWeighingDatePersistence
 * @generated
 */
public class NcraVerifyWeighingDateUtil {

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
		NcraVerifyWeighingDate ncraVerifyWeighingDate) {

		getPersistence().clearCache(ncraVerifyWeighingDate);
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
	public static Map<Serializable, NcraVerifyWeighingDate> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<NcraVerifyWeighingDate> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<NcraVerifyWeighingDate> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<NcraVerifyWeighingDate> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<NcraVerifyWeighingDate> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static NcraVerifyWeighingDate update(
		NcraVerifyWeighingDate ncraVerifyWeighingDate) {

		return getPersistence().update(ncraVerifyWeighingDate);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static NcraVerifyWeighingDate update(
		NcraVerifyWeighingDate ncraVerifyWeighingDate,
		ServiceContext serviceContext) {

		return getPersistence().update(ncraVerifyWeighingDate, serviceContext);
	}

	/**
	 * Returns the ncra verify weighing date where ncraApplicationId = &#63; or throws a <code>NoSuchNcraVerifyWeighingDateException</code> if it could not be found.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @return the matching ncra verify weighing date
	 * @throws NoSuchNcraVerifyWeighingDateException if a matching ncra verify weighing date could not be found
	 */
	public static NcraVerifyWeighingDate findBygetNcraVerify_By_Date(
			long ncraApplicationId)
		throws com.nbp.ncra.application.form.service.exception.
			NoSuchNcraVerifyWeighingDateException {

		return getPersistence().findBygetNcraVerify_By_Date(ncraApplicationId);
	}

	/**
	 * Returns the ncra verify weighing date where ncraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @return the matching ncra verify weighing date, or <code>null</code> if a matching ncra verify weighing date could not be found
	 */
	public static NcraVerifyWeighingDate fetchBygetNcraVerify_By_Date(
		long ncraApplicationId) {

		return getPersistence().fetchBygetNcraVerify_By_Date(ncraApplicationId);
	}

	/**
	 * Returns the ncra verify weighing date where ncraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncra verify weighing date, or <code>null</code> if a matching ncra verify weighing date could not be found
	 */
	public static NcraVerifyWeighingDate fetchBygetNcraVerify_By_Date(
		long ncraApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetNcraVerify_By_Date(
			ncraApplicationId, useFinderCache);
	}

	/**
	 * Removes the ncra verify weighing date where ncraApplicationId = &#63; from the database.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @return the ncra verify weighing date that was removed
	 */
	public static NcraVerifyWeighingDate removeBygetNcraVerify_By_Date(
			long ncraApplicationId)
		throws com.nbp.ncra.application.form.service.exception.
			NoSuchNcraVerifyWeighingDateException {

		return getPersistence().removeBygetNcraVerify_By_Date(
			ncraApplicationId);
	}

	/**
	 * Returns the number of ncra verify weighing dates where ncraApplicationId = &#63;.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @return the number of matching ncra verify weighing dates
	 */
	public static int countBygetNcraVerify_By_Date(long ncraApplicationId) {
		return getPersistence().countBygetNcraVerify_By_Date(ncraApplicationId);
	}

	/**
	 * Caches the ncra verify weighing date in the entity cache if it is enabled.
	 *
	 * @param ncraVerifyWeighingDate the ncra verify weighing date
	 */
	public static void cacheResult(
		NcraVerifyWeighingDate ncraVerifyWeighingDate) {

		getPersistence().cacheResult(ncraVerifyWeighingDate);
	}

	/**
	 * Caches the ncra verify weighing dates in the entity cache if it is enabled.
	 *
	 * @param ncraVerifyWeighingDates the ncra verify weighing dates
	 */
	public static void cacheResult(
		List<NcraVerifyWeighingDate> ncraVerifyWeighingDates) {

		getPersistence().cacheResult(ncraVerifyWeighingDates);
	}

	/**
	 * Creates a new ncra verify weighing date with the primary key. Does not add the ncra verify weighing date to the database.
	 *
	 * @param ncraVerifyWeighingDateId the primary key for the new ncra verify weighing date
	 * @return the new ncra verify weighing date
	 */
	public static NcraVerifyWeighingDate create(long ncraVerifyWeighingDateId) {
		return getPersistence().create(ncraVerifyWeighingDateId);
	}

	/**
	 * Removes the ncra verify weighing date with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ncraVerifyWeighingDateId the primary key of the ncra verify weighing date
	 * @return the ncra verify weighing date that was removed
	 * @throws NoSuchNcraVerifyWeighingDateException if a ncra verify weighing date with the primary key could not be found
	 */
	public static NcraVerifyWeighingDate remove(long ncraVerifyWeighingDateId)
		throws com.nbp.ncra.application.form.service.exception.
			NoSuchNcraVerifyWeighingDateException {

		return getPersistence().remove(ncraVerifyWeighingDateId);
	}

	public static NcraVerifyWeighingDate updateImpl(
		NcraVerifyWeighingDate ncraVerifyWeighingDate) {

		return getPersistence().updateImpl(ncraVerifyWeighingDate);
	}

	/**
	 * Returns the ncra verify weighing date with the primary key or throws a <code>NoSuchNcraVerifyWeighingDateException</code> if it could not be found.
	 *
	 * @param ncraVerifyWeighingDateId the primary key of the ncra verify weighing date
	 * @return the ncra verify weighing date
	 * @throws NoSuchNcraVerifyWeighingDateException if a ncra verify weighing date with the primary key could not be found
	 */
	public static NcraVerifyWeighingDate findByPrimaryKey(
			long ncraVerifyWeighingDateId)
		throws com.nbp.ncra.application.form.service.exception.
			NoSuchNcraVerifyWeighingDateException {

		return getPersistence().findByPrimaryKey(ncraVerifyWeighingDateId);
	}

	/**
	 * Returns the ncra verify weighing date with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ncraVerifyWeighingDateId the primary key of the ncra verify weighing date
	 * @return the ncra verify weighing date, or <code>null</code> if a ncra verify weighing date with the primary key could not be found
	 */
	public static NcraVerifyWeighingDate fetchByPrimaryKey(
		long ncraVerifyWeighingDateId) {

		return getPersistence().fetchByPrimaryKey(ncraVerifyWeighingDateId);
	}

	/**
	 * Returns all the ncra verify weighing dates.
	 *
	 * @return the ncra verify weighing dates
	 */
	public static List<NcraVerifyWeighingDate> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the ncra verify weighing dates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraVerifyWeighingDateModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncra verify weighing dates
	 * @param end the upper bound of the range of ncra verify weighing dates (not inclusive)
	 * @return the range of ncra verify weighing dates
	 */
	public static List<NcraVerifyWeighingDate> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the ncra verify weighing dates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraVerifyWeighingDateModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncra verify weighing dates
	 * @param end the upper bound of the range of ncra verify weighing dates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ncra verify weighing dates
	 */
	public static List<NcraVerifyWeighingDate> findAll(
		int start, int end,
		OrderByComparator<NcraVerifyWeighingDate> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the ncra verify weighing dates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraVerifyWeighingDateModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncra verify weighing dates
	 * @param end the upper bound of the range of ncra verify weighing dates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ncra verify weighing dates
	 */
	public static List<NcraVerifyWeighingDate> findAll(
		int start, int end,
		OrderByComparator<NcraVerifyWeighingDate> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the ncra verify weighing dates from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of ncra verify weighing dates.
	 *
	 * @return the number of ncra verify weighing dates
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static NcraVerifyWeighingDatePersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		NcraVerifyWeighingDatePersistence persistence) {

		_persistence = persistence;
	}

	private static volatile NcraVerifyWeighingDatePersistence _persistence;

}