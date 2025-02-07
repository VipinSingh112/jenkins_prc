/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.janaac.application.form.service.model.AddLabStructuralRequirement;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the add lab structural requirement service. This utility wraps <code>com.nbp.janaac.application.form.service.service.persistence.impl.AddLabStructuralRequirementPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AddLabStructuralRequirementPersistence
 * @generated
 */
public class AddLabStructuralRequirementUtil {

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
		AddLabStructuralRequirement addLabStructuralRequirement) {

		getPersistence().clearCache(addLabStructuralRequirement);
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
	public static Map<Serializable, AddLabStructuralRequirement>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AddLabStructuralRequirement> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AddLabStructuralRequirement> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AddLabStructuralRequirement> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AddLabStructuralRequirement> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AddLabStructuralRequirement update(
		AddLabStructuralRequirement addLabStructuralRequirement) {

		return getPersistence().update(addLabStructuralRequirement);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AddLabStructuralRequirement update(
		AddLabStructuralRequirement addLabStructuralRequirement,
		ServiceContext serviceContext) {

		return getPersistence().update(
			addLabStructuralRequirement, serviceContext);
	}

	/**
	 * Returns all the add lab structural requirements where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching add lab structural requirements
	 */
	public static List<AddLabStructuralRequirement> findBygetJanaacById(
		long janaacApplicationId) {

		return getPersistence().findBygetJanaacById(janaacApplicationId);
	}

	/**
	 * Returns a range of all the add lab structural requirements where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabStructuralRequirementModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add lab structural requirements
	 * @param end the upper bound of the range of add lab structural requirements (not inclusive)
	 * @return the range of matching add lab structural requirements
	 */
	public static List<AddLabStructuralRequirement> findBygetJanaacById(
		long janaacApplicationId, int start, int end) {

		return getPersistence().findBygetJanaacById(
			janaacApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the add lab structural requirements where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabStructuralRequirementModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add lab structural requirements
	 * @param end the upper bound of the range of add lab structural requirements (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching add lab structural requirements
	 */
	public static List<AddLabStructuralRequirement> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		OrderByComparator<AddLabStructuralRequirement> orderByComparator) {

		return getPersistence().findBygetJanaacById(
			janaacApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the add lab structural requirements where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabStructuralRequirementModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add lab structural requirements
	 * @param end the upper bound of the range of add lab structural requirements (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching add lab structural requirements
	 */
	public static List<AddLabStructuralRequirement> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		OrderByComparator<AddLabStructuralRequirement> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetJanaacById(
			janaacApplicationId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first add lab structural requirement in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add lab structural requirement
	 * @throws NoSuchAddLabStructuralRequirementException if a matching add lab structural requirement could not be found
	 */
	public static AddLabStructuralRequirement findBygetJanaacById_First(
			long janaacApplicationId,
			OrderByComparator<AddLabStructuralRequirement> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddLabStructuralRequirementException {

		return getPersistence().findBygetJanaacById_First(
			janaacApplicationId, orderByComparator);
	}

	/**
	 * Returns the first add lab structural requirement in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add lab structural requirement, or <code>null</code> if a matching add lab structural requirement could not be found
	 */
	public static AddLabStructuralRequirement fetchBygetJanaacById_First(
		long janaacApplicationId,
		OrderByComparator<AddLabStructuralRequirement> orderByComparator) {

		return getPersistence().fetchBygetJanaacById_First(
			janaacApplicationId, orderByComparator);
	}

	/**
	 * Returns the last add lab structural requirement in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add lab structural requirement
	 * @throws NoSuchAddLabStructuralRequirementException if a matching add lab structural requirement could not be found
	 */
	public static AddLabStructuralRequirement findBygetJanaacById_Last(
			long janaacApplicationId,
			OrderByComparator<AddLabStructuralRequirement> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddLabStructuralRequirementException {

		return getPersistence().findBygetJanaacById_Last(
			janaacApplicationId, orderByComparator);
	}

	/**
	 * Returns the last add lab structural requirement in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add lab structural requirement, or <code>null</code> if a matching add lab structural requirement could not be found
	 */
	public static AddLabStructuralRequirement fetchBygetJanaacById_Last(
		long janaacApplicationId,
		OrderByComparator<AddLabStructuralRequirement> orderByComparator) {

		return getPersistence().fetchBygetJanaacById_Last(
			janaacApplicationId, orderByComparator);
	}

	/**
	 * Returns the add lab structural requirements before and after the current add lab structural requirement in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param addLabStructuralRequirementId the primary key of the current add lab structural requirement
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next add lab structural requirement
	 * @throws NoSuchAddLabStructuralRequirementException if a add lab structural requirement with the primary key could not be found
	 */
	public static AddLabStructuralRequirement[] findBygetJanaacById_PrevAndNext(
			long addLabStructuralRequirementId, long janaacApplicationId,
			OrderByComparator<AddLabStructuralRequirement> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddLabStructuralRequirementException {

		return getPersistence().findBygetJanaacById_PrevAndNext(
			addLabStructuralRequirementId, janaacApplicationId,
			orderByComparator);
	}

	/**
	 * Removes all the add lab structural requirements where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 */
	public static void removeBygetJanaacById(long janaacApplicationId) {
		getPersistence().removeBygetJanaacById(janaacApplicationId);
	}

	/**
	 * Returns the number of add lab structural requirements where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching add lab structural requirements
	 */
	public static int countBygetJanaacById(long janaacApplicationId) {
		return getPersistence().countBygetJanaacById(janaacApplicationId);
	}

	/**
	 * Caches the add lab structural requirement in the entity cache if it is enabled.
	 *
	 * @param addLabStructuralRequirement the add lab structural requirement
	 */
	public static void cacheResult(
		AddLabStructuralRequirement addLabStructuralRequirement) {

		getPersistence().cacheResult(addLabStructuralRequirement);
	}

	/**
	 * Caches the add lab structural requirements in the entity cache if it is enabled.
	 *
	 * @param addLabStructuralRequirements the add lab structural requirements
	 */
	public static void cacheResult(
		List<AddLabStructuralRequirement> addLabStructuralRequirements) {

		getPersistence().cacheResult(addLabStructuralRequirements);
	}

	/**
	 * Creates a new add lab structural requirement with the primary key. Does not add the add lab structural requirement to the database.
	 *
	 * @param addLabStructuralRequirementId the primary key for the new add lab structural requirement
	 * @return the new add lab structural requirement
	 */
	public static AddLabStructuralRequirement create(
		long addLabStructuralRequirementId) {

		return getPersistence().create(addLabStructuralRequirementId);
	}

	/**
	 * Removes the add lab structural requirement with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param addLabStructuralRequirementId the primary key of the add lab structural requirement
	 * @return the add lab structural requirement that was removed
	 * @throws NoSuchAddLabStructuralRequirementException if a add lab structural requirement with the primary key could not be found
	 */
	public static AddLabStructuralRequirement remove(
			long addLabStructuralRequirementId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddLabStructuralRequirementException {

		return getPersistence().remove(addLabStructuralRequirementId);
	}

	public static AddLabStructuralRequirement updateImpl(
		AddLabStructuralRequirement addLabStructuralRequirement) {

		return getPersistence().updateImpl(addLabStructuralRequirement);
	}

	/**
	 * Returns the add lab structural requirement with the primary key or throws a <code>NoSuchAddLabStructuralRequirementException</code> if it could not be found.
	 *
	 * @param addLabStructuralRequirementId the primary key of the add lab structural requirement
	 * @return the add lab structural requirement
	 * @throws NoSuchAddLabStructuralRequirementException if a add lab structural requirement with the primary key could not be found
	 */
	public static AddLabStructuralRequirement findByPrimaryKey(
			long addLabStructuralRequirementId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddLabStructuralRequirementException {

		return getPersistence().findByPrimaryKey(addLabStructuralRequirementId);
	}

	/**
	 * Returns the add lab structural requirement with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param addLabStructuralRequirementId the primary key of the add lab structural requirement
	 * @return the add lab structural requirement, or <code>null</code> if a add lab structural requirement with the primary key could not be found
	 */
	public static AddLabStructuralRequirement fetchByPrimaryKey(
		long addLabStructuralRequirementId) {

		return getPersistence().fetchByPrimaryKey(
			addLabStructuralRequirementId);
	}

	/**
	 * Returns all the add lab structural requirements.
	 *
	 * @return the add lab structural requirements
	 */
	public static List<AddLabStructuralRequirement> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the add lab structural requirements.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabStructuralRequirementModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add lab structural requirements
	 * @param end the upper bound of the range of add lab structural requirements (not inclusive)
	 * @return the range of add lab structural requirements
	 */
	public static List<AddLabStructuralRequirement> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the add lab structural requirements.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabStructuralRequirementModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add lab structural requirements
	 * @param end the upper bound of the range of add lab structural requirements (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of add lab structural requirements
	 */
	public static List<AddLabStructuralRequirement> findAll(
		int start, int end,
		OrderByComparator<AddLabStructuralRequirement> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the add lab structural requirements.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabStructuralRequirementModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add lab structural requirements
	 * @param end the upper bound of the range of add lab structural requirements (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of add lab structural requirements
	 */
	public static List<AddLabStructuralRequirement> findAll(
		int start, int end,
		OrderByComparator<AddLabStructuralRequirement> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the add lab structural requirements from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of add lab structural requirements.
	 *
	 * @return the number of add lab structural requirements
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AddLabStructuralRequirementPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		AddLabStructuralRequirementPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile AddLabStructuralRequirementPersistence _persistence;

}