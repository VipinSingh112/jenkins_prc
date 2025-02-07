/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.janaac.application.form.service.model.AddLabTestStructuralReqSec;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the add lab test structural req sec service. This utility wraps <code>com.nbp.janaac.application.form.service.service.persistence.impl.AddLabTestStructuralReqSecPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AddLabTestStructuralReqSecPersistence
 * @generated
 */
public class AddLabTestStructuralReqSecUtil {

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
		AddLabTestStructuralReqSec addLabTestStructuralReqSec) {

		getPersistence().clearCache(addLabTestStructuralReqSec);
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
	public static Map<Serializable, AddLabTestStructuralReqSec>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AddLabTestStructuralReqSec> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AddLabTestStructuralReqSec> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AddLabTestStructuralReqSec> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AddLabTestStructuralReqSec> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AddLabTestStructuralReqSec update(
		AddLabTestStructuralReqSec addLabTestStructuralReqSec) {

		return getPersistence().update(addLabTestStructuralReqSec);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AddLabTestStructuralReqSec update(
		AddLabTestStructuralReqSec addLabTestStructuralReqSec,
		ServiceContext serviceContext) {

		return getPersistence().update(
			addLabTestStructuralReqSec, serviceContext);
	}

	/**
	 * Returns all the add lab test structural req secs where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching add lab test structural req secs
	 */
	public static List<AddLabTestStructuralReqSec> findBygetJanaacById(
		long janaacApplicationId) {

		return getPersistence().findBygetJanaacById(janaacApplicationId);
	}

	/**
	 * Returns a range of all the add lab test structural req secs where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabTestStructuralReqSecModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add lab test structural req secs
	 * @param end the upper bound of the range of add lab test structural req secs (not inclusive)
	 * @return the range of matching add lab test structural req secs
	 */
	public static List<AddLabTestStructuralReqSec> findBygetJanaacById(
		long janaacApplicationId, int start, int end) {

		return getPersistence().findBygetJanaacById(
			janaacApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the add lab test structural req secs where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabTestStructuralReqSecModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add lab test structural req secs
	 * @param end the upper bound of the range of add lab test structural req secs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching add lab test structural req secs
	 */
	public static List<AddLabTestStructuralReqSec> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		OrderByComparator<AddLabTestStructuralReqSec> orderByComparator) {

		return getPersistence().findBygetJanaacById(
			janaacApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the add lab test structural req secs where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabTestStructuralReqSecModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add lab test structural req secs
	 * @param end the upper bound of the range of add lab test structural req secs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching add lab test structural req secs
	 */
	public static List<AddLabTestStructuralReqSec> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		OrderByComparator<AddLabTestStructuralReqSec> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetJanaacById(
			janaacApplicationId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first add lab test structural req sec in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add lab test structural req sec
	 * @throws NoSuchAddLabTestStructuralReqSecException if a matching add lab test structural req sec could not be found
	 */
	public static AddLabTestStructuralReqSec findBygetJanaacById_First(
			long janaacApplicationId,
			OrderByComparator<AddLabTestStructuralReqSec> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddLabTestStructuralReqSecException {

		return getPersistence().findBygetJanaacById_First(
			janaacApplicationId, orderByComparator);
	}

	/**
	 * Returns the first add lab test structural req sec in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add lab test structural req sec, or <code>null</code> if a matching add lab test structural req sec could not be found
	 */
	public static AddLabTestStructuralReqSec fetchBygetJanaacById_First(
		long janaacApplicationId,
		OrderByComparator<AddLabTestStructuralReqSec> orderByComparator) {

		return getPersistence().fetchBygetJanaacById_First(
			janaacApplicationId, orderByComparator);
	}

	/**
	 * Returns the last add lab test structural req sec in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add lab test structural req sec
	 * @throws NoSuchAddLabTestStructuralReqSecException if a matching add lab test structural req sec could not be found
	 */
	public static AddLabTestStructuralReqSec findBygetJanaacById_Last(
			long janaacApplicationId,
			OrderByComparator<AddLabTestStructuralReqSec> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddLabTestStructuralReqSecException {

		return getPersistence().findBygetJanaacById_Last(
			janaacApplicationId, orderByComparator);
	}

	/**
	 * Returns the last add lab test structural req sec in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add lab test structural req sec, or <code>null</code> if a matching add lab test structural req sec could not be found
	 */
	public static AddLabTestStructuralReqSec fetchBygetJanaacById_Last(
		long janaacApplicationId,
		OrderByComparator<AddLabTestStructuralReqSec> orderByComparator) {

		return getPersistence().fetchBygetJanaacById_Last(
			janaacApplicationId, orderByComparator);
	}

	/**
	 * Returns the add lab test structural req secs before and after the current add lab test structural req sec in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param addLabTestStructuralReqSecId the primary key of the current add lab test structural req sec
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next add lab test structural req sec
	 * @throws NoSuchAddLabTestStructuralReqSecException if a add lab test structural req sec with the primary key could not be found
	 */
	public static AddLabTestStructuralReqSec[] findBygetJanaacById_PrevAndNext(
			long addLabTestStructuralReqSecId, long janaacApplicationId,
			OrderByComparator<AddLabTestStructuralReqSec> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddLabTestStructuralReqSecException {

		return getPersistence().findBygetJanaacById_PrevAndNext(
			addLabTestStructuralReqSecId, janaacApplicationId,
			orderByComparator);
	}

	/**
	 * Removes all the add lab test structural req secs where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 */
	public static void removeBygetJanaacById(long janaacApplicationId) {
		getPersistence().removeBygetJanaacById(janaacApplicationId);
	}

	/**
	 * Returns the number of add lab test structural req secs where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching add lab test structural req secs
	 */
	public static int countBygetJanaacById(long janaacApplicationId) {
		return getPersistence().countBygetJanaacById(janaacApplicationId);
	}

	/**
	 * Caches the add lab test structural req sec in the entity cache if it is enabled.
	 *
	 * @param addLabTestStructuralReqSec the add lab test structural req sec
	 */
	public static void cacheResult(
		AddLabTestStructuralReqSec addLabTestStructuralReqSec) {

		getPersistence().cacheResult(addLabTestStructuralReqSec);
	}

	/**
	 * Caches the add lab test structural req secs in the entity cache if it is enabled.
	 *
	 * @param addLabTestStructuralReqSecs the add lab test structural req secs
	 */
	public static void cacheResult(
		List<AddLabTestStructuralReqSec> addLabTestStructuralReqSecs) {

		getPersistence().cacheResult(addLabTestStructuralReqSecs);
	}

	/**
	 * Creates a new add lab test structural req sec with the primary key. Does not add the add lab test structural req sec to the database.
	 *
	 * @param addLabTestStructuralReqSecId the primary key for the new add lab test structural req sec
	 * @return the new add lab test structural req sec
	 */
	public static AddLabTestStructuralReqSec create(
		long addLabTestStructuralReqSecId) {

		return getPersistence().create(addLabTestStructuralReqSecId);
	}

	/**
	 * Removes the add lab test structural req sec with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param addLabTestStructuralReqSecId the primary key of the add lab test structural req sec
	 * @return the add lab test structural req sec that was removed
	 * @throws NoSuchAddLabTestStructuralReqSecException if a add lab test structural req sec with the primary key could not be found
	 */
	public static AddLabTestStructuralReqSec remove(
			long addLabTestStructuralReqSecId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddLabTestStructuralReqSecException {

		return getPersistence().remove(addLabTestStructuralReqSecId);
	}

	public static AddLabTestStructuralReqSec updateImpl(
		AddLabTestStructuralReqSec addLabTestStructuralReqSec) {

		return getPersistence().updateImpl(addLabTestStructuralReqSec);
	}

	/**
	 * Returns the add lab test structural req sec with the primary key or throws a <code>NoSuchAddLabTestStructuralReqSecException</code> if it could not be found.
	 *
	 * @param addLabTestStructuralReqSecId the primary key of the add lab test structural req sec
	 * @return the add lab test structural req sec
	 * @throws NoSuchAddLabTestStructuralReqSecException if a add lab test structural req sec with the primary key could not be found
	 */
	public static AddLabTestStructuralReqSec findByPrimaryKey(
			long addLabTestStructuralReqSecId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddLabTestStructuralReqSecException {

		return getPersistence().findByPrimaryKey(addLabTestStructuralReqSecId);
	}

	/**
	 * Returns the add lab test structural req sec with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param addLabTestStructuralReqSecId the primary key of the add lab test structural req sec
	 * @return the add lab test structural req sec, or <code>null</code> if a add lab test structural req sec with the primary key could not be found
	 */
	public static AddLabTestStructuralReqSec fetchByPrimaryKey(
		long addLabTestStructuralReqSecId) {

		return getPersistence().fetchByPrimaryKey(addLabTestStructuralReqSecId);
	}

	/**
	 * Returns all the add lab test structural req secs.
	 *
	 * @return the add lab test structural req secs
	 */
	public static List<AddLabTestStructuralReqSec> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the add lab test structural req secs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabTestStructuralReqSecModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add lab test structural req secs
	 * @param end the upper bound of the range of add lab test structural req secs (not inclusive)
	 * @return the range of add lab test structural req secs
	 */
	public static List<AddLabTestStructuralReqSec> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the add lab test structural req secs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabTestStructuralReqSecModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add lab test structural req secs
	 * @param end the upper bound of the range of add lab test structural req secs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of add lab test structural req secs
	 */
	public static List<AddLabTestStructuralReqSec> findAll(
		int start, int end,
		OrderByComparator<AddLabTestStructuralReqSec> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the add lab test structural req secs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabTestStructuralReqSecModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add lab test structural req secs
	 * @param end the upper bound of the range of add lab test structural req secs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of add lab test structural req secs
	 */
	public static List<AddLabTestStructuralReqSec> findAll(
		int start, int end,
		OrderByComparator<AddLabTestStructuralReqSec> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the add lab test structural req secs from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of add lab test structural req secs.
	 *
	 * @return the number of add lab test structural req secs
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AddLabTestStructuralReqSecPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		AddLabTestStructuralReqSecPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile AddLabTestStructuralReqSecPersistence _persistence;

}