/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.pharmaceutical.application.form.service.model.PharmaManufacturerInfo;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the pharma manufacturer info service. This utility wraps <code>com.nbp.pharmaceutical.application.form.service.service.persistence.impl.PharmaManufacturerInfoPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PharmaManufacturerInfoPersistence
 * @generated
 */
public class PharmaManufacturerInfoUtil {

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
		PharmaManufacturerInfo pharmaManufacturerInfo) {

		getPersistence().clearCache(pharmaManufacturerInfo);
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
	public static Map<Serializable, PharmaManufacturerInfo> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<PharmaManufacturerInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<PharmaManufacturerInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<PharmaManufacturerInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<PharmaManufacturerInfo> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static PharmaManufacturerInfo update(
		PharmaManufacturerInfo pharmaManufacturerInfo) {

		return getPersistence().update(pharmaManufacturerInfo);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static PharmaManufacturerInfo update(
		PharmaManufacturerInfo pharmaManufacturerInfo,
		ServiceContext serviceContext) {

		return getPersistence().update(pharmaManufacturerInfo, serviceContext);
	}

	/**
	 * Returns the pharma manufacturer info where pharmaApplicationId = &#63; or throws a <code>NoSuchPharmaManufacturerInfoException</code> if it could not be found.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the matching pharma manufacturer info
	 * @throws NoSuchPharmaManufacturerInfoException if a matching pharma manufacturer info could not be found
	 */
	public static PharmaManufacturerInfo findBygetPharmaByAppId(
			long pharmaApplicationId)
		throws com.nbp.pharmaceutical.application.form.service.exception.
			NoSuchPharmaManufacturerInfoException {

		return getPersistence().findBygetPharmaByAppId(pharmaApplicationId);
	}

	/**
	 * Returns the pharma manufacturer info where pharmaApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the matching pharma manufacturer info, or <code>null</code> if a matching pharma manufacturer info could not be found
	 */
	public static PharmaManufacturerInfo fetchBygetPharmaByAppId(
		long pharmaApplicationId) {

		return getPersistence().fetchBygetPharmaByAppId(pharmaApplicationId);
	}

	/**
	 * Returns the pharma manufacturer info where pharmaApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching pharma manufacturer info, or <code>null</code> if a matching pharma manufacturer info could not be found
	 */
	public static PharmaManufacturerInfo fetchBygetPharmaByAppId(
		long pharmaApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetPharmaByAppId(
			pharmaApplicationId, useFinderCache);
	}

	/**
	 * Removes the pharma manufacturer info where pharmaApplicationId = &#63; from the database.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the pharma manufacturer info that was removed
	 */
	public static PharmaManufacturerInfo removeBygetPharmaByAppId(
			long pharmaApplicationId)
		throws com.nbp.pharmaceutical.application.form.service.exception.
			NoSuchPharmaManufacturerInfoException {

		return getPersistence().removeBygetPharmaByAppId(pharmaApplicationId);
	}

	/**
	 * Returns the number of pharma manufacturer infos where pharmaApplicationId = &#63;.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the number of matching pharma manufacturer infos
	 */
	public static int countBygetPharmaByAppId(long pharmaApplicationId) {
		return getPersistence().countBygetPharmaByAppId(pharmaApplicationId);
	}

	/**
	 * Returns all the pharma manufacturer infos where pharmaApplicationId = &#63;.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the matching pharma manufacturer infos
	 */
	public static List<PharmaManufacturerInfo> findBygetPA_DI_PAI(
		long pharmaApplicationId) {

		return getPersistence().findBygetPA_DI_PAI(pharmaApplicationId);
	}

	/**
	 * Returns a range of all the pharma manufacturer infos where pharmaApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaManufacturerInfoModelImpl</code>.
	 * </p>
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @param start the lower bound of the range of pharma manufacturer infos
	 * @param end the upper bound of the range of pharma manufacturer infos (not inclusive)
	 * @return the range of matching pharma manufacturer infos
	 */
	public static List<PharmaManufacturerInfo> findBygetPA_DI_PAI(
		long pharmaApplicationId, int start, int end) {

		return getPersistence().findBygetPA_DI_PAI(
			pharmaApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the pharma manufacturer infos where pharmaApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaManufacturerInfoModelImpl</code>.
	 * </p>
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @param start the lower bound of the range of pharma manufacturer infos
	 * @param end the upper bound of the range of pharma manufacturer infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching pharma manufacturer infos
	 */
	public static List<PharmaManufacturerInfo> findBygetPA_DI_PAI(
		long pharmaApplicationId, int start, int end,
		OrderByComparator<PharmaManufacturerInfo> orderByComparator) {

		return getPersistence().findBygetPA_DI_PAI(
			pharmaApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the pharma manufacturer infos where pharmaApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaManufacturerInfoModelImpl</code>.
	 * </p>
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @param start the lower bound of the range of pharma manufacturer infos
	 * @param end the upper bound of the range of pharma manufacturer infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching pharma manufacturer infos
	 */
	public static List<PharmaManufacturerInfo> findBygetPA_DI_PAI(
		long pharmaApplicationId, int start, int end,
		OrderByComparator<PharmaManufacturerInfo> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetPA_DI_PAI(
			pharmaApplicationId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first pharma manufacturer info in the ordered set where pharmaApplicationId = &#63;.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pharma manufacturer info
	 * @throws NoSuchPharmaManufacturerInfoException if a matching pharma manufacturer info could not be found
	 */
	public static PharmaManufacturerInfo findBygetPA_DI_PAI_First(
			long pharmaApplicationId,
			OrderByComparator<PharmaManufacturerInfo> orderByComparator)
		throws com.nbp.pharmaceutical.application.form.service.exception.
			NoSuchPharmaManufacturerInfoException {

		return getPersistence().findBygetPA_DI_PAI_First(
			pharmaApplicationId, orderByComparator);
	}

	/**
	 * Returns the first pharma manufacturer info in the ordered set where pharmaApplicationId = &#63;.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pharma manufacturer info, or <code>null</code> if a matching pharma manufacturer info could not be found
	 */
	public static PharmaManufacturerInfo fetchBygetPA_DI_PAI_First(
		long pharmaApplicationId,
		OrderByComparator<PharmaManufacturerInfo> orderByComparator) {

		return getPersistence().fetchBygetPA_DI_PAI_First(
			pharmaApplicationId, orderByComparator);
	}

	/**
	 * Returns the last pharma manufacturer info in the ordered set where pharmaApplicationId = &#63;.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pharma manufacturer info
	 * @throws NoSuchPharmaManufacturerInfoException if a matching pharma manufacturer info could not be found
	 */
	public static PharmaManufacturerInfo findBygetPA_DI_PAI_Last(
			long pharmaApplicationId,
			OrderByComparator<PharmaManufacturerInfo> orderByComparator)
		throws com.nbp.pharmaceutical.application.form.service.exception.
			NoSuchPharmaManufacturerInfoException {

		return getPersistence().findBygetPA_DI_PAI_Last(
			pharmaApplicationId, orderByComparator);
	}

	/**
	 * Returns the last pharma manufacturer info in the ordered set where pharmaApplicationId = &#63;.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pharma manufacturer info, or <code>null</code> if a matching pharma manufacturer info could not be found
	 */
	public static PharmaManufacturerInfo fetchBygetPA_DI_PAI_Last(
		long pharmaApplicationId,
		OrderByComparator<PharmaManufacturerInfo> orderByComparator) {

		return getPersistence().fetchBygetPA_DI_PAI_Last(
			pharmaApplicationId, orderByComparator);
	}

	/**
	 * Returns the pharma manufacturer infos before and after the current pharma manufacturer info in the ordered set where pharmaApplicationId = &#63;.
	 *
	 * @param pharmaManufacturerInfoId the primary key of the current pharma manufacturer info
	 * @param pharmaApplicationId the pharma application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next pharma manufacturer info
	 * @throws NoSuchPharmaManufacturerInfoException if a pharma manufacturer info with the primary key could not be found
	 */
	public static PharmaManufacturerInfo[] findBygetPA_DI_PAI_PrevAndNext(
			long pharmaManufacturerInfoId, long pharmaApplicationId,
			OrderByComparator<PharmaManufacturerInfo> orderByComparator)
		throws com.nbp.pharmaceutical.application.form.service.exception.
			NoSuchPharmaManufacturerInfoException {

		return getPersistence().findBygetPA_DI_PAI_PrevAndNext(
			pharmaManufacturerInfoId, pharmaApplicationId, orderByComparator);
	}

	/**
	 * Removes all the pharma manufacturer infos where pharmaApplicationId = &#63; from the database.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 */
	public static void removeBygetPA_DI_PAI(long pharmaApplicationId) {
		getPersistence().removeBygetPA_DI_PAI(pharmaApplicationId);
	}

	/**
	 * Returns the number of pharma manufacturer infos where pharmaApplicationId = &#63;.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the number of matching pharma manufacturer infos
	 */
	public static int countBygetPA_DI_PAI(long pharmaApplicationId) {
		return getPersistence().countBygetPA_DI_PAI(pharmaApplicationId);
	}

	/**
	 * Caches the pharma manufacturer info in the entity cache if it is enabled.
	 *
	 * @param pharmaManufacturerInfo the pharma manufacturer info
	 */
	public static void cacheResult(
		PharmaManufacturerInfo pharmaManufacturerInfo) {

		getPersistence().cacheResult(pharmaManufacturerInfo);
	}

	/**
	 * Caches the pharma manufacturer infos in the entity cache if it is enabled.
	 *
	 * @param pharmaManufacturerInfos the pharma manufacturer infos
	 */
	public static void cacheResult(
		List<PharmaManufacturerInfo> pharmaManufacturerInfos) {

		getPersistence().cacheResult(pharmaManufacturerInfos);
	}

	/**
	 * Creates a new pharma manufacturer info with the primary key. Does not add the pharma manufacturer info to the database.
	 *
	 * @param pharmaManufacturerInfoId the primary key for the new pharma manufacturer info
	 * @return the new pharma manufacturer info
	 */
	public static PharmaManufacturerInfo create(long pharmaManufacturerInfoId) {
		return getPersistence().create(pharmaManufacturerInfoId);
	}

	/**
	 * Removes the pharma manufacturer info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param pharmaManufacturerInfoId the primary key of the pharma manufacturer info
	 * @return the pharma manufacturer info that was removed
	 * @throws NoSuchPharmaManufacturerInfoException if a pharma manufacturer info with the primary key could not be found
	 */
	public static PharmaManufacturerInfo remove(long pharmaManufacturerInfoId)
		throws com.nbp.pharmaceutical.application.form.service.exception.
			NoSuchPharmaManufacturerInfoException {

		return getPersistence().remove(pharmaManufacturerInfoId);
	}

	public static PharmaManufacturerInfo updateImpl(
		PharmaManufacturerInfo pharmaManufacturerInfo) {

		return getPersistence().updateImpl(pharmaManufacturerInfo);
	}

	/**
	 * Returns the pharma manufacturer info with the primary key or throws a <code>NoSuchPharmaManufacturerInfoException</code> if it could not be found.
	 *
	 * @param pharmaManufacturerInfoId the primary key of the pharma manufacturer info
	 * @return the pharma manufacturer info
	 * @throws NoSuchPharmaManufacturerInfoException if a pharma manufacturer info with the primary key could not be found
	 */
	public static PharmaManufacturerInfo findByPrimaryKey(
			long pharmaManufacturerInfoId)
		throws com.nbp.pharmaceutical.application.form.service.exception.
			NoSuchPharmaManufacturerInfoException {

		return getPersistence().findByPrimaryKey(pharmaManufacturerInfoId);
	}

	/**
	 * Returns the pharma manufacturer info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param pharmaManufacturerInfoId the primary key of the pharma manufacturer info
	 * @return the pharma manufacturer info, or <code>null</code> if a pharma manufacturer info with the primary key could not be found
	 */
	public static PharmaManufacturerInfo fetchByPrimaryKey(
		long pharmaManufacturerInfoId) {

		return getPersistence().fetchByPrimaryKey(pharmaManufacturerInfoId);
	}

	/**
	 * Returns all the pharma manufacturer infos.
	 *
	 * @return the pharma manufacturer infos
	 */
	public static List<PharmaManufacturerInfo> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the pharma manufacturer infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaManufacturerInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma manufacturer infos
	 * @param end the upper bound of the range of pharma manufacturer infos (not inclusive)
	 * @return the range of pharma manufacturer infos
	 */
	public static List<PharmaManufacturerInfo> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the pharma manufacturer infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaManufacturerInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma manufacturer infos
	 * @param end the upper bound of the range of pharma manufacturer infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of pharma manufacturer infos
	 */
	public static List<PharmaManufacturerInfo> findAll(
		int start, int end,
		OrderByComparator<PharmaManufacturerInfo> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the pharma manufacturer infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaManufacturerInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma manufacturer infos
	 * @param end the upper bound of the range of pharma manufacturer infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of pharma manufacturer infos
	 */
	public static List<PharmaManufacturerInfo> findAll(
		int start, int end,
		OrderByComparator<PharmaManufacturerInfo> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the pharma manufacturer infos from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of pharma manufacturer infos.
	 *
	 * @return the number of pharma manufacturer infos
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static PharmaManufacturerInfoPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		PharmaManufacturerInfoPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile PharmaManufacturerInfoPersistence _persistence;

}