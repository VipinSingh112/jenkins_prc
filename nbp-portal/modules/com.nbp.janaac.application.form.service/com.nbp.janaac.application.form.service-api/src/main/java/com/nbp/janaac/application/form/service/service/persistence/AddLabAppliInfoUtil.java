/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.janaac.application.form.service.model.AddLabAppliInfo;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the add lab appli info service. This utility wraps <code>com.nbp.janaac.application.form.service.service.persistence.impl.AddLabAppliInfoPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AddLabAppliInfoPersistence
 * @generated
 */
public class AddLabAppliInfoUtil {

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
	public static void clearCache(AddLabAppliInfo addLabAppliInfo) {
		getPersistence().clearCache(addLabAppliInfo);
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
	public static Map<Serializable, AddLabAppliInfo> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AddLabAppliInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AddLabAppliInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AddLabAppliInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AddLabAppliInfo> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AddLabAppliInfo update(AddLabAppliInfo addLabAppliInfo) {
		return getPersistence().update(addLabAppliInfo);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AddLabAppliInfo update(
		AddLabAppliInfo addLabAppliInfo, ServiceContext serviceContext) {

		return getPersistence().update(addLabAppliInfo, serviceContext);
	}

	/**
	 * Returns all the add lab appli infos where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching add lab appli infos
	 */
	public static List<AddLabAppliInfo> findBygetJanaacById(
		long janaacApplicationId) {

		return getPersistence().findBygetJanaacById(janaacApplicationId);
	}

	/**
	 * Returns a range of all the add lab appli infos where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabAppliInfoModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add lab appli infos
	 * @param end the upper bound of the range of add lab appli infos (not inclusive)
	 * @return the range of matching add lab appli infos
	 */
	public static List<AddLabAppliInfo> findBygetJanaacById(
		long janaacApplicationId, int start, int end) {

		return getPersistence().findBygetJanaacById(
			janaacApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the add lab appli infos where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabAppliInfoModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add lab appli infos
	 * @param end the upper bound of the range of add lab appli infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching add lab appli infos
	 */
	public static List<AddLabAppliInfo> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		OrderByComparator<AddLabAppliInfo> orderByComparator) {

		return getPersistence().findBygetJanaacById(
			janaacApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the add lab appli infos where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabAppliInfoModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add lab appli infos
	 * @param end the upper bound of the range of add lab appli infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching add lab appli infos
	 */
	public static List<AddLabAppliInfo> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		OrderByComparator<AddLabAppliInfo> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetJanaacById(
			janaacApplicationId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first add lab appli info in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add lab appli info
	 * @throws NoSuchAddLabAppliInfoException if a matching add lab appli info could not be found
	 */
	public static AddLabAppliInfo findBygetJanaacById_First(
			long janaacApplicationId,
			OrderByComparator<AddLabAppliInfo> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddLabAppliInfoException {

		return getPersistence().findBygetJanaacById_First(
			janaacApplicationId, orderByComparator);
	}

	/**
	 * Returns the first add lab appli info in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add lab appli info, or <code>null</code> if a matching add lab appli info could not be found
	 */
	public static AddLabAppliInfo fetchBygetJanaacById_First(
		long janaacApplicationId,
		OrderByComparator<AddLabAppliInfo> orderByComparator) {

		return getPersistence().fetchBygetJanaacById_First(
			janaacApplicationId, orderByComparator);
	}

	/**
	 * Returns the last add lab appli info in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add lab appli info
	 * @throws NoSuchAddLabAppliInfoException if a matching add lab appli info could not be found
	 */
	public static AddLabAppliInfo findBygetJanaacById_Last(
			long janaacApplicationId,
			OrderByComparator<AddLabAppliInfo> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddLabAppliInfoException {

		return getPersistence().findBygetJanaacById_Last(
			janaacApplicationId, orderByComparator);
	}

	/**
	 * Returns the last add lab appli info in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add lab appli info, or <code>null</code> if a matching add lab appli info could not be found
	 */
	public static AddLabAppliInfo fetchBygetJanaacById_Last(
		long janaacApplicationId,
		OrderByComparator<AddLabAppliInfo> orderByComparator) {

		return getPersistence().fetchBygetJanaacById_Last(
			janaacApplicationId, orderByComparator);
	}

	/**
	 * Returns the add lab appli infos before and after the current add lab appli info in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param addLabAppliInfoId the primary key of the current add lab appli info
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next add lab appli info
	 * @throws NoSuchAddLabAppliInfoException if a add lab appli info with the primary key could not be found
	 */
	public static AddLabAppliInfo[] findBygetJanaacById_PrevAndNext(
			long addLabAppliInfoId, long janaacApplicationId,
			OrderByComparator<AddLabAppliInfo> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddLabAppliInfoException {

		return getPersistence().findBygetJanaacById_PrevAndNext(
			addLabAppliInfoId, janaacApplicationId, orderByComparator);
	}

	/**
	 * Removes all the add lab appli infos where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 */
	public static void removeBygetJanaacById(long janaacApplicationId) {
		getPersistence().removeBygetJanaacById(janaacApplicationId);
	}

	/**
	 * Returns the number of add lab appli infos where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching add lab appli infos
	 */
	public static int countBygetJanaacById(long janaacApplicationId) {
		return getPersistence().countBygetJanaacById(janaacApplicationId);
	}

	/**
	 * Caches the add lab appli info in the entity cache if it is enabled.
	 *
	 * @param addLabAppliInfo the add lab appli info
	 */
	public static void cacheResult(AddLabAppliInfo addLabAppliInfo) {
		getPersistence().cacheResult(addLabAppliInfo);
	}

	/**
	 * Caches the add lab appli infos in the entity cache if it is enabled.
	 *
	 * @param addLabAppliInfos the add lab appli infos
	 */
	public static void cacheResult(List<AddLabAppliInfo> addLabAppliInfos) {
		getPersistence().cacheResult(addLabAppliInfos);
	}

	/**
	 * Creates a new add lab appli info with the primary key. Does not add the add lab appli info to the database.
	 *
	 * @param addLabAppliInfoId the primary key for the new add lab appli info
	 * @return the new add lab appli info
	 */
	public static AddLabAppliInfo create(long addLabAppliInfoId) {
		return getPersistence().create(addLabAppliInfoId);
	}

	/**
	 * Removes the add lab appli info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param addLabAppliInfoId the primary key of the add lab appli info
	 * @return the add lab appli info that was removed
	 * @throws NoSuchAddLabAppliInfoException if a add lab appli info with the primary key could not be found
	 */
	public static AddLabAppliInfo remove(long addLabAppliInfoId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddLabAppliInfoException {

		return getPersistence().remove(addLabAppliInfoId);
	}

	public static AddLabAppliInfo updateImpl(AddLabAppliInfo addLabAppliInfo) {
		return getPersistence().updateImpl(addLabAppliInfo);
	}

	/**
	 * Returns the add lab appli info with the primary key or throws a <code>NoSuchAddLabAppliInfoException</code> if it could not be found.
	 *
	 * @param addLabAppliInfoId the primary key of the add lab appli info
	 * @return the add lab appli info
	 * @throws NoSuchAddLabAppliInfoException if a add lab appli info with the primary key could not be found
	 */
	public static AddLabAppliInfo findByPrimaryKey(long addLabAppliInfoId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddLabAppliInfoException {

		return getPersistence().findByPrimaryKey(addLabAppliInfoId);
	}

	/**
	 * Returns the add lab appli info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param addLabAppliInfoId the primary key of the add lab appli info
	 * @return the add lab appli info, or <code>null</code> if a add lab appli info with the primary key could not be found
	 */
	public static AddLabAppliInfo fetchByPrimaryKey(long addLabAppliInfoId) {
		return getPersistence().fetchByPrimaryKey(addLabAppliInfoId);
	}

	/**
	 * Returns all the add lab appli infos.
	 *
	 * @return the add lab appli infos
	 */
	public static List<AddLabAppliInfo> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the add lab appli infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabAppliInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add lab appli infos
	 * @param end the upper bound of the range of add lab appli infos (not inclusive)
	 * @return the range of add lab appli infos
	 */
	public static List<AddLabAppliInfo> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the add lab appli infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabAppliInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add lab appli infos
	 * @param end the upper bound of the range of add lab appli infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of add lab appli infos
	 */
	public static List<AddLabAppliInfo> findAll(
		int start, int end,
		OrderByComparator<AddLabAppliInfo> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the add lab appli infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabAppliInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add lab appli infos
	 * @param end the upper bound of the range of add lab appli infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of add lab appli infos
	 */
	public static List<AddLabAppliInfo> findAll(
		int start, int end,
		OrderByComparator<AddLabAppliInfo> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the add lab appli infos from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of add lab appli infos.
	 *
	 * @return the number of add lab appli infos
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AddLabAppliInfoPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(AddLabAppliInfoPersistence persistence) {
		_persistence = persistence;
	}

	private static volatile AddLabAppliInfoPersistence _persistence;

}