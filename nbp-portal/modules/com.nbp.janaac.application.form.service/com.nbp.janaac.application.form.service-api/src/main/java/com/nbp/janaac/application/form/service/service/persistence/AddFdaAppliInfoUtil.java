/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.janaac.application.form.service.model.AddFdaAppliInfo;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the add fda appli info service. This utility wraps <code>com.nbp.janaac.application.form.service.service.persistence.impl.AddFdaAppliInfoPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AddFdaAppliInfoPersistence
 * @generated
 */
public class AddFdaAppliInfoUtil {

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
	public static void clearCache(AddFdaAppliInfo addFdaAppliInfo) {
		getPersistence().clearCache(addFdaAppliInfo);
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
	public static Map<Serializable, AddFdaAppliInfo> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AddFdaAppliInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AddFdaAppliInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AddFdaAppliInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AddFdaAppliInfo> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AddFdaAppliInfo update(AddFdaAppliInfo addFdaAppliInfo) {
		return getPersistence().update(addFdaAppliInfo);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AddFdaAppliInfo update(
		AddFdaAppliInfo addFdaAppliInfo, ServiceContext serviceContext) {

		return getPersistence().update(addFdaAppliInfo, serviceContext);
	}

	/**
	 * Returns all the add fda appli infos where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching add fda appli infos
	 */
	public static List<AddFdaAppliInfo> findBygetJanaacById(
		long janaacApplicationId) {

		return getPersistence().findBygetJanaacById(janaacApplicationId);
	}

	/**
	 * Returns a range of all the add fda appli infos where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddFdaAppliInfoModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add fda appli infos
	 * @param end the upper bound of the range of add fda appli infos (not inclusive)
	 * @return the range of matching add fda appli infos
	 */
	public static List<AddFdaAppliInfo> findBygetJanaacById(
		long janaacApplicationId, int start, int end) {

		return getPersistence().findBygetJanaacById(
			janaacApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the add fda appli infos where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddFdaAppliInfoModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add fda appli infos
	 * @param end the upper bound of the range of add fda appli infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching add fda appli infos
	 */
	public static List<AddFdaAppliInfo> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		OrderByComparator<AddFdaAppliInfo> orderByComparator) {

		return getPersistence().findBygetJanaacById(
			janaacApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the add fda appli infos where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddFdaAppliInfoModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add fda appli infos
	 * @param end the upper bound of the range of add fda appli infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching add fda appli infos
	 */
	public static List<AddFdaAppliInfo> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		OrderByComparator<AddFdaAppliInfo> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetJanaacById(
			janaacApplicationId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first add fda appli info in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add fda appli info
	 * @throws NoSuchAddFdaAppliInfoException if a matching add fda appli info could not be found
	 */
	public static AddFdaAppliInfo findBygetJanaacById_First(
			long janaacApplicationId,
			OrderByComparator<AddFdaAppliInfo> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddFdaAppliInfoException {

		return getPersistence().findBygetJanaacById_First(
			janaacApplicationId, orderByComparator);
	}

	/**
	 * Returns the first add fda appli info in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add fda appli info, or <code>null</code> if a matching add fda appli info could not be found
	 */
	public static AddFdaAppliInfo fetchBygetJanaacById_First(
		long janaacApplicationId,
		OrderByComparator<AddFdaAppliInfo> orderByComparator) {

		return getPersistence().fetchBygetJanaacById_First(
			janaacApplicationId, orderByComparator);
	}

	/**
	 * Returns the last add fda appli info in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add fda appli info
	 * @throws NoSuchAddFdaAppliInfoException if a matching add fda appli info could not be found
	 */
	public static AddFdaAppliInfo findBygetJanaacById_Last(
			long janaacApplicationId,
			OrderByComparator<AddFdaAppliInfo> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddFdaAppliInfoException {

		return getPersistence().findBygetJanaacById_Last(
			janaacApplicationId, orderByComparator);
	}

	/**
	 * Returns the last add fda appli info in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add fda appli info, or <code>null</code> if a matching add fda appli info could not be found
	 */
	public static AddFdaAppliInfo fetchBygetJanaacById_Last(
		long janaacApplicationId,
		OrderByComparator<AddFdaAppliInfo> orderByComparator) {

		return getPersistence().fetchBygetJanaacById_Last(
			janaacApplicationId, orderByComparator);
	}

	/**
	 * Returns the add fda appli infos before and after the current add fda appli info in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param addFdaAppliInfoId the primary key of the current add fda appli info
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next add fda appli info
	 * @throws NoSuchAddFdaAppliInfoException if a add fda appli info with the primary key could not be found
	 */
	public static AddFdaAppliInfo[] findBygetJanaacById_PrevAndNext(
			long addFdaAppliInfoId, long janaacApplicationId,
			OrderByComparator<AddFdaAppliInfo> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddFdaAppliInfoException {

		return getPersistence().findBygetJanaacById_PrevAndNext(
			addFdaAppliInfoId, janaacApplicationId, orderByComparator);
	}

	/**
	 * Removes all the add fda appli infos where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 */
	public static void removeBygetJanaacById(long janaacApplicationId) {
		getPersistence().removeBygetJanaacById(janaacApplicationId);
	}

	/**
	 * Returns the number of add fda appli infos where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching add fda appli infos
	 */
	public static int countBygetJanaacById(long janaacApplicationId) {
		return getPersistence().countBygetJanaacById(janaacApplicationId);
	}

	/**
	 * Caches the add fda appli info in the entity cache if it is enabled.
	 *
	 * @param addFdaAppliInfo the add fda appli info
	 */
	public static void cacheResult(AddFdaAppliInfo addFdaAppliInfo) {
		getPersistence().cacheResult(addFdaAppliInfo);
	}

	/**
	 * Caches the add fda appli infos in the entity cache if it is enabled.
	 *
	 * @param addFdaAppliInfos the add fda appli infos
	 */
	public static void cacheResult(List<AddFdaAppliInfo> addFdaAppliInfos) {
		getPersistence().cacheResult(addFdaAppliInfos);
	}

	/**
	 * Creates a new add fda appli info with the primary key. Does not add the add fda appli info to the database.
	 *
	 * @param addFdaAppliInfoId the primary key for the new add fda appli info
	 * @return the new add fda appli info
	 */
	public static AddFdaAppliInfo create(long addFdaAppliInfoId) {
		return getPersistence().create(addFdaAppliInfoId);
	}

	/**
	 * Removes the add fda appli info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param addFdaAppliInfoId the primary key of the add fda appli info
	 * @return the add fda appli info that was removed
	 * @throws NoSuchAddFdaAppliInfoException if a add fda appli info with the primary key could not be found
	 */
	public static AddFdaAppliInfo remove(long addFdaAppliInfoId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddFdaAppliInfoException {

		return getPersistence().remove(addFdaAppliInfoId);
	}

	public static AddFdaAppliInfo updateImpl(AddFdaAppliInfo addFdaAppliInfo) {
		return getPersistence().updateImpl(addFdaAppliInfo);
	}

	/**
	 * Returns the add fda appli info with the primary key or throws a <code>NoSuchAddFdaAppliInfoException</code> if it could not be found.
	 *
	 * @param addFdaAppliInfoId the primary key of the add fda appli info
	 * @return the add fda appli info
	 * @throws NoSuchAddFdaAppliInfoException if a add fda appli info with the primary key could not be found
	 */
	public static AddFdaAppliInfo findByPrimaryKey(long addFdaAppliInfoId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddFdaAppliInfoException {

		return getPersistence().findByPrimaryKey(addFdaAppliInfoId);
	}

	/**
	 * Returns the add fda appli info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param addFdaAppliInfoId the primary key of the add fda appli info
	 * @return the add fda appli info, or <code>null</code> if a add fda appli info with the primary key could not be found
	 */
	public static AddFdaAppliInfo fetchByPrimaryKey(long addFdaAppliInfoId) {
		return getPersistence().fetchByPrimaryKey(addFdaAppliInfoId);
	}

	/**
	 * Returns all the add fda appli infos.
	 *
	 * @return the add fda appli infos
	 */
	public static List<AddFdaAppliInfo> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the add fda appli infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddFdaAppliInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add fda appli infos
	 * @param end the upper bound of the range of add fda appli infos (not inclusive)
	 * @return the range of add fda appli infos
	 */
	public static List<AddFdaAppliInfo> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the add fda appli infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddFdaAppliInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add fda appli infos
	 * @param end the upper bound of the range of add fda appli infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of add fda appli infos
	 */
	public static List<AddFdaAppliInfo> findAll(
		int start, int end,
		OrderByComparator<AddFdaAppliInfo> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the add fda appli infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddFdaAppliInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add fda appli infos
	 * @param end the upper bound of the range of add fda appli infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of add fda appli infos
	 */
	public static List<AddFdaAppliInfo> findAll(
		int start, int end,
		OrderByComparator<AddFdaAppliInfo> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the add fda appli infos from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of add fda appli infos.
	 *
	 * @return the number of add fda appli infos
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AddFdaAppliInfoPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(AddFdaAppliInfoPersistence persistence) {
		_persistence = persistence;
	}

	private static volatile AddFdaAppliInfoPersistence _persistence;

}