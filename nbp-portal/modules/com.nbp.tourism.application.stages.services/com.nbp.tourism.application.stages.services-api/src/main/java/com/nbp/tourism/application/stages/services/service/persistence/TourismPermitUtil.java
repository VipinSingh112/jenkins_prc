/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.stages.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.tourism.application.stages.services.model.TourismPermit;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the tourism permit service. This utility wraps <code>com.nbp.tourism.application.stages.services.service.persistence.impl.TourismPermitPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismPermitPersistence
 * @generated
 */
public class TourismPermitUtil {

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
	public static void clearCache(TourismPermit tourismPermit) {
		getPersistence().clearCache(tourismPermit);
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
	public static Map<Serializable, TourismPermit> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<TourismPermit> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<TourismPermit> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<TourismPermit> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<TourismPermit> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static TourismPermit update(TourismPermit tourismPermit) {
		return getPersistence().update(tourismPermit);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static TourismPermit update(
		TourismPermit tourismPermit, ServiceContext serviceContext) {

		return getPersistence().update(tourismPermit, serviceContext);
	}

	/**
	 * Returns the tourism permit where caseId = &#63; or throws a <code>NoSuchTourismPermitException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching tourism permit
	 * @throws NoSuchTourismPermitException if a matching tourism permit could not be found
	 */
	public static TourismPermit findBygetManufacturingPermitBY_CI(String caseId)
		throws com.nbp.tourism.application.stages.services.exception.
			NoSuchTourismPermitException {

		return getPersistence().findBygetManufacturingPermitBY_CI(caseId);
	}

	/**
	 * Returns the tourism permit where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching tourism permit, or <code>null</code> if a matching tourism permit could not be found
	 */
	public static TourismPermit fetchBygetManufacturingPermitBY_CI(
		String caseId) {

		return getPersistence().fetchBygetManufacturingPermitBY_CI(caseId);
	}

	/**
	 * Returns the tourism permit where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism permit, or <code>null</code> if a matching tourism permit could not be found
	 */
	public static TourismPermit fetchBygetManufacturingPermitBY_CI(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetManufacturingPermitBY_CI(
			caseId, useFinderCache);
	}

	/**
	 * Removes the tourism permit where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the tourism permit that was removed
	 */
	public static TourismPermit removeBygetManufacturingPermitBY_CI(
			String caseId)
		throws com.nbp.tourism.application.stages.services.exception.
			NoSuchTourismPermitException {

		return getPersistence().removeBygetManufacturingPermitBY_CI(caseId);
	}

	/**
	 * Returns the number of tourism permits where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching tourism permits
	 */
	public static int countBygetManufacturingPermitBY_CI(String caseId) {
		return getPersistence().countBygetManufacturingPermitBY_CI(caseId);
	}

	/**
	 * Caches the tourism permit in the entity cache if it is enabled.
	 *
	 * @param tourismPermit the tourism permit
	 */
	public static void cacheResult(TourismPermit tourismPermit) {
		getPersistence().cacheResult(tourismPermit);
	}

	/**
	 * Caches the tourism permits in the entity cache if it is enabled.
	 *
	 * @param tourismPermits the tourism permits
	 */
	public static void cacheResult(List<TourismPermit> tourismPermits) {
		getPersistence().cacheResult(tourismPermits);
	}

	/**
	 * Creates a new tourism permit with the primary key. Does not add the tourism permit to the database.
	 *
	 * @param tourismgPermitId the primary key for the new tourism permit
	 * @return the new tourism permit
	 */
	public static TourismPermit create(long tourismgPermitId) {
		return getPersistence().create(tourismgPermitId);
	}

	/**
	 * Removes the tourism permit with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tourismgPermitId the primary key of the tourism permit
	 * @return the tourism permit that was removed
	 * @throws NoSuchTourismPermitException if a tourism permit with the primary key could not be found
	 */
	public static TourismPermit remove(long tourismgPermitId)
		throws com.nbp.tourism.application.stages.services.exception.
			NoSuchTourismPermitException {

		return getPersistence().remove(tourismgPermitId);
	}

	public static TourismPermit updateImpl(TourismPermit tourismPermit) {
		return getPersistence().updateImpl(tourismPermit);
	}

	/**
	 * Returns the tourism permit with the primary key or throws a <code>NoSuchTourismPermitException</code> if it could not be found.
	 *
	 * @param tourismgPermitId the primary key of the tourism permit
	 * @return the tourism permit
	 * @throws NoSuchTourismPermitException if a tourism permit with the primary key could not be found
	 */
	public static TourismPermit findByPrimaryKey(long tourismgPermitId)
		throws com.nbp.tourism.application.stages.services.exception.
			NoSuchTourismPermitException {

		return getPersistence().findByPrimaryKey(tourismgPermitId);
	}

	/**
	 * Returns the tourism permit with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tourismgPermitId the primary key of the tourism permit
	 * @return the tourism permit, or <code>null</code> if a tourism permit with the primary key could not be found
	 */
	public static TourismPermit fetchByPrimaryKey(long tourismgPermitId) {
		return getPersistence().fetchByPrimaryKey(tourismgPermitId);
	}

	/**
	 * Returns all the tourism permits.
	 *
	 * @return the tourism permits
	 */
	public static List<TourismPermit> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the tourism permits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismPermitModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism permits
	 * @param end the upper bound of the range of tourism permits (not inclusive)
	 * @return the range of tourism permits
	 */
	public static List<TourismPermit> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the tourism permits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismPermitModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism permits
	 * @param end the upper bound of the range of tourism permits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism permits
	 */
	public static List<TourismPermit> findAll(
		int start, int end,
		OrderByComparator<TourismPermit> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the tourism permits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismPermitModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism permits
	 * @param end the upper bound of the range of tourism permits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism permits
	 */
	public static List<TourismPermit> findAll(
		int start, int end, OrderByComparator<TourismPermit> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the tourism permits from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of tourism permits.
	 *
	 * @return the number of tourism permits
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static TourismPermitPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(TourismPermitPersistence persistence) {
		_persistence = persistence;
	}

	private static volatile TourismPermitPersistence _persistence;

}