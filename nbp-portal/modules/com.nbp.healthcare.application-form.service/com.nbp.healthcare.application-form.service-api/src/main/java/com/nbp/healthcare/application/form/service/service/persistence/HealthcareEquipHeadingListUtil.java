/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.healthcare.application.form.service.model.HealthcareEquipHeadingList;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the healthcare equip heading list service. This utility wraps <code>com.nbp.healthcare.application.form.service.service.persistence.impl.HealthcareEquipHeadingListPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HealthcareEquipHeadingListPersistence
 * @generated
 */
public class HealthcareEquipHeadingListUtil {

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
		HealthcareEquipHeadingList healthcareEquipHeadingList) {

		getPersistence().clearCache(healthcareEquipHeadingList);
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
	public static Map<Serializable, HealthcareEquipHeadingList>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<HealthcareEquipHeadingList> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<HealthcareEquipHeadingList> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<HealthcareEquipHeadingList> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<HealthcareEquipHeadingList> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static HealthcareEquipHeadingList update(
		HealthcareEquipHeadingList healthcareEquipHeadingList) {

		return getPersistence().update(healthcareEquipHeadingList);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static HealthcareEquipHeadingList update(
		HealthcareEquipHeadingList healthcareEquipHeadingList,
		ServiceContext serviceContext) {

		return getPersistence().update(
			healthcareEquipHeadingList, serviceContext);
	}

	/**
	 * Returns the healthcare equip heading list where healthcareDescription = &#63; or throws a <code>NoSuchHealthcareEquipHeadingListException</code> if it could not be found.
	 *
	 * @param healthcareDescription the healthcare description
	 * @return the matching healthcare equip heading list
	 * @throws NoSuchHealthcareEquipHeadingListException if a matching healthcare equip heading list could not be found
	 */
	public static HealthcareEquipHeadingList findByget_HL_HD(
			String healthcareDescription)
		throws com.nbp.healthcare.application.form.service.exception.
			NoSuchHealthcareEquipHeadingListException {

		return getPersistence().findByget_HL_HD(healthcareDescription);
	}

	/**
	 * Returns the healthcare equip heading list where healthcareDescription = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param healthcareDescription the healthcare description
	 * @return the matching healthcare equip heading list, or <code>null</code> if a matching healthcare equip heading list could not be found
	 */
	public static HealthcareEquipHeadingList fetchByget_HL_HD(
		String healthcareDescription) {

		return getPersistence().fetchByget_HL_HD(healthcareDescription);
	}

	/**
	 * Returns the healthcare equip heading list where healthcareDescription = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param healthcareDescription the healthcare description
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching healthcare equip heading list, or <code>null</code> if a matching healthcare equip heading list could not be found
	 */
	public static HealthcareEquipHeadingList fetchByget_HL_HD(
		String healthcareDescription, boolean useFinderCache) {

		return getPersistence().fetchByget_HL_HD(
			healthcareDescription, useFinderCache);
	}

	/**
	 * Removes the healthcare equip heading list where healthcareDescription = &#63; from the database.
	 *
	 * @param healthcareDescription the healthcare description
	 * @return the healthcare equip heading list that was removed
	 */
	public static HealthcareEquipHeadingList removeByget_HL_HD(
			String healthcareDescription)
		throws com.nbp.healthcare.application.form.service.exception.
			NoSuchHealthcareEquipHeadingListException {

		return getPersistence().removeByget_HL_HD(healthcareDescription);
	}

	/**
	 * Returns the number of healthcare equip heading lists where healthcareDescription = &#63;.
	 *
	 * @param healthcareDescription the healthcare description
	 * @return the number of matching healthcare equip heading lists
	 */
	public static int countByget_HL_HD(String healthcareDescription) {
		return getPersistence().countByget_HL_HD(healthcareDescription);
	}

	/**
	 * Caches the healthcare equip heading list in the entity cache if it is enabled.
	 *
	 * @param healthcareEquipHeadingList the healthcare equip heading list
	 */
	public static void cacheResult(
		HealthcareEquipHeadingList healthcareEquipHeadingList) {

		getPersistence().cacheResult(healthcareEquipHeadingList);
	}

	/**
	 * Caches the healthcare equip heading lists in the entity cache if it is enabled.
	 *
	 * @param healthcareEquipHeadingLists the healthcare equip heading lists
	 */
	public static void cacheResult(
		List<HealthcareEquipHeadingList> healthcareEquipHeadingLists) {

		getPersistence().cacheResult(healthcareEquipHeadingLists);
	}

	/**
	 * Creates a new healthcare equip heading list with the primary key. Does not add the healthcare equip heading list to the database.
	 *
	 * @param healthcareEquipHeadingListId the primary key for the new healthcare equip heading list
	 * @return the new healthcare equip heading list
	 */
	public static HealthcareEquipHeadingList create(
		long healthcareEquipHeadingListId) {

		return getPersistence().create(healthcareEquipHeadingListId);
	}

	/**
	 * Removes the healthcare equip heading list with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param healthcareEquipHeadingListId the primary key of the healthcare equip heading list
	 * @return the healthcare equip heading list that was removed
	 * @throws NoSuchHealthcareEquipHeadingListException if a healthcare equip heading list with the primary key could not be found
	 */
	public static HealthcareEquipHeadingList remove(
			long healthcareEquipHeadingListId)
		throws com.nbp.healthcare.application.form.service.exception.
			NoSuchHealthcareEquipHeadingListException {

		return getPersistence().remove(healthcareEquipHeadingListId);
	}

	public static HealthcareEquipHeadingList updateImpl(
		HealthcareEquipHeadingList healthcareEquipHeadingList) {

		return getPersistence().updateImpl(healthcareEquipHeadingList);
	}

	/**
	 * Returns the healthcare equip heading list with the primary key or throws a <code>NoSuchHealthcareEquipHeadingListException</code> if it could not be found.
	 *
	 * @param healthcareEquipHeadingListId the primary key of the healthcare equip heading list
	 * @return the healthcare equip heading list
	 * @throws NoSuchHealthcareEquipHeadingListException if a healthcare equip heading list with the primary key could not be found
	 */
	public static HealthcareEquipHeadingList findByPrimaryKey(
			long healthcareEquipHeadingListId)
		throws com.nbp.healthcare.application.form.service.exception.
			NoSuchHealthcareEquipHeadingListException {

		return getPersistence().findByPrimaryKey(healthcareEquipHeadingListId);
	}

	/**
	 * Returns the healthcare equip heading list with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param healthcareEquipHeadingListId the primary key of the healthcare equip heading list
	 * @return the healthcare equip heading list, or <code>null</code> if a healthcare equip heading list with the primary key could not be found
	 */
	public static HealthcareEquipHeadingList fetchByPrimaryKey(
		long healthcareEquipHeadingListId) {

		return getPersistence().fetchByPrimaryKey(healthcareEquipHeadingListId);
	}

	/**
	 * Returns all the healthcare equip heading lists.
	 *
	 * @return the healthcare equip heading lists
	 */
	public static List<HealthcareEquipHeadingList> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the healthcare equip heading lists.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthcareEquipHeadingListModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of healthcare equip heading lists
	 * @param end the upper bound of the range of healthcare equip heading lists (not inclusive)
	 * @return the range of healthcare equip heading lists
	 */
	public static List<HealthcareEquipHeadingList> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the healthcare equip heading lists.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthcareEquipHeadingListModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of healthcare equip heading lists
	 * @param end the upper bound of the range of healthcare equip heading lists (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of healthcare equip heading lists
	 */
	public static List<HealthcareEquipHeadingList> findAll(
		int start, int end,
		OrderByComparator<HealthcareEquipHeadingList> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the healthcare equip heading lists.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthcareEquipHeadingListModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of healthcare equip heading lists
	 * @param end the upper bound of the range of healthcare equip heading lists (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of healthcare equip heading lists
	 */
	public static List<HealthcareEquipHeadingList> findAll(
		int start, int end,
		OrderByComparator<HealthcareEquipHeadingList> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the healthcare equip heading lists from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of healthcare equip heading lists.
	 *
	 * @return the number of healthcare equip heading lists
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static HealthcareEquipHeadingListPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		HealthcareEquipHeadingListPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile HealthcareEquipHeadingListPersistence _persistence;

}