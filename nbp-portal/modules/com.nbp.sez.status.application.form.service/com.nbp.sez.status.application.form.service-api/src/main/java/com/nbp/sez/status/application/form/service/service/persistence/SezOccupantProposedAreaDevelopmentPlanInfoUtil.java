/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.sez.status.application.form.service.model.SezOccupantProposedAreaDevelopmentPlanInfo;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the sez occupant proposed area development plan info service. This utility wraps <code>com.nbp.sez.status.application.form.service.service.persistence.impl.SezOccupantProposedAreaDevelopmentPlanInfoPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezOccupantProposedAreaDevelopmentPlanInfoPersistence
 * @generated
 */
public class SezOccupantProposedAreaDevelopmentPlanInfoUtil {

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
		SezOccupantProposedAreaDevelopmentPlanInfo
			sezOccupantProposedAreaDevelopmentPlanInfo) {

		getPersistence().clearCache(sezOccupantProposedAreaDevelopmentPlanInfo);
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
	public static Map<Serializable, SezOccupantProposedAreaDevelopmentPlanInfo>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<SezOccupantProposedAreaDevelopmentPlanInfo>
		findWithDynamicQuery(DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<SezOccupantProposedAreaDevelopmentPlanInfo>
		findWithDynamicQuery(DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<SezOccupantProposedAreaDevelopmentPlanInfo>
		findWithDynamicQuery(
			DynamicQuery dynamicQuery, int start, int end,
			OrderByComparator<SezOccupantProposedAreaDevelopmentPlanInfo>
				orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static SezOccupantProposedAreaDevelopmentPlanInfo update(
		SezOccupantProposedAreaDevelopmentPlanInfo
			sezOccupantProposedAreaDevelopmentPlanInfo) {

		return getPersistence().update(
			sezOccupantProposedAreaDevelopmentPlanInfo);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static SezOccupantProposedAreaDevelopmentPlanInfo update(
		SezOccupantProposedAreaDevelopmentPlanInfo
			sezOccupantProposedAreaDevelopmentPlanInfo,
		ServiceContext serviceContext) {

		return getPersistence().update(
			sezOccupantProposedAreaDevelopmentPlanInfo, serviceContext);
	}

	/**
	 * Returns the sez occupant proposed area development plan info where sezStatusApplicationId = &#63; or throws a <code>NoSuchSezOccupantProposedAreaDevelopmentPlanInfoException</code> if it could not be found.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez occupant proposed area development plan info
	 * @throws NoSuchSezOccupantProposedAreaDevelopmentPlanInfoException if a matching sez occupant proposed area development plan info could not be found
	 */
	public static SezOccupantProposedAreaDevelopmentPlanInfo
			findBygetSezStatusByAppId(long sezStatusApplicationId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezOccupantProposedAreaDevelopmentPlanInfoException {

		return getPersistence().findBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Returns the sez occupant proposed area development plan info where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez occupant proposed area development plan info, or <code>null</code> if a matching sez occupant proposed area development plan info could not be found
	 */
	public static SezOccupantProposedAreaDevelopmentPlanInfo
		fetchBygetSezStatusByAppId(long sezStatusApplicationId) {

		return getPersistence().fetchBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Returns the sez occupant proposed area development plan info where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez occupant proposed area development plan info, or <code>null</code> if a matching sez occupant proposed area development plan info could not be found
	 */
	public static SezOccupantProposedAreaDevelopmentPlanInfo
		fetchBygetSezStatusByAppId(
			long sezStatusApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetSezStatusByAppId(
			sezStatusApplicationId, useFinderCache);
	}

	/**
	 * Removes the sez occupant proposed area development plan info where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the sez occupant proposed area development plan info that was removed
	 */
	public static SezOccupantProposedAreaDevelopmentPlanInfo
			removeBygetSezStatusByAppId(long sezStatusApplicationId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezOccupantProposedAreaDevelopmentPlanInfoException {

		return getPersistence().removeBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Returns the number of sez occupant proposed area development plan infos where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez occupant proposed area development plan infos
	 */
	public static int countBygetSezStatusByAppId(long sezStatusApplicationId) {
		return getPersistence().countBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Caches the sez occupant proposed area development plan info in the entity cache if it is enabled.
	 *
	 * @param sezOccupantProposedAreaDevelopmentPlanInfo the sez occupant proposed area development plan info
	 */
	public static void cacheResult(
		SezOccupantProposedAreaDevelopmentPlanInfo
			sezOccupantProposedAreaDevelopmentPlanInfo) {

		getPersistence().cacheResult(
			sezOccupantProposedAreaDevelopmentPlanInfo);
	}

	/**
	 * Caches the sez occupant proposed area development plan infos in the entity cache if it is enabled.
	 *
	 * @param sezOccupantProposedAreaDevelopmentPlanInfos the sez occupant proposed area development plan infos
	 */
	public static void cacheResult(
		List<SezOccupantProposedAreaDevelopmentPlanInfo>
			sezOccupantProposedAreaDevelopmentPlanInfos) {

		getPersistence().cacheResult(
			sezOccupantProposedAreaDevelopmentPlanInfos);
	}

	/**
	 * Creates a new sez occupant proposed area development plan info with the primary key. Does not add the sez occupant proposed area development plan info to the database.
	 *
	 * @param sezOccPropAreaId the primary key for the new sez occupant proposed area development plan info
	 * @return the new sez occupant proposed area development plan info
	 */
	public static SezOccupantProposedAreaDevelopmentPlanInfo create(
		long sezOccPropAreaId) {

		return getPersistence().create(sezOccPropAreaId);
	}

	/**
	 * Removes the sez occupant proposed area development plan info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezOccPropAreaId the primary key of the sez occupant proposed area development plan info
	 * @return the sez occupant proposed area development plan info that was removed
	 * @throws NoSuchSezOccupantProposedAreaDevelopmentPlanInfoException if a sez occupant proposed area development plan info with the primary key could not be found
	 */
	public static SezOccupantProposedAreaDevelopmentPlanInfo remove(
			long sezOccPropAreaId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezOccupantProposedAreaDevelopmentPlanInfoException {

		return getPersistence().remove(sezOccPropAreaId);
	}

	public static SezOccupantProposedAreaDevelopmentPlanInfo updateImpl(
		SezOccupantProposedAreaDevelopmentPlanInfo
			sezOccupantProposedAreaDevelopmentPlanInfo) {

		return getPersistence().updateImpl(
			sezOccupantProposedAreaDevelopmentPlanInfo);
	}

	/**
	 * Returns the sez occupant proposed area development plan info with the primary key or throws a <code>NoSuchSezOccupantProposedAreaDevelopmentPlanInfoException</code> if it could not be found.
	 *
	 * @param sezOccPropAreaId the primary key of the sez occupant proposed area development plan info
	 * @return the sez occupant proposed area development plan info
	 * @throws NoSuchSezOccupantProposedAreaDevelopmentPlanInfoException if a sez occupant proposed area development plan info with the primary key could not be found
	 */
	public static SezOccupantProposedAreaDevelopmentPlanInfo findByPrimaryKey(
			long sezOccPropAreaId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezOccupantProposedAreaDevelopmentPlanInfoException {

		return getPersistence().findByPrimaryKey(sezOccPropAreaId);
	}

	/**
	 * Returns the sez occupant proposed area development plan info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezOccPropAreaId the primary key of the sez occupant proposed area development plan info
	 * @return the sez occupant proposed area development plan info, or <code>null</code> if a sez occupant proposed area development plan info with the primary key could not be found
	 */
	public static SezOccupantProposedAreaDevelopmentPlanInfo fetchByPrimaryKey(
		long sezOccPropAreaId) {

		return getPersistence().fetchByPrimaryKey(sezOccPropAreaId);
	}

	/**
	 * Returns all the sez occupant proposed area development plan infos.
	 *
	 * @return the sez occupant proposed area development plan infos
	 */
	public static List<SezOccupantProposedAreaDevelopmentPlanInfo> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the sez occupant proposed area development plan infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantProposedAreaDevelopmentPlanInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupant proposed area development plan infos
	 * @param end the upper bound of the range of sez occupant proposed area development plan infos (not inclusive)
	 * @return the range of sez occupant proposed area development plan infos
	 */
	public static List<SezOccupantProposedAreaDevelopmentPlanInfo> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the sez occupant proposed area development plan infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantProposedAreaDevelopmentPlanInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupant proposed area development plan infos
	 * @param end the upper bound of the range of sez occupant proposed area development plan infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez occupant proposed area development plan infos
	 */
	public static List<SezOccupantProposedAreaDevelopmentPlanInfo> findAll(
		int start, int end,
		OrderByComparator<SezOccupantProposedAreaDevelopmentPlanInfo>
			orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the sez occupant proposed area development plan infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantProposedAreaDevelopmentPlanInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupant proposed area development plan infos
	 * @param end the upper bound of the range of sez occupant proposed area development plan infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez occupant proposed area development plan infos
	 */
	public static List<SezOccupantProposedAreaDevelopmentPlanInfo> findAll(
		int start, int end,
		OrderByComparator<SezOccupantProposedAreaDevelopmentPlanInfo>
			orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the sez occupant proposed area development plan infos from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of sez occupant proposed area development plan infos.
	 *
	 * @return the number of sez occupant proposed area development plan infos
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static SezOccupantProposedAreaDevelopmentPlanInfoPersistence
		getPersistence() {

		return _persistence;
	}

	public static void setPersistence(
		SezOccupantProposedAreaDevelopmentPlanInfoPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile
		SezOccupantProposedAreaDevelopmentPlanInfoPersistence _persistence;

}