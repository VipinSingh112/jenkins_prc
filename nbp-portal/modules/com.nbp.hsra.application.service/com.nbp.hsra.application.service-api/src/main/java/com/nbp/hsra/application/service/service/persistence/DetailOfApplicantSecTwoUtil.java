/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.hsra.application.service.model.DetailOfApplicantSecTwo;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the detail of applicant sec two service. This utility wraps <code>com.nbp.hsra.application.service.service.persistence.impl.DetailOfApplicantSecTwoPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DetailOfApplicantSecTwoPersistence
 * @generated
 */
public class DetailOfApplicantSecTwoUtil {

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
		DetailOfApplicantSecTwo detailOfApplicantSecTwo) {

		getPersistence().clearCache(detailOfApplicantSecTwo);
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
	public static Map<Serializable, DetailOfApplicantSecTwo> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<DetailOfApplicantSecTwo> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DetailOfApplicantSecTwo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DetailOfApplicantSecTwo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<DetailOfApplicantSecTwo> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static DetailOfApplicantSecTwo update(
		DetailOfApplicantSecTwo detailOfApplicantSecTwo) {

		return getPersistence().update(detailOfApplicantSecTwo);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static DetailOfApplicantSecTwo update(
		DetailOfApplicantSecTwo detailOfApplicantSecTwo,
		ServiceContext serviceContext) {

		return getPersistence().update(detailOfApplicantSecTwo, serviceContext);
	}

	/**
	 * Returns the detail of applicant sec two where hsraApplicationId = &#63; or throws a <code>NoSuchDetailOfApplicantSecTwoException</code> if it could not be found.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching detail of applicant sec two
	 * @throws NoSuchDetailOfApplicantSecTwoException if a matching detail of applicant sec two could not be found
	 */
	public static DetailOfApplicantSecTwo findBygetHsraById(
			long hsraApplicationId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchDetailOfApplicantSecTwoException {

		return getPersistence().findBygetHsraById(hsraApplicationId);
	}

	/**
	 * Returns the detail of applicant sec two where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching detail of applicant sec two, or <code>null</code> if a matching detail of applicant sec two could not be found
	 */
	public static DetailOfApplicantSecTwo fetchBygetHsraById(
		long hsraApplicationId) {

		return getPersistence().fetchBygetHsraById(hsraApplicationId);
	}

	/**
	 * Returns the detail of applicant sec two where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching detail of applicant sec two, or <code>null</code> if a matching detail of applicant sec two could not be found
	 */
	public static DetailOfApplicantSecTwo fetchBygetHsraById(
		long hsraApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetHsraById(
			hsraApplicationId, useFinderCache);
	}

	/**
	 * Removes the detail of applicant sec two where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the detail of applicant sec two that was removed
	 */
	public static DetailOfApplicantSecTwo removeBygetHsraById(
			long hsraApplicationId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchDetailOfApplicantSecTwoException {

		return getPersistence().removeBygetHsraById(hsraApplicationId);
	}

	/**
	 * Returns the number of detail of applicant sec twos where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching detail of applicant sec twos
	 */
	public static int countBygetHsraById(long hsraApplicationId) {
		return getPersistence().countBygetHsraById(hsraApplicationId);
	}

	/**
	 * Caches the detail of applicant sec two in the entity cache if it is enabled.
	 *
	 * @param detailOfApplicantSecTwo the detail of applicant sec two
	 */
	public static void cacheResult(
		DetailOfApplicantSecTwo detailOfApplicantSecTwo) {

		getPersistence().cacheResult(detailOfApplicantSecTwo);
	}

	/**
	 * Caches the detail of applicant sec twos in the entity cache if it is enabled.
	 *
	 * @param detailOfApplicantSecTwos the detail of applicant sec twos
	 */
	public static void cacheResult(
		List<DetailOfApplicantSecTwo> detailOfApplicantSecTwos) {

		getPersistence().cacheResult(detailOfApplicantSecTwos);
	}

	/**
	 * Creates a new detail of applicant sec two with the primary key. Does not add the detail of applicant sec two to the database.
	 *
	 * @param detailOfAppliSecTwoId the primary key for the new detail of applicant sec two
	 * @return the new detail of applicant sec two
	 */
	public static DetailOfApplicantSecTwo create(long detailOfAppliSecTwoId) {
		return getPersistence().create(detailOfAppliSecTwoId);
	}

	/**
	 * Removes the detail of applicant sec two with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param detailOfAppliSecTwoId the primary key of the detail of applicant sec two
	 * @return the detail of applicant sec two that was removed
	 * @throws NoSuchDetailOfApplicantSecTwoException if a detail of applicant sec two with the primary key could not be found
	 */
	public static DetailOfApplicantSecTwo remove(long detailOfAppliSecTwoId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchDetailOfApplicantSecTwoException {

		return getPersistence().remove(detailOfAppliSecTwoId);
	}

	public static DetailOfApplicantSecTwo updateImpl(
		DetailOfApplicantSecTwo detailOfApplicantSecTwo) {

		return getPersistence().updateImpl(detailOfApplicantSecTwo);
	}

	/**
	 * Returns the detail of applicant sec two with the primary key or throws a <code>NoSuchDetailOfApplicantSecTwoException</code> if it could not be found.
	 *
	 * @param detailOfAppliSecTwoId the primary key of the detail of applicant sec two
	 * @return the detail of applicant sec two
	 * @throws NoSuchDetailOfApplicantSecTwoException if a detail of applicant sec two with the primary key could not be found
	 */
	public static DetailOfApplicantSecTwo findByPrimaryKey(
			long detailOfAppliSecTwoId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchDetailOfApplicantSecTwoException {

		return getPersistence().findByPrimaryKey(detailOfAppliSecTwoId);
	}

	/**
	 * Returns the detail of applicant sec two with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param detailOfAppliSecTwoId the primary key of the detail of applicant sec two
	 * @return the detail of applicant sec two, or <code>null</code> if a detail of applicant sec two with the primary key could not be found
	 */
	public static DetailOfApplicantSecTwo fetchByPrimaryKey(
		long detailOfAppliSecTwoId) {

		return getPersistence().fetchByPrimaryKey(detailOfAppliSecTwoId);
	}

	/**
	 * Returns all the detail of applicant sec twos.
	 *
	 * @return the detail of applicant sec twos
	 */
	public static List<DetailOfApplicantSecTwo> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the detail of applicant sec twos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DetailOfApplicantSecTwoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of detail of applicant sec twos
	 * @param end the upper bound of the range of detail of applicant sec twos (not inclusive)
	 * @return the range of detail of applicant sec twos
	 */
	public static List<DetailOfApplicantSecTwo> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the detail of applicant sec twos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DetailOfApplicantSecTwoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of detail of applicant sec twos
	 * @param end the upper bound of the range of detail of applicant sec twos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of detail of applicant sec twos
	 */
	public static List<DetailOfApplicantSecTwo> findAll(
		int start, int end,
		OrderByComparator<DetailOfApplicantSecTwo> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the detail of applicant sec twos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DetailOfApplicantSecTwoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of detail of applicant sec twos
	 * @param end the upper bound of the range of detail of applicant sec twos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of detail of applicant sec twos
	 */
	public static List<DetailOfApplicantSecTwo> findAll(
		int start, int end,
		OrderByComparator<DetailOfApplicantSecTwo> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the detail of applicant sec twos from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of detail of applicant sec twos.
	 *
	 * @return the number of detail of applicant sec twos
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static DetailOfApplicantSecTwoPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		DetailOfApplicantSecTwoPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile DetailOfApplicantSecTwoPersistence _persistence;

}