/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.pharmaceutical.application.form.service.model.PharmaDrugInfo;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the pharma drug info service. This utility wraps <code>com.nbp.pharmaceutical.application.form.service.service.persistence.impl.PharmaDrugInfoPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PharmaDrugInfoPersistence
 * @generated
 */
public class PharmaDrugInfoUtil {

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
	public static void clearCache(PharmaDrugInfo pharmaDrugInfo) {
		getPersistence().clearCache(pharmaDrugInfo);
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
	public static Map<Serializable, PharmaDrugInfo> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<PharmaDrugInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<PharmaDrugInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<PharmaDrugInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<PharmaDrugInfo> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static PharmaDrugInfo update(PharmaDrugInfo pharmaDrugInfo) {
		return getPersistence().update(pharmaDrugInfo);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static PharmaDrugInfo update(
		PharmaDrugInfo pharmaDrugInfo, ServiceContext serviceContext) {

		return getPersistence().update(pharmaDrugInfo, serviceContext);
	}

	/**
	 * Returns the pharma drug info where pharmaApplicationId = &#63; or throws a <code>NoSuchPharmaDrugInfoException</code> if it could not be found.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the matching pharma drug info
	 * @throws NoSuchPharmaDrugInfoException if a matching pharma drug info could not be found
	 */
	public static PharmaDrugInfo findBygetPharmaByAppId(
			long pharmaApplicationId)
		throws com.nbp.pharmaceutical.application.form.service.exception.
			NoSuchPharmaDrugInfoException {

		return getPersistence().findBygetPharmaByAppId(pharmaApplicationId);
	}

	/**
	 * Returns the pharma drug info where pharmaApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the matching pharma drug info, or <code>null</code> if a matching pharma drug info could not be found
	 */
	public static PharmaDrugInfo fetchBygetPharmaByAppId(
		long pharmaApplicationId) {

		return getPersistence().fetchBygetPharmaByAppId(pharmaApplicationId);
	}

	/**
	 * Returns the pharma drug info where pharmaApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching pharma drug info, or <code>null</code> if a matching pharma drug info could not be found
	 */
	public static PharmaDrugInfo fetchBygetPharmaByAppId(
		long pharmaApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetPharmaByAppId(
			pharmaApplicationId, useFinderCache);
	}

	/**
	 * Removes the pharma drug info where pharmaApplicationId = &#63; from the database.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the pharma drug info that was removed
	 */
	public static PharmaDrugInfo removeBygetPharmaByAppId(
			long pharmaApplicationId)
		throws com.nbp.pharmaceutical.application.form.service.exception.
			NoSuchPharmaDrugInfoException {

		return getPersistence().removeBygetPharmaByAppId(pharmaApplicationId);
	}

	/**
	 * Returns the number of pharma drug infos where pharmaApplicationId = &#63;.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the number of matching pharma drug infos
	 */
	public static int countBygetPharmaByAppId(long pharmaApplicationId) {
		return getPersistence().countBygetPharmaByAppId(pharmaApplicationId);
	}

	/**
	 * Returns all the pharma drug infos where pharmaApplicationId = &#63;.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the matching pharma drug infos
	 */
	public static List<PharmaDrugInfo> findBygetPA_DI_PAI(
		long pharmaApplicationId) {

		return getPersistence().findBygetPA_DI_PAI(pharmaApplicationId);
	}

	/**
	 * Returns a range of all the pharma drug infos where pharmaApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaDrugInfoModelImpl</code>.
	 * </p>
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @param start the lower bound of the range of pharma drug infos
	 * @param end the upper bound of the range of pharma drug infos (not inclusive)
	 * @return the range of matching pharma drug infos
	 */
	public static List<PharmaDrugInfo> findBygetPA_DI_PAI(
		long pharmaApplicationId, int start, int end) {

		return getPersistence().findBygetPA_DI_PAI(
			pharmaApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the pharma drug infos where pharmaApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaDrugInfoModelImpl</code>.
	 * </p>
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @param start the lower bound of the range of pharma drug infos
	 * @param end the upper bound of the range of pharma drug infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching pharma drug infos
	 */
	public static List<PharmaDrugInfo> findBygetPA_DI_PAI(
		long pharmaApplicationId, int start, int end,
		OrderByComparator<PharmaDrugInfo> orderByComparator) {

		return getPersistence().findBygetPA_DI_PAI(
			pharmaApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the pharma drug infos where pharmaApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaDrugInfoModelImpl</code>.
	 * </p>
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @param start the lower bound of the range of pharma drug infos
	 * @param end the upper bound of the range of pharma drug infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching pharma drug infos
	 */
	public static List<PharmaDrugInfo> findBygetPA_DI_PAI(
		long pharmaApplicationId, int start, int end,
		OrderByComparator<PharmaDrugInfo> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetPA_DI_PAI(
			pharmaApplicationId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first pharma drug info in the ordered set where pharmaApplicationId = &#63;.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pharma drug info
	 * @throws NoSuchPharmaDrugInfoException if a matching pharma drug info could not be found
	 */
	public static PharmaDrugInfo findBygetPA_DI_PAI_First(
			long pharmaApplicationId,
			OrderByComparator<PharmaDrugInfo> orderByComparator)
		throws com.nbp.pharmaceutical.application.form.service.exception.
			NoSuchPharmaDrugInfoException {

		return getPersistence().findBygetPA_DI_PAI_First(
			pharmaApplicationId, orderByComparator);
	}

	/**
	 * Returns the first pharma drug info in the ordered set where pharmaApplicationId = &#63;.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pharma drug info, or <code>null</code> if a matching pharma drug info could not be found
	 */
	public static PharmaDrugInfo fetchBygetPA_DI_PAI_First(
		long pharmaApplicationId,
		OrderByComparator<PharmaDrugInfo> orderByComparator) {

		return getPersistence().fetchBygetPA_DI_PAI_First(
			pharmaApplicationId, orderByComparator);
	}

	/**
	 * Returns the last pharma drug info in the ordered set where pharmaApplicationId = &#63;.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pharma drug info
	 * @throws NoSuchPharmaDrugInfoException if a matching pharma drug info could not be found
	 */
	public static PharmaDrugInfo findBygetPA_DI_PAI_Last(
			long pharmaApplicationId,
			OrderByComparator<PharmaDrugInfo> orderByComparator)
		throws com.nbp.pharmaceutical.application.form.service.exception.
			NoSuchPharmaDrugInfoException {

		return getPersistence().findBygetPA_DI_PAI_Last(
			pharmaApplicationId, orderByComparator);
	}

	/**
	 * Returns the last pharma drug info in the ordered set where pharmaApplicationId = &#63;.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pharma drug info, or <code>null</code> if a matching pharma drug info could not be found
	 */
	public static PharmaDrugInfo fetchBygetPA_DI_PAI_Last(
		long pharmaApplicationId,
		OrderByComparator<PharmaDrugInfo> orderByComparator) {

		return getPersistence().fetchBygetPA_DI_PAI_Last(
			pharmaApplicationId, orderByComparator);
	}

	/**
	 * Returns the pharma drug infos before and after the current pharma drug info in the ordered set where pharmaApplicationId = &#63;.
	 *
	 * @param pharmaDrugInfoId the primary key of the current pharma drug info
	 * @param pharmaApplicationId the pharma application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next pharma drug info
	 * @throws NoSuchPharmaDrugInfoException if a pharma drug info with the primary key could not be found
	 */
	public static PharmaDrugInfo[] findBygetPA_DI_PAI_PrevAndNext(
			long pharmaDrugInfoId, long pharmaApplicationId,
			OrderByComparator<PharmaDrugInfo> orderByComparator)
		throws com.nbp.pharmaceutical.application.form.service.exception.
			NoSuchPharmaDrugInfoException {

		return getPersistence().findBygetPA_DI_PAI_PrevAndNext(
			pharmaDrugInfoId, pharmaApplicationId, orderByComparator);
	}

	/**
	 * Removes all the pharma drug infos where pharmaApplicationId = &#63; from the database.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 */
	public static void removeBygetPA_DI_PAI(long pharmaApplicationId) {
		getPersistence().removeBygetPA_DI_PAI(pharmaApplicationId);
	}

	/**
	 * Returns the number of pharma drug infos where pharmaApplicationId = &#63;.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the number of matching pharma drug infos
	 */
	public static int countBygetPA_DI_PAI(long pharmaApplicationId) {
		return getPersistence().countBygetPA_DI_PAI(pharmaApplicationId);
	}

	/**
	 * Caches the pharma drug info in the entity cache if it is enabled.
	 *
	 * @param pharmaDrugInfo the pharma drug info
	 */
	public static void cacheResult(PharmaDrugInfo pharmaDrugInfo) {
		getPersistence().cacheResult(pharmaDrugInfo);
	}

	/**
	 * Caches the pharma drug infos in the entity cache if it is enabled.
	 *
	 * @param pharmaDrugInfos the pharma drug infos
	 */
	public static void cacheResult(List<PharmaDrugInfo> pharmaDrugInfos) {
		getPersistence().cacheResult(pharmaDrugInfos);
	}

	/**
	 * Creates a new pharma drug info with the primary key. Does not add the pharma drug info to the database.
	 *
	 * @param pharmaDrugInfoId the primary key for the new pharma drug info
	 * @return the new pharma drug info
	 */
	public static PharmaDrugInfo create(long pharmaDrugInfoId) {
		return getPersistence().create(pharmaDrugInfoId);
	}

	/**
	 * Removes the pharma drug info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param pharmaDrugInfoId the primary key of the pharma drug info
	 * @return the pharma drug info that was removed
	 * @throws NoSuchPharmaDrugInfoException if a pharma drug info with the primary key could not be found
	 */
	public static PharmaDrugInfo remove(long pharmaDrugInfoId)
		throws com.nbp.pharmaceutical.application.form.service.exception.
			NoSuchPharmaDrugInfoException {

		return getPersistence().remove(pharmaDrugInfoId);
	}

	public static PharmaDrugInfo updateImpl(PharmaDrugInfo pharmaDrugInfo) {
		return getPersistence().updateImpl(pharmaDrugInfo);
	}

	/**
	 * Returns the pharma drug info with the primary key or throws a <code>NoSuchPharmaDrugInfoException</code> if it could not be found.
	 *
	 * @param pharmaDrugInfoId the primary key of the pharma drug info
	 * @return the pharma drug info
	 * @throws NoSuchPharmaDrugInfoException if a pharma drug info with the primary key could not be found
	 */
	public static PharmaDrugInfo findByPrimaryKey(long pharmaDrugInfoId)
		throws com.nbp.pharmaceutical.application.form.service.exception.
			NoSuchPharmaDrugInfoException {

		return getPersistence().findByPrimaryKey(pharmaDrugInfoId);
	}

	/**
	 * Returns the pharma drug info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param pharmaDrugInfoId the primary key of the pharma drug info
	 * @return the pharma drug info, or <code>null</code> if a pharma drug info with the primary key could not be found
	 */
	public static PharmaDrugInfo fetchByPrimaryKey(long pharmaDrugInfoId) {
		return getPersistence().fetchByPrimaryKey(pharmaDrugInfoId);
	}

	/**
	 * Returns all the pharma drug infos.
	 *
	 * @return the pharma drug infos
	 */
	public static List<PharmaDrugInfo> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the pharma drug infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaDrugInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma drug infos
	 * @param end the upper bound of the range of pharma drug infos (not inclusive)
	 * @return the range of pharma drug infos
	 */
	public static List<PharmaDrugInfo> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the pharma drug infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaDrugInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma drug infos
	 * @param end the upper bound of the range of pharma drug infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of pharma drug infos
	 */
	public static List<PharmaDrugInfo> findAll(
		int start, int end,
		OrderByComparator<PharmaDrugInfo> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the pharma drug infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaDrugInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma drug infos
	 * @param end the upper bound of the range of pharma drug infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of pharma drug infos
	 */
	public static List<PharmaDrugInfo> findAll(
		int start, int end, OrderByComparator<PharmaDrugInfo> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the pharma drug infos from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of pharma drug infos.
	 *
	 * @return the number of pharma drug infos
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static PharmaDrugInfoPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(PharmaDrugInfoPersistence persistence) {
		_persistence = persistence;
	}

	private static volatile PharmaDrugInfoPersistence _persistence;

}