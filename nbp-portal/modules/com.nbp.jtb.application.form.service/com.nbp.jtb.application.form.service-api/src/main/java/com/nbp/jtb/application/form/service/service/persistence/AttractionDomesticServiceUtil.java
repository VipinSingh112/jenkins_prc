/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.jtb.application.form.service.model.AttractionDomesticService;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the attraction domestic service service. This utility wraps <code>com.nbp.jtb.application.form.service.service.persistence.impl.AttractionDomesticServicePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AttractionDomesticServicePersistence
 * @generated
 */
public class AttractionDomesticServiceUtil {

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
		AttractionDomesticService attractionDomesticService) {

		getPersistence().clearCache(attractionDomesticService);
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
	public static Map<Serializable, AttractionDomesticService>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AttractionDomesticService> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AttractionDomesticService> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AttractionDomesticService> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AttractionDomesticService> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AttractionDomesticService update(
		AttractionDomesticService attractionDomesticService) {

		return getPersistence().update(attractionDomesticService);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AttractionDomesticService update(
		AttractionDomesticService attractionDomesticService,
		ServiceContext serviceContext) {

		return getPersistence().update(
			attractionDomesticService, serviceContext);
	}

	/**
	 * Returns the attraction domestic service where jtbApplicationId = &#63; or throws a <code>NoSuchAttractionDomesticServiceException</code> if it could not be found.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching attraction domestic service
	 * @throws NoSuchAttractionDomesticServiceException if a matching attraction domestic service could not be found
	 */
	public static AttractionDomesticService findBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAttractionDomesticServiceException {

		return getPersistence().findBygetJTB_ByApplicationId(jtbApplicationId);
	}

	/**
	 * Returns the attraction domestic service where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching attraction domestic service, or <code>null</code> if a matching attraction domestic service could not be found
	 */
	public static AttractionDomesticService fetchBygetJTB_ByApplicationId(
		long jtbApplicationId) {

		return getPersistence().fetchBygetJTB_ByApplicationId(jtbApplicationId);
	}

	/**
	 * Returns the attraction domestic service where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching attraction domestic service, or <code>null</code> if a matching attraction domestic service could not be found
	 */
	public static AttractionDomesticService fetchBygetJTB_ByApplicationId(
		long jtbApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetJTB_ByApplicationId(
			jtbApplicationId, useFinderCache);
	}

	/**
	 * Removes the attraction domestic service where jtbApplicationId = &#63; from the database.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the attraction domestic service that was removed
	 */
	public static AttractionDomesticService removeBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAttractionDomesticServiceException {

		return getPersistence().removeBygetJTB_ByApplicationId(
			jtbApplicationId);
	}

	/**
	 * Returns the number of attraction domestic services where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the number of matching attraction domestic services
	 */
	public static int countBygetJTB_ByApplicationId(long jtbApplicationId) {
		return getPersistence().countBygetJTB_ByApplicationId(jtbApplicationId);
	}

	/**
	 * Caches the attraction domestic service in the entity cache if it is enabled.
	 *
	 * @param attractionDomesticService the attraction domestic service
	 */
	public static void cacheResult(
		AttractionDomesticService attractionDomesticService) {

		getPersistence().cacheResult(attractionDomesticService);
	}

	/**
	 * Caches the attraction domestic services in the entity cache if it is enabled.
	 *
	 * @param attractionDomesticServices the attraction domestic services
	 */
	public static void cacheResult(
		List<AttractionDomesticService> attractionDomesticServices) {

		getPersistence().cacheResult(attractionDomesticServices);
	}

	/**
	 * Creates a new attraction domestic service with the primary key. Does not add the attraction domestic service to the database.
	 *
	 * @param attractionDomesticServId the primary key for the new attraction domestic service
	 * @return the new attraction domestic service
	 */
	public static AttractionDomesticService create(
		long attractionDomesticServId) {

		return getPersistence().create(attractionDomesticServId);
	}

	/**
	 * Removes the attraction domestic service with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param attractionDomesticServId the primary key of the attraction domestic service
	 * @return the attraction domestic service that was removed
	 * @throws NoSuchAttractionDomesticServiceException if a attraction domestic service with the primary key could not be found
	 */
	public static AttractionDomesticService remove(
			long attractionDomesticServId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAttractionDomesticServiceException {

		return getPersistence().remove(attractionDomesticServId);
	}

	public static AttractionDomesticService updateImpl(
		AttractionDomesticService attractionDomesticService) {

		return getPersistence().updateImpl(attractionDomesticService);
	}

	/**
	 * Returns the attraction domestic service with the primary key or throws a <code>NoSuchAttractionDomesticServiceException</code> if it could not be found.
	 *
	 * @param attractionDomesticServId the primary key of the attraction domestic service
	 * @return the attraction domestic service
	 * @throws NoSuchAttractionDomesticServiceException if a attraction domestic service with the primary key could not be found
	 */
	public static AttractionDomesticService findByPrimaryKey(
			long attractionDomesticServId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAttractionDomesticServiceException {

		return getPersistence().findByPrimaryKey(attractionDomesticServId);
	}

	/**
	 * Returns the attraction domestic service with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param attractionDomesticServId the primary key of the attraction domestic service
	 * @return the attraction domestic service, or <code>null</code> if a attraction domestic service with the primary key could not be found
	 */
	public static AttractionDomesticService fetchByPrimaryKey(
		long attractionDomesticServId) {

		return getPersistence().fetchByPrimaryKey(attractionDomesticServId);
	}

	/**
	 * Returns all the attraction domestic services.
	 *
	 * @return the attraction domestic services
	 */
	public static List<AttractionDomesticService> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the attraction domestic services.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionDomesticServiceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction domestic services
	 * @param end the upper bound of the range of attraction domestic services (not inclusive)
	 * @return the range of attraction domestic services
	 */
	public static List<AttractionDomesticService> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the attraction domestic services.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionDomesticServiceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction domestic services
	 * @param end the upper bound of the range of attraction domestic services (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of attraction domestic services
	 */
	public static List<AttractionDomesticService> findAll(
		int start, int end,
		OrderByComparator<AttractionDomesticService> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the attraction domestic services.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionDomesticServiceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction domestic services
	 * @param end the upper bound of the range of attraction domestic services (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of attraction domestic services
	 */
	public static List<AttractionDomesticService> findAll(
		int start, int end,
		OrderByComparator<AttractionDomesticService> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the attraction domestic services from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of attraction domestic services.
	 *
	 * @return the number of attraction domestic services
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AttractionDomesticServicePersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		AttractionDomesticServicePersistence persistence) {

		_persistence = persistence;
	}

	private static volatile AttractionDomesticServicePersistence _persistence;

}