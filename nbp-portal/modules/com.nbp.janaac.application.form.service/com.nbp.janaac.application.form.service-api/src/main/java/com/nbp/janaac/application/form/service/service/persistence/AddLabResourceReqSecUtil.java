/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.janaac.application.form.service.model.AddLabResourceReqSec;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the add lab resource req sec service. This utility wraps <code>com.nbp.janaac.application.form.service.service.persistence.impl.AddLabResourceReqSecPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AddLabResourceReqSecPersistence
 * @generated
 */
public class AddLabResourceReqSecUtil {

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
	public static void clearCache(AddLabResourceReqSec addLabResourceReqSec) {
		getPersistence().clearCache(addLabResourceReqSec);
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
	public static Map<Serializable, AddLabResourceReqSec> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AddLabResourceReqSec> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AddLabResourceReqSec> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AddLabResourceReqSec> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AddLabResourceReqSec> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AddLabResourceReqSec update(
		AddLabResourceReqSec addLabResourceReqSec) {

		return getPersistence().update(addLabResourceReqSec);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AddLabResourceReqSec update(
		AddLabResourceReqSec addLabResourceReqSec,
		ServiceContext serviceContext) {

		return getPersistence().update(addLabResourceReqSec, serviceContext);
	}

	/**
	 * Returns all the add lab resource req secs where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching add lab resource req secs
	 */
	public static List<AddLabResourceReqSec> findBygetJanaacById(
		long janaacApplicationId) {

		return getPersistence().findBygetJanaacById(janaacApplicationId);
	}

	/**
	 * Returns a range of all the add lab resource req secs where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabResourceReqSecModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add lab resource req secs
	 * @param end the upper bound of the range of add lab resource req secs (not inclusive)
	 * @return the range of matching add lab resource req secs
	 */
	public static List<AddLabResourceReqSec> findBygetJanaacById(
		long janaacApplicationId, int start, int end) {

		return getPersistence().findBygetJanaacById(
			janaacApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the add lab resource req secs where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabResourceReqSecModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add lab resource req secs
	 * @param end the upper bound of the range of add lab resource req secs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching add lab resource req secs
	 */
	public static List<AddLabResourceReqSec> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		OrderByComparator<AddLabResourceReqSec> orderByComparator) {

		return getPersistence().findBygetJanaacById(
			janaacApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the add lab resource req secs where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabResourceReqSecModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add lab resource req secs
	 * @param end the upper bound of the range of add lab resource req secs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching add lab resource req secs
	 */
	public static List<AddLabResourceReqSec> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		OrderByComparator<AddLabResourceReqSec> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetJanaacById(
			janaacApplicationId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first add lab resource req sec in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add lab resource req sec
	 * @throws NoSuchAddLabResourceReqSecException if a matching add lab resource req sec could not be found
	 */
	public static AddLabResourceReqSec findBygetJanaacById_First(
			long janaacApplicationId,
			OrderByComparator<AddLabResourceReqSec> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddLabResourceReqSecException {

		return getPersistence().findBygetJanaacById_First(
			janaacApplicationId, orderByComparator);
	}

	/**
	 * Returns the first add lab resource req sec in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add lab resource req sec, or <code>null</code> if a matching add lab resource req sec could not be found
	 */
	public static AddLabResourceReqSec fetchBygetJanaacById_First(
		long janaacApplicationId,
		OrderByComparator<AddLabResourceReqSec> orderByComparator) {

		return getPersistence().fetchBygetJanaacById_First(
			janaacApplicationId, orderByComparator);
	}

	/**
	 * Returns the last add lab resource req sec in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add lab resource req sec
	 * @throws NoSuchAddLabResourceReqSecException if a matching add lab resource req sec could not be found
	 */
	public static AddLabResourceReqSec findBygetJanaacById_Last(
			long janaacApplicationId,
			OrderByComparator<AddLabResourceReqSec> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddLabResourceReqSecException {

		return getPersistence().findBygetJanaacById_Last(
			janaacApplicationId, orderByComparator);
	}

	/**
	 * Returns the last add lab resource req sec in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add lab resource req sec, or <code>null</code> if a matching add lab resource req sec could not be found
	 */
	public static AddLabResourceReqSec fetchBygetJanaacById_Last(
		long janaacApplicationId,
		OrderByComparator<AddLabResourceReqSec> orderByComparator) {

		return getPersistence().fetchBygetJanaacById_Last(
			janaacApplicationId, orderByComparator);
	}

	/**
	 * Returns the add lab resource req secs before and after the current add lab resource req sec in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param addLabResourceReqSecId the primary key of the current add lab resource req sec
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next add lab resource req sec
	 * @throws NoSuchAddLabResourceReqSecException if a add lab resource req sec with the primary key could not be found
	 */
	public static AddLabResourceReqSec[] findBygetJanaacById_PrevAndNext(
			long addLabResourceReqSecId, long janaacApplicationId,
			OrderByComparator<AddLabResourceReqSec> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddLabResourceReqSecException {

		return getPersistence().findBygetJanaacById_PrevAndNext(
			addLabResourceReqSecId, janaacApplicationId, orderByComparator);
	}

	/**
	 * Removes all the add lab resource req secs where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 */
	public static void removeBygetJanaacById(long janaacApplicationId) {
		getPersistence().removeBygetJanaacById(janaacApplicationId);
	}

	/**
	 * Returns the number of add lab resource req secs where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching add lab resource req secs
	 */
	public static int countBygetJanaacById(long janaacApplicationId) {
		return getPersistence().countBygetJanaacById(janaacApplicationId);
	}

	/**
	 * Caches the add lab resource req sec in the entity cache if it is enabled.
	 *
	 * @param addLabResourceReqSec the add lab resource req sec
	 */
	public static void cacheResult(AddLabResourceReqSec addLabResourceReqSec) {
		getPersistence().cacheResult(addLabResourceReqSec);
	}

	/**
	 * Caches the add lab resource req secs in the entity cache if it is enabled.
	 *
	 * @param addLabResourceReqSecs the add lab resource req secs
	 */
	public static void cacheResult(
		List<AddLabResourceReqSec> addLabResourceReqSecs) {

		getPersistence().cacheResult(addLabResourceReqSecs);
	}

	/**
	 * Creates a new add lab resource req sec with the primary key. Does not add the add lab resource req sec to the database.
	 *
	 * @param addLabResourceReqSecId the primary key for the new add lab resource req sec
	 * @return the new add lab resource req sec
	 */
	public static AddLabResourceReqSec create(long addLabResourceReqSecId) {
		return getPersistence().create(addLabResourceReqSecId);
	}

	/**
	 * Removes the add lab resource req sec with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param addLabResourceReqSecId the primary key of the add lab resource req sec
	 * @return the add lab resource req sec that was removed
	 * @throws NoSuchAddLabResourceReqSecException if a add lab resource req sec with the primary key could not be found
	 */
	public static AddLabResourceReqSec remove(long addLabResourceReqSecId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddLabResourceReqSecException {

		return getPersistence().remove(addLabResourceReqSecId);
	}

	public static AddLabResourceReqSec updateImpl(
		AddLabResourceReqSec addLabResourceReqSec) {

		return getPersistence().updateImpl(addLabResourceReqSec);
	}

	/**
	 * Returns the add lab resource req sec with the primary key or throws a <code>NoSuchAddLabResourceReqSecException</code> if it could not be found.
	 *
	 * @param addLabResourceReqSecId the primary key of the add lab resource req sec
	 * @return the add lab resource req sec
	 * @throws NoSuchAddLabResourceReqSecException if a add lab resource req sec with the primary key could not be found
	 */
	public static AddLabResourceReqSec findByPrimaryKey(
			long addLabResourceReqSecId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddLabResourceReqSecException {

		return getPersistence().findByPrimaryKey(addLabResourceReqSecId);
	}

	/**
	 * Returns the add lab resource req sec with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param addLabResourceReqSecId the primary key of the add lab resource req sec
	 * @return the add lab resource req sec, or <code>null</code> if a add lab resource req sec with the primary key could not be found
	 */
	public static AddLabResourceReqSec fetchByPrimaryKey(
		long addLabResourceReqSecId) {

		return getPersistence().fetchByPrimaryKey(addLabResourceReqSecId);
	}

	/**
	 * Returns all the add lab resource req secs.
	 *
	 * @return the add lab resource req secs
	 */
	public static List<AddLabResourceReqSec> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the add lab resource req secs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabResourceReqSecModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add lab resource req secs
	 * @param end the upper bound of the range of add lab resource req secs (not inclusive)
	 * @return the range of add lab resource req secs
	 */
	public static List<AddLabResourceReqSec> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the add lab resource req secs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabResourceReqSecModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add lab resource req secs
	 * @param end the upper bound of the range of add lab resource req secs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of add lab resource req secs
	 */
	public static List<AddLabResourceReqSec> findAll(
		int start, int end,
		OrderByComparator<AddLabResourceReqSec> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the add lab resource req secs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabResourceReqSecModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add lab resource req secs
	 * @param end the upper bound of the range of add lab resource req secs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of add lab resource req secs
	 */
	public static List<AddLabResourceReqSec> findAll(
		int start, int end,
		OrderByComparator<AddLabResourceReqSec> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the add lab resource req secs from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of add lab resource req secs.
	 *
	 * @return the number of add lab resource req secs
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AddLabResourceReqSecPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		AddLabResourceReqSecPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile AddLabResourceReqSecPersistence _persistence;

}