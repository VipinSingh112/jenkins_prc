/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.janaac.application.form.service.model.AddLabMedicalDescOfActiSec;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the add lab medical desc of acti sec service. This utility wraps <code>com.nbp.janaac.application.form.service.service.persistence.impl.AddLabMedicalDescOfActiSecPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AddLabMedicalDescOfActiSecPersistence
 * @generated
 */
public class AddLabMedicalDescOfActiSecUtil {

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
		AddLabMedicalDescOfActiSec addLabMedicalDescOfActiSec) {

		getPersistence().clearCache(addLabMedicalDescOfActiSec);
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
	public static Map<Serializable, AddLabMedicalDescOfActiSec>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AddLabMedicalDescOfActiSec> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AddLabMedicalDescOfActiSec> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AddLabMedicalDescOfActiSec> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AddLabMedicalDescOfActiSec> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AddLabMedicalDescOfActiSec update(
		AddLabMedicalDescOfActiSec addLabMedicalDescOfActiSec) {

		return getPersistence().update(addLabMedicalDescOfActiSec);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AddLabMedicalDescOfActiSec update(
		AddLabMedicalDescOfActiSec addLabMedicalDescOfActiSec,
		ServiceContext serviceContext) {

		return getPersistence().update(
			addLabMedicalDescOfActiSec, serviceContext);
	}

	/**
	 * Returns all the add lab medical desc of acti secs where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching add lab medical desc of acti secs
	 */
	public static List<AddLabMedicalDescOfActiSec> findBygetJanaacById(
		long janaacApplicationId) {

		return getPersistence().findBygetJanaacById(janaacApplicationId);
	}

	/**
	 * Returns a range of all the add lab medical desc of acti secs where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabMedicalDescOfActiSecModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add lab medical desc of acti secs
	 * @param end the upper bound of the range of add lab medical desc of acti secs (not inclusive)
	 * @return the range of matching add lab medical desc of acti secs
	 */
	public static List<AddLabMedicalDescOfActiSec> findBygetJanaacById(
		long janaacApplicationId, int start, int end) {

		return getPersistence().findBygetJanaacById(
			janaacApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the add lab medical desc of acti secs where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabMedicalDescOfActiSecModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add lab medical desc of acti secs
	 * @param end the upper bound of the range of add lab medical desc of acti secs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching add lab medical desc of acti secs
	 */
	public static List<AddLabMedicalDescOfActiSec> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		OrderByComparator<AddLabMedicalDescOfActiSec> orderByComparator) {

		return getPersistence().findBygetJanaacById(
			janaacApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the add lab medical desc of acti secs where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabMedicalDescOfActiSecModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add lab medical desc of acti secs
	 * @param end the upper bound of the range of add lab medical desc of acti secs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching add lab medical desc of acti secs
	 */
	public static List<AddLabMedicalDescOfActiSec> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		OrderByComparator<AddLabMedicalDescOfActiSec> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetJanaacById(
			janaacApplicationId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first add lab medical desc of acti sec in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add lab medical desc of acti sec
	 * @throws NoSuchAddLabMedicalDescOfActiSecException if a matching add lab medical desc of acti sec could not be found
	 */
	public static AddLabMedicalDescOfActiSec findBygetJanaacById_First(
			long janaacApplicationId,
			OrderByComparator<AddLabMedicalDescOfActiSec> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddLabMedicalDescOfActiSecException {

		return getPersistence().findBygetJanaacById_First(
			janaacApplicationId, orderByComparator);
	}

	/**
	 * Returns the first add lab medical desc of acti sec in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add lab medical desc of acti sec, or <code>null</code> if a matching add lab medical desc of acti sec could not be found
	 */
	public static AddLabMedicalDescOfActiSec fetchBygetJanaacById_First(
		long janaacApplicationId,
		OrderByComparator<AddLabMedicalDescOfActiSec> orderByComparator) {

		return getPersistence().fetchBygetJanaacById_First(
			janaacApplicationId, orderByComparator);
	}

	/**
	 * Returns the last add lab medical desc of acti sec in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add lab medical desc of acti sec
	 * @throws NoSuchAddLabMedicalDescOfActiSecException if a matching add lab medical desc of acti sec could not be found
	 */
	public static AddLabMedicalDescOfActiSec findBygetJanaacById_Last(
			long janaacApplicationId,
			OrderByComparator<AddLabMedicalDescOfActiSec> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddLabMedicalDescOfActiSecException {

		return getPersistence().findBygetJanaacById_Last(
			janaacApplicationId, orderByComparator);
	}

	/**
	 * Returns the last add lab medical desc of acti sec in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add lab medical desc of acti sec, or <code>null</code> if a matching add lab medical desc of acti sec could not be found
	 */
	public static AddLabMedicalDescOfActiSec fetchBygetJanaacById_Last(
		long janaacApplicationId,
		OrderByComparator<AddLabMedicalDescOfActiSec> orderByComparator) {

		return getPersistence().fetchBygetJanaacById_Last(
			janaacApplicationId, orderByComparator);
	}

	/**
	 * Returns the add lab medical desc of acti secs before and after the current add lab medical desc of acti sec in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param addLabMedicalDescOfActiSecId the primary key of the current add lab medical desc of acti sec
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next add lab medical desc of acti sec
	 * @throws NoSuchAddLabMedicalDescOfActiSecException if a add lab medical desc of acti sec with the primary key could not be found
	 */
	public static AddLabMedicalDescOfActiSec[] findBygetJanaacById_PrevAndNext(
			long addLabMedicalDescOfActiSecId, long janaacApplicationId,
			OrderByComparator<AddLabMedicalDescOfActiSec> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddLabMedicalDescOfActiSecException {

		return getPersistence().findBygetJanaacById_PrevAndNext(
			addLabMedicalDescOfActiSecId, janaacApplicationId,
			orderByComparator);
	}

	/**
	 * Removes all the add lab medical desc of acti secs where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 */
	public static void removeBygetJanaacById(long janaacApplicationId) {
		getPersistence().removeBygetJanaacById(janaacApplicationId);
	}

	/**
	 * Returns the number of add lab medical desc of acti secs where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching add lab medical desc of acti secs
	 */
	public static int countBygetJanaacById(long janaacApplicationId) {
		return getPersistence().countBygetJanaacById(janaacApplicationId);
	}

	/**
	 * Caches the add lab medical desc of acti sec in the entity cache if it is enabled.
	 *
	 * @param addLabMedicalDescOfActiSec the add lab medical desc of acti sec
	 */
	public static void cacheResult(
		AddLabMedicalDescOfActiSec addLabMedicalDescOfActiSec) {

		getPersistence().cacheResult(addLabMedicalDescOfActiSec);
	}

	/**
	 * Caches the add lab medical desc of acti secs in the entity cache if it is enabled.
	 *
	 * @param addLabMedicalDescOfActiSecs the add lab medical desc of acti secs
	 */
	public static void cacheResult(
		List<AddLabMedicalDescOfActiSec> addLabMedicalDescOfActiSecs) {

		getPersistence().cacheResult(addLabMedicalDescOfActiSecs);
	}

	/**
	 * Creates a new add lab medical desc of acti sec with the primary key. Does not add the add lab medical desc of acti sec to the database.
	 *
	 * @param addLabMedicalDescOfActiSecId the primary key for the new add lab medical desc of acti sec
	 * @return the new add lab medical desc of acti sec
	 */
	public static AddLabMedicalDescOfActiSec create(
		long addLabMedicalDescOfActiSecId) {

		return getPersistence().create(addLabMedicalDescOfActiSecId);
	}

	/**
	 * Removes the add lab medical desc of acti sec with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param addLabMedicalDescOfActiSecId the primary key of the add lab medical desc of acti sec
	 * @return the add lab medical desc of acti sec that was removed
	 * @throws NoSuchAddLabMedicalDescOfActiSecException if a add lab medical desc of acti sec with the primary key could not be found
	 */
	public static AddLabMedicalDescOfActiSec remove(
			long addLabMedicalDescOfActiSecId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddLabMedicalDescOfActiSecException {

		return getPersistence().remove(addLabMedicalDescOfActiSecId);
	}

	public static AddLabMedicalDescOfActiSec updateImpl(
		AddLabMedicalDescOfActiSec addLabMedicalDescOfActiSec) {

		return getPersistence().updateImpl(addLabMedicalDescOfActiSec);
	}

	/**
	 * Returns the add lab medical desc of acti sec with the primary key or throws a <code>NoSuchAddLabMedicalDescOfActiSecException</code> if it could not be found.
	 *
	 * @param addLabMedicalDescOfActiSecId the primary key of the add lab medical desc of acti sec
	 * @return the add lab medical desc of acti sec
	 * @throws NoSuchAddLabMedicalDescOfActiSecException if a add lab medical desc of acti sec with the primary key could not be found
	 */
	public static AddLabMedicalDescOfActiSec findByPrimaryKey(
			long addLabMedicalDescOfActiSecId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddLabMedicalDescOfActiSecException {

		return getPersistence().findByPrimaryKey(addLabMedicalDescOfActiSecId);
	}

	/**
	 * Returns the add lab medical desc of acti sec with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param addLabMedicalDescOfActiSecId the primary key of the add lab medical desc of acti sec
	 * @return the add lab medical desc of acti sec, or <code>null</code> if a add lab medical desc of acti sec with the primary key could not be found
	 */
	public static AddLabMedicalDescOfActiSec fetchByPrimaryKey(
		long addLabMedicalDescOfActiSecId) {

		return getPersistence().fetchByPrimaryKey(addLabMedicalDescOfActiSecId);
	}

	/**
	 * Returns all the add lab medical desc of acti secs.
	 *
	 * @return the add lab medical desc of acti secs
	 */
	public static List<AddLabMedicalDescOfActiSec> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the add lab medical desc of acti secs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabMedicalDescOfActiSecModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add lab medical desc of acti secs
	 * @param end the upper bound of the range of add lab medical desc of acti secs (not inclusive)
	 * @return the range of add lab medical desc of acti secs
	 */
	public static List<AddLabMedicalDescOfActiSec> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the add lab medical desc of acti secs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabMedicalDescOfActiSecModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add lab medical desc of acti secs
	 * @param end the upper bound of the range of add lab medical desc of acti secs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of add lab medical desc of acti secs
	 */
	public static List<AddLabMedicalDescOfActiSec> findAll(
		int start, int end,
		OrderByComparator<AddLabMedicalDescOfActiSec> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the add lab medical desc of acti secs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabMedicalDescOfActiSecModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add lab medical desc of acti secs
	 * @param end the upper bound of the range of add lab medical desc of acti secs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of add lab medical desc of acti secs
	 */
	public static List<AddLabMedicalDescOfActiSec> findAll(
		int start, int end,
		OrderByComparator<AddLabMedicalDescOfActiSec> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the add lab medical desc of acti secs from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of add lab medical desc of acti secs.
	 *
	 * @return the number of add lab medical desc of acti secs
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AddLabMedicalDescOfActiSecPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		AddLabMedicalDescOfActiSecPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile AddLabMedicalDescOfActiSecPersistence _persistence;

}