/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.sez.status.application.form.service.model.SezOccupanteSubmissionChecklistInfo;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the sez occupante submission checklist info service. This utility wraps <code>com.nbp.sez.status.application.form.service.service.persistence.impl.SezOccupanteSubmissionChecklistInfoPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezOccupanteSubmissionChecklistInfoPersistence
 * @generated
 */
public class SezOccupanteSubmissionChecklistInfoUtil {

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
		SezOccupanteSubmissionChecklistInfo
			sezOccupanteSubmissionChecklistInfo) {

		getPersistence().clearCache(sezOccupanteSubmissionChecklistInfo);
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
	public static Map<Serializable, SezOccupanteSubmissionChecklistInfo>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<SezOccupanteSubmissionChecklistInfo>
		findWithDynamicQuery(DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<SezOccupanteSubmissionChecklistInfo>
		findWithDynamicQuery(DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<SezOccupanteSubmissionChecklistInfo>
		findWithDynamicQuery(
			DynamicQuery dynamicQuery, int start, int end,
			OrderByComparator<SezOccupanteSubmissionChecklistInfo>
				orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static SezOccupanteSubmissionChecklistInfo update(
		SezOccupanteSubmissionChecklistInfo
			sezOccupanteSubmissionChecklistInfo) {

		return getPersistence().update(sezOccupanteSubmissionChecklistInfo);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static SezOccupanteSubmissionChecklistInfo update(
		SezOccupanteSubmissionChecklistInfo sezOccupanteSubmissionChecklistInfo,
		ServiceContext serviceContext) {

		return getPersistence().update(
			sezOccupanteSubmissionChecklistInfo, serviceContext);
	}

	/**
	 * Returns the sez occupante submission checklist info where sezStatusApplicationId = &#63; or throws a <code>NoSuchSezOccupanteSubmissionChecklistInfoException</code> if it could not be found.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez occupante submission checklist info
	 * @throws NoSuchSezOccupanteSubmissionChecklistInfoException if a matching sez occupante submission checklist info could not be found
	 */
	public static SezOccupanteSubmissionChecklistInfo findBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezOccupanteSubmissionChecklistInfoException {

		return getPersistence().findBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Returns the sez occupante submission checklist info where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez occupante submission checklist info, or <code>null</code> if a matching sez occupante submission checklist info could not be found
	 */
	public static SezOccupanteSubmissionChecklistInfo
		fetchBygetSezStatusByAppId(long sezStatusApplicationId) {

		return getPersistence().fetchBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Returns the sez occupante submission checklist info where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez occupante submission checklist info, or <code>null</code> if a matching sez occupante submission checklist info could not be found
	 */
	public static SezOccupanteSubmissionChecklistInfo
		fetchBygetSezStatusByAppId(
			long sezStatusApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetSezStatusByAppId(
			sezStatusApplicationId, useFinderCache);
	}

	/**
	 * Removes the sez occupante submission checklist info where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the sez occupante submission checklist info that was removed
	 */
	public static SezOccupanteSubmissionChecklistInfo
			removeBygetSezStatusByAppId(long sezStatusApplicationId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezOccupanteSubmissionChecklistInfoException {

		return getPersistence().removeBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Returns the number of sez occupante submission checklist infos where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez occupante submission checklist infos
	 */
	public static int countBygetSezStatusByAppId(long sezStatusApplicationId) {
		return getPersistence().countBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Caches the sez occupante submission checklist info in the entity cache if it is enabled.
	 *
	 * @param sezOccupanteSubmissionChecklistInfo the sez occupante submission checklist info
	 */
	public static void cacheResult(
		SezOccupanteSubmissionChecklistInfo
			sezOccupanteSubmissionChecklistInfo) {

		getPersistence().cacheResult(sezOccupanteSubmissionChecklistInfo);
	}

	/**
	 * Caches the sez occupante submission checklist infos in the entity cache if it is enabled.
	 *
	 * @param sezOccupanteSubmissionChecklistInfos the sez occupante submission checklist infos
	 */
	public static void cacheResult(
		List<SezOccupanteSubmissionChecklistInfo>
			sezOccupanteSubmissionChecklistInfos) {

		getPersistence().cacheResult(sezOccupanteSubmissionChecklistInfos);
	}

	/**
	 * Creates a new sez occupante submission checklist info with the primary key. Does not add the sez occupante submission checklist info to the database.
	 *
	 * @param sezOccCheckSubmitId the primary key for the new sez occupante submission checklist info
	 * @return the new sez occupante submission checklist info
	 */
	public static SezOccupanteSubmissionChecklistInfo create(
		long sezOccCheckSubmitId) {

		return getPersistence().create(sezOccCheckSubmitId);
	}

	/**
	 * Removes the sez occupante submission checklist info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezOccCheckSubmitId the primary key of the sez occupante submission checklist info
	 * @return the sez occupante submission checklist info that was removed
	 * @throws NoSuchSezOccupanteSubmissionChecklistInfoException if a sez occupante submission checklist info with the primary key could not be found
	 */
	public static SezOccupanteSubmissionChecklistInfo remove(
			long sezOccCheckSubmitId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezOccupanteSubmissionChecklistInfoException {

		return getPersistence().remove(sezOccCheckSubmitId);
	}

	public static SezOccupanteSubmissionChecklistInfo updateImpl(
		SezOccupanteSubmissionChecklistInfo
			sezOccupanteSubmissionChecklistInfo) {

		return getPersistence().updateImpl(sezOccupanteSubmissionChecklistInfo);
	}

	/**
	 * Returns the sez occupante submission checklist info with the primary key or throws a <code>NoSuchSezOccupanteSubmissionChecklistInfoException</code> if it could not be found.
	 *
	 * @param sezOccCheckSubmitId the primary key of the sez occupante submission checklist info
	 * @return the sez occupante submission checklist info
	 * @throws NoSuchSezOccupanteSubmissionChecklistInfoException if a sez occupante submission checklist info with the primary key could not be found
	 */
	public static SezOccupanteSubmissionChecklistInfo findByPrimaryKey(
			long sezOccCheckSubmitId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezOccupanteSubmissionChecklistInfoException {

		return getPersistence().findByPrimaryKey(sezOccCheckSubmitId);
	}

	/**
	 * Returns the sez occupante submission checklist info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezOccCheckSubmitId the primary key of the sez occupante submission checklist info
	 * @return the sez occupante submission checklist info, or <code>null</code> if a sez occupante submission checklist info with the primary key could not be found
	 */
	public static SezOccupanteSubmissionChecklistInfo fetchByPrimaryKey(
		long sezOccCheckSubmitId) {

		return getPersistence().fetchByPrimaryKey(sezOccCheckSubmitId);
	}

	/**
	 * Returns all the sez occupante submission checklist infos.
	 *
	 * @return the sez occupante submission checklist infos
	 */
	public static List<SezOccupanteSubmissionChecklistInfo> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the sez occupante submission checklist infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupanteSubmissionChecklistInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupante submission checklist infos
	 * @param end the upper bound of the range of sez occupante submission checklist infos (not inclusive)
	 * @return the range of sez occupante submission checklist infos
	 */
	public static List<SezOccupanteSubmissionChecklistInfo> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the sez occupante submission checklist infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupanteSubmissionChecklistInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupante submission checklist infos
	 * @param end the upper bound of the range of sez occupante submission checklist infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez occupante submission checklist infos
	 */
	public static List<SezOccupanteSubmissionChecklistInfo> findAll(
		int start, int end,
		OrderByComparator<SezOccupanteSubmissionChecklistInfo>
			orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the sez occupante submission checklist infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupanteSubmissionChecklistInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupante submission checklist infos
	 * @param end the upper bound of the range of sez occupante submission checklist infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez occupante submission checklist infos
	 */
	public static List<SezOccupanteSubmissionChecklistInfo> findAll(
		int start, int end,
		OrderByComparator<SezOccupanteSubmissionChecklistInfo>
			orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the sez occupante submission checklist infos from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of sez occupante submission checklist infos.
	 *
	 * @return the number of sez occupante submission checklist infos
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static SezOccupanteSubmissionChecklistInfoPersistence
		getPersistence() {

		return _persistence;
	}

	public static void setPersistence(
		SezOccupanteSubmissionChecklistInfoPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile SezOccupanteSubmissionChecklistInfoPersistence
		_persistence;

}