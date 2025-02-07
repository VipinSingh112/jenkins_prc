/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.tourism.application.form.services.model.TourismBonaGroundTransContractSign;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the tourism bona ground trans contract sign service. This utility wraps <code>com.nbp.tourism.application.form.services.service.persistence.impl.TourismBonaGroundTransContractSignPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaGroundTransContractSignPersistence
 * @generated
 */
public class TourismBonaGroundTransContractSignUtil {

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
		TourismBonaGroundTransContractSign tourismBonaGroundTransContractSign) {

		getPersistence().clearCache(tourismBonaGroundTransContractSign);
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
	public static Map<Serializable, TourismBonaGroundTransContractSign>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<TourismBonaGroundTransContractSign> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<TourismBonaGroundTransContractSign> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<TourismBonaGroundTransContractSign> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<TourismBonaGroundTransContractSign>
			orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static TourismBonaGroundTransContractSign update(
		TourismBonaGroundTransContractSign tourismBonaGroundTransContractSign) {

		return getPersistence().update(tourismBonaGroundTransContractSign);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static TourismBonaGroundTransContractSign update(
		TourismBonaGroundTransContractSign tourismBonaGroundTransContractSign,
		ServiceContext serviceContext) {

		return getPersistence().update(
			tourismBonaGroundTransContractSign, serviceContext);
	}

	/**
	 * Returns the tourism bona ground trans contract sign where tourismApplicationId = &#63; or throws a <code>NoSuchTourismBonaGroundTransContractSignException</code> if it could not be found.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism bona ground trans contract sign
	 * @throws NoSuchTourismBonaGroundTransContractSignException if a matching tourism bona ground trans contract sign could not be found
	 */
	public static TourismBonaGroundTransContractSign findBygetTourismById(
			long tourismApplicationId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismBonaGroundTransContractSignException {

		return getPersistence().findBygetTourismById(tourismApplicationId);
	}

	/**
	 * Returns the tourism bona ground trans contract sign where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism bona ground trans contract sign, or <code>null</code> if a matching tourism bona ground trans contract sign could not be found
	 */
	public static TourismBonaGroundTransContractSign fetchBygetTourismById(
		long tourismApplicationId) {

		return getPersistence().fetchBygetTourismById(tourismApplicationId);
	}

	/**
	 * Returns the tourism bona ground trans contract sign where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism bona ground trans contract sign, or <code>null</code> if a matching tourism bona ground trans contract sign could not be found
	 */
	public static TourismBonaGroundTransContractSign fetchBygetTourismById(
		long tourismApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetTourismById(
			tourismApplicationId, useFinderCache);
	}

	/**
	 * Removes the tourism bona ground trans contract sign where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the tourism bona ground trans contract sign that was removed
	 */
	public static TourismBonaGroundTransContractSign removeBygetTourismById(
			long tourismApplicationId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismBonaGroundTransContractSignException {

		return getPersistence().removeBygetTourismById(tourismApplicationId);
	}

	/**
	 * Returns the number of tourism bona ground trans contract signs where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism bona ground trans contract signs
	 */
	public static int countBygetTourismById(long tourismApplicationId) {
		return getPersistence().countBygetTourismById(tourismApplicationId);
	}

	/**
	 * Caches the tourism bona ground trans contract sign in the entity cache if it is enabled.
	 *
	 * @param tourismBonaGroundTransContractSign the tourism bona ground trans contract sign
	 */
	public static void cacheResult(
		TourismBonaGroundTransContractSign tourismBonaGroundTransContractSign) {

		getPersistence().cacheResult(tourismBonaGroundTransContractSign);
	}

	/**
	 * Caches the tourism bona ground trans contract signs in the entity cache if it is enabled.
	 *
	 * @param tourismBonaGroundTransContractSigns the tourism bona ground trans contract signs
	 */
	public static void cacheResult(
		List<TourismBonaGroundTransContractSign>
			tourismBonaGroundTransContractSigns) {

		getPersistence().cacheResult(tourismBonaGroundTransContractSigns);
	}

	/**
	 * Creates a new tourism bona ground trans contract sign with the primary key. Does not add the tourism bona ground trans contract sign to the database.
	 *
	 * @param tourismBonaGroTraCoSignId the primary key for the new tourism bona ground trans contract sign
	 * @return the new tourism bona ground trans contract sign
	 */
	public static TourismBonaGroundTransContractSign create(
		long tourismBonaGroTraCoSignId) {

		return getPersistence().create(tourismBonaGroTraCoSignId);
	}

	/**
	 * Removes the tourism bona ground trans contract sign with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tourismBonaGroTraCoSignId the primary key of the tourism bona ground trans contract sign
	 * @return the tourism bona ground trans contract sign that was removed
	 * @throws NoSuchTourismBonaGroundTransContractSignException if a tourism bona ground trans contract sign with the primary key could not be found
	 */
	public static TourismBonaGroundTransContractSign remove(
			long tourismBonaGroTraCoSignId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismBonaGroundTransContractSignException {

		return getPersistence().remove(tourismBonaGroTraCoSignId);
	}

	public static TourismBonaGroundTransContractSign updateImpl(
		TourismBonaGroundTransContractSign tourismBonaGroundTransContractSign) {

		return getPersistence().updateImpl(tourismBonaGroundTransContractSign);
	}

	/**
	 * Returns the tourism bona ground trans contract sign with the primary key or throws a <code>NoSuchTourismBonaGroundTransContractSignException</code> if it could not be found.
	 *
	 * @param tourismBonaGroTraCoSignId the primary key of the tourism bona ground trans contract sign
	 * @return the tourism bona ground trans contract sign
	 * @throws NoSuchTourismBonaGroundTransContractSignException if a tourism bona ground trans contract sign with the primary key could not be found
	 */
	public static TourismBonaGroundTransContractSign findByPrimaryKey(
			long tourismBonaGroTraCoSignId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismBonaGroundTransContractSignException {

		return getPersistence().findByPrimaryKey(tourismBonaGroTraCoSignId);
	}

	/**
	 * Returns the tourism bona ground trans contract sign with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tourismBonaGroTraCoSignId the primary key of the tourism bona ground trans contract sign
	 * @return the tourism bona ground trans contract sign, or <code>null</code> if a tourism bona ground trans contract sign with the primary key could not be found
	 */
	public static TourismBonaGroundTransContractSign fetchByPrimaryKey(
		long tourismBonaGroTraCoSignId) {

		return getPersistence().fetchByPrimaryKey(tourismBonaGroTraCoSignId);
	}

	/**
	 * Returns all the tourism bona ground trans contract signs.
	 *
	 * @return the tourism bona ground trans contract signs
	 */
	public static List<TourismBonaGroundTransContractSign> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the tourism bona ground trans contract signs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaGroundTransContractSignModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona ground trans contract signs
	 * @param end the upper bound of the range of tourism bona ground trans contract signs (not inclusive)
	 * @return the range of tourism bona ground trans contract signs
	 */
	public static List<TourismBonaGroundTransContractSign> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the tourism bona ground trans contract signs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaGroundTransContractSignModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona ground trans contract signs
	 * @param end the upper bound of the range of tourism bona ground trans contract signs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism bona ground trans contract signs
	 */
	public static List<TourismBonaGroundTransContractSign> findAll(
		int start, int end,
		OrderByComparator<TourismBonaGroundTransContractSign>
			orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the tourism bona ground trans contract signs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaGroundTransContractSignModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona ground trans contract signs
	 * @param end the upper bound of the range of tourism bona ground trans contract signs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism bona ground trans contract signs
	 */
	public static List<TourismBonaGroundTransContractSign> findAll(
		int start, int end,
		OrderByComparator<TourismBonaGroundTransContractSign> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the tourism bona ground trans contract signs from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of tourism bona ground trans contract signs.
	 *
	 * @return the number of tourism bona ground trans contract signs
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static TourismBonaGroundTransContractSignPersistence
		getPersistence() {

		return _persistence;
	}

	public static void setPersistence(
		TourismBonaGroundTransContractSignPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile TourismBonaGroundTransContractSignPersistence
		_persistence;

}