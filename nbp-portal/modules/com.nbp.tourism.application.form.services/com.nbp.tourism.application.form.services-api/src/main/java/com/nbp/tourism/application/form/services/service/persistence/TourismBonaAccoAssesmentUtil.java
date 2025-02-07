/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.tourism.application.form.services.model.TourismBonaAccoAssesment;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the tourism bona acco assesment service. This utility wraps <code>com.nbp.tourism.application.form.services.service.persistence.impl.TourismBonaAccoAssesmentPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaAccoAssesmentPersistence
 * @generated
 */
public class TourismBonaAccoAssesmentUtil {

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
		TourismBonaAccoAssesment tourismBonaAccoAssesment) {

		getPersistence().clearCache(tourismBonaAccoAssesment);
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
	public static Map<Serializable, TourismBonaAccoAssesment>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<TourismBonaAccoAssesment> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<TourismBonaAccoAssesment> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<TourismBonaAccoAssesment> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<TourismBonaAccoAssesment> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static TourismBonaAccoAssesment update(
		TourismBonaAccoAssesment tourismBonaAccoAssesment) {

		return getPersistence().update(tourismBonaAccoAssesment);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static TourismBonaAccoAssesment update(
		TourismBonaAccoAssesment tourismBonaAccoAssesment,
		ServiceContext serviceContext) {

		return getPersistence().update(
			tourismBonaAccoAssesment, serviceContext);
	}

	/**
	 * Returns the tourism bona acco assesment where tourismApplicationId = &#63; or throws a <code>NoSuchTourismBonaAccoAssesmentException</code> if it could not be found.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism bona acco assesment
	 * @throws NoSuchTourismBonaAccoAssesmentException if a matching tourism bona acco assesment could not be found
	 */
	public static TourismBonaAccoAssesment findBygetTourismById(
			long tourismApplicationId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismBonaAccoAssesmentException {

		return getPersistence().findBygetTourismById(tourismApplicationId);
	}

	/**
	 * Returns the tourism bona acco assesment where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism bona acco assesment, or <code>null</code> if a matching tourism bona acco assesment could not be found
	 */
	public static TourismBonaAccoAssesment fetchBygetTourismById(
		long tourismApplicationId) {

		return getPersistence().fetchBygetTourismById(tourismApplicationId);
	}

	/**
	 * Returns the tourism bona acco assesment where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism bona acco assesment, or <code>null</code> if a matching tourism bona acco assesment could not be found
	 */
	public static TourismBonaAccoAssesment fetchBygetTourismById(
		long tourismApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetTourismById(
			tourismApplicationId, useFinderCache);
	}

	/**
	 * Removes the tourism bona acco assesment where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the tourism bona acco assesment that was removed
	 */
	public static TourismBonaAccoAssesment removeBygetTourismById(
			long tourismApplicationId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismBonaAccoAssesmentException {

		return getPersistence().removeBygetTourismById(tourismApplicationId);
	}

	/**
	 * Returns the number of tourism bona acco assesments where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism bona acco assesments
	 */
	public static int countBygetTourismById(long tourismApplicationId) {
		return getPersistence().countBygetTourismById(tourismApplicationId);
	}

	/**
	 * Caches the tourism bona acco assesment in the entity cache if it is enabled.
	 *
	 * @param tourismBonaAccoAssesment the tourism bona acco assesment
	 */
	public static void cacheResult(
		TourismBonaAccoAssesment tourismBonaAccoAssesment) {

		getPersistence().cacheResult(tourismBonaAccoAssesment);
	}

	/**
	 * Caches the tourism bona acco assesments in the entity cache if it is enabled.
	 *
	 * @param tourismBonaAccoAssesments the tourism bona acco assesments
	 */
	public static void cacheResult(
		List<TourismBonaAccoAssesment> tourismBonaAccoAssesments) {

		getPersistence().cacheResult(tourismBonaAccoAssesments);
	}

	/**
	 * Creates a new tourism bona acco assesment with the primary key. Does not add the tourism bona acco assesment to the database.
	 *
	 * @param tourismBonaAccoAssesmentId the primary key for the new tourism bona acco assesment
	 * @return the new tourism bona acco assesment
	 */
	public static TourismBonaAccoAssesment create(
		long tourismBonaAccoAssesmentId) {

		return getPersistence().create(tourismBonaAccoAssesmentId);
	}

	/**
	 * Removes the tourism bona acco assesment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tourismBonaAccoAssesmentId the primary key of the tourism bona acco assesment
	 * @return the tourism bona acco assesment that was removed
	 * @throws NoSuchTourismBonaAccoAssesmentException if a tourism bona acco assesment with the primary key could not be found
	 */
	public static TourismBonaAccoAssesment remove(
			long tourismBonaAccoAssesmentId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismBonaAccoAssesmentException {

		return getPersistence().remove(tourismBonaAccoAssesmentId);
	}

	public static TourismBonaAccoAssesment updateImpl(
		TourismBonaAccoAssesment tourismBonaAccoAssesment) {

		return getPersistence().updateImpl(tourismBonaAccoAssesment);
	}

	/**
	 * Returns the tourism bona acco assesment with the primary key or throws a <code>NoSuchTourismBonaAccoAssesmentException</code> if it could not be found.
	 *
	 * @param tourismBonaAccoAssesmentId the primary key of the tourism bona acco assesment
	 * @return the tourism bona acco assesment
	 * @throws NoSuchTourismBonaAccoAssesmentException if a tourism bona acco assesment with the primary key could not be found
	 */
	public static TourismBonaAccoAssesment findByPrimaryKey(
			long tourismBonaAccoAssesmentId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismBonaAccoAssesmentException {

		return getPersistence().findByPrimaryKey(tourismBonaAccoAssesmentId);
	}

	/**
	 * Returns the tourism bona acco assesment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tourismBonaAccoAssesmentId the primary key of the tourism bona acco assesment
	 * @return the tourism bona acco assesment, or <code>null</code> if a tourism bona acco assesment with the primary key could not be found
	 */
	public static TourismBonaAccoAssesment fetchByPrimaryKey(
		long tourismBonaAccoAssesmentId) {

		return getPersistence().fetchByPrimaryKey(tourismBonaAccoAssesmentId);
	}

	/**
	 * Returns all the tourism bona acco assesments.
	 *
	 * @return the tourism bona acco assesments
	 */
	public static List<TourismBonaAccoAssesment> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the tourism bona acco assesments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaAccoAssesmentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona acco assesments
	 * @param end the upper bound of the range of tourism bona acco assesments (not inclusive)
	 * @return the range of tourism bona acco assesments
	 */
	public static List<TourismBonaAccoAssesment> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the tourism bona acco assesments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaAccoAssesmentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona acco assesments
	 * @param end the upper bound of the range of tourism bona acco assesments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism bona acco assesments
	 */
	public static List<TourismBonaAccoAssesment> findAll(
		int start, int end,
		OrderByComparator<TourismBonaAccoAssesment> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the tourism bona acco assesments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaAccoAssesmentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona acco assesments
	 * @param end the upper bound of the range of tourism bona acco assesments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism bona acco assesments
	 */
	public static List<TourismBonaAccoAssesment> findAll(
		int start, int end,
		OrderByComparator<TourismBonaAccoAssesment> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the tourism bona acco assesments from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of tourism bona acco assesments.
	 *
	 * @return the number of tourism bona acco assesments
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static TourismBonaAccoAssesmentPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		TourismBonaAccoAssesmentPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile TourismBonaAccoAssesmentPersistence _persistence;

}