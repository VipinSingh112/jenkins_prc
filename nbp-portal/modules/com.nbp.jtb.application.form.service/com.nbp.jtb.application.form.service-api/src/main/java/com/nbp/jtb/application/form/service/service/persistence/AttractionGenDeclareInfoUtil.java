/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.jtb.application.form.service.model.AttractionGenDeclareInfo;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the attraction gen declare info service. This utility wraps <code>com.nbp.jtb.application.form.service.service.persistence.impl.AttractionGenDeclareInfoPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AttractionGenDeclareInfoPersistence
 * @generated
 */
public class AttractionGenDeclareInfoUtil {

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
		AttractionGenDeclareInfo attractionGenDeclareInfo) {

		getPersistence().clearCache(attractionGenDeclareInfo);
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
	public static Map<Serializable, AttractionGenDeclareInfo>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AttractionGenDeclareInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AttractionGenDeclareInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AttractionGenDeclareInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AttractionGenDeclareInfo> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AttractionGenDeclareInfo update(
		AttractionGenDeclareInfo attractionGenDeclareInfo) {

		return getPersistence().update(attractionGenDeclareInfo);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AttractionGenDeclareInfo update(
		AttractionGenDeclareInfo attractionGenDeclareInfo,
		ServiceContext serviceContext) {

		return getPersistence().update(
			attractionGenDeclareInfo, serviceContext);
	}

	/**
	 * Returns the attraction gen declare info where jtbApplicationId = &#63; or throws a <code>NoSuchAttractionGenDeclareInfoException</code> if it could not be found.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching attraction gen declare info
	 * @throws NoSuchAttractionGenDeclareInfoException if a matching attraction gen declare info could not be found
	 */
	public static AttractionGenDeclareInfo findBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAttractionGenDeclareInfoException {

		return getPersistence().findBygetJTB_ByApplicationId(jtbApplicationId);
	}

	/**
	 * Returns the attraction gen declare info where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching attraction gen declare info, or <code>null</code> if a matching attraction gen declare info could not be found
	 */
	public static AttractionGenDeclareInfo fetchBygetJTB_ByApplicationId(
		long jtbApplicationId) {

		return getPersistence().fetchBygetJTB_ByApplicationId(jtbApplicationId);
	}

	/**
	 * Returns the attraction gen declare info where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching attraction gen declare info, or <code>null</code> if a matching attraction gen declare info could not be found
	 */
	public static AttractionGenDeclareInfo fetchBygetJTB_ByApplicationId(
		long jtbApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetJTB_ByApplicationId(
			jtbApplicationId, useFinderCache);
	}

	/**
	 * Removes the attraction gen declare info where jtbApplicationId = &#63; from the database.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the attraction gen declare info that was removed
	 */
	public static AttractionGenDeclareInfo removeBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAttractionGenDeclareInfoException {

		return getPersistence().removeBygetJTB_ByApplicationId(
			jtbApplicationId);
	}

	/**
	 * Returns the number of attraction gen declare infos where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the number of matching attraction gen declare infos
	 */
	public static int countBygetJTB_ByApplicationId(long jtbApplicationId) {
		return getPersistence().countBygetJTB_ByApplicationId(jtbApplicationId);
	}

	/**
	 * Caches the attraction gen declare info in the entity cache if it is enabled.
	 *
	 * @param attractionGenDeclareInfo the attraction gen declare info
	 */
	public static void cacheResult(
		AttractionGenDeclareInfo attractionGenDeclareInfo) {

		getPersistence().cacheResult(attractionGenDeclareInfo);
	}

	/**
	 * Caches the attraction gen declare infos in the entity cache if it is enabled.
	 *
	 * @param attractionGenDeclareInfos the attraction gen declare infos
	 */
	public static void cacheResult(
		List<AttractionGenDeclareInfo> attractionGenDeclareInfos) {

		getPersistence().cacheResult(attractionGenDeclareInfos);
	}

	/**
	 * Creates a new attraction gen declare info with the primary key. Does not add the attraction gen declare info to the database.
	 *
	 * @param attractionGenDeclareInfoId the primary key for the new attraction gen declare info
	 * @return the new attraction gen declare info
	 */
	public static AttractionGenDeclareInfo create(
		long attractionGenDeclareInfoId) {

		return getPersistence().create(attractionGenDeclareInfoId);
	}

	/**
	 * Removes the attraction gen declare info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param attractionGenDeclareInfoId the primary key of the attraction gen declare info
	 * @return the attraction gen declare info that was removed
	 * @throws NoSuchAttractionGenDeclareInfoException if a attraction gen declare info with the primary key could not be found
	 */
	public static AttractionGenDeclareInfo remove(
			long attractionGenDeclareInfoId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAttractionGenDeclareInfoException {

		return getPersistence().remove(attractionGenDeclareInfoId);
	}

	public static AttractionGenDeclareInfo updateImpl(
		AttractionGenDeclareInfo attractionGenDeclareInfo) {

		return getPersistence().updateImpl(attractionGenDeclareInfo);
	}

	/**
	 * Returns the attraction gen declare info with the primary key or throws a <code>NoSuchAttractionGenDeclareInfoException</code> if it could not be found.
	 *
	 * @param attractionGenDeclareInfoId the primary key of the attraction gen declare info
	 * @return the attraction gen declare info
	 * @throws NoSuchAttractionGenDeclareInfoException if a attraction gen declare info with the primary key could not be found
	 */
	public static AttractionGenDeclareInfo findByPrimaryKey(
			long attractionGenDeclareInfoId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAttractionGenDeclareInfoException {

		return getPersistence().findByPrimaryKey(attractionGenDeclareInfoId);
	}

	/**
	 * Returns the attraction gen declare info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param attractionGenDeclareInfoId the primary key of the attraction gen declare info
	 * @return the attraction gen declare info, or <code>null</code> if a attraction gen declare info with the primary key could not be found
	 */
	public static AttractionGenDeclareInfo fetchByPrimaryKey(
		long attractionGenDeclareInfoId) {

		return getPersistence().fetchByPrimaryKey(attractionGenDeclareInfoId);
	}

	/**
	 * Returns all the attraction gen declare infos.
	 *
	 * @return the attraction gen declare infos
	 */
	public static List<AttractionGenDeclareInfo> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the attraction gen declare infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionGenDeclareInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction gen declare infos
	 * @param end the upper bound of the range of attraction gen declare infos (not inclusive)
	 * @return the range of attraction gen declare infos
	 */
	public static List<AttractionGenDeclareInfo> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the attraction gen declare infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionGenDeclareInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction gen declare infos
	 * @param end the upper bound of the range of attraction gen declare infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of attraction gen declare infos
	 */
	public static List<AttractionGenDeclareInfo> findAll(
		int start, int end,
		OrderByComparator<AttractionGenDeclareInfo> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the attraction gen declare infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionGenDeclareInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction gen declare infos
	 * @param end the upper bound of the range of attraction gen declare infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of attraction gen declare infos
	 */
	public static List<AttractionGenDeclareInfo> findAll(
		int start, int end,
		OrderByComparator<AttractionGenDeclareInfo> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the attraction gen declare infos from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of attraction gen declare infos.
	 *
	 * @return the number of attraction gen declare infos
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AttractionGenDeclareInfoPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		AttractionGenDeclareInfoPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile AttractionGenDeclareInfoPersistence _persistence;

}