/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.janaac.application.form.service.model.AddCerScopeServiceThird;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the add cer scope service third service. This utility wraps <code>com.nbp.janaac.application.form.service.service.persistence.impl.AddCerScopeServiceThirdPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AddCerScopeServiceThirdPersistence
 * @generated
 */
public class AddCerScopeServiceThirdUtil {

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
		AddCerScopeServiceThird addCerScopeServiceThird) {

		getPersistence().clearCache(addCerScopeServiceThird);
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
	public static Map<Serializable, AddCerScopeServiceThird> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AddCerScopeServiceThird> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AddCerScopeServiceThird> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AddCerScopeServiceThird> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AddCerScopeServiceThird> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AddCerScopeServiceThird update(
		AddCerScopeServiceThird addCerScopeServiceThird) {

		return getPersistence().update(addCerScopeServiceThird);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AddCerScopeServiceThird update(
		AddCerScopeServiceThird addCerScopeServiceThird,
		ServiceContext serviceContext) {

		return getPersistence().update(addCerScopeServiceThird, serviceContext);
	}

	/**
	 * Returns all the add cer scope service thirds where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching add cer scope service thirds
	 */
	public static List<AddCerScopeServiceThird> findBygetJanaacById(
		long janaacApplicationId) {

		return getPersistence().findBygetJanaacById(janaacApplicationId);
	}

	/**
	 * Returns a range of all the add cer scope service thirds where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddCerScopeServiceThirdModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add cer scope service thirds
	 * @param end the upper bound of the range of add cer scope service thirds (not inclusive)
	 * @return the range of matching add cer scope service thirds
	 */
	public static List<AddCerScopeServiceThird> findBygetJanaacById(
		long janaacApplicationId, int start, int end) {

		return getPersistence().findBygetJanaacById(
			janaacApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the add cer scope service thirds where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddCerScopeServiceThirdModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add cer scope service thirds
	 * @param end the upper bound of the range of add cer scope service thirds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching add cer scope service thirds
	 */
	public static List<AddCerScopeServiceThird> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		OrderByComparator<AddCerScopeServiceThird> orderByComparator) {

		return getPersistence().findBygetJanaacById(
			janaacApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the add cer scope service thirds where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddCerScopeServiceThirdModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add cer scope service thirds
	 * @param end the upper bound of the range of add cer scope service thirds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching add cer scope service thirds
	 */
	public static List<AddCerScopeServiceThird> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		OrderByComparator<AddCerScopeServiceThird> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetJanaacById(
			janaacApplicationId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first add cer scope service third in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add cer scope service third
	 * @throws NoSuchAddCerScopeServiceThirdException if a matching add cer scope service third could not be found
	 */
	public static AddCerScopeServiceThird findBygetJanaacById_First(
			long janaacApplicationId,
			OrderByComparator<AddCerScopeServiceThird> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddCerScopeServiceThirdException {

		return getPersistence().findBygetJanaacById_First(
			janaacApplicationId, orderByComparator);
	}

	/**
	 * Returns the first add cer scope service third in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add cer scope service third, or <code>null</code> if a matching add cer scope service third could not be found
	 */
	public static AddCerScopeServiceThird fetchBygetJanaacById_First(
		long janaacApplicationId,
		OrderByComparator<AddCerScopeServiceThird> orderByComparator) {

		return getPersistence().fetchBygetJanaacById_First(
			janaacApplicationId, orderByComparator);
	}

	/**
	 * Returns the last add cer scope service third in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add cer scope service third
	 * @throws NoSuchAddCerScopeServiceThirdException if a matching add cer scope service third could not be found
	 */
	public static AddCerScopeServiceThird findBygetJanaacById_Last(
			long janaacApplicationId,
			OrderByComparator<AddCerScopeServiceThird> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddCerScopeServiceThirdException {

		return getPersistence().findBygetJanaacById_Last(
			janaacApplicationId, orderByComparator);
	}

	/**
	 * Returns the last add cer scope service third in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add cer scope service third, or <code>null</code> if a matching add cer scope service third could not be found
	 */
	public static AddCerScopeServiceThird fetchBygetJanaacById_Last(
		long janaacApplicationId,
		OrderByComparator<AddCerScopeServiceThird> orderByComparator) {

		return getPersistence().fetchBygetJanaacById_Last(
			janaacApplicationId, orderByComparator);
	}

	/**
	 * Returns the add cer scope service thirds before and after the current add cer scope service third in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param addCerScopeServiceThirdId the primary key of the current add cer scope service third
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next add cer scope service third
	 * @throws NoSuchAddCerScopeServiceThirdException if a add cer scope service third with the primary key could not be found
	 */
	public static AddCerScopeServiceThird[] findBygetJanaacById_PrevAndNext(
			long addCerScopeServiceThirdId, long janaacApplicationId,
			OrderByComparator<AddCerScopeServiceThird> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddCerScopeServiceThirdException {

		return getPersistence().findBygetJanaacById_PrevAndNext(
			addCerScopeServiceThirdId, janaacApplicationId, orderByComparator);
	}

	/**
	 * Removes all the add cer scope service thirds where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 */
	public static void removeBygetJanaacById(long janaacApplicationId) {
		getPersistence().removeBygetJanaacById(janaacApplicationId);
	}

	/**
	 * Returns the number of add cer scope service thirds where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching add cer scope service thirds
	 */
	public static int countBygetJanaacById(long janaacApplicationId) {
		return getPersistence().countBygetJanaacById(janaacApplicationId);
	}

	/**
	 * Caches the add cer scope service third in the entity cache if it is enabled.
	 *
	 * @param addCerScopeServiceThird the add cer scope service third
	 */
	public static void cacheResult(
		AddCerScopeServiceThird addCerScopeServiceThird) {

		getPersistence().cacheResult(addCerScopeServiceThird);
	}

	/**
	 * Caches the add cer scope service thirds in the entity cache if it is enabled.
	 *
	 * @param addCerScopeServiceThirds the add cer scope service thirds
	 */
	public static void cacheResult(
		List<AddCerScopeServiceThird> addCerScopeServiceThirds) {

		getPersistence().cacheResult(addCerScopeServiceThirds);
	}

	/**
	 * Creates a new add cer scope service third with the primary key. Does not add the add cer scope service third to the database.
	 *
	 * @param addCerScopeServiceThirdId the primary key for the new add cer scope service third
	 * @return the new add cer scope service third
	 */
	public static AddCerScopeServiceThird create(
		long addCerScopeServiceThirdId) {

		return getPersistence().create(addCerScopeServiceThirdId);
	}

	/**
	 * Removes the add cer scope service third with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param addCerScopeServiceThirdId the primary key of the add cer scope service third
	 * @return the add cer scope service third that was removed
	 * @throws NoSuchAddCerScopeServiceThirdException if a add cer scope service third with the primary key could not be found
	 */
	public static AddCerScopeServiceThird remove(long addCerScopeServiceThirdId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddCerScopeServiceThirdException {

		return getPersistence().remove(addCerScopeServiceThirdId);
	}

	public static AddCerScopeServiceThird updateImpl(
		AddCerScopeServiceThird addCerScopeServiceThird) {

		return getPersistence().updateImpl(addCerScopeServiceThird);
	}

	/**
	 * Returns the add cer scope service third with the primary key or throws a <code>NoSuchAddCerScopeServiceThirdException</code> if it could not be found.
	 *
	 * @param addCerScopeServiceThirdId the primary key of the add cer scope service third
	 * @return the add cer scope service third
	 * @throws NoSuchAddCerScopeServiceThirdException if a add cer scope service third with the primary key could not be found
	 */
	public static AddCerScopeServiceThird findByPrimaryKey(
			long addCerScopeServiceThirdId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddCerScopeServiceThirdException {

		return getPersistence().findByPrimaryKey(addCerScopeServiceThirdId);
	}

	/**
	 * Returns the add cer scope service third with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param addCerScopeServiceThirdId the primary key of the add cer scope service third
	 * @return the add cer scope service third, or <code>null</code> if a add cer scope service third with the primary key could not be found
	 */
	public static AddCerScopeServiceThird fetchByPrimaryKey(
		long addCerScopeServiceThirdId) {

		return getPersistence().fetchByPrimaryKey(addCerScopeServiceThirdId);
	}

	/**
	 * Returns all the add cer scope service thirds.
	 *
	 * @return the add cer scope service thirds
	 */
	public static List<AddCerScopeServiceThird> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the add cer scope service thirds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddCerScopeServiceThirdModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add cer scope service thirds
	 * @param end the upper bound of the range of add cer scope service thirds (not inclusive)
	 * @return the range of add cer scope service thirds
	 */
	public static List<AddCerScopeServiceThird> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the add cer scope service thirds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddCerScopeServiceThirdModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add cer scope service thirds
	 * @param end the upper bound of the range of add cer scope service thirds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of add cer scope service thirds
	 */
	public static List<AddCerScopeServiceThird> findAll(
		int start, int end,
		OrderByComparator<AddCerScopeServiceThird> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the add cer scope service thirds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddCerScopeServiceThirdModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add cer scope service thirds
	 * @param end the upper bound of the range of add cer scope service thirds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of add cer scope service thirds
	 */
	public static List<AddCerScopeServiceThird> findAll(
		int start, int end,
		OrderByComparator<AddCerScopeServiceThird> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the add cer scope service thirds from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of add cer scope service thirds.
	 *
	 * @return the number of add cer scope service thirds
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AddCerScopeServiceThirdPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		AddCerScopeServiceThirdPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile AddCerScopeServiceThirdPersistence _persistence;

}