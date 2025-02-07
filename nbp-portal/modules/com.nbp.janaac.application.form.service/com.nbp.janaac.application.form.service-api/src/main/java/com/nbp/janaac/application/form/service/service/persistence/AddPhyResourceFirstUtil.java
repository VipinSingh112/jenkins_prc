/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.janaac.application.form.service.model.AddPhyResourceFirst;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the add phy resource first service. This utility wraps <code>com.nbp.janaac.application.form.service.service.persistence.impl.AddPhyResourceFirstPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AddPhyResourceFirstPersistence
 * @generated
 */
public class AddPhyResourceFirstUtil {

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
	public static void clearCache(AddPhyResourceFirst addPhyResourceFirst) {
		getPersistence().clearCache(addPhyResourceFirst);
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
	public static Map<Serializable, AddPhyResourceFirst> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AddPhyResourceFirst> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AddPhyResourceFirst> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AddPhyResourceFirst> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AddPhyResourceFirst> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AddPhyResourceFirst update(
		AddPhyResourceFirst addPhyResourceFirst) {

		return getPersistence().update(addPhyResourceFirst);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AddPhyResourceFirst update(
		AddPhyResourceFirst addPhyResourceFirst,
		ServiceContext serviceContext) {

		return getPersistence().update(addPhyResourceFirst, serviceContext);
	}

	/**
	 * Returns all the add phy resource firsts where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching add phy resource firsts
	 */
	public static List<AddPhyResourceFirst> findBygetJanaacById(
		long janaacApplicationId) {

		return getPersistence().findBygetJanaacById(janaacApplicationId);
	}

	/**
	 * Returns a range of all the add phy resource firsts where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddPhyResourceFirstModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add phy resource firsts
	 * @param end the upper bound of the range of add phy resource firsts (not inclusive)
	 * @return the range of matching add phy resource firsts
	 */
	public static List<AddPhyResourceFirst> findBygetJanaacById(
		long janaacApplicationId, int start, int end) {

		return getPersistence().findBygetJanaacById(
			janaacApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the add phy resource firsts where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddPhyResourceFirstModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add phy resource firsts
	 * @param end the upper bound of the range of add phy resource firsts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching add phy resource firsts
	 */
	public static List<AddPhyResourceFirst> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		OrderByComparator<AddPhyResourceFirst> orderByComparator) {

		return getPersistence().findBygetJanaacById(
			janaacApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the add phy resource firsts where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddPhyResourceFirstModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add phy resource firsts
	 * @param end the upper bound of the range of add phy resource firsts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching add phy resource firsts
	 */
	public static List<AddPhyResourceFirst> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		OrderByComparator<AddPhyResourceFirst> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetJanaacById(
			janaacApplicationId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first add phy resource first in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add phy resource first
	 * @throws NoSuchAddPhyResourceFirstException if a matching add phy resource first could not be found
	 */
	public static AddPhyResourceFirst findBygetJanaacById_First(
			long janaacApplicationId,
			OrderByComparator<AddPhyResourceFirst> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddPhyResourceFirstException {

		return getPersistence().findBygetJanaacById_First(
			janaacApplicationId, orderByComparator);
	}

	/**
	 * Returns the first add phy resource first in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add phy resource first, or <code>null</code> if a matching add phy resource first could not be found
	 */
	public static AddPhyResourceFirst fetchBygetJanaacById_First(
		long janaacApplicationId,
		OrderByComparator<AddPhyResourceFirst> orderByComparator) {

		return getPersistence().fetchBygetJanaacById_First(
			janaacApplicationId, orderByComparator);
	}

	/**
	 * Returns the last add phy resource first in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add phy resource first
	 * @throws NoSuchAddPhyResourceFirstException if a matching add phy resource first could not be found
	 */
	public static AddPhyResourceFirst findBygetJanaacById_Last(
			long janaacApplicationId,
			OrderByComparator<AddPhyResourceFirst> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddPhyResourceFirstException {

		return getPersistence().findBygetJanaacById_Last(
			janaacApplicationId, orderByComparator);
	}

	/**
	 * Returns the last add phy resource first in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add phy resource first, or <code>null</code> if a matching add phy resource first could not be found
	 */
	public static AddPhyResourceFirst fetchBygetJanaacById_Last(
		long janaacApplicationId,
		OrderByComparator<AddPhyResourceFirst> orderByComparator) {

		return getPersistence().fetchBygetJanaacById_Last(
			janaacApplicationId, orderByComparator);
	}

	/**
	 * Returns the add phy resource firsts before and after the current add phy resource first in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param addPhyResourceFirstId the primary key of the current add phy resource first
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next add phy resource first
	 * @throws NoSuchAddPhyResourceFirstException if a add phy resource first with the primary key could not be found
	 */
	public static AddPhyResourceFirst[] findBygetJanaacById_PrevAndNext(
			long addPhyResourceFirstId, long janaacApplicationId,
			OrderByComparator<AddPhyResourceFirst> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddPhyResourceFirstException {

		return getPersistence().findBygetJanaacById_PrevAndNext(
			addPhyResourceFirstId, janaacApplicationId, orderByComparator);
	}

	/**
	 * Removes all the add phy resource firsts where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 */
	public static void removeBygetJanaacById(long janaacApplicationId) {
		getPersistence().removeBygetJanaacById(janaacApplicationId);
	}

	/**
	 * Returns the number of add phy resource firsts where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching add phy resource firsts
	 */
	public static int countBygetJanaacById(long janaacApplicationId) {
		return getPersistence().countBygetJanaacById(janaacApplicationId);
	}

	/**
	 * Caches the add phy resource first in the entity cache if it is enabled.
	 *
	 * @param addPhyResourceFirst the add phy resource first
	 */
	public static void cacheResult(AddPhyResourceFirst addPhyResourceFirst) {
		getPersistence().cacheResult(addPhyResourceFirst);
	}

	/**
	 * Caches the add phy resource firsts in the entity cache if it is enabled.
	 *
	 * @param addPhyResourceFirsts the add phy resource firsts
	 */
	public static void cacheResult(
		List<AddPhyResourceFirst> addPhyResourceFirsts) {

		getPersistence().cacheResult(addPhyResourceFirsts);
	}

	/**
	 * Creates a new add phy resource first with the primary key. Does not add the add phy resource first to the database.
	 *
	 * @param addPhyResourceFirstId the primary key for the new add phy resource first
	 * @return the new add phy resource first
	 */
	public static AddPhyResourceFirst create(long addPhyResourceFirstId) {
		return getPersistence().create(addPhyResourceFirstId);
	}

	/**
	 * Removes the add phy resource first with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param addPhyResourceFirstId the primary key of the add phy resource first
	 * @return the add phy resource first that was removed
	 * @throws NoSuchAddPhyResourceFirstException if a add phy resource first with the primary key could not be found
	 */
	public static AddPhyResourceFirst remove(long addPhyResourceFirstId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddPhyResourceFirstException {

		return getPersistence().remove(addPhyResourceFirstId);
	}

	public static AddPhyResourceFirst updateImpl(
		AddPhyResourceFirst addPhyResourceFirst) {

		return getPersistence().updateImpl(addPhyResourceFirst);
	}

	/**
	 * Returns the add phy resource first with the primary key or throws a <code>NoSuchAddPhyResourceFirstException</code> if it could not be found.
	 *
	 * @param addPhyResourceFirstId the primary key of the add phy resource first
	 * @return the add phy resource first
	 * @throws NoSuchAddPhyResourceFirstException if a add phy resource first with the primary key could not be found
	 */
	public static AddPhyResourceFirst findByPrimaryKey(
			long addPhyResourceFirstId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddPhyResourceFirstException {

		return getPersistence().findByPrimaryKey(addPhyResourceFirstId);
	}

	/**
	 * Returns the add phy resource first with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param addPhyResourceFirstId the primary key of the add phy resource first
	 * @return the add phy resource first, or <code>null</code> if a add phy resource first with the primary key could not be found
	 */
	public static AddPhyResourceFirst fetchByPrimaryKey(
		long addPhyResourceFirstId) {

		return getPersistence().fetchByPrimaryKey(addPhyResourceFirstId);
	}

	/**
	 * Returns all the add phy resource firsts.
	 *
	 * @return the add phy resource firsts
	 */
	public static List<AddPhyResourceFirst> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the add phy resource firsts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddPhyResourceFirstModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add phy resource firsts
	 * @param end the upper bound of the range of add phy resource firsts (not inclusive)
	 * @return the range of add phy resource firsts
	 */
	public static List<AddPhyResourceFirst> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the add phy resource firsts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddPhyResourceFirstModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add phy resource firsts
	 * @param end the upper bound of the range of add phy resource firsts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of add phy resource firsts
	 */
	public static List<AddPhyResourceFirst> findAll(
		int start, int end,
		OrderByComparator<AddPhyResourceFirst> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the add phy resource firsts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddPhyResourceFirstModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add phy resource firsts
	 * @param end the upper bound of the range of add phy resource firsts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of add phy resource firsts
	 */
	public static List<AddPhyResourceFirst> findAll(
		int start, int end,
		OrderByComparator<AddPhyResourceFirst> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the add phy resource firsts from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of add phy resource firsts.
	 *
	 * @return the number of add phy resource firsts
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AddPhyResourceFirstPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		AddPhyResourceFirstPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile AddPhyResourceFirstPersistence _persistence;

}