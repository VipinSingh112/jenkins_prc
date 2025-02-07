/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.hsra.application.service.model.DetailOfSources;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the detail of sources service. This utility wraps <code>com.nbp.hsra.application.service.service.persistence.impl.DetailOfSourcesPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DetailOfSourcesPersistence
 * @generated
 */
public class DetailOfSourcesUtil {

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
	public static void clearCache(DetailOfSources detailOfSources) {
		getPersistence().clearCache(detailOfSources);
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
	public static Map<Serializable, DetailOfSources> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<DetailOfSources> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DetailOfSources> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DetailOfSources> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<DetailOfSources> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static DetailOfSources update(DetailOfSources detailOfSources) {
		return getPersistence().update(detailOfSources);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static DetailOfSources update(
		DetailOfSources detailOfSources, ServiceContext serviceContext) {

		return getPersistence().update(detailOfSources, serviceContext);
	}

	/**
	 * Returns the detail of sources where hsraApplicationId = &#63; or throws a <code>NoSuchDetailOfSourcesException</code> if it could not be found.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching detail of sources
	 * @throws NoSuchDetailOfSourcesException if a matching detail of sources could not be found
	 */
	public static DetailOfSources findBygetHsraById(long hsraApplicationId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchDetailOfSourcesException {

		return getPersistence().findBygetHsraById(hsraApplicationId);
	}

	/**
	 * Returns the detail of sources where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching detail of sources, or <code>null</code> if a matching detail of sources could not be found
	 */
	public static DetailOfSources fetchBygetHsraById(long hsraApplicationId) {
		return getPersistence().fetchBygetHsraById(hsraApplicationId);
	}

	/**
	 * Returns the detail of sources where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching detail of sources, or <code>null</code> if a matching detail of sources could not be found
	 */
	public static DetailOfSources fetchBygetHsraById(
		long hsraApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetHsraById(
			hsraApplicationId, useFinderCache);
	}

	/**
	 * Removes the detail of sources where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the detail of sources that was removed
	 */
	public static DetailOfSources removeBygetHsraById(long hsraApplicationId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchDetailOfSourcesException {

		return getPersistence().removeBygetHsraById(hsraApplicationId);
	}

	/**
	 * Returns the number of detail of sourceses where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching detail of sourceses
	 */
	public static int countBygetHsraById(long hsraApplicationId) {
		return getPersistence().countBygetHsraById(hsraApplicationId);
	}

	/**
	 * Caches the detail of sources in the entity cache if it is enabled.
	 *
	 * @param detailOfSources the detail of sources
	 */
	public static void cacheResult(DetailOfSources detailOfSources) {
		getPersistence().cacheResult(detailOfSources);
	}

	/**
	 * Caches the detail of sourceses in the entity cache if it is enabled.
	 *
	 * @param detailOfSourceses the detail of sourceses
	 */
	public static void cacheResult(List<DetailOfSources> detailOfSourceses) {
		getPersistence().cacheResult(detailOfSourceses);
	}

	/**
	 * Creates a new detail of sources with the primary key. Does not add the detail of sources to the database.
	 *
	 * @param detailOfSourcesId the primary key for the new detail of sources
	 * @return the new detail of sources
	 */
	public static DetailOfSources create(long detailOfSourcesId) {
		return getPersistence().create(detailOfSourcesId);
	}

	/**
	 * Removes the detail of sources with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param detailOfSourcesId the primary key of the detail of sources
	 * @return the detail of sources that was removed
	 * @throws NoSuchDetailOfSourcesException if a detail of sources with the primary key could not be found
	 */
	public static DetailOfSources remove(long detailOfSourcesId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchDetailOfSourcesException {

		return getPersistence().remove(detailOfSourcesId);
	}

	public static DetailOfSources updateImpl(DetailOfSources detailOfSources) {
		return getPersistence().updateImpl(detailOfSources);
	}

	/**
	 * Returns the detail of sources with the primary key or throws a <code>NoSuchDetailOfSourcesException</code> if it could not be found.
	 *
	 * @param detailOfSourcesId the primary key of the detail of sources
	 * @return the detail of sources
	 * @throws NoSuchDetailOfSourcesException if a detail of sources with the primary key could not be found
	 */
	public static DetailOfSources findByPrimaryKey(long detailOfSourcesId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchDetailOfSourcesException {

		return getPersistence().findByPrimaryKey(detailOfSourcesId);
	}

	/**
	 * Returns the detail of sources with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param detailOfSourcesId the primary key of the detail of sources
	 * @return the detail of sources, or <code>null</code> if a detail of sources with the primary key could not be found
	 */
	public static DetailOfSources fetchByPrimaryKey(long detailOfSourcesId) {
		return getPersistence().fetchByPrimaryKey(detailOfSourcesId);
	}

	/**
	 * Returns all the detail of sourceses.
	 *
	 * @return the detail of sourceses
	 */
	public static List<DetailOfSources> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the detail of sourceses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DetailOfSourcesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of detail of sourceses
	 * @param end the upper bound of the range of detail of sourceses (not inclusive)
	 * @return the range of detail of sourceses
	 */
	public static List<DetailOfSources> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the detail of sourceses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DetailOfSourcesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of detail of sourceses
	 * @param end the upper bound of the range of detail of sourceses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of detail of sourceses
	 */
	public static List<DetailOfSources> findAll(
		int start, int end,
		OrderByComparator<DetailOfSources> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the detail of sourceses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DetailOfSourcesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of detail of sourceses
	 * @param end the upper bound of the range of detail of sourceses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of detail of sourceses
	 */
	public static List<DetailOfSources> findAll(
		int start, int end,
		OrderByComparator<DetailOfSources> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the detail of sourceses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of detail of sourceses.
	 *
	 * @return the number of detail of sourceses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static DetailOfSourcesPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(DetailOfSourcesPersistence persistence) {
		_persistence = persistence;
	}

	private static volatile DetailOfSourcesPersistence _persistence;

}