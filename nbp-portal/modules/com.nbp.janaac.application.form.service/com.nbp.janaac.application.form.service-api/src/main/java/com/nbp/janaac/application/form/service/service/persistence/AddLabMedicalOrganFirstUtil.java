/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.janaac.application.form.service.model.AddLabMedicalOrganFirst;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the add lab medical organ first service. This utility wraps <code>com.nbp.janaac.application.form.service.service.persistence.impl.AddLabMedicalOrganFirstPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AddLabMedicalOrganFirstPersistence
 * @generated
 */
public class AddLabMedicalOrganFirstUtil {

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
		AddLabMedicalOrganFirst addLabMedicalOrganFirst) {

		getPersistence().clearCache(addLabMedicalOrganFirst);
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
	public static Map<Serializable, AddLabMedicalOrganFirst> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AddLabMedicalOrganFirst> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AddLabMedicalOrganFirst> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AddLabMedicalOrganFirst> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AddLabMedicalOrganFirst> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AddLabMedicalOrganFirst update(
		AddLabMedicalOrganFirst addLabMedicalOrganFirst) {

		return getPersistence().update(addLabMedicalOrganFirst);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AddLabMedicalOrganFirst update(
		AddLabMedicalOrganFirst addLabMedicalOrganFirst,
		ServiceContext serviceContext) {

		return getPersistence().update(addLabMedicalOrganFirst, serviceContext);
	}

	/**
	 * Returns all the add lab medical organ firsts where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching add lab medical organ firsts
	 */
	public static List<AddLabMedicalOrganFirst> findBygetJanaacById(
		long janaacApplicationId) {

		return getPersistence().findBygetJanaacById(janaacApplicationId);
	}

	/**
	 * Returns a range of all the add lab medical organ firsts where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabMedicalOrganFirstModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add lab medical organ firsts
	 * @param end the upper bound of the range of add lab medical organ firsts (not inclusive)
	 * @return the range of matching add lab medical organ firsts
	 */
	public static List<AddLabMedicalOrganFirst> findBygetJanaacById(
		long janaacApplicationId, int start, int end) {

		return getPersistence().findBygetJanaacById(
			janaacApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the add lab medical organ firsts where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabMedicalOrganFirstModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add lab medical organ firsts
	 * @param end the upper bound of the range of add lab medical organ firsts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching add lab medical organ firsts
	 */
	public static List<AddLabMedicalOrganFirst> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		OrderByComparator<AddLabMedicalOrganFirst> orderByComparator) {

		return getPersistence().findBygetJanaacById(
			janaacApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the add lab medical organ firsts where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabMedicalOrganFirstModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add lab medical organ firsts
	 * @param end the upper bound of the range of add lab medical organ firsts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching add lab medical organ firsts
	 */
	public static List<AddLabMedicalOrganFirst> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		OrderByComparator<AddLabMedicalOrganFirst> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetJanaacById(
			janaacApplicationId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first add lab medical organ first in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add lab medical organ first
	 * @throws NoSuchAddLabMedicalOrganFirstException if a matching add lab medical organ first could not be found
	 */
	public static AddLabMedicalOrganFirst findBygetJanaacById_First(
			long janaacApplicationId,
			OrderByComparator<AddLabMedicalOrganFirst> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddLabMedicalOrganFirstException {

		return getPersistence().findBygetJanaacById_First(
			janaacApplicationId, orderByComparator);
	}

	/**
	 * Returns the first add lab medical organ first in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add lab medical organ first, or <code>null</code> if a matching add lab medical organ first could not be found
	 */
	public static AddLabMedicalOrganFirst fetchBygetJanaacById_First(
		long janaacApplicationId,
		OrderByComparator<AddLabMedicalOrganFirst> orderByComparator) {

		return getPersistence().fetchBygetJanaacById_First(
			janaacApplicationId, orderByComparator);
	}

	/**
	 * Returns the last add lab medical organ first in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add lab medical organ first
	 * @throws NoSuchAddLabMedicalOrganFirstException if a matching add lab medical organ first could not be found
	 */
	public static AddLabMedicalOrganFirst findBygetJanaacById_Last(
			long janaacApplicationId,
			OrderByComparator<AddLabMedicalOrganFirst> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddLabMedicalOrganFirstException {

		return getPersistence().findBygetJanaacById_Last(
			janaacApplicationId, orderByComparator);
	}

	/**
	 * Returns the last add lab medical organ first in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add lab medical organ first, or <code>null</code> if a matching add lab medical organ first could not be found
	 */
	public static AddLabMedicalOrganFirst fetchBygetJanaacById_Last(
		long janaacApplicationId,
		OrderByComparator<AddLabMedicalOrganFirst> orderByComparator) {

		return getPersistence().fetchBygetJanaacById_Last(
			janaacApplicationId, orderByComparator);
	}

	/**
	 * Returns the add lab medical organ firsts before and after the current add lab medical organ first in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param addLabMedicalOrganFirstId the primary key of the current add lab medical organ first
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next add lab medical organ first
	 * @throws NoSuchAddLabMedicalOrganFirstException if a add lab medical organ first with the primary key could not be found
	 */
	public static AddLabMedicalOrganFirst[] findBygetJanaacById_PrevAndNext(
			long addLabMedicalOrganFirstId, long janaacApplicationId,
			OrderByComparator<AddLabMedicalOrganFirst> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddLabMedicalOrganFirstException {

		return getPersistence().findBygetJanaacById_PrevAndNext(
			addLabMedicalOrganFirstId, janaacApplicationId, orderByComparator);
	}

	/**
	 * Removes all the add lab medical organ firsts where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 */
	public static void removeBygetJanaacById(long janaacApplicationId) {
		getPersistence().removeBygetJanaacById(janaacApplicationId);
	}

	/**
	 * Returns the number of add lab medical organ firsts where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching add lab medical organ firsts
	 */
	public static int countBygetJanaacById(long janaacApplicationId) {
		return getPersistence().countBygetJanaacById(janaacApplicationId);
	}

	/**
	 * Caches the add lab medical organ first in the entity cache if it is enabled.
	 *
	 * @param addLabMedicalOrganFirst the add lab medical organ first
	 */
	public static void cacheResult(
		AddLabMedicalOrganFirst addLabMedicalOrganFirst) {

		getPersistence().cacheResult(addLabMedicalOrganFirst);
	}

	/**
	 * Caches the add lab medical organ firsts in the entity cache if it is enabled.
	 *
	 * @param addLabMedicalOrganFirsts the add lab medical organ firsts
	 */
	public static void cacheResult(
		List<AddLabMedicalOrganFirst> addLabMedicalOrganFirsts) {

		getPersistence().cacheResult(addLabMedicalOrganFirsts);
	}

	/**
	 * Creates a new add lab medical organ first with the primary key. Does not add the add lab medical organ first to the database.
	 *
	 * @param addLabMedicalOrganFirstId the primary key for the new add lab medical organ first
	 * @return the new add lab medical organ first
	 */
	public static AddLabMedicalOrganFirst create(
		long addLabMedicalOrganFirstId) {

		return getPersistence().create(addLabMedicalOrganFirstId);
	}

	/**
	 * Removes the add lab medical organ first with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param addLabMedicalOrganFirstId the primary key of the add lab medical organ first
	 * @return the add lab medical organ first that was removed
	 * @throws NoSuchAddLabMedicalOrganFirstException if a add lab medical organ first with the primary key could not be found
	 */
	public static AddLabMedicalOrganFirst remove(long addLabMedicalOrganFirstId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddLabMedicalOrganFirstException {

		return getPersistence().remove(addLabMedicalOrganFirstId);
	}

	public static AddLabMedicalOrganFirst updateImpl(
		AddLabMedicalOrganFirst addLabMedicalOrganFirst) {

		return getPersistence().updateImpl(addLabMedicalOrganFirst);
	}

	/**
	 * Returns the add lab medical organ first with the primary key or throws a <code>NoSuchAddLabMedicalOrganFirstException</code> if it could not be found.
	 *
	 * @param addLabMedicalOrganFirstId the primary key of the add lab medical organ first
	 * @return the add lab medical organ first
	 * @throws NoSuchAddLabMedicalOrganFirstException if a add lab medical organ first with the primary key could not be found
	 */
	public static AddLabMedicalOrganFirst findByPrimaryKey(
			long addLabMedicalOrganFirstId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddLabMedicalOrganFirstException {

		return getPersistence().findByPrimaryKey(addLabMedicalOrganFirstId);
	}

	/**
	 * Returns the add lab medical organ first with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param addLabMedicalOrganFirstId the primary key of the add lab medical organ first
	 * @return the add lab medical organ first, or <code>null</code> if a add lab medical organ first with the primary key could not be found
	 */
	public static AddLabMedicalOrganFirst fetchByPrimaryKey(
		long addLabMedicalOrganFirstId) {

		return getPersistence().fetchByPrimaryKey(addLabMedicalOrganFirstId);
	}

	/**
	 * Returns all the add lab medical organ firsts.
	 *
	 * @return the add lab medical organ firsts
	 */
	public static List<AddLabMedicalOrganFirst> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the add lab medical organ firsts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabMedicalOrganFirstModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add lab medical organ firsts
	 * @param end the upper bound of the range of add lab medical organ firsts (not inclusive)
	 * @return the range of add lab medical organ firsts
	 */
	public static List<AddLabMedicalOrganFirst> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the add lab medical organ firsts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabMedicalOrganFirstModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add lab medical organ firsts
	 * @param end the upper bound of the range of add lab medical organ firsts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of add lab medical organ firsts
	 */
	public static List<AddLabMedicalOrganFirst> findAll(
		int start, int end,
		OrderByComparator<AddLabMedicalOrganFirst> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the add lab medical organ firsts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabMedicalOrganFirstModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add lab medical organ firsts
	 * @param end the upper bound of the range of add lab medical organ firsts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of add lab medical organ firsts
	 */
	public static List<AddLabMedicalOrganFirst> findAll(
		int start, int end,
		OrderByComparator<AddLabMedicalOrganFirst> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the add lab medical organ firsts from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of add lab medical organ firsts.
	 *
	 * @return the number of add lab medical organ firsts
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AddLabMedicalOrganFirstPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		AddLabMedicalOrganFirstPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile AddLabMedicalOrganFirstPersistence _persistence;

}