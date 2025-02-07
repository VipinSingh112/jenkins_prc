/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.jtb.application.form.service.model.AttractionTravelAgency;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the attraction travel agency service. This utility wraps <code>com.nbp.jtb.application.form.service.service.persistence.impl.AttractionTravelAgencyPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AttractionTravelAgencyPersistence
 * @generated
 */
public class AttractionTravelAgencyUtil {

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
		AttractionTravelAgency attractionTravelAgency) {

		getPersistence().clearCache(attractionTravelAgency);
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
	public static Map<Serializable, AttractionTravelAgency> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AttractionTravelAgency> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AttractionTravelAgency> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AttractionTravelAgency> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AttractionTravelAgency> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AttractionTravelAgency update(
		AttractionTravelAgency attractionTravelAgency) {

		return getPersistence().update(attractionTravelAgency);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AttractionTravelAgency update(
		AttractionTravelAgency attractionTravelAgency,
		ServiceContext serviceContext) {

		return getPersistence().update(attractionTravelAgency, serviceContext);
	}

	/**
	 * Returns the attraction travel agency where jtbApplicationId = &#63; or throws a <code>NoSuchAttractionTravelAgencyException</code> if it could not be found.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching attraction travel agency
	 * @throws NoSuchAttractionTravelAgencyException if a matching attraction travel agency could not be found
	 */
	public static AttractionTravelAgency findBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAttractionTravelAgencyException {

		return getPersistence().findBygetJTB_ByApplicationId(jtbApplicationId);
	}

	/**
	 * Returns the attraction travel agency where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching attraction travel agency, or <code>null</code> if a matching attraction travel agency could not be found
	 */
	public static AttractionTravelAgency fetchBygetJTB_ByApplicationId(
		long jtbApplicationId) {

		return getPersistence().fetchBygetJTB_ByApplicationId(jtbApplicationId);
	}

	/**
	 * Returns the attraction travel agency where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching attraction travel agency, or <code>null</code> if a matching attraction travel agency could not be found
	 */
	public static AttractionTravelAgency fetchBygetJTB_ByApplicationId(
		long jtbApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetJTB_ByApplicationId(
			jtbApplicationId, useFinderCache);
	}

	/**
	 * Removes the attraction travel agency where jtbApplicationId = &#63; from the database.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the attraction travel agency that was removed
	 */
	public static AttractionTravelAgency removeBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAttractionTravelAgencyException {

		return getPersistence().removeBygetJTB_ByApplicationId(
			jtbApplicationId);
	}

	/**
	 * Returns the number of attraction travel agencies where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the number of matching attraction travel agencies
	 */
	public static int countBygetJTB_ByApplicationId(long jtbApplicationId) {
		return getPersistence().countBygetJTB_ByApplicationId(jtbApplicationId);
	}

	/**
	 * Caches the attraction travel agency in the entity cache if it is enabled.
	 *
	 * @param attractionTravelAgency the attraction travel agency
	 */
	public static void cacheResult(
		AttractionTravelAgency attractionTravelAgency) {

		getPersistence().cacheResult(attractionTravelAgency);
	}

	/**
	 * Caches the attraction travel agencies in the entity cache if it is enabled.
	 *
	 * @param attractionTravelAgencies the attraction travel agencies
	 */
	public static void cacheResult(
		List<AttractionTravelAgency> attractionTravelAgencies) {

		getPersistence().cacheResult(attractionTravelAgencies);
	}

	/**
	 * Creates a new attraction travel agency with the primary key. Does not add the attraction travel agency to the database.
	 *
	 * @param attractionTravelAgencyId the primary key for the new attraction travel agency
	 * @return the new attraction travel agency
	 */
	public static AttractionTravelAgency create(long attractionTravelAgencyId) {
		return getPersistence().create(attractionTravelAgencyId);
	}

	/**
	 * Removes the attraction travel agency with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param attractionTravelAgencyId the primary key of the attraction travel agency
	 * @return the attraction travel agency that was removed
	 * @throws NoSuchAttractionTravelAgencyException if a attraction travel agency with the primary key could not be found
	 */
	public static AttractionTravelAgency remove(long attractionTravelAgencyId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAttractionTravelAgencyException {

		return getPersistence().remove(attractionTravelAgencyId);
	}

	public static AttractionTravelAgency updateImpl(
		AttractionTravelAgency attractionTravelAgency) {

		return getPersistence().updateImpl(attractionTravelAgency);
	}

	/**
	 * Returns the attraction travel agency with the primary key or throws a <code>NoSuchAttractionTravelAgencyException</code> if it could not be found.
	 *
	 * @param attractionTravelAgencyId the primary key of the attraction travel agency
	 * @return the attraction travel agency
	 * @throws NoSuchAttractionTravelAgencyException if a attraction travel agency with the primary key could not be found
	 */
	public static AttractionTravelAgency findByPrimaryKey(
			long attractionTravelAgencyId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAttractionTravelAgencyException {

		return getPersistence().findByPrimaryKey(attractionTravelAgencyId);
	}

	/**
	 * Returns the attraction travel agency with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param attractionTravelAgencyId the primary key of the attraction travel agency
	 * @return the attraction travel agency, or <code>null</code> if a attraction travel agency with the primary key could not be found
	 */
	public static AttractionTravelAgency fetchByPrimaryKey(
		long attractionTravelAgencyId) {

		return getPersistence().fetchByPrimaryKey(attractionTravelAgencyId);
	}

	/**
	 * Returns all the attraction travel agencies.
	 *
	 * @return the attraction travel agencies
	 */
	public static List<AttractionTravelAgency> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the attraction travel agencies.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionTravelAgencyModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction travel agencies
	 * @param end the upper bound of the range of attraction travel agencies (not inclusive)
	 * @return the range of attraction travel agencies
	 */
	public static List<AttractionTravelAgency> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the attraction travel agencies.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionTravelAgencyModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction travel agencies
	 * @param end the upper bound of the range of attraction travel agencies (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of attraction travel agencies
	 */
	public static List<AttractionTravelAgency> findAll(
		int start, int end,
		OrderByComparator<AttractionTravelAgency> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the attraction travel agencies.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionTravelAgencyModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction travel agencies
	 * @param end the upper bound of the range of attraction travel agencies (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of attraction travel agencies
	 */
	public static List<AttractionTravelAgency> findAll(
		int start, int end,
		OrderByComparator<AttractionTravelAgency> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the attraction travel agencies from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of attraction travel agencies.
	 *
	 * @return the number of attraction travel agencies
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AttractionTravelAgencyPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		AttractionTravelAgencyPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile AttractionTravelAgencyPersistence _persistence;

}