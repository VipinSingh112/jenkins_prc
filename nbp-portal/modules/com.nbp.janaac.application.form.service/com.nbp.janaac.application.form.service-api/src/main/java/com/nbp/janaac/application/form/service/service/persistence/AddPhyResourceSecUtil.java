/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.janaac.application.form.service.model.AddPhyResourceSec;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the add phy resource sec service. This utility wraps <code>com.nbp.janaac.application.form.service.service.persistence.impl.AddPhyResourceSecPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AddPhyResourceSecPersistence
 * @generated
 */
public class AddPhyResourceSecUtil {

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
	public static void clearCache(AddPhyResourceSec addPhyResourceSec) {
		getPersistence().clearCache(addPhyResourceSec);
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
	public static Map<Serializable, AddPhyResourceSec> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AddPhyResourceSec> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AddPhyResourceSec> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AddPhyResourceSec> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AddPhyResourceSec> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AddPhyResourceSec update(
		AddPhyResourceSec addPhyResourceSec) {

		return getPersistence().update(addPhyResourceSec);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AddPhyResourceSec update(
		AddPhyResourceSec addPhyResourceSec, ServiceContext serviceContext) {

		return getPersistence().update(addPhyResourceSec, serviceContext);
	}

	/**
	 * Returns all the add phy resource secs where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching add phy resource secs
	 */
	public static List<AddPhyResourceSec> findBygetJanaacById(
		long janaacApplicationId) {

		return getPersistence().findBygetJanaacById(janaacApplicationId);
	}

	/**
	 * Returns a range of all the add phy resource secs where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddPhyResourceSecModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add phy resource secs
	 * @param end the upper bound of the range of add phy resource secs (not inclusive)
	 * @return the range of matching add phy resource secs
	 */
	public static List<AddPhyResourceSec> findBygetJanaacById(
		long janaacApplicationId, int start, int end) {

		return getPersistence().findBygetJanaacById(
			janaacApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the add phy resource secs where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddPhyResourceSecModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add phy resource secs
	 * @param end the upper bound of the range of add phy resource secs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching add phy resource secs
	 */
	public static List<AddPhyResourceSec> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		OrderByComparator<AddPhyResourceSec> orderByComparator) {

		return getPersistence().findBygetJanaacById(
			janaacApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the add phy resource secs where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddPhyResourceSecModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add phy resource secs
	 * @param end the upper bound of the range of add phy resource secs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching add phy resource secs
	 */
	public static List<AddPhyResourceSec> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		OrderByComparator<AddPhyResourceSec> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetJanaacById(
			janaacApplicationId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first add phy resource sec in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add phy resource sec
	 * @throws NoSuchAddPhyResourceSecException if a matching add phy resource sec could not be found
	 */
	public static AddPhyResourceSec findBygetJanaacById_First(
			long janaacApplicationId,
			OrderByComparator<AddPhyResourceSec> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddPhyResourceSecException {

		return getPersistence().findBygetJanaacById_First(
			janaacApplicationId, orderByComparator);
	}

	/**
	 * Returns the first add phy resource sec in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add phy resource sec, or <code>null</code> if a matching add phy resource sec could not be found
	 */
	public static AddPhyResourceSec fetchBygetJanaacById_First(
		long janaacApplicationId,
		OrderByComparator<AddPhyResourceSec> orderByComparator) {

		return getPersistence().fetchBygetJanaacById_First(
			janaacApplicationId, orderByComparator);
	}

	/**
	 * Returns the last add phy resource sec in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add phy resource sec
	 * @throws NoSuchAddPhyResourceSecException if a matching add phy resource sec could not be found
	 */
	public static AddPhyResourceSec findBygetJanaacById_Last(
			long janaacApplicationId,
			OrderByComparator<AddPhyResourceSec> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddPhyResourceSecException {

		return getPersistence().findBygetJanaacById_Last(
			janaacApplicationId, orderByComparator);
	}

	/**
	 * Returns the last add phy resource sec in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add phy resource sec, or <code>null</code> if a matching add phy resource sec could not be found
	 */
	public static AddPhyResourceSec fetchBygetJanaacById_Last(
		long janaacApplicationId,
		OrderByComparator<AddPhyResourceSec> orderByComparator) {

		return getPersistence().fetchBygetJanaacById_Last(
			janaacApplicationId, orderByComparator);
	}

	/**
	 * Returns the add phy resource secs before and after the current add phy resource sec in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param addPhyResourceSecId the primary key of the current add phy resource sec
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next add phy resource sec
	 * @throws NoSuchAddPhyResourceSecException if a add phy resource sec with the primary key could not be found
	 */
	public static AddPhyResourceSec[] findBygetJanaacById_PrevAndNext(
			long addPhyResourceSecId, long janaacApplicationId,
			OrderByComparator<AddPhyResourceSec> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddPhyResourceSecException {

		return getPersistence().findBygetJanaacById_PrevAndNext(
			addPhyResourceSecId, janaacApplicationId, orderByComparator);
	}

	/**
	 * Removes all the add phy resource secs where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 */
	public static void removeBygetJanaacById(long janaacApplicationId) {
		getPersistence().removeBygetJanaacById(janaacApplicationId);
	}

	/**
	 * Returns the number of add phy resource secs where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching add phy resource secs
	 */
	public static int countBygetJanaacById(long janaacApplicationId) {
		return getPersistence().countBygetJanaacById(janaacApplicationId);
	}

	/**
	 * Caches the add phy resource sec in the entity cache if it is enabled.
	 *
	 * @param addPhyResourceSec the add phy resource sec
	 */
	public static void cacheResult(AddPhyResourceSec addPhyResourceSec) {
		getPersistence().cacheResult(addPhyResourceSec);
	}

	/**
	 * Caches the add phy resource secs in the entity cache if it is enabled.
	 *
	 * @param addPhyResourceSecs the add phy resource secs
	 */
	public static void cacheResult(List<AddPhyResourceSec> addPhyResourceSecs) {
		getPersistence().cacheResult(addPhyResourceSecs);
	}

	/**
	 * Creates a new add phy resource sec with the primary key. Does not add the add phy resource sec to the database.
	 *
	 * @param addPhyResourceSecId the primary key for the new add phy resource sec
	 * @return the new add phy resource sec
	 */
	public static AddPhyResourceSec create(long addPhyResourceSecId) {
		return getPersistence().create(addPhyResourceSecId);
	}

	/**
	 * Removes the add phy resource sec with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param addPhyResourceSecId the primary key of the add phy resource sec
	 * @return the add phy resource sec that was removed
	 * @throws NoSuchAddPhyResourceSecException if a add phy resource sec with the primary key could not be found
	 */
	public static AddPhyResourceSec remove(long addPhyResourceSecId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddPhyResourceSecException {

		return getPersistence().remove(addPhyResourceSecId);
	}

	public static AddPhyResourceSec updateImpl(
		AddPhyResourceSec addPhyResourceSec) {

		return getPersistence().updateImpl(addPhyResourceSec);
	}

	/**
	 * Returns the add phy resource sec with the primary key or throws a <code>NoSuchAddPhyResourceSecException</code> if it could not be found.
	 *
	 * @param addPhyResourceSecId the primary key of the add phy resource sec
	 * @return the add phy resource sec
	 * @throws NoSuchAddPhyResourceSecException if a add phy resource sec with the primary key could not be found
	 */
	public static AddPhyResourceSec findByPrimaryKey(long addPhyResourceSecId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddPhyResourceSecException {

		return getPersistence().findByPrimaryKey(addPhyResourceSecId);
	}

	/**
	 * Returns the add phy resource sec with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param addPhyResourceSecId the primary key of the add phy resource sec
	 * @return the add phy resource sec, or <code>null</code> if a add phy resource sec with the primary key could not be found
	 */
	public static AddPhyResourceSec fetchByPrimaryKey(
		long addPhyResourceSecId) {

		return getPersistence().fetchByPrimaryKey(addPhyResourceSecId);
	}

	/**
	 * Returns all the add phy resource secs.
	 *
	 * @return the add phy resource secs
	 */
	public static List<AddPhyResourceSec> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the add phy resource secs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddPhyResourceSecModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add phy resource secs
	 * @param end the upper bound of the range of add phy resource secs (not inclusive)
	 * @return the range of add phy resource secs
	 */
	public static List<AddPhyResourceSec> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the add phy resource secs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddPhyResourceSecModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add phy resource secs
	 * @param end the upper bound of the range of add phy resource secs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of add phy resource secs
	 */
	public static List<AddPhyResourceSec> findAll(
		int start, int end,
		OrderByComparator<AddPhyResourceSec> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the add phy resource secs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddPhyResourceSecModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add phy resource secs
	 * @param end the upper bound of the range of add phy resource secs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of add phy resource secs
	 */
	public static List<AddPhyResourceSec> findAll(
		int start, int end,
		OrderByComparator<AddPhyResourceSec> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the add phy resource secs from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of add phy resource secs.
	 *
	 * @return the number of add phy resource secs
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AddPhyResourceSecPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		AddPhyResourceSecPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile AddPhyResourceSecPersistence _persistence;

}