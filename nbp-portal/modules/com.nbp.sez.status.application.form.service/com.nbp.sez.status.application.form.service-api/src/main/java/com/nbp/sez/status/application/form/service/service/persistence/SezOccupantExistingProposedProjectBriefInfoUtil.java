/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.sez.status.application.form.service.model.SezOccupantExistingProposedProjectBriefInfo;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the sez occupant existing proposed project brief info service. This utility wraps <code>com.nbp.sez.status.application.form.service.service.persistence.impl.SezOccupantExistingProposedProjectBriefInfoPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezOccupantExistingProposedProjectBriefInfoPersistence
 * @generated
 */
public class SezOccupantExistingProposedProjectBriefInfoUtil {

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
		SezOccupantExistingProposedProjectBriefInfo
			sezOccupantExistingProposedProjectBriefInfo) {

		getPersistence().clearCache(
			sezOccupantExistingProposedProjectBriefInfo);
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
	public static Map<Serializable, SezOccupantExistingProposedProjectBriefInfo>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<SezOccupantExistingProposedProjectBriefInfo>
		findWithDynamicQuery(DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<SezOccupantExistingProposedProjectBriefInfo>
		findWithDynamicQuery(DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<SezOccupantExistingProposedProjectBriefInfo>
		findWithDynamicQuery(
			DynamicQuery dynamicQuery, int start, int end,
			OrderByComparator<SezOccupantExistingProposedProjectBriefInfo>
				orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static SezOccupantExistingProposedProjectBriefInfo update(
		SezOccupantExistingProposedProjectBriefInfo
			sezOccupantExistingProposedProjectBriefInfo) {

		return getPersistence().update(
			sezOccupantExistingProposedProjectBriefInfo);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static SezOccupantExistingProposedProjectBriefInfo update(
		SezOccupantExistingProposedProjectBriefInfo
			sezOccupantExistingProposedProjectBriefInfo,
		ServiceContext serviceContext) {

		return getPersistence().update(
			sezOccupantExistingProposedProjectBriefInfo, serviceContext);
	}

	/**
	 * Returns the sez occupant existing proposed project brief info where sezStatusApplicationId = &#63; or throws a <code>NoSuchSezOccupantExistingProposedProjectBriefInfoException</code> if it could not be found.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez occupant existing proposed project brief info
	 * @throws NoSuchSezOccupantExistingProposedProjectBriefInfoException if a matching sez occupant existing proposed project brief info could not be found
	 */
	public static SezOccupantExistingProposedProjectBriefInfo
			findBygetSezStatusByAppId(long sezStatusApplicationId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezOccupantExistingProposedProjectBriefInfoException {

		return getPersistence().findBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Returns the sez occupant existing proposed project brief info where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez occupant existing proposed project brief info, or <code>null</code> if a matching sez occupant existing proposed project brief info could not be found
	 */
	public static SezOccupantExistingProposedProjectBriefInfo
		fetchBygetSezStatusByAppId(long sezStatusApplicationId) {

		return getPersistence().fetchBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Returns the sez occupant existing proposed project brief info where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez occupant existing proposed project brief info, or <code>null</code> if a matching sez occupant existing proposed project brief info could not be found
	 */
	public static SezOccupantExistingProposedProjectBriefInfo
		fetchBygetSezStatusByAppId(
			long sezStatusApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetSezStatusByAppId(
			sezStatusApplicationId, useFinderCache);
	}

	/**
	 * Removes the sez occupant existing proposed project brief info where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the sez occupant existing proposed project brief info that was removed
	 */
	public static SezOccupantExistingProposedProjectBriefInfo
			removeBygetSezStatusByAppId(long sezStatusApplicationId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezOccupantExistingProposedProjectBriefInfoException {

		return getPersistence().removeBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Returns the number of sez occupant existing proposed project brief infos where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez occupant existing proposed project brief infos
	 */
	public static int countBygetSezStatusByAppId(long sezStatusApplicationId) {
		return getPersistence().countBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Caches the sez occupant existing proposed project brief info in the entity cache if it is enabled.
	 *
	 * @param sezOccupantExistingProposedProjectBriefInfo the sez occupant existing proposed project brief info
	 */
	public static void cacheResult(
		SezOccupantExistingProposedProjectBriefInfo
			sezOccupantExistingProposedProjectBriefInfo) {

		getPersistence().cacheResult(
			sezOccupantExistingProposedProjectBriefInfo);
	}

	/**
	 * Caches the sez occupant existing proposed project brief infos in the entity cache if it is enabled.
	 *
	 * @param sezOccupantExistingProposedProjectBriefInfos the sez occupant existing proposed project brief infos
	 */
	public static void cacheResult(
		List<SezOccupantExistingProposedProjectBriefInfo>
			sezOccupantExistingProposedProjectBriefInfos) {

		getPersistence().cacheResult(
			sezOccupantExistingProposedProjectBriefInfos);
	}

	/**
	 * Creates a new sez occupant existing proposed project brief info with the primary key. Does not add the sez occupant existing proposed project brief info to the database.
	 *
	 * @param sezOccExistPorpId the primary key for the new sez occupant existing proposed project brief info
	 * @return the new sez occupant existing proposed project brief info
	 */
	public static SezOccupantExistingProposedProjectBriefInfo create(
		long sezOccExistPorpId) {

		return getPersistence().create(sezOccExistPorpId);
	}

	/**
	 * Removes the sez occupant existing proposed project brief info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezOccExistPorpId the primary key of the sez occupant existing proposed project brief info
	 * @return the sez occupant existing proposed project brief info that was removed
	 * @throws NoSuchSezOccupantExistingProposedProjectBriefInfoException if a sez occupant existing proposed project brief info with the primary key could not be found
	 */
	public static SezOccupantExistingProposedProjectBriefInfo remove(
			long sezOccExistPorpId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezOccupantExistingProposedProjectBriefInfoException {

		return getPersistence().remove(sezOccExistPorpId);
	}

	public static SezOccupantExistingProposedProjectBriefInfo updateImpl(
		SezOccupantExistingProposedProjectBriefInfo
			sezOccupantExistingProposedProjectBriefInfo) {

		return getPersistence().updateImpl(
			sezOccupantExistingProposedProjectBriefInfo);
	}

	/**
	 * Returns the sez occupant existing proposed project brief info with the primary key or throws a <code>NoSuchSezOccupantExistingProposedProjectBriefInfoException</code> if it could not be found.
	 *
	 * @param sezOccExistPorpId the primary key of the sez occupant existing proposed project brief info
	 * @return the sez occupant existing proposed project brief info
	 * @throws NoSuchSezOccupantExistingProposedProjectBriefInfoException if a sez occupant existing proposed project brief info with the primary key could not be found
	 */
	public static SezOccupantExistingProposedProjectBriefInfo findByPrimaryKey(
			long sezOccExistPorpId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezOccupantExistingProposedProjectBriefInfoException {

		return getPersistence().findByPrimaryKey(sezOccExistPorpId);
	}

	/**
	 * Returns the sez occupant existing proposed project brief info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezOccExistPorpId the primary key of the sez occupant existing proposed project brief info
	 * @return the sez occupant existing proposed project brief info, or <code>null</code> if a sez occupant existing proposed project brief info with the primary key could not be found
	 */
	public static SezOccupantExistingProposedProjectBriefInfo fetchByPrimaryKey(
		long sezOccExistPorpId) {

		return getPersistence().fetchByPrimaryKey(sezOccExistPorpId);
	}

	/**
	 * Returns all the sez occupant existing proposed project brief infos.
	 *
	 * @return the sez occupant existing proposed project brief infos
	 */
	public static List<SezOccupantExistingProposedProjectBriefInfo> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the sez occupant existing proposed project brief infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantExistingProposedProjectBriefInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupant existing proposed project brief infos
	 * @param end the upper bound of the range of sez occupant existing proposed project brief infos (not inclusive)
	 * @return the range of sez occupant existing proposed project brief infos
	 */
	public static List<SezOccupantExistingProposedProjectBriefInfo> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the sez occupant existing proposed project brief infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantExistingProposedProjectBriefInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupant existing proposed project brief infos
	 * @param end the upper bound of the range of sez occupant existing proposed project brief infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez occupant existing proposed project brief infos
	 */
	public static List<SezOccupantExistingProposedProjectBriefInfo> findAll(
		int start, int end,
		OrderByComparator<SezOccupantExistingProposedProjectBriefInfo>
			orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the sez occupant existing proposed project brief infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantExistingProposedProjectBriefInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupant existing proposed project brief infos
	 * @param end the upper bound of the range of sez occupant existing proposed project brief infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez occupant existing proposed project brief infos
	 */
	public static List<SezOccupantExistingProposedProjectBriefInfo> findAll(
		int start, int end,
		OrderByComparator<SezOccupantExistingProposedProjectBriefInfo>
			orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the sez occupant existing proposed project brief infos from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of sez occupant existing proposed project brief infos.
	 *
	 * @return the number of sez occupant existing proposed project brief infos
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static SezOccupantExistingProposedProjectBriefInfoPersistence
		getPersistence() {

		return _persistence;
	}

	public static void setPersistence(
		SezOccupantExistingProposedProjectBriefInfoPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile
		SezOccupantExistingProposedProjectBriefInfoPersistence _persistence;

}