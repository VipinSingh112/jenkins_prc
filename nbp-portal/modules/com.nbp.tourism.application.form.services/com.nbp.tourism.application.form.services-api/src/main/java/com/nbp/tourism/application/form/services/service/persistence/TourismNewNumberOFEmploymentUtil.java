/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.tourism.application.form.services.model.TourismNewNumberOFEmployment;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the tourism new number of employment service. This utility wraps <code>com.nbp.tourism.application.form.services.service.persistence.impl.TourismNewNumberOFEmploymentPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismNewNumberOFEmploymentPersistence
 * @generated
 */
public class TourismNewNumberOFEmploymentUtil {

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
		TourismNewNumberOFEmployment tourismNewNumberOFEmployment) {

		getPersistence().clearCache(tourismNewNumberOFEmployment);
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
	public static Map<Serializable, TourismNewNumberOFEmployment>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<TourismNewNumberOFEmployment> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<TourismNewNumberOFEmployment> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<TourismNewNumberOFEmployment> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<TourismNewNumberOFEmployment> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static TourismNewNumberOFEmployment update(
		TourismNewNumberOFEmployment tourismNewNumberOFEmployment) {

		return getPersistence().update(tourismNewNumberOFEmployment);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static TourismNewNumberOFEmployment update(
		TourismNewNumberOFEmployment tourismNewNumberOFEmployment,
		ServiceContext serviceContext) {

		return getPersistence().update(
			tourismNewNumberOFEmployment, serviceContext);
	}

	/**
	 * Returns the tourism new number of employment where tourismApplicationId = &#63; or throws a <code>NoSuchTourismNewNumberOFEmploymentException</code> if it could not be found.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism new number of employment
	 * @throws NoSuchTourismNewNumberOFEmploymentException if a matching tourism new number of employment could not be found
	 */
	public static TourismNewNumberOFEmployment findBygetTourismById(
			long tourismApplicationId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismNewNumberOFEmploymentException {

		return getPersistence().findBygetTourismById(tourismApplicationId);
	}

	/**
	 * Returns the tourism new number of employment where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism new number of employment, or <code>null</code> if a matching tourism new number of employment could not be found
	 */
	public static TourismNewNumberOFEmployment fetchBygetTourismById(
		long tourismApplicationId) {

		return getPersistence().fetchBygetTourismById(tourismApplicationId);
	}

	/**
	 * Returns the tourism new number of employment where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism new number of employment, or <code>null</code> if a matching tourism new number of employment could not be found
	 */
	public static TourismNewNumberOFEmployment fetchBygetTourismById(
		long tourismApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetTourismById(
			tourismApplicationId, useFinderCache);
	}

	/**
	 * Removes the tourism new number of employment where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the tourism new number of employment that was removed
	 */
	public static TourismNewNumberOFEmployment removeBygetTourismById(
			long tourismApplicationId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismNewNumberOFEmploymentException {

		return getPersistence().removeBygetTourismById(tourismApplicationId);
	}

	/**
	 * Returns the number of tourism new number of employments where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism new number of employments
	 */
	public static int countBygetTourismById(long tourismApplicationId) {
		return getPersistence().countBygetTourismById(tourismApplicationId);
	}

	/**
	 * Caches the tourism new number of employment in the entity cache if it is enabled.
	 *
	 * @param tourismNewNumberOFEmployment the tourism new number of employment
	 */
	public static void cacheResult(
		TourismNewNumberOFEmployment tourismNewNumberOFEmployment) {

		getPersistence().cacheResult(tourismNewNumberOFEmployment);
	}

	/**
	 * Caches the tourism new number of employments in the entity cache if it is enabled.
	 *
	 * @param tourismNewNumberOFEmployments the tourism new number of employments
	 */
	public static void cacheResult(
		List<TourismNewNumberOFEmployment> tourismNewNumberOFEmployments) {

		getPersistence().cacheResult(tourismNewNumberOFEmployments);
	}

	/**
	 * Creates a new tourism new number of employment with the primary key. Does not add the tourism new number of employment to the database.
	 *
	 * @param tourismNewNumberOFEmploymentId the primary key for the new tourism new number of employment
	 * @return the new tourism new number of employment
	 */
	public static TourismNewNumberOFEmployment create(
		long tourismNewNumberOFEmploymentId) {

		return getPersistence().create(tourismNewNumberOFEmploymentId);
	}

	/**
	 * Removes the tourism new number of employment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tourismNewNumberOFEmploymentId the primary key of the tourism new number of employment
	 * @return the tourism new number of employment that was removed
	 * @throws NoSuchTourismNewNumberOFEmploymentException if a tourism new number of employment with the primary key could not be found
	 */
	public static TourismNewNumberOFEmployment remove(
			long tourismNewNumberOFEmploymentId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismNewNumberOFEmploymentException {

		return getPersistence().remove(tourismNewNumberOFEmploymentId);
	}

	public static TourismNewNumberOFEmployment updateImpl(
		TourismNewNumberOFEmployment tourismNewNumberOFEmployment) {

		return getPersistence().updateImpl(tourismNewNumberOFEmployment);
	}

	/**
	 * Returns the tourism new number of employment with the primary key or throws a <code>NoSuchTourismNewNumberOFEmploymentException</code> if it could not be found.
	 *
	 * @param tourismNewNumberOFEmploymentId the primary key of the tourism new number of employment
	 * @return the tourism new number of employment
	 * @throws NoSuchTourismNewNumberOFEmploymentException if a tourism new number of employment with the primary key could not be found
	 */
	public static TourismNewNumberOFEmployment findByPrimaryKey(
			long tourismNewNumberOFEmploymentId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismNewNumberOFEmploymentException {

		return getPersistence().findByPrimaryKey(
			tourismNewNumberOFEmploymentId);
	}

	/**
	 * Returns the tourism new number of employment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tourismNewNumberOFEmploymentId the primary key of the tourism new number of employment
	 * @return the tourism new number of employment, or <code>null</code> if a tourism new number of employment with the primary key could not be found
	 */
	public static TourismNewNumberOFEmployment fetchByPrimaryKey(
		long tourismNewNumberOFEmploymentId) {

		return getPersistence().fetchByPrimaryKey(
			tourismNewNumberOFEmploymentId);
	}

	/**
	 * Returns all the tourism new number of employments.
	 *
	 * @return the tourism new number of employments
	 */
	public static List<TourismNewNumberOFEmployment> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the tourism new number of employments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewNumberOFEmploymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new number of employments
	 * @param end the upper bound of the range of tourism new number of employments (not inclusive)
	 * @return the range of tourism new number of employments
	 */
	public static List<TourismNewNumberOFEmployment> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the tourism new number of employments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewNumberOFEmploymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new number of employments
	 * @param end the upper bound of the range of tourism new number of employments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism new number of employments
	 */
	public static List<TourismNewNumberOFEmployment> findAll(
		int start, int end,
		OrderByComparator<TourismNewNumberOFEmployment> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the tourism new number of employments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewNumberOFEmploymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new number of employments
	 * @param end the upper bound of the range of tourism new number of employments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism new number of employments
	 */
	public static List<TourismNewNumberOFEmployment> findAll(
		int start, int end,
		OrderByComparator<TourismNewNumberOFEmployment> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the tourism new number of employments from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of tourism new number of employments.
	 *
	 * @return the number of tourism new number of employments
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static TourismNewNumberOFEmploymentPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		TourismNewNumberOFEmploymentPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile TourismNewNumberOFEmploymentPersistence
		_persistence;

}