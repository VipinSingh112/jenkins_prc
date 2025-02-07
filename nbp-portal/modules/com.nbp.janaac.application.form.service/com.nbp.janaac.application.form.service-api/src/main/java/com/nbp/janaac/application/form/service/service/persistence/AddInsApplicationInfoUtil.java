/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.janaac.application.form.service.model.AddInsApplicationInfo;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the add ins application info service. This utility wraps <code>com.nbp.janaac.application.form.service.service.persistence.impl.AddInsApplicationInfoPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AddInsApplicationInfoPersistence
 * @generated
 */
public class AddInsApplicationInfoUtil {

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
	public static void clearCache(AddInsApplicationInfo addInsApplicationInfo) {
		getPersistence().clearCache(addInsApplicationInfo);
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
	public static Map<Serializable, AddInsApplicationInfo> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AddInsApplicationInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AddInsApplicationInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AddInsApplicationInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AddInsApplicationInfo> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AddInsApplicationInfo update(
		AddInsApplicationInfo addInsApplicationInfo) {

		return getPersistence().update(addInsApplicationInfo);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AddInsApplicationInfo update(
		AddInsApplicationInfo addInsApplicationInfo,
		ServiceContext serviceContext) {

		return getPersistence().update(addInsApplicationInfo, serviceContext);
	}

	/**
	 * Returns all the add ins application infos where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching add ins application infos
	 */
	public static List<AddInsApplicationInfo> findBygetJanaacById(
		long janaacApplicationId) {

		return getPersistence().findBygetJanaacById(janaacApplicationId);
	}

	/**
	 * Returns a range of all the add ins application infos where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddInsApplicationInfoModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add ins application infos
	 * @param end the upper bound of the range of add ins application infos (not inclusive)
	 * @return the range of matching add ins application infos
	 */
	public static List<AddInsApplicationInfo> findBygetJanaacById(
		long janaacApplicationId, int start, int end) {

		return getPersistence().findBygetJanaacById(
			janaacApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the add ins application infos where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddInsApplicationInfoModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add ins application infos
	 * @param end the upper bound of the range of add ins application infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching add ins application infos
	 */
	public static List<AddInsApplicationInfo> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		OrderByComparator<AddInsApplicationInfo> orderByComparator) {

		return getPersistence().findBygetJanaacById(
			janaacApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the add ins application infos where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddInsApplicationInfoModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add ins application infos
	 * @param end the upper bound of the range of add ins application infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching add ins application infos
	 */
	public static List<AddInsApplicationInfo> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		OrderByComparator<AddInsApplicationInfo> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetJanaacById(
			janaacApplicationId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first add ins application info in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add ins application info
	 * @throws NoSuchAddInsApplicationInfoException if a matching add ins application info could not be found
	 */
	public static AddInsApplicationInfo findBygetJanaacById_First(
			long janaacApplicationId,
			OrderByComparator<AddInsApplicationInfo> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddInsApplicationInfoException {

		return getPersistence().findBygetJanaacById_First(
			janaacApplicationId, orderByComparator);
	}

	/**
	 * Returns the first add ins application info in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add ins application info, or <code>null</code> if a matching add ins application info could not be found
	 */
	public static AddInsApplicationInfo fetchBygetJanaacById_First(
		long janaacApplicationId,
		OrderByComparator<AddInsApplicationInfo> orderByComparator) {

		return getPersistence().fetchBygetJanaacById_First(
			janaacApplicationId, orderByComparator);
	}

	/**
	 * Returns the last add ins application info in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add ins application info
	 * @throws NoSuchAddInsApplicationInfoException if a matching add ins application info could not be found
	 */
	public static AddInsApplicationInfo findBygetJanaacById_Last(
			long janaacApplicationId,
			OrderByComparator<AddInsApplicationInfo> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddInsApplicationInfoException {

		return getPersistence().findBygetJanaacById_Last(
			janaacApplicationId, orderByComparator);
	}

	/**
	 * Returns the last add ins application info in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add ins application info, or <code>null</code> if a matching add ins application info could not be found
	 */
	public static AddInsApplicationInfo fetchBygetJanaacById_Last(
		long janaacApplicationId,
		OrderByComparator<AddInsApplicationInfo> orderByComparator) {

		return getPersistence().fetchBygetJanaacById_Last(
			janaacApplicationId, orderByComparator);
	}

	/**
	 * Returns the add ins application infos before and after the current add ins application info in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param addInsApplicationInfoId the primary key of the current add ins application info
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next add ins application info
	 * @throws NoSuchAddInsApplicationInfoException if a add ins application info with the primary key could not be found
	 */
	public static AddInsApplicationInfo[] findBygetJanaacById_PrevAndNext(
			long addInsApplicationInfoId, long janaacApplicationId,
			OrderByComparator<AddInsApplicationInfo> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddInsApplicationInfoException {

		return getPersistence().findBygetJanaacById_PrevAndNext(
			addInsApplicationInfoId, janaacApplicationId, orderByComparator);
	}

	/**
	 * Removes all the add ins application infos where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 */
	public static void removeBygetJanaacById(long janaacApplicationId) {
		getPersistence().removeBygetJanaacById(janaacApplicationId);
	}

	/**
	 * Returns the number of add ins application infos where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching add ins application infos
	 */
	public static int countBygetJanaacById(long janaacApplicationId) {
		return getPersistence().countBygetJanaacById(janaacApplicationId);
	}

	/**
	 * Caches the add ins application info in the entity cache if it is enabled.
	 *
	 * @param addInsApplicationInfo the add ins application info
	 */
	public static void cacheResult(
		AddInsApplicationInfo addInsApplicationInfo) {

		getPersistence().cacheResult(addInsApplicationInfo);
	}

	/**
	 * Caches the add ins application infos in the entity cache if it is enabled.
	 *
	 * @param addInsApplicationInfos the add ins application infos
	 */
	public static void cacheResult(
		List<AddInsApplicationInfo> addInsApplicationInfos) {

		getPersistence().cacheResult(addInsApplicationInfos);
	}

	/**
	 * Creates a new add ins application info with the primary key. Does not add the add ins application info to the database.
	 *
	 * @param addInsApplicationInfoId the primary key for the new add ins application info
	 * @return the new add ins application info
	 */
	public static AddInsApplicationInfo create(long addInsApplicationInfoId) {
		return getPersistence().create(addInsApplicationInfoId);
	}

	/**
	 * Removes the add ins application info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param addInsApplicationInfoId the primary key of the add ins application info
	 * @return the add ins application info that was removed
	 * @throws NoSuchAddInsApplicationInfoException if a add ins application info with the primary key could not be found
	 */
	public static AddInsApplicationInfo remove(long addInsApplicationInfoId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddInsApplicationInfoException {

		return getPersistence().remove(addInsApplicationInfoId);
	}

	public static AddInsApplicationInfo updateImpl(
		AddInsApplicationInfo addInsApplicationInfo) {

		return getPersistence().updateImpl(addInsApplicationInfo);
	}

	/**
	 * Returns the add ins application info with the primary key or throws a <code>NoSuchAddInsApplicationInfoException</code> if it could not be found.
	 *
	 * @param addInsApplicationInfoId the primary key of the add ins application info
	 * @return the add ins application info
	 * @throws NoSuchAddInsApplicationInfoException if a add ins application info with the primary key could not be found
	 */
	public static AddInsApplicationInfo findByPrimaryKey(
			long addInsApplicationInfoId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddInsApplicationInfoException {

		return getPersistence().findByPrimaryKey(addInsApplicationInfoId);
	}

	/**
	 * Returns the add ins application info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param addInsApplicationInfoId the primary key of the add ins application info
	 * @return the add ins application info, or <code>null</code> if a add ins application info with the primary key could not be found
	 */
	public static AddInsApplicationInfo fetchByPrimaryKey(
		long addInsApplicationInfoId) {

		return getPersistence().fetchByPrimaryKey(addInsApplicationInfoId);
	}

	/**
	 * Returns all the add ins application infos.
	 *
	 * @return the add ins application infos
	 */
	public static List<AddInsApplicationInfo> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the add ins application infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddInsApplicationInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add ins application infos
	 * @param end the upper bound of the range of add ins application infos (not inclusive)
	 * @return the range of add ins application infos
	 */
	public static List<AddInsApplicationInfo> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the add ins application infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddInsApplicationInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add ins application infos
	 * @param end the upper bound of the range of add ins application infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of add ins application infos
	 */
	public static List<AddInsApplicationInfo> findAll(
		int start, int end,
		OrderByComparator<AddInsApplicationInfo> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the add ins application infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddInsApplicationInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add ins application infos
	 * @param end the upper bound of the range of add ins application infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of add ins application infos
	 */
	public static List<AddInsApplicationInfo> findAll(
		int start, int end,
		OrderByComparator<AddInsApplicationInfo> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the add ins application infos from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of add ins application infos.
	 *
	 * @return the number of add ins application infos
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AddInsApplicationInfoPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		AddInsApplicationInfoPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile AddInsApplicationInfoPersistence _persistence;

}