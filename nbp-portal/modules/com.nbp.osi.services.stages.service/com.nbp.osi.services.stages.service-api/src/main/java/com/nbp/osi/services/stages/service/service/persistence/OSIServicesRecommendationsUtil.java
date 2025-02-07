/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.stages.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.osi.services.stages.service.model.OSIServicesRecommendations;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the osi services recommendations service. This utility wraps <code>com.nbp.osi.services.stages.service.service.persistence.impl.OSIServicesRecommendationsPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OSIServicesRecommendationsPersistence
 * @generated
 */
public class OSIServicesRecommendationsUtil {

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
		OSIServicesRecommendations osiServicesRecommendations) {

		getPersistence().clearCache(osiServicesRecommendations);
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
	public static Map<Serializable, OSIServicesRecommendations>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<OSIServicesRecommendations> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<OSIServicesRecommendations> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<OSIServicesRecommendations> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<OSIServicesRecommendations> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static OSIServicesRecommendations update(
		OSIServicesRecommendations osiServicesRecommendations) {

		return getPersistence().update(osiServicesRecommendations);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static OSIServicesRecommendations update(
		OSIServicesRecommendations osiServicesRecommendations,
		ServiceContext serviceContext) {

		return getPersistence().update(
			osiServicesRecommendations, serviceContext);
	}

	/**
	 * Returns the osi services recommendations where caseId = &#63; or throws a <code>NoSuchOSIServicesRecommendationsException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching osi services recommendations
	 * @throws NoSuchOSIServicesRecommendationsException if a matching osi services recommendations could not be found
	 */
	public static OSIServicesRecommendations
			findBygetOsiServicesRecommendationByCaseId(String caseId)
		throws com.nbp.osi.services.stages.service.exception.
			NoSuchOSIServicesRecommendationsException {

		return getPersistence().findBygetOsiServicesRecommendationByCaseId(
			caseId);
	}

	/**
	 * Returns the osi services recommendations where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching osi services recommendations, or <code>null</code> if a matching osi services recommendations could not be found
	 */
	public static OSIServicesRecommendations
		fetchBygetOsiServicesRecommendationByCaseId(String caseId) {

		return getPersistence().fetchBygetOsiServicesRecommendationByCaseId(
			caseId);
	}

	/**
	 * Returns the osi services recommendations where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi services recommendations, or <code>null</code> if a matching osi services recommendations could not be found
	 */
	public static OSIServicesRecommendations
		fetchBygetOsiServicesRecommendationByCaseId(
			String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetOsiServicesRecommendationByCaseId(
			caseId, useFinderCache);
	}

	/**
	 * Removes the osi services recommendations where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the osi services recommendations that was removed
	 */
	public static OSIServicesRecommendations
			removeBygetOsiServicesRecommendationByCaseId(String caseId)
		throws com.nbp.osi.services.stages.service.exception.
			NoSuchOSIServicesRecommendationsException {

		return getPersistence().removeBygetOsiServicesRecommendationByCaseId(
			caseId);
	}

	/**
	 * Returns the number of osi services recommendationses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching osi services recommendationses
	 */
	public static int countBygetOsiServicesRecommendationByCaseId(
		String caseId) {

		return getPersistence().countBygetOsiServicesRecommendationByCaseId(
			caseId);
	}

	/**
	 * Caches the osi services recommendations in the entity cache if it is enabled.
	 *
	 * @param osiServicesRecommendations the osi services recommendations
	 */
	public static void cacheResult(
		OSIServicesRecommendations osiServicesRecommendations) {

		getPersistence().cacheResult(osiServicesRecommendations);
	}

	/**
	 * Caches the osi services recommendationses in the entity cache if it is enabled.
	 *
	 * @param osiServicesRecommendationses the osi services recommendationses
	 */
	public static void cacheResult(
		List<OSIServicesRecommendations> osiServicesRecommendationses) {

		getPersistence().cacheResult(osiServicesRecommendationses);
	}

	/**
	 * Creates a new osi services recommendations with the primary key. Does not add the osi services recommendations to the database.
	 *
	 * @param oSIServicesRecommendationsId the primary key for the new osi services recommendations
	 * @return the new osi services recommendations
	 */
	public static OSIServicesRecommendations create(
		long oSIServicesRecommendationsId) {

		return getPersistence().create(oSIServicesRecommendationsId);
	}

	/**
	 * Removes the osi services recommendations with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param oSIServicesRecommendationsId the primary key of the osi services recommendations
	 * @return the osi services recommendations that was removed
	 * @throws NoSuchOSIServicesRecommendationsException if a osi services recommendations with the primary key could not be found
	 */
	public static OSIServicesRecommendations remove(
			long oSIServicesRecommendationsId)
		throws com.nbp.osi.services.stages.service.exception.
			NoSuchOSIServicesRecommendationsException {

		return getPersistence().remove(oSIServicesRecommendationsId);
	}

	public static OSIServicesRecommendations updateImpl(
		OSIServicesRecommendations osiServicesRecommendations) {

		return getPersistence().updateImpl(osiServicesRecommendations);
	}

	/**
	 * Returns the osi services recommendations with the primary key or throws a <code>NoSuchOSIServicesRecommendationsException</code> if it could not be found.
	 *
	 * @param oSIServicesRecommendationsId the primary key of the osi services recommendations
	 * @return the osi services recommendations
	 * @throws NoSuchOSIServicesRecommendationsException if a osi services recommendations with the primary key could not be found
	 */
	public static OSIServicesRecommendations findByPrimaryKey(
			long oSIServicesRecommendationsId)
		throws com.nbp.osi.services.stages.service.exception.
			NoSuchOSIServicesRecommendationsException {

		return getPersistence().findByPrimaryKey(oSIServicesRecommendationsId);
	}

	/**
	 * Returns the osi services recommendations with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param oSIServicesRecommendationsId the primary key of the osi services recommendations
	 * @return the osi services recommendations, or <code>null</code> if a osi services recommendations with the primary key could not be found
	 */
	public static OSIServicesRecommendations fetchByPrimaryKey(
		long oSIServicesRecommendationsId) {

		return getPersistence().fetchByPrimaryKey(oSIServicesRecommendationsId);
	}

	/**
	 * Returns all the osi services recommendationses.
	 *
	 * @return the osi services recommendationses
	 */
	public static List<OSIServicesRecommendations> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the osi services recommendationses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OSIServicesRecommendationsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services recommendationses
	 * @param end the upper bound of the range of osi services recommendationses (not inclusive)
	 * @return the range of osi services recommendationses
	 */
	public static List<OSIServicesRecommendations> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the osi services recommendationses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OSIServicesRecommendationsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services recommendationses
	 * @param end the upper bound of the range of osi services recommendationses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of osi services recommendationses
	 */
	public static List<OSIServicesRecommendations> findAll(
		int start, int end,
		OrderByComparator<OSIServicesRecommendations> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the osi services recommendationses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OSIServicesRecommendationsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services recommendationses
	 * @param end the upper bound of the range of osi services recommendationses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of osi services recommendationses
	 */
	public static List<OSIServicesRecommendations> findAll(
		int start, int end,
		OrderByComparator<OSIServicesRecommendations> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the osi services recommendationses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of osi services recommendationses.
	 *
	 * @return the number of osi services recommendationses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static OSIServicesRecommendationsPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		OSIServicesRecommendationsPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile OSIServicesRecommendationsPersistence _persistence;

}