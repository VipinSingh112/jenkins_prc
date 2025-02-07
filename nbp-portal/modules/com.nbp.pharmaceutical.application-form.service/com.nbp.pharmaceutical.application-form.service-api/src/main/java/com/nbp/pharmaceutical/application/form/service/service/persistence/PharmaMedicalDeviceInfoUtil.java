/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.pharmaceutical.application.form.service.model.PharmaMedicalDeviceInfo;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the pharma medical device info service. This utility wraps <code>com.nbp.pharmaceutical.application.form.service.service.persistence.impl.PharmaMedicalDeviceInfoPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PharmaMedicalDeviceInfoPersistence
 * @generated
 */
public class PharmaMedicalDeviceInfoUtil {

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
		PharmaMedicalDeviceInfo pharmaMedicalDeviceInfo) {

		getPersistence().clearCache(pharmaMedicalDeviceInfo);
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
	public static Map<Serializable, PharmaMedicalDeviceInfo> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<PharmaMedicalDeviceInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<PharmaMedicalDeviceInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<PharmaMedicalDeviceInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<PharmaMedicalDeviceInfo> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static PharmaMedicalDeviceInfo update(
		PharmaMedicalDeviceInfo pharmaMedicalDeviceInfo) {

		return getPersistence().update(pharmaMedicalDeviceInfo);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static PharmaMedicalDeviceInfo update(
		PharmaMedicalDeviceInfo pharmaMedicalDeviceInfo,
		ServiceContext serviceContext) {

		return getPersistence().update(pharmaMedicalDeviceInfo, serviceContext);
	}

	/**
	 * Returns the pharma medical device info where pharmaApplicationId = &#63; or throws a <code>NoSuchPharmaMedicalDeviceInfoException</code> if it could not be found.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the matching pharma medical device info
	 * @throws NoSuchPharmaMedicalDeviceInfoException if a matching pharma medical device info could not be found
	 */
	public static PharmaMedicalDeviceInfo findBygetPharmaByAppId(
			long pharmaApplicationId)
		throws com.nbp.pharmaceutical.application.form.service.exception.
			NoSuchPharmaMedicalDeviceInfoException {

		return getPersistence().findBygetPharmaByAppId(pharmaApplicationId);
	}

	/**
	 * Returns the pharma medical device info where pharmaApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the matching pharma medical device info, or <code>null</code> if a matching pharma medical device info could not be found
	 */
	public static PharmaMedicalDeviceInfo fetchBygetPharmaByAppId(
		long pharmaApplicationId) {

		return getPersistence().fetchBygetPharmaByAppId(pharmaApplicationId);
	}

	/**
	 * Returns the pharma medical device info where pharmaApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching pharma medical device info, or <code>null</code> if a matching pharma medical device info could not be found
	 */
	public static PharmaMedicalDeviceInfo fetchBygetPharmaByAppId(
		long pharmaApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetPharmaByAppId(
			pharmaApplicationId, useFinderCache);
	}

	/**
	 * Removes the pharma medical device info where pharmaApplicationId = &#63; from the database.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the pharma medical device info that was removed
	 */
	public static PharmaMedicalDeviceInfo removeBygetPharmaByAppId(
			long pharmaApplicationId)
		throws com.nbp.pharmaceutical.application.form.service.exception.
			NoSuchPharmaMedicalDeviceInfoException {

		return getPersistence().removeBygetPharmaByAppId(pharmaApplicationId);
	}

	/**
	 * Returns the number of pharma medical device infos where pharmaApplicationId = &#63;.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the number of matching pharma medical device infos
	 */
	public static int countBygetPharmaByAppId(long pharmaApplicationId) {
		return getPersistence().countBygetPharmaByAppId(pharmaApplicationId);
	}

	/**
	 * Returns all the pharma medical device infos where pharmaApplicationId = &#63;.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the matching pharma medical device infos
	 */
	public static List<PharmaMedicalDeviceInfo> findBygetPA_MD_PAI(
		long pharmaApplicationId) {

		return getPersistence().findBygetPA_MD_PAI(pharmaApplicationId);
	}

	/**
	 * Returns a range of all the pharma medical device infos where pharmaApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaMedicalDeviceInfoModelImpl</code>.
	 * </p>
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @param start the lower bound of the range of pharma medical device infos
	 * @param end the upper bound of the range of pharma medical device infos (not inclusive)
	 * @return the range of matching pharma medical device infos
	 */
	public static List<PharmaMedicalDeviceInfo> findBygetPA_MD_PAI(
		long pharmaApplicationId, int start, int end) {

		return getPersistence().findBygetPA_MD_PAI(
			pharmaApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the pharma medical device infos where pharmaApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaMedicalDeviceInfoModelImpl</code>.
	 * </p>
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @param start the lower bound of the range of pharma medical device infos
	 * @param end the upper bound of the range of pharma medical device infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching pharma medical device infos
	 */
	public static List<PharmaMedicalDeviceInfo> findBygetPA_MD_PAI(
		long pharmaApplicationId, int start, int end,
		OrderByComparator<PharmaMedicalDeviceInfo> orderByComparator) {

		return getPersistence().findBygetPA_MD_PAI(
			pharmaApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the pharma medical device infos where pharmaApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaMedicalDeviceInfoModelImpl</code>.
	 * </p>
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @param start the lower bound of the range of pharma medical device infos
	 * @param end the upper bound of the range of pharma medical device infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching pharma medical device infos
	 */
	public static List<PharmaMedicalDeviceInfo> findBygetPA_MD_PAI(
		long pharmaApplicationId, int start, int end,
		OrderByComparator<PharmaMedicalDeviceInfo> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetPA_MD_PAI(
			pharmaApplicationId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first pharma medical device info in the ordered set where pharmaApplicationId = &#63;.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pharma medical device info
	 * @throws NoSuchPharmaMedicalDeviceInfoException if a matching pharma medical device info could not be found
	 */
	public static PharmaMedicalDeviceInfo findBygetPA_MD_PAI_First(
			long pharmaApplicationId,
			OrderByComparator<PharmaMedicalDeviceInfo> orderByComparator)
		throws com.nbp.pharmaceutical.application.form.service.exception.
			NoSuchPharmaMedicalDeviceInfoException {

		return getPersistence().findBygetPA_MD_PAI_First(
			pharmaApplicationId, orderByComparator);
	}

	/**
	 * Returns the first pharma medical device info in the ordered set where pharmaApplicationId = &#63;.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pharma medical device info, or <code>null</code> if a matching pharma medical device info could not be found
	 */
	public static PharmaMedicalDeviceInfo fetchBygetPA_MD_PAI_First(
		long pharmaApplicationId,
		OrderByComparator<PharmaMedicalDeviceInfo> orderByComparator) {

		return getPersistence().fetchBygetPA_MD_PAI_First(
			pharmaApplicationId, orderByComparator);
	}

	/**
	 * Returns the last pharma medical device info in the ordered set where pharmaApplicationId = &#63;.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pharma medical device info
	 * @throws NoSuchPharmaMedicalDeviceInfoException if a matching pharma medical device info could not be found
	 */
	public static PharmaMedicalDeviceInfo findBygetPA_MD_PAI_Last(
			long pharmaApplicationId,
			OrderByComparator<PharmaMedicalDeviceInfo> orderByComparator)
		throws com.nbp.pharmaceutical.application.form.service.exception.
			NoSuchPharmaMedicalDeviceInfoException {

		return getPersistence().findBygetPA_MD_PAI_Last(
			pharmaApplicationId, orderByComparator);
	}

	/**
	 * Returns the last pharma medical device info in the ordered set where pharmaApplicationId = &#63;.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pharma medical device info, or <code>null</code> if a matching pharma medical device info could not be found
	 */
	public static PharmaMedicalDeviceInfo fetchBygetPA_MD_PAI_Last(
		long pharmaApplicationId,
		OrderByComparator<PharmaMedicalDeviceInfo> orderByComparator) {

		return getPersistence().fetchBygetPA_MD_PAI_Last(
			pharmaApplicationId, orderByComparator);
	}

	/**
	 * Returns the pharma medical device infos before and after the current pharma medical device info in the ordered set where pharmaApplicationId = &#63;.
	 *
	 * @param pharmaMedicalDeviceId the primary key of the current pharma medical device info
	 * @param pharmaApplicationId the pharma application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next pharma medical device info
	 * @throws NoSuchPharmaMedicalDeviceInfoException if a pharma medical device info with the primary key could not be found
	 */
	public static PharmaMedicalDeviceInfo[] findBygetPA_MD_PAI_PrevAndNext(
			long pharmaMedicalDeviceId, long pharmaApplicationId,
			OrderByComparator<PharmaMedicalDeviceInfo> orderByComparator)
		throws com.nbp.pharmaceutical.application.form.service.exception.
			NoSuchPharmaMedicalDeviceInfoException {

		return getPersistence().findBygetPA_MD_PAI_PrevAndNext(
			pharmaMedicalDeviceId, pharmaApplicationId, orderByComparator);
	}

	/**
	 * Removes all the pharma medical device infos where pharmaApplicationId = &#63; from the database.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 */
	public static void removeBygetPA_MD_PAI(long pharmaApplicationId) {
		getPersistence().removeBygetPA_MD_PAI(pharmaApplicationId);
	}

	/**
	 * Returns the number of pharma medical device infos where pharmaApplicationId = &#63;.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the number of matching pharma medical device infos
	 */
	public static int countBygetPA_MD_PAI(long pharmaApplicationId) {
		return getPersistence().countBygetPA_MD_PAI(pharmaApplicationId);
	}

	/**
	 * Caches the pharma medical device info in the entity cache if it is enabled.
	 *
	 * @param pharmaMedicalDeviceInfo the pharma medical device info
	 */
	public static void cacheResult(
		PharmaMedicalDeviceInfo pharmaMedicalDeviceInfo) {

		getPersistence().cacheResult(pharmaMedicalDeviceInfo);
	}

	/**
	 * Caches the pharma medical device infos in the entity cache if it is enabled.
	 *
	 * @param pharmaMedicalDeviceInfos the pharma medical device infos
	 */
	public static void cacheResult(
		List<PharmaMedicalDeviceInfo> pharmaMedicalDeviceInfos) {

		getPersistence().cacheResult(pharmaMedicalDeviceInfos);
	}

	/**
	 * Creates a new pharma medical device info with the primary key. Does not add the pharma medical device info to the database.
	 *
	 * @param pharmaMedicalDeviceId the primary key for the new pharma medical device info
	 * @return the new pharma medical device info
	 */
	public static PharmaMedicalDeviceInfo create(long pharmaMedicalDeviceId) {
		return getPersistence().create(pharmaMedicalDeviceId);
	}

	/**
	 * Removes the pharma medical device info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param pharmaMedicalDeviceId the primary key of the pharma medical device info
	 * @return the pharma medical device info that was removed
	 * @throws NoSuchPharmaMedicalDeviceInfoException if a pharma medical device info with the primary key could not be found
	 */
	public static PharmaMedicalDeviceInfo remove(long pharmaMedicalDeviceId)
		throws com.nbp.pharmaceutical.application.form.service.exception.
			NoSuchPharmaMedicalDeviceInfoException {

		return getPersistence().remove(pharmaMedicalDeviceId);
	}

	public static PharmaMedicalDeviceInfo updateImpl(
		PharmaMedicalDeviceInfo pharmaMedicalDeviceInfo) {

		return getPersistence().updateImpl(pharmaMedicalDeviceInfo);
	}

	/**
	 * Returns the pharma medical device info with the primary key or throws a <code>NoSuchPharmaMedicalDeviceInfoException</code> if it could not be found.
	 *
	 * @param pharmaMedicalDeviceId the primary key of the pharma medical device info
	 * @return the pharma medical device info
	 * @throws NoSuchPharmaMedicalDeviceInfoException if a pharma medical device info with the primary key could not be found
	 */
	public static PharmaMedicalDeviceInfo findByPrimaryKey(
			long pharmaMedicalDeviceId)
		throws com.nbp.pharmaceutical.application.form.service.exception.
			NoSuchPharmaMedicalDeviceInfoException {

		return getPersistence().findByPrimaryKey(pharmaMedicalDeviceId);
	}

	/**
	 * Returns the pharma medical device info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param pharmaMedicalDeviceId the primary key of the pharma medical device info
	 * @return the pharma medical device info, or <code>null</code> if a pharma medical device info with the primary key could not be found
	 */
	public static PharmaMedicalDeviceInfo fetchByPrimaryKey(
		long pharmaMedicalDeviceId) {

		return getPersistence().fetchByPrimaryKey(pharmaMedicalDeviceId);
	}

	/**
	 * Returns all the pharma medical device infos.
	 *
	 * @return the pharma medical device infos
	 */
	public static List<PharmaMedicalDeviceInfo> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the pharma medical device infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaMedicalDeviceInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma medical device infos
	 * @param end the upper bound of the range of pharma medical device infos (not inclusive)
	 * @return the range of pharma medical device infos
	 */
	public static List<PharmaMedicalDeviceInfo> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the pharma medical device infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaMedicalDeviceInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma medical device infos
	 * @param end the upper bound of the range of pharma medical device infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of pharma medical device infos
	 */
	public static List<PharmaMedicalDeviceInfo> findAll(
		int start, int end,
		OrderByComparator<PharmaMedicalDeviceInfo> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the pharma medical device infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaMedicalDeviceInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma medical device infos
	 * @param end the upper bound of the range of pharma medical device infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of pharma medical device infos
	 */
	public static List<PharmaMedicalDeviceInfo> findAll(
		int start, int end,
		OrderByComparator<PharmaMedicalDeviceInfo> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the pharma medical device infos from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of pharma medical device infos.
	 *
	 * @return the number of pharma medical device infos
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static PharmaMedicalDeviceInfoPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		PharmaMedicalDeviceInfoPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile PharmaMedicalDeviceInfoPersistence _persistence;

}