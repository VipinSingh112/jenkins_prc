/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.janaac.application.form.service.model.AddLabResourceReqFirst;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the add lab resource req first service. This utility wraps <code>com.nbp.janaac.application.form.service.service.persistence.impl.AddLabResourceReqFirstPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AddLabResourceReqFirstPersistence
 * @generated
 */
public class AddLabResourceReqFirstUtil {

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
		AddLabResourceReqFirst addLabResourceReqFirst) {

		getPersistence().clearCache(addLabResourceReqFirst);
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
	public static Map<Serializable, AddLabResourceReqFirst> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AddLabResourceReqFirst> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AddLabResourceReqFirst> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AddLabResourceReqFirst> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AddLabResourceReqFirst> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AddLabResourceReqFirst update(
		AddLabResourceReqFirst addLabResourceReqFirst) {

		return getPersistence().update(addLabResourceReqFirst);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AddLabResourceReqFirst update(
		AddLabResourceReqFirst addLabResourceReqFirst,
		ServiceContext serviceContext) {

		return getPersistence().update(addLabResourceReqFirst, serviceContext);
	}

	/**
	 * Returns all the add lab resource req firsts where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching add lab resource req firsts
	 */
	public static List<AddLabResourceReqFirst> findBygetJanaacById(
		long janaacApplicationId) {

		return getPersistence().findBygetJanaacById(janaacApplicationId);
	}

	/**
	 * Returns a range of all the add lab resource req firsts where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabResourceReqFirstModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add lab resource req firsts
	 * @param end the upper bound of the range of add lab resource req firsts (not inclusive)
	 * @return the range of matching add lab resource req firsts
	 */
	public static List<AddLabResourceReqFirst> findBygetJanaacById(
		long janaacApplicationId, int start, int end) {

		return getPersistence().findBygetJanaacById(
			janaacApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the add lab resource req firsts where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabResourceReqFirstModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add lab resource req firsts
	 * @param end the upper bound of the range of add lab resource req firsts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching add lab resource req firsts
	 */
	public static List<AddLabResourceReqFirst> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		OrderByComparator<AddLabResourceReqFirst> orderByComparator) {

		return getPersistence().findBygetJanaacById(
			janaacApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the add lab resource req firsts where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabResourceReqFirstModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add lab resource req firsts
	 * @param end the upper bound of the range of add lab resource req firsts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching add lab resource req firsts
	 */
	public static List<AddLabResourceReqFirst> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		OrderByComparator<AddLabResourceReqFirst> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetJanaacById(
			janaacApplicationId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first add lab resource req first in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add lab resource req first
	 * @throws NoSuchAddLabResourceReqFirstException if a matching add lab resource req first could not be found
	 */
	public static AddLabResourceReqFirst findBygetJanaacById_First(
			long janaacApplicationId,
			OrderByComparator<AddLabResourceReqFirst> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddLabResourceReqFirstException {

		return getPersistence().findBygetJanaacById_First(
			janaacApplicationId, orderByComparator);
	}

	/**
	 * Returns the first add lab resource req first in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add lab resource req first, or <code>null</code> if a matching add lab resource req first could not be found
	 */
	public static AddLabResourceReqFirst fetchBygetJanaacById_First(
		long janaacApplicationId,
		OrderByComparator<AddLabResourceReqFirst> orderByComparator) {

		return getPersistence().fetchBygetJanaacById_First(
			janaacApplicationId, orderByComparator);
	}

	/**
	 * Returns the last add lab resource req first in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add lab resource req first
	 * @throws NoSuchAddLabResourceReqFirstException if a matching add lab resource req first could not be found
	 */
	public static AddLabResourceReqFirst findBygetJanaacById_Last(
			long janaacApplicationId,
			OrderByComparator<AddLabResourceReqFirst> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddLabResourceReqFirstException {

		return getPersistence().findBygetJanaacById_Last(
			janaacApplicationId, orderByComparator);
	}

	/**
	 * Returns the last add lab resource req first in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add lab resource req first, or <code>null</code> if a matching add lab resource req first could not be found
	 */
	public static AddLabResourceReqFirst fetchBygetJanaacById_Last(
		long janaacApplicationId,
		OrderByComparator<AddLabResourceReqFirst> orderByComparator) {

		return getPersistence().fetchBygetJanaacById_Last(
			janaacApplicationId, orderByComparator);
	}

	/**
	 * Returns the add lab resource req firsts before and after the current add lab resource req first in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param addLabResourceReqFirstId the primary key of the current add lab resource req first
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next add lab resource req first
	 * @throws NoSuchAddLabResourceReqFirstException if a add lab resource req first with the primary key could not be found
	 */
	public static AddLabResourceReqFirst[] findBygetJanaacById_PrevAndNext(
			long addLabResourceReqFirstId, long janaacApplicationId,
			OrderByComparator<AddLabResourceReqFirst> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddLabResourceReqFirstException {

		return getPersistence().findBygetJanaacById_PrevAndNext(
			addLabResourceReqFirstId, janaacApplicationId, orderByComparator);
	}

	/**
	 * Removes all the add lab resource req firsts where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 */
	public static void removeBygetJanaacById(long janaacApplicationId) {
		getPersistence().removeBygetJanaacById(janaacApplicationId);
	}

	/**
	 * Returns the number of add lab resource req firsts where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching add lab resource req firsts
	 */
	public static int countBygetJanaacById(long janaacApplicationId) {
		return getPersistence().countBygetJanaacById(janaacApplicationId);
	}

	/**
	 * Caches the add lab resource req first in the entity cache if it is enabled.
	 *
	 * @param addLabResourceReqFirst the add lab resource req first
	 */
	public static void cacheResult(
		AddLabResourceReqFirst addLabResourceReqFirst) {

		getPersistence().cacheResult(addLabResourceReqFirst);
	}

	/**
	 * Caches the add lab resource req firsts in the entity cache if it is enabled.
	 *
	 * @param addLabResourceReqFirsts the add lab resource req firsts
	 */
	public static void cacheResult(
		List<AddLabResourceReqFirst> addLabResourceReqFirsts) {

		getPersistence().cacheResult(addLabResourceReqFirsts);
	}

	/**
	 * Creates a new add lab resource req first with the primary key. Does not add the add lab resource req first to the database.
	 *
	 * @param addLabResourceReqFirstId the primary key for the new add lab resource req first
	 * @return the new add lab resource req first
	 */
	public static AddLabResourceReqFirst create(long addLabResourceReqFirstId) {
		return getPersistence().create(addLabResourceReqFirstId);
	}

	/**
	 * Removes the add lab resource req first with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param addLabResourceReqFirstId the primary key of the add lab resource req first
	 * @return the add lab resource req first that was removed
	 * @throws NoSuchAddLabResourceReqFirstException if a add lab resource req first with the primary key could not be found
	 */
	public static AddLabResourceReqFirst remove(long addLabResourceReqFirstId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddLabResourceReqFirstException {

		return getPersistence().remove(addLabResourceReqFirstId);
	}

	public static AddLabResourceReqFirst updateImpl(
		AddLabResourceReqFirst addLabResourceReqFirst) {

		return getPersistence().updateImpl(addLabResourceReqFirst);
	}

	/**
	 * Returns the add lab resource req first with the primary key or throws a <code>NoSuchAddLabResourceReqFirstException</code> if it could not be found.
	 *
	 * @param addLabResourceReqFirstId the primary key of the add lab resource req first
	 * @return the add lab resource req first
	 * @throws NoSuchAddLabResourceReqFirstException if a add lab resource req first with the primary key could not be found
	 */
	public static AddLabResourceReqFirst findByPrimaryKey(
			long addLabResourceReqFirstId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddLabResourceReqFirstException {

		return getPersistence().findByPrimaryKey(addLabResourceReqFirstId);
	}

	/**
	 * Returns the add lab resource req first with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param addLabResourceReqFirstId the primary key of the add lab resource req first
	 * @return the add lab resource req first, or <code>null</code> if a add lab resource req first with the primary key could not be found
	 */
	public static AddLabResourceReqFirst fetchByPrimaryKey(
		long addLabResourceReqFirstId) {

		return getPersistence().fetchByPrimaryKey(addLabResourceReqFirstId);
	}

	/**
	 * Returns all the add lab resource req firsts.
	 *
	 * @return the add lab resource req firsts
	 */
	public static List<AddLabResourceReqFirst> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the add lab resource req firsts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabResourceReqFirstModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add lab resource req firsts
	 * @param end the upper bound of the range of add lab resource req firsts (not inclusive)
	 * @return the range of add lab resource req firsts
	 */
	public static List<AddLabResourceReqFirst> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the add lab resource req firsts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabResourceReqFirstModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add lab resource req firsts
	 * @param end the upper bound of the range of add lab resource req firsts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of add lab resource req firsts
	 */
	public static List<AddLabResourceReqFirst> findAll(
		int start, int end,
		OrderByComparator<AddLabResourceReqFirst> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the add lab resource req firsts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabResourceReqFirstModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add lab resource req firsts
	 * @param end the upper bound of the range of add lab resource req firsts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of add lab resource req firsts
	 */
	public static List<AddLabResourceReqFirst> findAll(
		int start, int end,
		OrderByComparator<AddLabResourceReqFirst> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the add lab resource req firsts from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of add lab resource req firsts.
	 *
	 * @return the number of add lab resource req firsts
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AddLabResourceReqFirstPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		AddLabResourceReqFirstPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile AddLabResourceReqFirstPersistence _persistence;

}