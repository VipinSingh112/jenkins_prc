/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.janaac.application.form.service.model.AddCerPersonnelThird;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the add cer personnel third service. This utility wraps <code>com.nbp.janaac.application.form.service.service.persistence.impl.AddCerPersonnelThirdPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AddCerPersonnelThirdPersistence
 * @generated
 */
public class AddCerPersonnelThirdUtil {

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
	public static void clearCache(AddCerPersonnelThird addCerPersonnelThird) {
		getPersistence().clearCache(addCerPersonnelThird);
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
	public static Map<Serializable, AddCerPersonnelThird> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AddCerPersonnelThird> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AddCerPersonnelThird> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AddCerPersonnelThird> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AddCerPersonnelThird> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AddCerPersonnelThird update(
		AddCerPersonnelThird addCerPersonnelThird) {

		return getPersistence().update(addCerPersonnelThird);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AddCerPersonnelThird update(
		AddCerPersonnelThird addCerPersonnelThird,
		ServiceContext serviceContext) {

		return getPersistence().update(addCerPersonnelThird, serviceContext);
	}

	/**
	 * Returns all the add cer personnel thirds where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching add cer personnel thirds
	 */
	public static List<AddCerPersonnelThird> findBygetJanaacById(
		long janaacApplicationId) {

		return getPersistence().findBygetJanaacById(janaacApplicationId);
	}

	/**
	 * Returns a range of all the add cer personnel thirds where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddCerPersonnelThirdModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add cer personnel thirds
	 * @param end the upper bound of the range of add cer personnel thirds (not inclusive)
	 * @return the range of matching add cer personnel thirds
	 */
	public static List<AddCerPersonnelThird> findBygetJanaacById(
		long janaacApplicationId, int start, int end) {

		return getPersistence().findBygetJanaacById(
			janaacApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the add cer personnel thirds where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddCerPersonnelThirdModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add cer personnel thirds
	 * @param end the upper bound of the range of add cer personnel thirds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching add cer personnel thirds
	 */
	public static List<AddCerPersonnelThird> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		OrderByComparator<AddCerPersonnelThird> orderByComparator) {

		return getPersistence().findBygetJanaacById(
			janaacApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the add cer personnel thirds where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddCerPersonnelThirdModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add cer personnel thirds
	 * @param end the upper bound of the range of add cer personnel thirds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching add cer personnel thirds
	 */
	public static List<AddCerPersonnelThird> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		OrderByComparator<AddCerPersonnelThird> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetJanaacById(
			janaacApplicationId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first add cer personnel third in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add cer personnel third
	 * @throws NoSuchAddCerPersonnelThirdException if a matching add cer personnel third could not be found
	 */
	public static AddCerPersonnelThird findBygetJanaacById_First(
			long janaacApplicationId,
			OrderByComparator<AddCerPersonnelThird> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddCerPersonnelThirdException {

		return getPersistence().findBygetJanaacById_First(
			janaacApplicationId, orderByComparator);
	}

	/**
	 * Returns the first add cer personnel third in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add cer personnel third, or <code>null</code> if a matching add cer personnel third could not be found
	 */
	public static AddCerPersonnelThird fetchBygetJanaacById_First(
		long janaacApplicationId,
		OrderByComparator<AddCerPersonnelThird> orderByComparator) {

		return getPersistence().fetchBygetJanaacById_First(
			janaacApplicationId, orderByComparator);
	}

	/**
	 * Returns the last add cer personnel third in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add cer personnel third
	 * @throws NoSuchAddCerPersonnelThirdException if a matching add cer personnel third could not be found
	 */
	public static AddCerPersonnelThird findBygetJanaacById_Last(
			long janaacApplicationId,
			OrderByComparator<AddCerPersonnelThird> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddCerPersonnelThirdException {

		return getPersistence().findBygetJanaacById_Last(
			janaacApplicationId, orderByComparator);
	}

	/**
	 * Returns the last add cer personnel third in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add cer personnel third, or <code>null</code> if a matching add cer personnel third could not be found
	 */
	public static AddCerPersonnelThird fetchBygetJanaacById_Last(
		long janaacApplicationId,
		OrderByComparator<AddCerPersonnelThird> orderByComparator) {

		return getPersistence().fetchBygetJanaacById_Last(
			janaacApplicationId, orderByComparator);
	}

	/**
	 * Returns the add cer personnel thirds before and after the current add cer personnel third in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param addCerPersonnelThirdId the primary key of the current add cer personnel third
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next add cer personnel third
	 * @throws NoSuchAddCerPersonnelThirdException if a add cer personnel third with the primary key could not be found
	 */
	public static AddCerPersonnelThird[] findBygetJanaacById_PrevAndNext(
			long addCerPersonnelThirdId, long janaacApplicationId,
			OrderByComparator<AddCerPersonnelThird> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddCerPersonnelThirdException {

		return getPersistence().findBygetJanaacById_PrevAndNext(
			addCerPersonnelThirdId, janaacApplicationId, orderByComparator);
	}

	/**
	 * Removes all the add cer personnel thirds where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 */
	public static void removeBygetJanaacById(long janaacApplicationId) {
		getPersistence().removeBygetJanaacById(janaacApplicationId);
	}

	/**
	 * Returns the number of add cer personnel thirds where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching add cer personnel thirds
	 */
	public static int countBygetJanaacById(long janaacApplicationId) {
		return getPersistence().countBygetJanaacById(janaacApplicationId);
	}

	/**
	 * Caches the add cer personnel third in the entity cache if it is enabled.
	 *
	 * @param addCerPersonnelThird the add cer personnel third
	 */
	public static void cacheResult(AddCerPersonnelThird addCerPersonnelThird) {
		getPersistence().cacheResult(addCerPersonnelThird);
	}

	/**
	 * Caches the add cer personnel thirds in the entity cache if it is enabled.
	 *
	 * @param addCerPersonnelThirds the add cer personnel thirds
	 */
	public static void cacheResult(
		List<AddCerPersonnelThird> addCerPersonnelThirds) {

		getPersistence().cacheResult(addCerPersonnelThirds);
	}

	/**
	 * Creates a new add cer personnel third with the primary key. Does not add the add cer personnel third to the database.
	 *
	 * @param addCerPersonnelThirdId the primary key for the new add cer personnel third
	 * @return the new add cer personnel third
	 */
	public static AddCerPersonnelThird create(long addCerPersonnelThirdId) {
		return getPersistence().create(addCerPersonnelThirdId);
	}

	/**
	 * Removes the add cer personnel third with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param addCerPersonnelThirdId the primary key of the add cer personnel third
	 * @return the add cer personnel third that was removed
	 * @throws NoSuchAddCerPersonnelThirdException if a add cer personnel third with the primary key could not be found
	 */
	public static AddCerPersonnelThird remove(long addCerPersonnelThirdId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddCerPersonnelThirdException {

		return getPersistence().remove(addCerPersonnelThirdId);
	}

	public static AddCerPersonnelThird updateImpl(
		AddCerPersonnelThird addCerPersonnelThird) {

		return getPersistence().updateImpl(addCerPersonnelThird);
	}

	/**
	 * Returns the add cer personnel third with the primary key or throws a <code>NoSuchAddCerPersonnelThirdException</code> if it could not be found.
	 *
	 * @param addCerPersonnelThirdId the primary key of the add cer personnel third
	 * @return the add cer personnel third
	 * @throws NoSuchAddCerPersonnelThirdException if a add cer personnel third with the primary key could not be found
	 */
	public static AddCerPersonnelThird findByPrimaryKey(
			long addCerPersonnelThirdId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddCerPersonnelThirdException {

		return getPersistence().findByPrimaryKey(addCerPersonnelThirdId);
	}

	/**
	 * Returns the add cer personnel third with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param addCerPersonnelThirdId the primary key of the add cer personnel third
	 * @return the add cer personnel third, or <code>null</code> if a add cer personnel third with the primary key could not be found
	 */
	public static AddCerPersonnelThird fetchByPrimaryKey(
		long addCerPersonnelThirdId) {

		return getPersistence().fetchByPrimaryKey(addCerPersonnelThirdId);
	}

	/**
	 * Returns all the add cer personnel thirds.
	 *
	 * @return the add cer personnel thirds
	 */
	public static List<AddCerPersonnelThird> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the add cer personnel thirds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddCerPersonnelThirdModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add cer personnel thirds
	 * @param end the upper bound of the range of add cer personnel thirds (not inclusive)
	 * @return the range of add cer personnel thirds
	 */
	public static List<AddCerPersonnelThird> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the add cer personnel thirds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddCerPersonnelThirdModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add cer personnel thirds
	 * @param end the upper bound of the range of add cer personnel thirds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of add cer personnel thirds
	 */
	public static List<AddCerPersonnelThird> findAll(
		int start, int end,
		OrderByComparator<AddCerPersonnelThird> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the add cer personnel thirds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddCerPersonnelThirdModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add cer personnel thirds
	 * @param end the upper bound of the range of add cer personnel thirds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of add cer personnel thirds
	 */
	public static List<AddCerPersonnelThird> findAll(
		int start, int end,
		OrderByComparator<AddCerPersonnelThird> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the add cer personnel thirds from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of add cer personnel thirds.
	 *
	 * @return the number of add cer personnel thirds
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AddCerPersonnelThirdPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		AddCerPersonnelThirdPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile AddCerPersonnelThirdPersistence _persistence;

}