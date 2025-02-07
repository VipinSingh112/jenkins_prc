/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.janaac.application.form.service.model.AddInsOrgInfoThird;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the add ins org info third service. This utility wraps <code>com.nbp.janaac.application.form.service.service.persistence.impl.AddInsOrgInfoThirdPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AddInsOrgInfoThirdPersistence
 * @generated
 */
public class AddInsOrgInfoThirdUtil {

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
	public static void clearCache(AddInsOrgInfoThird addInsOrgInfoThird) {
		getPersistence().clearCache(addInsOrgInfoThird);
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
	public static Map<Serializable, AddInsOrgInfoThird> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AddInsOrgInfoThird> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AddInsOrgInfoThird> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AddInsOrgInfoThird> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AddInsOrgInfoThird> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AddInsOrgInfoThird update(
		AddInsOrgInfoThird addInsOrgInfoThird) {

		return getPersistence().update(addInsOrgInfoThird);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AddInsOrgInfoThird update(
		AddInsOrgInfoThird addInsOrgInfoThird, ServiceContext serviceContext) {

		return getPersistence().update(addInsOrgInfoThird, serviceContext);
	}

	/**
	 * Returns all the add ins org info thirds where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching add ins org info thirds
	 */
	public static List<AddInsOrgInfoThird> findBygetJanaacById(
		long janaacApplicationId) {

		return getPersistence().findBygetJanaacById(janaacApplicationId);
	}

	/**
	 * Returns a range of all the add ins org info thirds where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddInsOrgInfoThirdModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add ins org info thirds
	 * @param end the upper bound of the range of add ins org info thirds (not inclusive)
	 * @return the range of matching add ins org info thirds
	 */
	public static List<AddInsOrgInfoThird> findBygetJanaacById(
		long janaacApplicationId, int start, int end) {

		return getPersistence().findBygetJanaacById(
			janaacApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the add ins org info thirds where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddInsOrgInfoThirdModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add ins org info thirds
	 * @param end the upper bound of the range of add ins org info thirds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching add ins org info thirds
	 */
	public static List<AddInsOrgInfoThird> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		OrderByComparator<AddInsOrgInfoThird> orderByComparator) {

		return getPersistence().findBygetJanaacById(
			janaacApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the add ins org info thirds where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddInsOrgInfoThirdModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add ins org info thirds
	 * @param end the upper bound of the range of add ins org info thirds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching add ins org info thirds
	 */
	public static List<AddInsOrgInfoThird> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		OrderByComparator<AddInsOrgInfoThird> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetJanaacById(
			janaacApplicationId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first add ins org info third in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add ins org info third
	 * @throws NoSuchAddInsOrgInfoThirdException if a matching add ins org info third could not be found
	 */
	public static AddInsOrgInfoThird findBygetJanaacById_First(
			long janaacApplicationId,
			OrderByComparator<AddInsOrgInfoThird> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddInsOrgInfoThirdException {

		return getPersistence().findBygetJanaacById_First(
			janaacApplicationId, orderByComparator);
	}

	/**
	 * Returns the first add ins org info third in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add ins org info third, or <code>null</code> if a matching add ins org info third could not be found
	 */
	public static AddInsOrgInfoThird fetchBygetJanaacById_First(
		long janaacApplicationId,
		OrderByComparator<AddInsOrgInfoThird> orderByComparator) {

		return getPersistence().fetchBygetJanaacById_First(
			janaacApplicationId, orderByComparator);
	}

	/**
	 * Returns the last add ins org info third in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add ins org info third
	 * @throws NoSuchAddInsOrgInfoThirdException if a matching add ins org info third could not be found
	 */
	public static AddInsOrgInfoThird findBygetJanaacById_Last(
			long janaacApplicationId,
			OrderByComparator<AddInsOrgInfoThird> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddInsOrgInfoThirdException {

		return getPersistence().findBygetJanaacById_Last(
			janaacApplicationId, orderByComparator);
	}

	/**
	 * Returns the last add ins org info third in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add ins org info third, or <code>null</code> if a matching add ins org info third could not be found
	 */
	public static AddInsOrgInfoThird fetchBygetJanaacById_Last(
		long janaacApplicationId,
		OrderByComparator<AddInsOrgInfoThird> orderByComparator) {

		return getPersistence().fetchBygetJanaacById_Last(
			janaacApplicationId, orderByComparator);
	}

	/**
	 * Returns the add ins org info thirds before and after the current add ins org info third in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param AddInsOrgInfoThirdId the primary key of the current add ins org info third
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next add ins org info third
	 * @throws NoSuchAddInsOrgInfoThirdException if a add ins org info third with the primary key could not be found
	 */
	public static AddInsOrgInfoThird[] findBygetJanaacById_PrevAndNext(
			long AddInsOrgInfoThirdId, long janaacApplicationId,
			OrderByComparator<AddInsOrgInfoThird> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddInsOrgInfoThirdException {

		return getPersistence().findBygetJanaacById_PrevAndNext(
			AddInsOrgInfoThirdId, janaacApplicationId, orderByComparator);
	}

	/**
	 * Removes all the add ins org info thirds where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 */
	public static void removeBygetJanaacById(long janaacApplicationId) {
		getPersistence().removeBygetJanaacById(janaacApplicationId);
	}

	/**
	 * Returns the number of add ins org info thirds where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching add ins org info thirds
	 */
	public static int countBygetJanaacById(long janaacApplicationId) {
		return getPersistence().countBygetJanaacById(janaacApplicationId);
	}

	/**
	 * Caches the add ins org info third in the entity cache if it is enabled.
	 *
	 * @param addInsOrgInfoThird the add ins org info third
	 */
	public static void cacheResult(AddInsOrgInfoThird addInsOrgInfoThird) {
		getPersistence().cacheResult(addInsOrgInfoThird);
	}

	/**
	 * Caches the add ins org info thirds in the entity cache if it is enabled.
	 *
	 * @param addInsOrgInfoThirds the add ins org info thirds
	 */
	public static void cacheResult(
		List<AddInsOrgInfoThird> addInsOrgInfoThirds) {

		getPersistence().cacheResult(addInsOrgInfoThirds);
	}

	/**
	 * Creates a new add ins org info third with the primary key. Does not add the add ins org info third to the database.
	 *
	 * @param AddInsOrgInfoThirdId the primary key for the new add ins org info third
	 * @return the new add ins org info third
	 */
	public static AddInsOrgInfoThird create(long AddInsOrgInfoThirdId) {
		return getPersistence().create(AddInsOrgInfoThirdId);
	}

	/**
	 * Removes the add ins org info third with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param AddInsOrgInfoThirdId the primary key of the add ins org info third
	 * @return the add ins org info third that was removed
	 * @throws NoSuchAddInsOrgInfoThirdException if a add ins org info third with the primary key could not be found
	 */
	public static AddInsOrgInfoThird remove(long AddInsOrgInfoThirdId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddInsOrgInfoThirdException {

		return getPersistence().remove(AddInsOrgInfoThirdId);
	}

	public static AddInsOrgInfoThird updateImpl(
		AddInsOrgInfoThird addInsOrgInfoThird) {

		return getPersistence().updateImpl(addInsOrgInfoThird);
	}

	/**
	 * Returns the add ins org info third with the primary key or throws a <code>NoSuchAddInsOrgInfoThirdException</code> if it could not be found.
	 *
	 * @param AddInsOrgInfoThirdId the primary key of the add ins org info third
	 * @return the add ins org info third
	 * @throws NoSuchAddInsOrgInfoThirdException if a add ins org info third with the primary key could not be found
	 */
	public static AddInsOrgInfoThird findByPrimaryKey(long AddInsOrgInfoThirdId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddInsOrgInfoThirdException {

		return getPersistence().findByPrimaryKey(AddInsOrgInfoThirdId);
	}

	/**
	 * Returns the add ins org info third with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param AddInsOrgInfoThirdId the primary key of the add ins org info third
	 * @return the add ins org info third, or <code>null</code> if a add ins org info third with the primary key could not be found
	 */
	public static AddInsOrgInfoThird fetchByPrimaryKey(
		long AddInsOrgInfoThirdId) {

		return getPersistence().fetchByPrimaryKey(AddInsOrgInfoThirdId);
	}

	/**
	 * Returns all the add ins org info thirds.
	 *
	 * @return the add ins org info thirds
	 */
	public static List<AddInsOrgInfoThird> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the add ins org info thirds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddInsOrgInfoThirdModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add ins org info thirds
	 * @param end the upper bound of the range of add ins org info thirds (not inclusive)
	 * @return the range of add ins org info thirds
	 */
	public static List<AddInsOrgInfoThird> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the add ins org info thirds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddInsOrgInfoThirdModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add ins org info thirds
	 * @param end the upper bound of the range of add ins org info thirds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of add ins org info thirds
	 */
	public static List<AddInsOrgInfoThird> findAll(
		int start, int end,
		OrderByComparator<AddInsOrgInfoThird> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the add ins org info thirds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddInsOrgInfoThirdModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add ins org info thirds
	 * @param end the upper bound of the range of add ins org info thirds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of add ins org info thirds
	 */
	public static List<AddInsOrgInfoThird> findAll(
		int start, int end,
		OrderByComparator<AddInsOrgInfoThird> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the add ins org info thirds from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of add ins org info thirds.
	 *
	 * @return the number of add ins org info thirds
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AddInsOrgInfoThirdPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		AddInsOrgInfoThirdPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile AddInsOrgInfoThirdPersistence _persistence;

}