/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.janaac.application.form.service.model.AddInsOrgInfoFirst;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the add ins org info first service. This utility wraps <code>com.nbp.janaac.application.form.service.service.persistence.impl.AddInsOrgInfoFirstPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AddInsOrgInfoFirstPersistence
 * @generated
 */
public class AddInsOrgInfoFirstUtil {

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
	public static void clearCache(AddInsOrgInfoFirst addInsOrgInfoFirst) {
		getPersistence().clearCache(addInsOrgInfoFirst);
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
	public static Map<Serializable, AddInsOrgInfoFirst> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AddInsOrgInfoFirst> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AddInsOrgInfoFirst> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AddInsOrgInfoFirst> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AddInsOrgInfoFirst> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AddInsOrgInfoFirst update(
		AddInsOrgInfoFirst addInsOrgInfoFirst) {

		return getPersistence().update(addInsOrgInfoFirst);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AddInsOrgInfoFirst update(
		AddInsOrgInfoFirst addInsOrgInfoFirst, ServiceContext serviceContext) {

		return getPersistence().update(addInsOrgInfoFirst, serviceContext);
	}

	/**
	 * Returns all the add ins org info firsts where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching add ins org info firsts
	 */
	public static List<AddInsOrgInfoFirst> findBygetJanaacById(
		long janaacApplicationId) {

		return getPersistence().findBygetJanaacById(janaacApplicationId);
	}

	/**
	 * Returns a range of all the add ins org info firsts where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddInsOrgInfoFirstModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add ins org info firsts
	 * @param end the upper bound of the range of add ins org info firsts (not inclusive)
	 * @return the range of matching add ins org info firsts
	 */
	public static List<AddInsOrgInfoFirst> findBygetJanaacById(
		long janaacApplicationId, int start, int end) {

		return getPersistence().findBygetJanaacById(
			janaacApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the add ins org info firsts where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddInsOrgInfoFirstModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add ins org info firsts
	 * @param end the upper bound of the range of add ins org info firsts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching add ins org info firsts
	 */
	public static List<AddInsOrgInfoFirst> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		OrderByComparator<AddInsOrgInfoFirst> orderByComparator) {

		return getPersistence().findBygetJanaacById(
			janaacApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the add ins org info firsts where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddInsOrgInfoFirstModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add ins org info firsts
	 * @param end the upper bound of the range of add ins org info firsts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching add ins org info firsts
	 */
	public static List<AddInsOrgInfoFirst> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		OrderByComparator<AddInsOrgInfoFirst> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetJanaacById(
			janaacApplicationId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first add ins org info first in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add ins org info first
	 * @throws NoSuchAddInsOrgInfoFirstException if a matching add ins org info first could not be found
	 */
	public static AddInsOrgInfoFirst findBygetJanaacById_First(
			long janaacApplicationId,
			OrderByComparator<AddInsOrgInfoFirst> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddInsOrgInfoFirstException {

		return getPersistence().findBygetJanaacById_First(
			janaacApplicationId, orderByComparator);
	}

	/**
	 * Returns the first add ins org info first in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add ins org info first, or <code>null</code> if a matching add ins org info first could not be found
	 */
	public static AddInsOrgInfoFirst fetchBygetJanaacById_First(
		long janaacApplicationId,
		OrderByComparator<AddInsOrgInfoFirst> orderByComparator) {

		return getPersistence().fetchBygetJanaacById_First(
			janaacApplicationId, orderByComparator);
	}

	/**
	 * Returns the last add ins org info first in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add ins org info first
	 * @throws NoSuchAddInsOrgInfoFirstException if a matching add ins org info first could not be found
	 */
	public static AddInsOrgInfoFirst findBygetJanaacById_Last(
			long janaacApplicationId,
			OrderByComparator<AddInsOrgInfoFirst> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddInsOrgInfoFirstException {

		return getPersistence().findBygetJanaacById_Last(
			janaacApplicationId, orderByComparator);
	}

	/**
	 * Returns the last add ins org info first in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add ins org info first, or <code>null</code> if a matching add ins org info first could not be found
	 */
	public static AddInsOrgInfoFirst fetchBygetJanaacById_Last(
		long janaacApplicationId,
		OrderByComparator<AddInsOrgInfoFirst> orderByComparator) {

		return getPersistence().fetchBygetJanaacById_Last(
			janaacApplicationId, orderByComparator);
	}

	/**
	 * Returns the add ins org info firsts before and after the current add ins org info first in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param addInsOrgInfoFirstId the primary key of the current add ins org info first
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next add ins org info first
	 * @throws NoSuchAddInsOrgInfoFirstException if a add ins org info first with the primary key could not be found
	 */
	public static AddInsOrgInfoFirst[] findBygetJanaacById_PrevAndNext(
			long addInsOrgInfoFirstId, long janaacApplicationId,
			OrderByComparator<AddInsOrgInfoFirst> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddInsOrgInfoFirstException {

		return getPersistence().findBygetJanaacById_PrevAndNext(
			addInsOrgInfoFirstId, janaacApplicationId, orderByComparator);
	}

	/**
	 * Removes all the add ins org info firsts where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 */
	public static void removeBygetJanaacById(long janaacApplicationId) {
		getPersistence().removeBygetJanaacById(janaacApplicationId);
	}

	/**
	 * Returns the number of add ins org info firsts where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching add ins org info firsts
	 */
	public static int countBygetJanaacById(long janaacApplicationId) {
		return getPersistence().countBygetJanaacById(janaacApplicationId);
	}

	/**
	 * Caches the add ins org info first in the entity cache if it is enabled.
	 *
	 * @param addInsOrgInfoFirst the add ins org info first
	 */
	public static void cacheResult(AddInsOrgInfoFirst addInsOrgInfoFirst) {
		getPersistence().cacheResult(addInsOrgInfoFirst);
	}

	/**
	 * Caches the add ins org info firsts in the entity cache if it is enabled.
	 *
	 * @param addInsOrgInfoFirsts the add ins org info firsts
	 */
	public static void cacheResult(
		List<AddInsOrgInfoFirst> addInsOrgInfoFirsts) {

		getPersistence().cacheResult(addInsOrgInfoFirsts);
	}

	/**
	 * Creates a new add ins org info first with the primary key. Does not add the add ins org info first to the database.
	 *
	 * @param addInsOrgInfoFirstId the primary key for the new add ins org info first
	 * @return the new add ins org info first
	 */
	public static AddInsOrgInfoFirst create(long addInsOrgInfoFirstId) {
		return getPersistence().create(addInsOrgInfoFirstId);
	}

	/**
	 * Removes the add ins org info first with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param addInsOrgInfoFirstId the primary key of the add ins org info first
	 * @return the add ins org info first that was removed
	 * @throws NoSuchAddInsOrgInfoFirstException if a add ins org info first with the primary key could not be found
	 */
	public static AddInsOrgInfoFirst remove(long addInsOrgInfoFirstId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddInsOrgInfoFirstException {

		return getPersistence().remove(addInsOrgInfoFirstId);
	}

	public static AddInsOrgInfoFirst updateImpl(
		AddInsOrgInfoFirst addInsOrgInfoFirst) {

		return getPersistence().updateImpl(addInsOrgInfoFirst);
	}

	/**
	 * Returns the add ins org info first with the primary key or throws a <code>NoSuchAddInsOrgInfoFirstException</code> if it could not be found.
	 *
	 * @param addInsOrgInfoFirstId the primary key of the add ins org info first
	 * @return the add ins org info first
	 * @throws NoSuchAddInsOrgInfoFirstException if a add ins org info first with the primary key could not be found
	 */
	public static AddInsOrgInfoFirst findByPrimaryKey(long addInsOrgInfoFirstId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddInsOrgInfoFirstException {

		return getPersistence().findByPrimaryKey(addInsOrgInfoFirstId);
	}

	/**
	 * Returns the add ins org info first with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param addInsOrgInfoFirstId the primary key of the add ins org info first
	 * @return the add ins org info first, or <code>null</code> if a add ins org info first with the primary key could not be found
	 */
	public static AddInsOrgInfoFirst fetchByPrimaryKey(
		long addInsOrgInfoFirstId) {

		return getPersistence().fetchByPrimaryKey(addInsOrgInfoFirstId);
	}

	/**
	 * Returns all the add ins org info firsts.
	 *
	 * @return the add ins org info firsts
	 */
	public static List<AddInsOrgInfoFirst> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the add ins org info firsts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddInsOrgInfoFirstModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add ins org info firsts
	 * @param end the upper bound of the range of add ins org info firsts (not inclusive)
	 * @return the range of add ins org info firsts
	 */
	public static List<AddInsOrgInfoFirst> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the add ins org info firsts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddInsOrgInfoFirstModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add ins org info firsts
	 * @param end the upper bound of the range of add ins org info firsts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of add ins org info firsts
	 */
	public static List<AddInsOrgInfoFirst> findAll(
		int start, int end,
		OrderByComparator<AddInsOrgInfoFirst> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the add ins org info firsts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddInsOrgInfoFirstModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add ins org info firsts
	 * @param end the upper bound of the range of add ins org info firsts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of add ins org info firsts
	 */
	public static List<AddInsOrgInfoFirst> findAll(
		int start, int end,
		OrderByComparator<AddInsOrgInfoFirst> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the add ins org info firsts from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of add ins org info firsts.
	 *
	 * @return the number of add ins org info firsts
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AddInsOrgInfoFirstPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		AddInsOrgInfoFirstPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile AddInsOrgInfoFirstPersistence _persistence;

}