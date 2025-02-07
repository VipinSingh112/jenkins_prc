/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.tourism.application.form.services.model.TourismNewAccoAssesment;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the tourism new acco assesment service. This utility wraps <code>com.nbp.tourism.application.form.services.service.persistence.impl.TourismNewAccoAssesmentPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismNewAccoAssesmentPersistence
 * @generated
 */
public class TourismNewAccoAssesmentUtil {

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
		TourismNewAccoAssesment tourismNewAccoAssesment) {

		getPersistence().clearCache(tourismNewAccoAssesment);
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
	public static Map<Serializable, TourismNewAccoAssesment> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<TourismNewAccoAssesment> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<TourismNewAccoAssesment> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<TourismNewAccoAssesment> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<TourismNewAccoAssesment> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static TourismNewAccoAssesment update(
		TourismNewAccoAssesment tourismNewAccoAssesment) {

		return getPersistence().update(tourismNewAccoAssesment);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static TourismNewAccoAssesment update(
		TourismNewAccoAssesment tourismNewAccoAssesment,
		ServiceContext serviceContext) {

		return getPersistence().update(tourismNewAccoAssesment, serviceContext);
	}

	/**
	 * Returns the tourism new acco assesment where tourismApplicationId = &#63; or throws a <code>NoSuchTourismNewAccoAssesmentException</code> if it could not be found.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism new acco assesment
	 * @throws NoSuchTourismNewAccoAssesmentException if a matching tourism new acco assesment could not be found
	 */
	public static TourismNewAccoAssesment findBygetTourismById(
			long tourismApplicationId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismNewAccoAssesmentException {

		return getPersistence().findBygetTourismById(tourismApplicationId);
	}

	/**
	 * Returns the tourism new acco assesment where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism new acco assesment, or <code>null</code> if a matching tourism new acco assesment could not be found
	 */
	public static TourismNewAccoAssesment fetchBygetTourismById(
		long tourismApplicationId) {

		return getPersistence().fetchBygetTourismById(tourismApplicationId);
	}

	/**
	 * Returns the tourism new acco assesment where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism new acco assesment, or <code>null</code> if a matching tourism new acco assesment could not be found
	 */
	public static TourismNewAccoAssesment fetchBygetTourismById(
		long tourismApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetTourismById(
			tourismApplicationId, useFinderCache);
	}

	/**
	 * Removes the tourism new acco assesment where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the tourism new acco assesment that was removed
	 */
	public static TourismNewAccoAssesment removeBygetTourismById(
			long tourismApplicationId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismNewAccoAssesmentException {

		return getPersistence().removeBygetTourismById(tourismApplicationId);
	}

	/**
	 * Returns the number of tourism new acco assesments where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism new acco assesments
	 */
	public static int countBygetTourismById(long tourismApplicationId) {
		return getPersistence().countBygetTourismById(tourismApplicationId);
	}

	/**
	 * Caches the tourism new acco assesment in the entity cache if it is enabled.
	 *
	 * @param tourismNewAccoAssesment the tourism new acco assesment
	 */
	public static void cacheResult(
		TourismNewAccoAssesment tourismNewAccoAssesment) {

		getPersistence().cacheResult(tourismNewAccoAssesment);
	}

	/**
	 * Caches the tourism new acco assesments in the entity cache if it is enabled.
	 *
	 * @param tourismNewAccoAssesments the tourism new acco assesments
	 */
	public static void cacheResult(
		List<TourismNewAccoAssesment> tourismNewAccoAssesments) {

		getPersistence().cacheResult(tourismNewAccoAssesments);
	}

	/**
	 * Creates a new tourism new acco assesment with the primary key. Does not add the tourism new acco assesment to the database.
	 *
	 * @param TourismNewAccoAssesmentInfoId the primary key for the new tourism new acco assesment
	 * @return the new tourism new acco assesment
	 */
	public static TourismNewAccoAssesment create(
		long TourismNewAccoAssesmentInfoId) {

		return getPersistence().create(TourismNewAccoAssesmentInfoId);
	}

	/**
	 * Removes the tourism new acco assesment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param TourismNewAccoAssesmentInfoId the primary key of the tourism new acco assesment
	 * @return the tourism new acco assesment that was removed
	 * @throws NoSuchTourismNewAccoAssesmentException if a tourism new acco assesment with the primary key could not be found
	 */
	public static TourismNewAccoAssesment remove(
			long TourismNewAccoAssesmentInfoId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismNewAccoAssesmentException {

		return getPersistence().remove(TourismNewAccoAssesmentInfoId);
	}

	public static TourismNewAccoAssesment updateImpl(
		TourismNewAccoAssesment tourismNewAccoAssesment) {

		return getPersistence().updateImpl(tourismNewAccoAssesment);
	}

	/**
	 * Returns the tourism new acco assesment with the primary key or throws a <code>NoSuchTourismNewAccoAssesmentException</code> if it could not be found.
	 *
	 * @param TourismNewAccoAssesmentInfoId the primary key of the tourism new acco assesment
	 * @return the tourism new acco assesment
	 * @throws NoSuchTourismNewAccoAssesmentException if a tourism new acco assesment with the primary key could not be found
	 */
	public static TourismNewAccoAssesment findByPrimaryKey(
			long TourismNewAccoAssesmentInfoId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismNewAccoAssesmentException {

		return getPersistence().findByPrimaryKey(TourismNewAccoAssesmentInfoId);
	}

	/**
	 * Returns the tourism new acco assesment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param TourismNewAccoAssesmentInfoId the primary key of the tourism new acco assesment
	 * @return the tourism new acco assesment, or <code>null</code> if a tourism new acco assesment with the primary key could not be found
	 */
	public static TourismNewAccoAssesment fetchByPrimaryKey(
		long TourismNewAccoAssesmentInfoId) {

		return getPersistence().fetchByPrimaryKey(
			TourismNewAccoAssesmentInfoId);
	}

	/**
	 * Returns all the tourism new acco assesments.
	 *
	 * @return the tourism new acco assesments
	 */
	public static List<TourismNewAccoAssesment> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the tourism new acco assesments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewAccoAssesmentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new acco assesments
	 * @param end the upper bound of the range of tourism new acco assesments (not inclusive)
	 * @return the range of tourism new acco assesments
	 */
	public static List<TourismNewAccoAssesment> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the tourism new acco assesments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewAccoAssesmentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new acco assesments
	 * @param end the upper bound of the range of tourism new acco assesments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism new acco assesments
	 */
	public static List<TourismNewAccoAssesment> findAll(
		int start, int end,
		OrderByComparator<TourismNewAccoAssesment> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the tourism new acco assesments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewAccoAssesmentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new acco assesments
	 * @param end the upper bound of the range of tourism new acco assesments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism new acco assesments
	 */
	public static List<TourismNewAccoAssesment> findAll(
		int start, int end,
		OrderByComparator<TourismNewAccoAssesment> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the tourism new acco assesments from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of tourism new acco assesments.
	 *
	 * @return the number of tourism new acco assesments
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static TourismNewAccoAssesmentPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		TourismNewAccoAssesmentPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile TourismNewAccoAssesmentPersistence _persistence;

}