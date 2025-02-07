/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.jtb.application.form.service.model.AttractionBikeRentalInfo;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the attraction bike rental info service. This utility wraps <code>com.nbp.jtb.application.form.service.service.persistence.impl.AttractionBikeRentalInfoPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AttractionBikeRentalInfoPersistence
 * @generated
 */
public class AttractionBikeRentalInfoUtil {

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
		AttractionBikeRentalInfo attractionBikeRentalInfo) {

		getPersistence().clearCache(attractionBikeRentalInfo);
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
	public static Map<Serializable, AttractionBikeRentalInfo>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AttractionBikeRentalInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AttractionBikeRentalInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AttractionBikeRentalInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AttractionBikeRentalInfo> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AttractionBikeRentalInfo update(
		AttractionBikeRentalInfo attractionBikeRentalInfo) {

		return getPersistence().update(attractionBikeRentalInfo);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AttractionBikeRentalInfo update(
		AttractionBikeRentalInfo attractionBikeRentalInfo,
		ServiceContext serviceContext) {

		return getPersistence().update(
			attractionBikeRentalInfo, serviceContext);
	}

	/**
	 * Returns the attraction bike rental info where jtbApplicationId = &#63; or throws a <code>NoSuchAttractionBikeRentalInfoException</code> if it could not be found.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching attraction bike rental info
	 * @throws NoSuchAttractionBikeRentalInfoException if a matching attraction bike rental info could not be found
	 */
	public static AttractionBikeRentalInfo findBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAttractionBikeRentalInfoException {

		return getPersistence().findBygetJTB_ByApplicationId(jtbApplicationId);
	}

	/**
	 * Returns the attraction bike rental info where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching attraction bike rental info, or <code>null</code> if a matching attraction bike rental info could not be found
	 */
	public static AttractionBikeRentalInfo fetchBygetJTB_ByApplicationId(
		long jtbApplicationId) {

		return getPersistence().fetchBygetJTB_ByApplicationId(jtbApplicationId);
	}

	/**
	 * Returns the attraction bike rental info where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching attraction bike rental info, or <code>null</code> if a matching attraction bike rental info could not be found
	 */
	public static AttractionBikeRentalInfo fetchBygetJTB_ByApplicationId(
		long jtbApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetJTB_ByApplicationId(
			jtbApplicationId, useFinderCache);
	}

	/**
	 * Removes the attraction bike rental info where jtbApplicationId = &#63; from the database.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the attraction bike rental info that was removed
	 */
	public static AttractionBikeRentalInfo removeBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAttractionBikeRentalInfoException {

		return getPersistence().removeBygetJTB_ByApplicationId(
			jtbApplicationId);
	}

	/**
	 * Returns the number of attraction bike rental infos where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the number of matching attraction bike rental infos
	 */
	public static int countBygetJTB_ByApplicationId(long jtbApplicationId) {
		return getPersistence().countBygetJTB_ByApplicationId(jtbApplicationId);
	}

	/**
	 * Caches the attraction bike rental info in the entity cache if it is enabled.
	 *
	 * @param attractionBikeRentalInfo the attraction bike rental info
	 */
	public static void cacheResult(
		AttractionBikeRentalInfo attractionBikeRentalInfo) {

		getPersistence().cacheResult(attractionBikeRentalInfo);
	}

	/**
	 * Caches the attraction bike rental infos in the entity cache if it is enabled.
	 *
	 * @param attractionBikeRentalInfos the attraction bike rental infos
	 */
	public static void cacheResult(
		List<AttractionBikeRentalInfo> attractionBikeRentalInfos) {

		getPersistence().cacheResult(attractionBikeRentalInfos);
	}

	/**
	 * Creates a new attraction bike rental info with the primary key. Does not add the attraction bike rental info to the database.
	 *
	 * @param attractionBikeRentalInfoId the primary key for the new attraction bike rental info
	 * @return the new attraction bike rental info
	 */
	public static AttractionBikeRentalInfo create(
		long attractionBikeRentalInfoId) {

		return getPersistence().create(attractionBikeRentalInfoId);
	}

	/**
	 * Removes the attraction bike rental info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param attractionBikeRentalInfoId the primary key of the attraction bike rental info
	 * @return the attraction bike rental info that was removed
	 * @throws NoSuchAttractionBikeRentalInfoException if a attraction bike rental info with the primary key could not be found
	 */
	public static AttractionBikeRentalInfo remove(
			long attractionBikeRentalInfoId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAttractionBikeRentalInfoException {

		return getPersistence().remove(attractionBikeRentalInfoId);
	}

	public static AttractionBikeRentalInfo updateImpl(
		AttractionBikeRentalInfo attractionBikeRentalInfo) {

		return getPersistence().updateImpl(attractionBikeRentalInfo);
	}

	/**
	 * Returns the attraction bike rental info with the primary key or throws a <code>NoSuchAttractionBikeRentalInfoException</code> if it could not be found.
	 *
	 * @param attractionBikeRentalInfoId the primary key of the attraction bike rental info
	 * @return the attraction bike rental info
	 * @throws NoSuchAttractionBikeRentalInfoException if a attraction bike rental info with the primary key could not be found
	 */
	public static AttractionBikeRentalInfo findByPrimaryKey(
			long attractionBikeRentalInfoId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAttractionBikeRentalInfoException {

		return getPersistence().findByPrimaryKey(attractionBikeRentalInfoId);
	}

	/**
	 * Returns the attraction bike rental info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param attractionBikeRentalInfoId the primary key of the attraction bike rental info
	 * @return the attraction bike rental info, or <code>null</code> if a attraction bike rental info with the primary key could not be found
	 */
	public static AttractionBikeRentalInfo fetchByPrimaryKey(
		long attractionBikeRentalInfoId) {

		return getPersistence().fetchByPrimaryKey(attractionBikeRentalInfoId);
	}

	/**
	 * Returns all the attraction bike rental infos.
	 *
	 * @return the attraction bike rental infos
	 */
	public static List<AttractionBikeRentalInfo> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the attraction bike rental infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionBikeRentalInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction bike rental infos
	 * @param end the upper bound of the range of attraction bike rental infos (not inclusive)
	 * @return the range of attraction bike rental infos
	 */
	public static List<AttractionBikeRentalInfo> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the attraction bike rental infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionBikeRentalInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction bike rental infos
	 * @param end the upper bound of the range of attraction bike rental infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of attraction bike rental infos
	 */
	public static List<AttractionBikeRentalInfo> findAll(
		int start, int end,
		OrderByComparator<AttractionBikeRentalInfo> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the attraction bike rental infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionBikeRentalInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction bike rental infos
	 * @param end the upper bound of the range of attraction bike rental infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of attraction bike rental infos
	 */
	public static List<AttractionBikeRentalInfo> findAll(
		int start, int end,
		OrderByComparator<AttractionBikeRentalInfo> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the attraction bike rental infos from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of attraction bike rental infos.
	 *
	 * @return the number of attraction bike rental infos
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AttractionBikeRentalInfoPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		AttractionBikeRentalInfoPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile AttractionBikeRentalInfoPersistence _persistence;

}