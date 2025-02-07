/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.janaac.application.form.service.model.AddLaboratoryPartOfOrg;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the add laboratory part of org service. This utility wraps <code>com.nbp.janaac.application.form.service.service.persistence.impl.AddLaboratoryPartOfOrgPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AddLaboratoryPartOfOrgPersistence
 * @generated
 */
public class AddLaboratoryPartOfOrgUtil {

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
		AddLaboratoryPartOfOrg addLaboratoryPartOfOrg) {

		getPersistence().clearCache(addLaboratoryPartOfOrg);
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
	public static Map<Serializable, AddLaboratoryPartOfOrg> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AddLaboratoryPartOfOrg> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AddLaboratoryPartOfOrg> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AddLaboratoryPartOfOrg> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AddLaboratoryPartOfOrg> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AddLaboratoryPartOfOrg update(
		AddLaboratoryPartOfOrg addLaboratoryPartOfOrg) {

		return getPersistence().update(addLaboratoryPartOfOrg);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AddLaboratoryPartOfOrg update(
		AddLaboratoryPartOfOrg addLaboratoryPartOfOrg,
		ServiceContext serviceContext) {

		return getPersistence().update(addLaboratoryPartOfOrg, serviceContext);
	}

	/**
	 * Returns all the add laboratory part of orgs where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching add laboratory part of orgs
	 */
	public static List<AddLaboratoryPartOfOrg> findBygetJanaacByAppId(
		long janaacApplicationId) {

		return getPersistence().findBygetJanaacByAppId(janaacApplicationId);
	}

	/**
	 * Returns a range of all the add laboratory part of orgs where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLaboratoryPartOfOrgModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add laboratory part of orgs
	 * @param end the upper bound of the range of add laboratory part of orgs (not inclusive)
	 * @return the range of matching add laboratory part of orgs
	 */
	public static List<AddLaboratoryPartOfOrg> findBygetJanaacByAppId(
		long janaacApplicationId, int start, int end) {

		return getPersistence().findBygetJanaacByAppId(
			janaacApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the add laboratory part of orgs where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLaboratoryPartOfOrgModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add laboratory part of orgs
	 * @param end the upper bound of the range of add laboratory part of orgs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching add laboratory part of orgs
	 */
	public static List<AddLaboratoryPartOfOrg> findBygetJanaacByAppId(
		long janaacApplicationId, int start, int end,
		OrderByComparator<AddLaboratoryPartOfOrg> orderByComparator) {

		return getPersistence().findBygetJanaacByAppId(
			janaacApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the add laboratory part of orgs where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLaboratoryPartOfOrgModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add laboratory part of orgs
	 * @param end the upper bound of the range of add laboratory part of orgs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching add laboratory part of orgs
	 */
	public static List<AddLaboratoryPartOfOrg> findBygetJanaacByAppId(
		long janaacApplicationId, int start, int end,
		OrderByComparator<AddLaboratoryPartOfOrg> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetJanaacByAppId(
			janaacApplicationId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first add laboratory part of org in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add laboratory part of org
	 * @throws NoSuchAddLaboratoryPartOfOrgException if a matching add laboratory part of org could not be found
	 */
	public static AddLaboratoryPartOfOrg findBygetJanaacByAppId_First(
			long janaacApplicationId,
			OrderByComparator<AddLaboratoryPartOfOrg> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddLaboratoryPartOfOrgException {

		return getPersistence().findBygetJanaacByAppId_First(
			janaacApplicationId, orderByComparator);
	}

	/**
	 * Returns the first add laboratory part of org in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add laboratory part of org, or <code>null</code> if a matching add laboratory part of org could not be found
	 */
	public static AddLaboratoryPartOfOrg fetchBygetJanaacByAppId_First(
		long janaacApplicationId,
		OrderByComparator<AddLaboratoryPartOfOrg> orderByComparator) {

		return getPersistence().fetchBygetJanaacByAppId_First(
			janaacApplicationId, orderByComparator);
	}

	/**
	 * Returns the last add laboratory part of org in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add laboratory part of org
	 * @throws NoSuchAddLaboratoryPartOfOrgException if a matching add laboratory part of org could not be found
	 */
	public static AddLaboratoryPartOfOrg findBygetJanaacByAppId_Last(
			long janaacApplicationId,
			OrderByComparator<AddLaboratoryPartOfOrg> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddLaboratoryPartOfOrgException {

		return getPersistence().findBygetJanaacByAppId_Last(
			janaacApplicationId, orderByComparator);
	}

	/**
	 * Returns the last add laboratory part of org in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add laboratory part of org, or <code>null</code> if a matching add laboratory part of org could not be found
	 */
	public static AddLaboratoryPartOfOrg fetchBygetJanaacByAppId_Last(
		long janaacApplicationId,
		OrderByComparator<AddLaboratoryPartOfOrg> orderByComparator) {

		return getPersistence().fetchBygetJanaacByAppId_Last(
			janaacApplicationId, orderByComparator);
	}

	/**
	 * Returns the add laboratory part of orgs before and after the current add laboratory part of org in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param addLaboratoryPartOfOrgId the primary key of the current add laboratory part of org
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next add laboratory part of org
	 * @throws NoSuchAddLaboratoryPartOfOrgException if a add laboratory part of org with the primary key could not be found
	 */
	public static AddLaboratoryPartOfOrg[] findBygetJanaacByAppId_PrevAndNext(
			long addLaboratoryPartOfOrgId, long janaacApplicationId,
			OrderByComparator<AddLaboratoryPartOfOrg> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddLaboratoryPartOfOrgException {

		return getPersistence().findBygetJanaacByAppId_PrevAndNext(
			addLaboratoryPartOfOrgId, janaacApplicationId, orderByComparator);
	}

	/**
	 * Removes all the add laboratory part of orgs where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 */
	public static void removeBygetJanaacByAppId(long janaacApplicationId) {
		getPersistence().removeBygetJanaacByAppId(janaacApplicationId);
	}

	/**
	 * Returns the number of add laboratory part of orgs where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching add laboratory part of orgs
	 */
	public static int countBygetJanaacByAppId(long janaacApplicationId) {
		return getPersistence().countBygetJanaacByAppId(janaacApplicationId);
	}

	/**
	 * Caches the add laboratory part of org in the entity cache if it is enabled.
	 *
	 * @param addLaboratoryPartOfOrg the add laboratory part of org
	 */
	public static void cacheResult(
		AddLaboratoryPartOfOrg addLaboratoryPartOfOrg) {

		getPersistence().cacheResult(addLaboratoryPartOfOrg);
	}

	/**
	 * Caches the add laboratory part of orgs in the entity cache if it is enabled.
	 *
	 * @param addLaboratoryPartOfOrgs the add laboratory part of orgs
	 */
	public static void cacheResult(
		List<AddLaboratoryPartOfOrg> addLaboratoryPartOfOrgs) {

		getPersistence().cacheResult(addLaboratoryPartOfOrgs);
	}

	/**
	 * Creates a new add laboratory part of org with the primary key. Does not add the add laboratory part of org to the database.
	 *
	 * @param addLaboratoryPartOfOrgId the primary key for the new add laboratory part of org
	 * @return the new add laboratory part of org
	 */
	public static AddLaboratoryPartOfOrg create(long addLaboratoryPartOfOrgId) {
		return getPersistence().create(addLaboratoryPartOfOrgId);
	}

	/**
	 * Removes the add laboratory part of org with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param addLaboratoryPartOfOrgId the primary key of the add laboratory part of org
	 * @return the add laboratory part of org that was removed
	 * @throws NoSuchAddLaboratoryPartOfOrgException if a add laboratory part of org with the primary key could not be found
	 */
	public static AddLaboratoryPartOfOrg remove(long addLaboratoryPartOfOrgId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddLaboratoryPartOfOrgException {

		return getPersistence().remove(addLaboratoryPartOfOrgId);
	}

	public static AddLaboratoryPartOfOrg updateImpl(
		AddLaboratoryPartOfOrg addLaboratoryPartOfOrg) {

		return getPersistence().updateImpl(addLaboratoryPartOfOrg);
	}

	/**
	 * Returns the add laboratory part of org with the primary key or throws a <code>NoSuchAddLaboratoryPartOfOrgException</code> if it could not be found.
	 *
	 * @param addLaboratoryPartOfOrgId the primary key of the add laboratory part of org
	 * @return the add laboratory part of org
	 * @throws NoSuchAddLaboratoryPartOfOrgException if a add laboratory part of org with the primary key could not be found
	 */
	public static AddLaboratoryPartOfOrg findByPrimaryKey(
			long addLaboratoryPartOfOrgId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddLaboratoryPartOfOrgException {

		return getPersistence().findByPrimaryKey(addLaboratoryPartOfOrgId);
	}

	/**
	 * Returns the add laboratory part of org with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param addLaboratoryPartOfOrgId the primary key of the add laboratory part of org
	 * @return the add laboratory part of org, or <code>null</code> if a add laboratory part of org with the primary key could not be found
	 */
	public static AddLaboratoryPartOfOrg fetchByPrimaryKey(
		long addLaboratoryPartOfOrgId) {

		return getPersistence().fetchByPrimaryKey(addLaboratoryPartOfOrgId);
	}

	/**
	 * Returns all the add laboratory part of orgs.
	 *
	 * @return the add laboratory part of orgs
	 */
	public static List<AddLaboratoryPartOfOrg> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the add laboratory part of orgs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLaboratoryPartOfOrgModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add laboratory part of orgs
	 * @param end the upper bound of the range of add laboratory part of orgs (not inclusive)
	 * @return the range of add laboratory part of orgs
	 */
	public static List<AddLaboratoryPartOfOrg> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the add laboratory part of orgs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLaboratoryPartOfOrgModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add laboratory part of orgs
	 * @param end the upper bound of the range of add laboratory part of orgs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of add laboratory part of orgs
	 */
	public static List<AddLaboratoryPartOfOrg> findAll(
		int start, int end,
		OrderByComparator<AddLaboratoryPartOfOrg> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the add laboratory part of orgs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLaboratoryPartOfOrgModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add laboratory part of orgs
	 * @param end the upper bound of the range of add laboratory part of orgs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of add laboratory part of orgs
	 */
	public static List<AddLaboratoryPartOfOrg> findAll(
		int start, int end,
		OrderByComparator<AddLaboratoryPartOfOrg> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the add laboratory part of orgs from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of add laboratory part of orgs.
	 *
	 * @return the number of add laboratory part of orgs
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AddLaboratoryPartOfOrgPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		AddLaboratoryPartOfOrgPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile AddLaboratoryPartOfOrgPersistence _persistence;

}