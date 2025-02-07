/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.janaac.application.form.service.model.AddFdaPersonnelFour;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the add fda personnel four service. This utility wraps <code>com.nbp.janaac.application.form.service.service.persistence.impl.AddFdaPersonnelFourPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AddFdaPersonnelFourPersistence
 * @generated
 */
public class AddFdaPersonnelFourUtil {

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
	public static void clearCache(AddFdaPersonnelFour addFdaPersonnelFour) {
		getPersistence().clearCache(addFdaPersonnelFour);
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
	public static Map<Serializable, AddFdaPersonnelFour> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AddFdaPersonnelFour> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AddFdaPersonnelFour> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AddFdaPersonnelFour> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AddFdaPersonnelFour> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AddFdaPersonnelFour update(
		AddFdaPersonnelFour addFdaPersonnelFour) {

		return getPersistence().update(addFdaPersonnelFour);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AddFdaPersonnelFour update(
		AddFdaPersonnelFour addFdaPersonnelFour,
		ServiceContext serviceContext) {

		return getPersistence().update(addFdaPersonnelFour, serviceContext);
	}

	/**
	 * Returns all the add fda personnel fours where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching add fda personnel fours
	 */
	public static List<AddFdaPersonnelFour> findBygetJanaacById(
		long janaacApplicationId) {

		return getPersistence().findBygetJanaacById(janaacApplicationId);
	}

	/**
	 * Returns a range of all the add fda personnel fours where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddFdaPersonnelFourModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add fda personnel fours
	 * @param end the upper bound of the range of add fda personnel fours (not inclusive)
	 * @return the range of matching add fda personnel fours
	 */
	public static List<AddFdaPersonnelFour> findBygetJanaacById(
		long janaacApplicationId, int start, int end) {

		return getPersistence().findBygetJanaacById(
			janaacApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the add fda personnel fours where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddFdaPersonnelFourModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add fda personnel fours
	 * @param end the upper bound of the range of add fda personnel fours (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching add fda personnel fours
	 */
	public static List<AddFdaPersonnelFour> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		OrderByComparator<AddFdaPersonnelFour> orderByComparator) {

		return getPersistence().findBygetJanaacById(
			janaacApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the add fda personnel fours where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddFdaPersonnelFourModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add fda personnel fours
	 * @param end the upper bound of the range of add fda personnel fours (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching add fda personnel fours
	 */
	public static List<AddFdaPersonnelFour> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		OrderByComparator<AddFdaPersonnelFour> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetJanaacById(
			janaacApplicationId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first add fda personnel four in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add fda personnel four
	 * @throws NoSuchAddFdaPersonnelFourException if a matching add fda personnel four could not be found
	 */
	public static AddFdaPersonnelFour findBygetJanaacById_First(
			long janaacApplicationId,
			OrderByComparator<AddFdaPersonnelFour> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddFdaPersonnelFourException {

		return getPersistence().findBygetJanaacById_First(
			janaacApplicationId, orderByComparator);
	}

	/**
	 * Returns the first add fda personnel four in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add fda personnel four, or <code>null</code> if a matching add fda personnel four could not be found
	 */
	public static AddFdaPersonnelFour fetchBygetJanaacById_First(
		long janaacApplicationId,
		OrderByComparator<AddFdaPersonnelFour> orderByComparator) {

		return getPersistence().fetchBygetJanaacById_First(
			janaacApplicationId, orderByComparator);
	}

	/**
	 * Returns the last add fda personnel four in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add fda personnel four
	 * @throws NoSuchAddFdaPersonnelFourException if a matching add fda personnel four could not be found
	 */
	public static AddFdaPersonnelFour findBygetJanaacById_Last(
			long janaacApplicationId,
			OrderByComparator<AddFdaPersonnelFour> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddFdaPersonnelFourException {

		return getPersistence().findBygetJanaacById_Last(
			janaacApplicationId, orderByComparator);
	}

	/**
	 * Returns the last add fda personnel four in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add fda personnel four, or <code>null</code> if a matching add fda personnel four could not be found
	 */
	public static AddFdaPersonnelFour fetchBygetJanaacById_Last(
		long janaacApplicationId,
		OrderByComparator<AddFdaPersonnelFour> orderByComparator) {

		return getPersistence().fetchBygetJanaacById_Last(
			janaacApplicationId, orderByComparator);
	}

	/**
	 * Returns the add fda personnel fours before and after the current add fda personnel four in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param addFdaPersonnelFourId the primary key of the current add fda personnel four
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next add fda personnel four
	 * @throws NoSuchAddFdaPersonnelFourException if a add fda personnel four with the primary key could not be found
	 */
	public static AddFdaPersonnelFour[] findBygetJanaacById_PrevAndNext(
			long addFdaPersonnelFourId, long janaacApplicationId,
			OrderByComparator<AddFdaPersonnelFour> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddFdaPersonnelFourException {

		return getPersistence().findBygetJanaacById_PrevAndNext(
			addFdaPersonnelFourId, janaacApplicationId, orderByComparator);
	}

	/**
	 * Removes all the add fda personnel fours where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 */
	public static void removeBygetJanaacById(long janaacApplicationId) {
		getPersistence().removeBygetJanaacById(janaacApplicationId);
	}

	/**
	 * Returns the number of add fda personnel fours where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching add fda personnel fours
	 */
	public static int countBygetJanaacById(long janaacApplicationId) {
		return getPersistence().countBygetJanaacById(janaacApplicationId);
	}

	/**
	 * Caches the add fda personnel four in the entity cache if it is enabled.
	 *
	 * @param addFdaPersonnelFour the add fda personnel four
	 */
	public static void cacheResult(AddFdaPersonnelFour addFdaPersonnelFour) {
		getPersistence().cacheResult(addFdaPersonnelFour);
	}

	/**
	 * Caches the add fda personnel fours in the entity cache if it is enabled.
	 *
	 * @param addFdaPersonnelFours the add fda personnel fours
	 */
	public static void cacheResult(
		List<AddFdaPersonnelFour> addFdaPersonnelFours) {

		getPersistence().cacheResult(addFdaPersonnelFours);
	}

	/**
	 * Creates a new add fda personnel four with the primary key. Does not add the add fda personnel four to the database.
	 *
	 * @param addFdaPersonnelFourId the primary key for the new add fda personnel four
	 * @return the new add fda personnel four
	 */
	public static AddFdaPersonnelFour create(long addFdaPersonnelFourId) {
		return getPersistence().create(addFdaPersonnelFourId);
	}

	/**
	 * Removes the add fda personnel four with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param addFdaPersonnelFourId the primary key of the add fda personnel four
	 * @return the add fda personnel four that was removed
	 * @throws NoSuchAddFdaPersonnelFourException if a add fda personnel four with the primary key could not be found
	 */
	public static AddFdaPersonnelFour remove(long addFdaPersonnelFourId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddFdaPersonnelFourException {

		return getPersistence().remove(addFdaPersonnelFourId);
	}

	public static AddFdaPersonnelFour updateImpl(
		AddFdaPersonnelFour addFdaPersonnelFour) {

		return getPersistence().updateImpl(addFdaPersonnelFour);
	}

	/**
	 * Returns the add fda personnel four with the primary key or throws a <code>NoSuchAddFdaPersonnelFourException</code> if it could not be found.
	 *
	 * @param addFdaPersonnelFourId the primary key of the add fda personnel four
	 * @return the add fda personnel four
	 * @throws NoSuchAddFdaPersonnelFourException if a add fda personnel four with the primary key could not be found
	 */
	public static AddFdaPersonnelFour findByPrimaryKey(
			long addFdaPersonnelFourId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddFdaPersonnelFourException {

		return getPersistence().findByPrimaryKey(addFdaPersonnelFourId);
	}

	/**
	 * Returns the add fda personnel four with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param addFdaPersonnelFourId the primary key of the add fda personnel four
	 * @return the add fda personnel four, or <code>null</code> if a add fda personnel four with the primary key could not be found
	 */
	public static AddFdaPersonnelFour fetchByPrimaryKey(
		long addFdaPersonnelFourId) {

		return getPersistence().fetchByPrimaryKey(addFdaPersonnelFourId);
	}

	/**
	 * Returns all the add fda personnel fours.
	 *
	 * @return the add fda personnel fours
	 */
	public static List<AddFdaPersonnelFour> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the add fda personnel fours.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddFdaPersonnelFourModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add fda personnel fours
	 * @param end the upper bound of the range of add fda personnel fours (not inclusive)
	 * @return the range of add fda personnel fours
	 */
	public static List<AddFdaPersonnelFour> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the add fda personnel fours.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddFdaPersonnelFourModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add fda personnel fours
	 * @param end the upper bound of the range of add fda personnel fours (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of add fda personnel fours
	 */
	public static List<AddFdaPersonnelFour> findAll(
		int start, int end,
		OrderByComparator<AddFdaPersonnelFour> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the add fda personnel fours.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddFdaPersonnelFourModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add fda personnel fours
	 * @param end the upper bound of the range of add fda personnel fours (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of add fda personnel fours
	 */
	public static List<AddFdaPersonnelFour> findAll(
		int start, int end,
		OrderByComparator<AddFdaPersonnelFour> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the add fda personnel fours from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of add fda personnel fours.
	 *
	 * @return the number of add fda personnel fours
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AddFdaPersonnelFourPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		AddFdaPersonnelFourPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile AddFdaPersonnelFourPersistence _persistence;

}