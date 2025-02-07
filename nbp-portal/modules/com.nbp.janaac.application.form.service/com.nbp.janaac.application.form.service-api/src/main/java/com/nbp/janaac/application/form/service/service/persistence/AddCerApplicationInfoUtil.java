/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.janaac.application.form.service.model.AddCerApplicationInfo;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the add cer application info service. This utility wraps <code>com.nbp.janaac.application.form.service.service.persistence.impl.AddCerApplicationInfoPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AddCerApplicationInfoPersistence
 * @generated
 */
public class AddCerApplicationInfoUtil {

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
	public static void clearCache(AddCerApplicationInfo addCerApplicationInfo) {
		getPersistence().clearCache(addCerApplicationInfo);
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
	public static Map<Serializable, AddCerApplicationInfo> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AddCerApplicationInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AddCerApplicationInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AddCerApplicationInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AddCerApplicationInfo> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AddCerApplicationInfo update(
		AddCerApplicationInfo addCerApplicationInfo) {

		return getPersistence().update(addCerApplicationInfo);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AddCerApplicationInfo update(
		AddCerApplicationInfo addCerApplicationInfo,
		ServiceContext serviceContext) {

		return getPersistence().update(addCerApplicationInfo, serviceContext);
	}

	/**
	 * Returns all the add cer application infos where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching add cer application infos
	 */
	public static List<AddCerApplicationInfo> findBygetJanaacById(
		long janaacApplicationId) {

		return getPersistence().findBygetJanaacById(janaacApplicationId);
	}

	/**
	 * Returns a range of all the add cer application infos where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddCerApplicationInfoModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add cer application infos
	 * @param end the upper bound of the range of add cer application infos (not inclusive)
	 * @return the range of matching add cer application infos
	 */
	public static List<AddCerApplicationInfo> findBygetJanaacById(
		long janaacApplicationId, int start, int end) {

		return getPersistence().findBygetJanaacById(
			janaacApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the add cer application infos where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddCerApplicationInfoModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add cer application infos
	 * @param end the upper bound of the range of add cer application infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching add cer application infos
	 */
	public static List<AddCerApplicationInfo> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		OrderByComparator<AddCerApplicationInfo> orderByComparator) {

		return getPersistence().findBygetJanaacById(
			janaacApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the add cer application infos where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddCerApplicationInfoModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add cer application infos
	 * @param end the upper bound of the range of add cer application infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching add cer application infos
	 */
	public static List<AddCerApplicationInfo> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		OrderByComparator<AddCerApplicationInfo> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetJanaacById(
			janaacApplicationId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first add cer application info in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add cer application info
	 * @throws NoSuchAddCerApplicationInfoException if a matching add cer application info could not be found
	 */
	public static AddCerApplicationInfo findBygetJanaacById_First(
			long janaacApplicationId,
			OrderByComparator<AddCerApplicationInfo> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddCerApplicationInfoException {

		return getPersistence().findBygetJanaacById_First(
			janaacApplicationId, orderByComparator);
	}

	/**
	 * Returns the first add cer application info in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add cer application info, or <code>null</code> if a matching add cer application info could not be found
	 */
	public static AddCerApplicationInfo fetchBygetJanaacById_First(
		long janaacApplicationId,
		OrderByComparator<AddCerApplicationInfo> orderByComparator) {

		return getPersistence().fetchBygetJanaacById_First(
			janaacApplicationId, orderByComparator);
	}

	/**
	 * Returns the last add cer application info in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add cer application info
	 * @throws NoSuchAddCerApplicationInfoException if a matching add cer application info could not be found
	 */
	public static AddCerApplicationInfo findBygetJanaacById_Last(
			long janaacApplicationId,
			OrderByComparator<AddCerApplicationInfo> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddCerApplicationInfoException {

		return getPersistence().findBygetJanaacById_Last(
			janaacApplicationId, orderByComparator);
	}

	/**
	 * Returns the last add cer application info in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add cer application info, or <code>null</code> if a matching add cer application info could not be found
	 */
	public static AddCerApplicationInfo fetchBygetJanaacById_Last(
		long janaacApplicationId,
		OrderByComparator<AddCerApplicationInfo> orderByComparator) {

		return getPersistence().fetchBygetJanaacById_Last(
			janaacApplicationId, orderByComparator);
	}

	/**
	 * Returns the add cer application infos before and after the current add cer application info in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param addCerApplicationInfoId the primary key of the current add cer application info
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next add cer application info
	 * @throws NoSuchAddCerApplicationInfoException if a add cer application info with the primary key could not be found
	 */
	public static AddCerApplicationInfo[] findBygetJanaacById_PrevAndNext(
			long addCerApplicationInfoId, long janaacApplicationId,
			OrderByComparator<AddCerApplicationInfo> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddCerApplicationInfoException {

		return getPersistence().findBygetJanaacById_PrevAndNext(
			addCerApplicationInfoId, janaacApplicationId, orderByComparator);
	}

	/**
	 * Removes all the add cer application infos where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 */
	public static void removeBygetJanaacById(long janaacApplicationId) {
		getPersistence().removeBygetJanaacById(janaacApplicationId);
	}

	/**
	 * Returns the number of add cer application infos where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching add cer application infos
	 */
	public static int countBygetJanaacById(long janaacApplicationId) {
		return getPersistence().countBygetJanaacById(janaacApplicationId);
	}

	/**
	 * Caches the add cer application info in the entity cache if it is enabled.
	 *
	 * @param addCerApplicationInfo the add cer application info
	 */
	public static void cacheResult(
		AddCerApplicationInfo addCerApplicationInfo) {

		getPersistence().cacheResult(addCerApplicationInfo);
	}

	/**
	 * Caches the add cer application infos in the entity cache if it is enabled.
	 *
	 * @param addCerApplicationInfos the add cer application infos
	 */
	public static void cacheResult(
		List<AddCerApplicationInfo> addCerApplicationInfos) {

		getPersistence().cacheResult(addCerApplicationInfos);
	}

	/**
	 * Creates a new add cer application info with the primary key. Does not add the add cer application info to the database.
	 *
	 * @param addCerApplicationInfoId the primary key for the new add cer application info
	 * @return the new add cer application info
	 */
	public static AddCerApplicationInfo create(long addCerApplicationInfoId) {
		return getPersistence().create(addCerApplicationInfoId);
	}

	/**
	 * Removes the add cer application info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param addCerApplicationInfoId the primary key of the add cer application info
	 * @return the add cer application info that was removed
	 * @throws NoSuchAddCerApplicationInfoException if a add cer application info with the primary key could not be found
	 */
	public static AddCerApplicationInfo remove(long addCerApplicationInfoId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddCerApplicationInfoException {

		return getPersistence().remove(addCerApplicationInfoId);
	}

	public static AddCerApplicationInfo updateImpl(
		AddCerApplicationInfo addCerApplicationInfo) {

		return getPersistence().updateImpl(addCerApplicationInfo);
	}

	/**
	 * Returns the add cer application info with the primary key or throws a <code>NoSuchAddCerApplicationInfoException</code> if it could not be found.
	 *
	 * @param addCerApplicationInfoId the primary key of the add cer application info
	 * @return the add cer application info
	 * @throws NoSuchAddCerApplicationInfoException if a add cer application info with the primary key could not be found
	 */
	public static AddCerApplicationInfo findByPrimaryKey(
			long addCerApplicationInfoId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddCerApplicationInfoException {

		return getPersistence().findByPrimaryKey(addCerApplicationInfoId);
	}

	/**
	 * Returns the add cer application info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param addCerApplicationInfoId the primary key of the add cer application info
	 * @return the add cer application info, or <code>null</code> if a add cer application info with the primary key could not be found
	 */
	public static AddCerApplicationInfo fetchByPrimaryKey(
		long addCerApplicationInfoId) {

		return getPersistence().fetchByPrimaryKey(addCerApplicationInfoId);
	}

	/**
	 * Returns all the add cer application infos.
	 *
	 * @return the add cer application infos
	 */
	public static List<AddCerApplicationInfo> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the add cer application infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddCerApplicationInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add cer application infos
	 * @param end the upper bound of the range of add cer application infos (not inclusive)
	 * @return the range of add cer application infos
	 */
	public static List<AddCerApplicationInfo> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the add cer application infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddCerApplicationInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add cer application infos
	 * @param end the upper bound of the range of add cer application infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of add cer application infos
	 */
	public static List<AddCerApplicationInfo> findAll(
		int start, int end,
		OrderByComparator<AddCerApplicationInfo> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the add cer application infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddCerApplicationInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add cer application infos
	 * @param end the upper bound of the range of add cer application infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of add cer application infos
	 */
	public static List<AddCerApplicationInfo> findAll(
		int start, int end,
		OrderByComparator<AddCerApplicationInfo> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the add cer application infos from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of add cer application infos.
	 *
	 * @return the number of add cer application infos
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AddCerApplicationInfoPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		AddCerApplicationInfoPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile AddCerApplicationInfoPersistence _persistence;

}