/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.janaac.application.form.service.model.AddCerPersonnelFirst;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the add cer personnel first service. This utility wraps <code>com.nbp.janaac.application.form.service.service.persistence.impl.AddCerPersonnelFirstPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AddCerPersonnelFirstPersistence
 * @generated
 */
public class AddCerPersonnelFirstUtil {

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
	public static void clearCache(AddCerPersonnelFirst addCerPersonnelFirst) {
		getPersistence().clearCache(addCerPersonnelFirst);
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
	public static Map<Serializable, AddCerPersonnelFirst> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AddCerPersonnelFirst> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AddCerPersonnelFirst> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AddCerPersonnelFirst> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AddCerPersonnelFirst> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AddCerPersonnelFirst update(
		AddCerPersonnelFirst addCerPersonnelFirst) {

		return getPersistence().update(addCerPersonnelFirst);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AddCerPersonnelFirst update(
		AddCerPersonnelFirst addCerPersonnelFirst,
		ServiceContext serviceContext) {

		return getPersistence().update(addCerPersonnelFirst, serviceContext);
	}

	/**
	 * Returns all the add cer personnel firsts where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching add cer personnel firsts
	 */
	public static List<AddCerPersonnelFirst> findBygetJanaacById(
		long janaacApplicationId) {

		return getPersistence().findBygetJanaacById(janaacApplicationId);
	}

	/**
	 * Returns a range of all the add cer personnel firsts where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddCerPersonnelFirstModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add cer personnel firsts
	 * @param end the upper bound of the range of add cer personnel firsts (not inclusive)
	 * @return the range of matching add cer personnel firsts
	 */
	public static List<AddCerPersonnelFirst> findBygetJanaacById(
		long janaacApplicationId, int start, int end) {

		return getPersistence().findBygetJanaacById(
			janaacApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the add cer personnel firsts where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddCerPersonnelFirstModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add cer personnel firsts
	 * @param end the upper bound of the range of add cer personnel firsts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching add cer personnel firsts
	 */
	public static List<AddCerPersonnelFirst> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		OrderByComparator<AddCerPersonnelFirst> orderByComparator) {

		return getPersistence().findBygetJanaacById(
			janaacApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the add cer personnel firsts where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddCerPersonnelFirstModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add cer personnel firsts
	 * @param end the upper bound of the range of add cer personnel firsts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching add cer personnel firsts
	 */
	public static List<AddCerPersonnelFirst> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		OrderByComparator<AddCerPersonnelFirst> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetJanaacById(
			janaacApplicationId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first add cer personnel first in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add cer personnel first
	 * @throws NoSuchAddCerPersonnelFirstException if a matching add cer personnel first could not be found
	 */
	public static AddCerPersonnelFirst findBygetJanaacById_First(
			long janaacApplicationId,
			OrderByComparator<AddCerPersonnelFirst> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddCerPersonnelFirstException {

		return getPersistence().findBygetJanaacById_First(
			janaacApplicationId, orderByComparator);
	}

	/**
	 * Returns the first add cer personnel first in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add cer personnel first, or <code>null</code> if a matching add cer personnel first could not be found
	 */
	public static AddCerPersonnelFirst fetchBygetJanaacById_First(
		long janaacApplicationId,
		OrderByComparator<AddCerPersonnelFirst> orderByComparator) {

		return getPersistence().fetchBygetJanaacById_First(
			janaacApplicationId, orderByComparator);
	}

	/**
	 * Returns the last add cer personnel first in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add cer personnel first
	 * @throws NoSuchAddCerPersonnelFirstException if a matching add cer personnel first could not be found
	 */
	public static AddCerPersonnelFirst findBygetJanaacById_Last(
			long janaacApplicationId,
			OrderByComparator<AddCerPersonnelFirst> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddCerPersonnelFirstException {

		return getPersistence().findBygetJanaacById_Last(
			janaacApplicationId, orderByComparator);
	}

	/**
	 * Returns the last add cer personnel first in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add cer personnel first, or <code>null</code> if a matching add cer personnel first could not be found
	 */
	public static AddCerPersonnelFirst fetchBygetJanaacById_Last(
		long janaacApplicationId,
		OrderByComparator<AddCerPersonnelFirst> orderByComparator) {

		return getPersistence().fetchBygetJanaacById_Last(
			janaacApplicationId, orderByComparator);
	}

	/**
	 * Returns the add cer personnel firsts before and after the current add cer personnel first in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param addCerPersonnelFirstId the primary key of the current add cer personnel first
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next add cer personnel first
	 * @throws NoSuchAddCerPersonnelFirstException if a add cer personnel first with the primary key could not be found
	 */
	public static AddCerPersonnelFirst[] findBygetJanaacById_PrevAndNext(
			long addCerPersonnelFirstId, long janaacApplicationId,
			OrderByComparator<AddCerPersonnelFirst> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddCerPersonnelFirstException {

		return getPersistence().findBygetJanaacById_PrevAndNext(
			addCerPersonnelFirstId, janaacApplicationId, orderByComparator);
	}

	/**
	 * Removes all the add cer personnel firsts where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 */
	public static void removeBygetJanaacById(long janaacApplicationId) {
		getPersistence().removeBygetJanaacById(janaacApplicationId);
	}

	/**
	 * Returns the number of add cer personnel firsts where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching add cer personnel firsts
	 */
	public static int countBygetJanaacById(long janaacApplicationId) {
		return getPersistence().countBygetJanaacById(janaacApplicationId);
	}

	/**
	 * Caches the add cer personnel first in the entity cache if it is enabled.
	 *
	 * @param addCerPersonnelFirst the add cer personnel first
	 */
	public static void cacheResult(AddCerPersonnelFirst addCerPersonnelFirst) {
		getPersistence().cacheResult(addCerPersonnelFirst);
	}

	/**
	 * Caches the add cer personnel firsts in the entity cache if it is enabled.
	 *
	 * @param addCerPersonnelFirsts the add cer personnel firsts
	 */
	public static void cacheResult(
		List<AddCerPersonnelFirst> addCerPersonnelFirsts) {

		getPersistence().cacheResult(addCerPersonnelFirsts);
	}

	/**
	 * Creates a new add cer personnel first with the primary key. Does not add the add cer personnel first to the database.
	 *
	 * @param addCerPersonnelFirstId the primary key for the new add cer personnel first
	 * @return the new add cer personnel first
	 */
	public static AddCerPersonnelFirst create(long addCerPersonnelFirstId) {
		return getPersistence().create(addCerPersonnelFirstId);
	}

	/**
	 * Removes the add cer personnel first with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param addCerPersonnelFirstId the primary key of the add cer personnel first
	 * @return the add cer personnel first that was removed
	 * @throws NoSuchAddCerPersonnelFirstException if a add cer personnel first with the primary key could not be found
	 */
	public static AddCerPersonnelFirst remove(long addCerPersonnelFirstId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddCerPersonnelFirstException {

		return getPersistence().remove(addCerPersonnelFirstId);
	}

	public static AddCerPersonnelFirst updateImpl(
		AddCerPersonnelFirst addCerPersonnelFirst) {

		return getPersistence().updateImpl(addCerPersonnelFirst);
	}

	/**
	 * Returns the add cer personnel first with the primary key or throws a <code>NoSuchAddCerPersonnelFirstException</code> if it could not be found.
	 *
	 * @param addCerPersonnelFirstId the primary key of the add cer personnel first
	 * @return the add cer personnel first
	 * @throws NoSuchAddCerPersonnelFirstException if a add cer personnel first with the primary key could not be found
	 */
	public static AddCerPersonnelFirst findByPrimaryKey(
			long addCerPersonnelFirstId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddCerPersonnelFirstException {

		return getPersistence().findByPrimaryKey(addCerPersonnelFirstId);
	}

	/**
	 * Returns the add cer personnel first with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param addCerPersonnelFirstId the primary key of the add cer personnel first
	 * @return the add cer personnel first, or <code>null</code> if a add cer personnel first with the primary key could not be found
	 */
	public static AddCerPersonnelFirst fetchByPrimaryKey(
		long addCerPersonnelFirstId) {

		return getPersistence().fetchByPrimaryKey(addCerPersonnelFirstId);
	}

	/**
	 * Returns all the add cer personnel firsts.
	 *
	 * @return the add cer personnel firsts
	 */
	public static List<AddCerPersonnelFirst> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the add cer personnel firsts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddCerPersonnelFirstModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add cer personnel firsts
	 * @param end the upper bound of the range of add cer personnel firsts (not inclusive)
	 * @return the range of add cer personnel firsts
	 */
	public static List<AddCerPersonnelFirst> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the add cer personnel firsts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddCerPersonnelFirstModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add cer personnel firsts
	 * @param end the upper bound of the range of add cer personnel firsts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of add cer personnel firsts
	 */
	public static List<AddCerPersonnelFirst> findAll(
		int start, int end,
		OrderByComparator<AddCerPersonnelFirst> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the add cer personnel firsts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddCerPersonnelFirstModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add cer personnel firsts
	 * @param end the upper bound of the range of add cer personnel firsts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of add cer personnel firsts
	 */
	public static List<AddCerPersonnelFirst> findAll(
		int start, int end,
		OrderByComparator<AddCerPersonnelFirst> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the add cer personnel firsts from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of add cer personnel firsts.
	 *
	 * @return the number of add cer personnel firsts
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AddCerPersonnelFirstPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		AddCerPersonnelFirstPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile AddCerPersonnelFirstPersistence _persistence;

}