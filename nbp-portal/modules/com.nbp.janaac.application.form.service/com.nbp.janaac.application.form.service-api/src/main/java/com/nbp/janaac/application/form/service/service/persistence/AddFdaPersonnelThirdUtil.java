/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.janaac.application.form.service.model.AddFdaPersonnelThird;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the add fda personnel third service. This utility wraps <code>com.nbp.janaac.application.form.service.service.persistence.impl.AddFdaPersonnelThirdPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AddFdaPersonnelThirdPersistence
 * @generated
 */
public class AddFdaPersonnelThirdUtil {

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
	public static void clearCache(AddFdaPersonnelThird addFdaPersonnelThird) {
		getPersistence().clearCache(addFdaPersonnelThird);
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
	public static Map<Serializable, AddFdaPersonnelThird> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AddFdaPersonnelThird> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AddFdaPersonnelThird> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AddFdaPersonnelThird> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AddFdaPersonnelThird> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AddFdaPersonnelThird update(
		AddFdaPersonnelThird addFdaPersonnelThird) {

		return getPersistence().update(addFdaPersonnelThird);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AddFdaPersonnelThird update(
		AddFdaPersonnelThird addFdaPersonnelThird,
		ServiceContext serviceContext) {

		return getPersistence().update(addFdaPersonnelThird, serviceContext);
	}

	/**
	 * Returns all the add fda personnel thirds where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching add fda personnel thirds
	 */
	public static List<AddFdaPersonnelThird> findBygetJanaacById(
		long janaacApplicationId) {

		return getPersistence().findBygetJanaacById(janaacApplicationId);
	}

	/**
	 * Returns a range of all the add fda personnel thirds where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddFdaPersonnelThirdModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add fda personnel thirds
	 * @param end the upper bound of the range of add fda personnel thirds (not inclusive)
	 * @return the range of matching add fda personnel thirds
	 */
	public static List<AddFdaPersonnelThird> findBygetJanaacById(
		long janaacApplicationId, int start, int end) {

		return getPersistence().findBygetJanaacById(
			janaacApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the add fda personnel thirds where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddFdaPersonnelThirdModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add fda personnel thirds
	 * @param end the upper bound of the range of add fda personnel thirds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching add fda personnel thirds
	 */
	public static List<AddFdaPersonnelThird> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		OrderByComparator<AddFdaPersonnelThird> orderByComparator) {

		return getPersistence().findBygetJanaacById(
			janaacApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the add fda personnel thirds where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddFdaPersonnelThirdModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add fda personnel thirds
	 * @param end the upper bound of the range of add fda personnel thirds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching add fda personnel thirds
	 */
	public static List<AddFdaPersonnelThird> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		OrderByComparator<AddFdaPersonnelThird> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetJanaacById(
			janaacApplicationId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first add fda personnel third in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add fda personnel third
	 * @throws NoSuchAddFdaPersonnelThirdException if a matching add fda personnel third could not be found
	 */
	public static AddFdaPersonnelThird findBygetJanaacById_First(
			long janaacApplicationId,
			OrderByComparator<AddFdaPersonnelThird> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddFdaPersonnelThirdException {

		return getPersistence().findBygetJanaacById_First(
			janaacApplicationId, orderByComparator);
	}

	/**
	 * Returns the first add fda personnel third in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add fda personnel third, or <code>null</code> if a matching add fda personnel third could not be found
	 */
	public static AddFdaPersonnelThird fetchBygetJanaacById_First(
		long janaacApplicationId,
		OrderByComparator<AddFdaPersonnelThird> orderByComparator) {

		return getPersistence().fetchBygetJanaacById_First(
			janaacApplicationId, orderByComparator);
	}

	/**
	 * Returns the last add fda personnel third in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add fda personnel third
	 * @throws NoSuchAddFdaPersonnelThirdException if a matching add fda personnel third could not be found
	 */
	public static AddFdaPersonnelThird findBygetJanaacById_Last(
			long janaacApplicationId,
			OrderByComparator<AddFdaPersonnelThird> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddFdaPersonnelThirdException {

		return getPersistence().findBygetJanaacById_Last(
			janaacApplicationId, orderByComparator);
	}

	/**
	 * Returns the last add fda personnel third in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add fda personnel third, or <code>null</code> if a matching add fda personnel third could not be found
	 */
	public static AddFdaPersonnelThird fetchBygetJanaacById_Last(
		long janaacApplicationId,
		OrderByComparator<AddFdaPersonnelThird> orderByComparator) {

		return getPersistence().fetchBygetJanaacById_Last(
			janaacApplicationId, orderByComparator);
	}

	/**
	 * Returns the add fda personnel thirds before and after the current add fda personnel third in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param addFdaPersonnelThirdId the primary key of the current add fda personnel third
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next add fda personnel third
	 * @throws NoSuchAddFdaPersonnelThirdException if a add fda personnel third with the primary key could not be found
	 */
	public static AddFdaPersonnelThird[] findBygetJanaacById_PrevAndNext(
			long addFdaPersonnelThirdId, long janaacApplicationId,
			OrderByComparator<AddFdaPersonnelThird> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddFdaPersonnelThirdException {

		return getPersistence().findBygetJanaacById_PrevAndNext(
			addFdaPersonnelThirdId, janaacApplicationId, orderByComparator);
	}

	/**
	 * Removes all the add fda personnel thirds where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 */
	public static void removeBygetJanaacById(long janaacApplicationId) {
		getPersistence().removeBygetJanaacById(janaacApplicationId);
	}

	/**
	 * Returns the number of add fda personnel thirds where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching add fda personnel thirds
	 */
	public static int countBygetJanaacById(long janaacApplicationId) {
		return getPersistence().countBygetJanaacById(janaacApplicationId);
	}

	/**
	 * Caches the add fda personnel third in the entity cache if it is enabled.
	 *
	 * @param addFdaPersonnelThird the add fda personnel third
	 */
	public static void cacheResult(AddFdaPersonnelThird addFdaPersonnelThird) {
		getPersistence().cacheResult(addFdaPersonnelThird);
	}

	/**
	 * Caches the add fda personnel thirds in the entity cache if it is enabled.
	 *
	 * @param addFdaPersonnelThirds the add fda personnel thirds
	 */
	public static void cacheResult(
		List<AddFdaPersonnelThird> addFdaPersonnelThirds) {

		getPersistence().cacheResult(addFdaPersonnelThirds);
	}

	/**
	 * Creates a new add fda personnel third with the primary key. Does not add the add fda personnel third to the database.
	 *
	 * @param addFdaPersonnelThirdId the primary key for the new add fda personnel third
	 * @return the new add fda personnel third
	 */
	public static AddFdaPersonnelThird create(long addFdaPersonnelThirdId) {
		return getPersistence().create(addFdaPersonnelThirdId);
	}

	/**
	 * Removes the add fda personnel third with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param addFdaPersonnelThirdId the primary key of the add fda personnel third
	 * @return the add fda personnel third that was removed
	 * @throws NoSuchAddFdaPersonnelThirdException if a add fda personnel third with the primary key could not be found
	 */
	public static AddFdaPersonnelThird remove(long addFdaPersonnelThirdId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddFdaPersonnelThirdException {

		return getPersistence().remove(addFdaPersonnelThirdId);
	}

	public static AddFdaPersonnelThird updateImpl(
		AddFdaPersonnelThird addFdaPersonnelThird) {

		return getPersistence().updateImpl(addFdaPersonnelThird);
	}

	/**
	 * Returns the add fda personnel third with the primary key or throws a <code>NoSuchAddFdaPersonnelThirdException</code> if it could not be found.
	 *
	 * @param addFdaPersonnelThirdId the primary key of the add fda personnel third
	 * @return the add fda personnel third
	 * @throws NoSuchAddFdaPersonnelThirdException if a add fda personnel third with the primary key could not be found
	 */
	public static AddFdaPersonnelThird findByPrimaryKey(
			long addFdaPersonnelThirdId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddFdaPersonnelThirdException {

		return getPersistence().findByPrimaryKey(addFdaPersonnelThirdId);
	}

	/**
	 * Returns the add fda personnel third with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param addFdaPersonnelThirdId the primary key of the add fda personnel third
	 * @return the add fda personnel third, or <code>null</code> if a add fda personnel third with the primary key could not be found
	 */
	public static AddFdaPersonnelThird fetchByPrimaryKey(
		long addFdaPersonnelThirdId) {

		return getPersistence().fetchByPrimaryKey(addFdaPersonnelThirdId);
	}

	/**
	 * Returns all the add fda personnel thirds.
	 *
	 * @return the add fda personnel thirds
	 */
	public static List<AddFdaPersonnelThird> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the add fda personnel thirds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddFdaPersonnelThirdModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add fda personnel thirds
	 * @param end the upper bound of the range of add fda personnel thirds (not inclusive)
	 * @return the range of add fda personnel thirds
	 */
	public static List<AddFdaPersonnelThird> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the add fda personnel thirds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddFdaPersonnelThirdModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add fda personnel thirds
	 * @param end the upper bound of the range of add fda personnel thirds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of add fda personnel thirds
	 */
	public static List<AddFdaPersonnelThird> findAll(
		int start, int end,
		OrderByComparator<AddFdaPersonnelThird> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the add fda personnel thirds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddFdaPersonnelThirdModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add fda personnel thirds
	 * @param end the upper bound of the range of add fda personnel thirds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of add fda personnel thirds
	 */
	public static List<AddFdaPersonnelThird> findAll(
		int start, int end,
		OrderByComparator<AddFdaPersonnelThird> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the add fda personnel thirds from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of add fda personnel thirds.
	 *
	 * @return the number of add fda personnel thirds
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AddFdaPersonnelThirdPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		AddFdaPersonnelThirdPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile AddFdaPersonnelThirdPersistence _persistence;

}