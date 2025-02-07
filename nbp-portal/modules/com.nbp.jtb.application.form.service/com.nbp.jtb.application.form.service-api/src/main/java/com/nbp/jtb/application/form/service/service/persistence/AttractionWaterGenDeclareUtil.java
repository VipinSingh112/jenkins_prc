/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.jtb.application.form.service.model.AttractionWaterGenDeclare;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the attraction water gen declare service. This utility wraps <code>com.nbp.jtb.application.form.service.service.persistence.impl.AttractionWaterGenDeclarePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AttractionWaterGenDeclarePersistence
 * @generated
 */
public class AttractionWaterGenDeclareUtil {

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
		AttractionWaterGenDeclare attractionWaterGenDeclare) {

		getPersistence().clearCache(attractionWaterGenDeclare);
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
	public static Map<Serializable, AttractionWaterGenDeclare>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AttractionWaterGenDeclare> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AttractionWaterGenDeclare> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AttractionWaterGenDeclare> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AttractionWaterGenDeclare> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AttractionWaterGenDeclare update(
		AttractionWaterGenDeclare attractionWaterGenDeclare) {

		return getPersistence().update(attractionWaterGenDeclare);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AttractionWaterGenDeclare update(
		AttractionWaterGenDeclare attractionWaterGenDeclare,
		ServiceContext serviceContext) {

		return getPersistence().update(
			attractionWaterGenDeclare, serviceContext);
	}

	/**
	 * Returns the attraction water gen declare where jtbApplicationId = &#63; or throws a <code>NoSuchAttractionWaterGenDeclareException</code> if it could not be found.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching attraction water gen declare
	 * @throws NoSuchAttractionWaterGenDeclareException if a matching attraction water gen declare could not be found
	 */
	public static AttractionWaterGenDeclare findBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAttractionWaterGenDeclareException {

		return getPersistence().findBygetJTB_ByApplicationId(jtbApplicationId);
	}

	/**
	 * Returns the attraction water gen declare where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching attraction water gen declare, or <code>null</code> if a matching attraction water gen declare could not be found
	 */
	public static AttractionWaterGenDeclare fetchBygetJTB_ByApplicationId(
		long jtbApplicationId) {

		return getPersistence().fetchBygetJTB_ByApplicationId(jtbApplicationId);
	}

	/**
	 * Returns the attraction water gen declare where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching attraction water gen declare, or <code>null</code> if a matching attraction water gen declare could not be found
	 */
	public static AttractionWaterGenDeclare fetchBygetJTB_ByApplicationId(
		long jtbApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetJTB_ByApplicationId(
			jtbApplicationId, useFinderCache);
	}

	/**
	 * Removes the attraction water gen declare where jtbApplicationId = &#63; from the database.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the attraction water gen declare that was removed
	 */
	public static AttractionWaterGenDeclare removeBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAttractionWaterGenDeclareException {

		return getPersistence().removeBygetJTB_ByApplicationId(
			jtbApplicationId);
	}

	/**
	 * Returns the number of attraction water gen declares where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the number of matching attraction water gen declares
	 */
	public static int countBygetJTB_ByApplicationId(long jtbApplicationId) {
		return getPersistence().countBygetJTB_ByApplicationId(jtbApplicationId);
	}

	/**
	 * Caches the attraction water gen declare in the entity cache if it is enabled.
	 *
	 * @param attractionWaterGenDeclare the attraction water gen declare
	 */
	public static void cacheResult(
		AttractionWaterGenDeclare attractionWaterGenDeclare) {

		getPersistence().cacheResult(attractionWaterGenDeclare);
	}

	/**
	 * Caches the attraction water gen declares in the entity cache if it is enabled.
	 *
	 * @param attractionWaterGenDeclares the attraction water gen declares
	 */
	public static void cacheResult(
		List<AttractionWaterGenDeclare> attractionWaterGenDeclares) {

		getPersistence().cacheResult(attractionWaterGenDeclares);
	}

	/**
	 * Creates a new attraction water gen declare with the primary key. Does not add the attraction water gen declare to the database.
	 *
	 * @param attractionWaterGenDeclareId the primary key for the new attraction water gen declare
	 * @return the new attraction water gen declare
	 */
	public static AttractionWaterGenDeclare create(
		long attractionWaterGenDeclareId) {

		return getPersistence().create(attractionWaterGenDeclareId);
	}

	/**
	 * Removes the attraction water gen declare with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param attractionWaterGenDeclareId the primary key of the attraction water gen declare
	 * @return the attraction water gen declare that was removed
	 * @throws NoSuchAttractionWaterGenDeclareException if a attraction water gen declare with the primary key could not be found
	 */
	public static AttractionWaterGenDeclare remove(
			long attractionWaterGenDeclareId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAttractionWaterGenDeclareException {

		return getPersistence().remove(attractionWaterGenDeclareId);
	}

	public static AttractionWaterGenDeclare updateImpl(
		AttractionWaterGenDeclare attractionWaterGenDeclare) {

		return getPersistence().updateImpl(attractionWaterGenDeclare);
	}

	/**
	 * Returns the attraction water gen declare with the primary key or throws a <code>NoSuchAttractionWaterGenDeclareException</code> if it could not be found.
	 *
	 * @param attractionWaterGenDeclareId the primary key of the attraction water gen declare
	 * @return the attraction water gen declare
	 * @throws NoSuchAttractionWaterGenDeclareException if a attraction water gen declare with the primary key could not be found
	 */
	public static AttractionWaterGenDeclare findByPrimaryKey(
			long attractionWaterGenDeclareId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAttractionWaterGenDeclareException {

		return getPersistence().findByPrimaryKey(attractionWaterGenDeclareId);
	}

	/**
	 * Returns the attraction water gen declare with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param attractionWaterGenDeclareId the primary key of the attraction water gen declare
	 * @return the attraction water gen declare, or <code>null</code> if a attraction water gen declare with the primary key could not be found
	 */
	public static AttractionWaterGenDeclare fetchByPrimaryKey(
		long attractionWaterGenDeclareId) {

		return getPersistence().fetchByPrimaryKey(attractionWaterGenDeclareId);
	}

	/**
	 * Returns all the attraction water gen declares.
	 *
	 * @return the attraction water gen declares
	 */
	public static List<AttractionWaterGenDeclare> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the attraction water gen declares.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionWaterGenDeclareModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction water gen declares
	 * @param end the upper bound of the range of attraction water gen declares (not inclusive)
	 * @return the range of attraction water gen declares
	 */
	public static List<AttractionWaterGenDeclare> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the attraction water gen declares.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionWaterGenDeclareModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction water gen declares
	 * @param end the upper bound of the range of attraction water gen declares (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of attraction water gen declares
	 */
	public static List<AttractionWaterGenDeclare> findAll(
		int start, int end,
		OrderByComparator<AttractionWaterGenDeclare> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the attraction water gen declares.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionWaterGenDeclareModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction water gen declares
	 * @param end the upper bound of the range of attraction water gen declares (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of attraction water gen declares
	 */
	public static List<AttractionWaterGenDeclare> findAll(
		int start, int end,
		OrderByComparator<AttractionWaterGenDeclare> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the attraction water gen declares from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of attraction water gen declares.
	 *
	 * @return the number of attraction water gen declares
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AttractionWaterGenDeclarePersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		AttractionWaterGenDeclarePersistence persistence) {

		_persistence = persistence;
	}

	private static volatile AttractionWaterGenDeclarePersistence _persistence;

}