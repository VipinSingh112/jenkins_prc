/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.janaac.application.form.service.model.AddLabMedicalPhysicalSec;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the add lab medical physical sec service. This utility wraps <code>com.nbp.janaac.application.form.service.service.persistence.impl.AddLabMedicalPhysicalSecPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AddLabMedicalPhysicalSecPersistence
 * @generated
 */
public class AddLabMedicalPhysicalSecUtil {

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
		AddLabMedicalPhysicalSec addLabMedicalPhysicalSec) {

		getPersistence().clearCache(addLabMedicalPhysicalSec);
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
	public static Map<Serializable, AddLabMedicalPhysicalSec>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AddLabMedicalPhysicalSec> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AddLabMedicalPhysicalSec> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AddLabMedicalPhysicalSec> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AddLabMedicalPhysicalSec> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AddLabMedicalPhysicalSec update(
		AddLabMedicalPhysicalSec addLabMedicalPhysicalSec) {

		return getPersistence().update(addLabMedicalPhysicalSec);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AddLabMedicalPhysicalSec update(
		AddLabMedicalPhysicalSec addLabMedicalPhysicalSec,
		ServiceContext serviceContext) {

		return getPersistence().update(
			addLabMedicalPhysicalSec, serviceContext);
	}

	/**
	 * Returns all the add lab medical physical secs where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching add lab medical physical secs
	 */
	public static List<AddLabMedicalPhysicalSec> findBygetJanaacById(
		long janaacApplicationId) {

		return getPersistence().findBygetJanaacById(janaacApplicationId);
	}

	/**
	 * Returns a range of all the add lab medical physical secs where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabMedicalPhysicalSecModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add lab medical physical secs
	 * @param end the upper bound of the range of add lab medical physical secs (not inclusive)
	 * @return the range of matching add lab medical physical secs
	 */
	public static List<AddLabMedicalPhysicalSec> findBygetJanaacById(
		long janaacApplicationId, int start, int end) {

		return getPersistence().findBygetJanaacById(
			janaacApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the add lab medical physical secs where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabMedicalPhysicalSecModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add lab medical physical secs
	 * @param end the upper bound of the range of add lab medical physical secs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching add lab medical physical secs
	 */
	public static List<AddLabMedicalPhysicalSec> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		OrderByComparator<AddLabMedicalPhysicalSec> orderByComparator) {

		return getPersistence().findBygetJanaacById(
			janaacApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the add lab medical physical secs where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabMedicalPhysicalSecModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add lab medical physical secs
	 * @param end the upper bound of the range of add lab medical physical secs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching add lab medical physical secs
	 */
	public static List<AddLabMedicalPhysicalSec> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		OrderByComparator<AddLabMedicalPhysicalSec> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetJanaacById(
			janaacApplicationId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first add lab medical physical sec in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add lab medical physical sec
	 * @throws NoSuchAddLabMedicalPhysicalSecException if a matching add lab medical physical sec could not be found
	 */
	public static AddLabMedicalPhysicalSec findBygetJanaacById_First(
			long janaacApplicationId,
			OrderByComparator<AddLabMedicalPhysicalSec> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddLabMedicalPhysicalSecException {

		return getPersistence().findBygetJanaacById_First(
			janaacApplicationId, orderByComparator);
	}

	/**
	 * Returns the first add lab medical physical sec in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add lab medical physical sec, or <code>null</code> if a matching add lab medical physical sec could not be found
	 */
	public static AddLabMedicalPhysicalSec fetchBygetJanaacById_First(
		long janaacApplicationId,
		OrderByComparator<AddLabMedicalPhysicalSec> orderByComparator) {

		return getPersistence().fetchBygetJanaacById_First(
			janaacApplicationId, orderByComparator);
	}

	/**
	 * Returns the last add lab medical physical sec in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add lab medical physical sec
	 * @throws NoSuchAddLabMedicalPhysicalSecException if a matching add lab medical physical sec could not be found
	 */
	public static AddLabMedicalPhysicalSec findBygetJanaacById_Last(
			long janaacApplicationId,
			OrderByComparator<AddLabMedicalPhysicalSec> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddLabMedicalPhysicalSecException {

		return getPersistence().findBygetJanaacById_Last(
			janaacApplicationId, orderByComparator);
	}

	/**
	 * Returns the last add lab medical physical sec in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add lab medical physical sec, or <code>null</code> if a matching add lab medical physical sec could not be found
	 */
	public static AddLabMedicalPhysicalSec fetchBygetJanaacById_Last(
		long janaacApplicationId,
		OrderByComparator<AddLabMedicalPhysicalSec> orderByComparator) {

		return getPersistence().fetchBygetJanaacById_Last(
			janaacApplicationId, orderByComparator);
	}

	/**
	 * Returns the add lab medical physical secs before and after the current add lab medical physical sec in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param addLabMedicalPhysicalSecId the primary key of the current add lab medical physical sec
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next add lab medical physical sec
	 * @throws NoSuchAddLabMedicalPhysicalSecException if a add lab medical physical sec with the primary key could not be found
	 */
	public static AddLabMedicalPhysicalSec[] findBygetJanaacById_PrevAndNext(
			long addLabMedicalPhysicalSecId, long janaacApplicationId,
			OrderByComparator<AddLabMedicalPhysicalSec> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddLabMedicalPhysicalSecException {

		return getPersistence().findBygetJanaacById_PrevAndNext(
			addLabMedicalPhysicalSecId, janaacApplicationId, orderByComparator);
	}

	/**
	 * Removes all the add lab medical physical secs where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 */
	public static void removeBygetJanaacById(long janaacApplicationId) {
		getPersistence().removeBygetJanaacById(janaacApplicationId);
	}

	/**
	 * Returns the number of add lab medical physical secs where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching add lab medical physical secs
	 */
	public static int countBygetJanaacById(long janaacApplicationId) {
		return getPersistence().countBygetJanaacById(janaacApplicationId);
	}

	/**
	 * Caches the add lab medical physical sec in the entity cache if it is enabled.
	 *
	 * @param addLabMedicalPhysicalSec the add lab medical physical sec
	 */
	public static void cacheResult(
		AddLabMedicalPhysicalSec addLabMedicalPhysicalSec) {

		getPersistence().cacheResult(addLabMedicalPhysicalSec);
	}

	/**
	 * Caches the add lab medical physical secs in the entity cache if it is enabled.
	 *
	 * @param addLabMedicalPhysicalSecs the add lab medical physical secs
	 */
	public static void cacheResult(
		List<AddLabMedicalPhysicalSec> addLabMedicalPhysicalSecs) {

		getPersistence().cacheResult(addLabMedicalPhysicalSecs);
	}

	/**
	 * Creates a new add lab medical physical sec with the primary key. Does not add the add lab medical physical sec to the database.
	 *
	 * @param addLabMedicalPhysicalSecId the primary key for the new add lab medical physical sec
	 * @return the new add lab medical physical sec
	 */
	public static AddLabMedicalPhysicalSec create(
		long addLabMedicalPhysicalSecId) {

		return getPersistence().create(addLabMedicalPhysicalSecId);
	}

	/**
	 * Removes the add lab medical physical sec with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param addLabMedicalPhysicalSecId the primary key of the add lab medical physical sec
	 * @return the add lab medical physical sec that was removed
	 * @throws NoSuchAddLabMedicalPhysicalSecException if a add lab medical physical sec with the primary key could not be found
	 */
	public static AddLabMedicalPhysicalSec remove(
			long addLabMedicalPhysicalSecId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddLabMedicalPhysicalSecException {

		return getPersistence().remove(addLabMedicalPhysicalSecId);
	}

	public static AddLabMedicalPhysicalSec updateImpl(
		AddLabMedicalPhysicalSec addLabMedicalPhysicalSec) {

		return getPersistence().updateImpl(addLabMedicalPhysicalSec);
	}

	/**
	 * Returns the add lab medical physical sec with the primary key or throws a <code>NoSuchAddLabMedicalPhysicalSecException</code> if it could not be found.
	 *
	 * @param addLabMedicalPhysicalSecId the primary key of the add lab medical physical sec
	 * @return the add lab medical physical sec
	 * @throws NoSuchAddLabMedicalPhysicalSecException if a add lab medical physical sec with the primary key could not be found
	 */
	public static AddLabMedicalPhysicalSec findByPrimaryKey(
			long addLabMedicalPhysicalSecId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddLabMedicalPhysicalSecException {

		return getPersistence().findByPrimaryKey(addLabMedicalPhysicalSecId);
	}

	/**
	 * Returns the add lab medical physical sec with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param addLabMedicalPhysicalSecId the primary key of the add lab medical physical sec
	 * @return the add lab medical physical sec, or <code>null</code> if a add lab medical physical sec with the primary key could not be found
	 */
	public static AddLabMedicalPhysicalSec fetchByPrimaryKey(
		long addLabMedicalPhysicalSecId) {

		return getPersistence().fetchByPrimaryKey(addLabMedicalPhysicalSecId);
	}

	/**
	 * Returns all the add lab medical physical secs.
	 *
	 * @return the add lab medical physical secs
	 */
	public static List<AddLabMedicalPhysicalSec> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the add lab medical physical secs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabMedicalPhysicalSecModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add lab medical physical secs
	 * @param end the upper bound of the range of add lab medical physical secs (not inclusive)
	 * @return the range of add lab medical physical secs
	 */
	public static List<AddLabMedicalPhysicalSec> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the add lab medical physical secs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabMedicalPhysicalSecModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add lab medical physical secs
	 * @param end the upper bound of the range of add lab medical physical secs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of add lab medical physical secs
	 */
	public static List<AddLabMedicalPhysicalSec> findAll(
		int start, int end,
		OrderByComparator<AddLabMedicalPhysicalSec> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the add lab medical physical secs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabMedicalPhysicalSecModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add lab medical physical secs
	 * @param end the upper bound of the range of add lab medical physical secs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of add lab medical physical secs
	 */
	public static List<AddLabMedicalPhysicalSec> findAll(
		int start, int end,
		OrderByComparator<AddLabMedicalPhysicalSec> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the add lab medical physical secs from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of add lab medical physical secs.
	 *
	 * @return the number of add lab medical physical secs
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AddLabMedicalPhysicalSecPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		AddLabMedicalPhysicalSecPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile AddLabMedicalPhysicalSecPersistence _persistence;

}