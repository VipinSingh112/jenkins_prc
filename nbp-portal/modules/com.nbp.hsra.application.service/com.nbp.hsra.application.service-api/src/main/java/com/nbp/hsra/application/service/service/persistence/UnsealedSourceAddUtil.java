/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.hsra.application.service.model.UnsealedSourceAdd;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the unsealed source add service. This utility wraps <code>com.nbp.hsra.application.service.service.persistence.impl.UnsealedSourceAddPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UnsealedSourceAddPersistence
 * @generated
 */
public class UnsealedSourceAddUtil {

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
	public static void clearCache(UnsealedSourceAdd unsealedSourceAdd) {
		getPersistence().clearCache(unsealedSourceAdd);
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
	public static Map<Serializable, UnsealedSourceAdd> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<UnsealedSourceAdd> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<UnsealedSourceAdd> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<UnsealedSourceAdd> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<UnsealedSourceAdd> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static UnsealedSourceAdd update(
		UnsealedSourceAdd unsealedSourceAdd) {

		return getPersistence().update(unsealedSourceAdd);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static UnsealedSourceAdd update(
		UnsealedSourceAdd unsealedSourceAdd, ServiceContext serviceContext) {

		return getPersistence().update(unsealedSourceAdd, serviceContext);
	}

	/**
	 * Returns all the unsealed source adds where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching unsealed source adds
	 */
	public static List<UnsealedSourceAdd> findBygetHsraById(
		long hsraApplicationId) {

		return getPersistence().findBygetHsraById(hsraApplicationId);
	}

	/**
	 * Returns a range of all the unsealed source adds where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UnsealedSourceAddModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of unsealed source adds
	 * @param end the upper bound of the range of unsealed source adds (not inclusive)
	 * @return the range of matching unsealed source adds
	 */
	public static List<UnsealedSourceAdd> findBygetHsraById(
		long hsraApplicationId, int start, int end) {

		return getPersistence().findBygetHsraById(
			hsraApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the unsealed source adds where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UnsealedSourceAddModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of unsealed source adds
	 * @param end the upper bound of the range of unsealed source adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching unsealed source adds
	 */
	public static List<UnsealedSourceAdd> findBygetHsraById(
		long hsraApplicationId, int start, int end,
		OrderByComparator<UnsealedSourceAdd> orderByComparator) {

		return getPersistence().findBygetHsraById(
			hsraApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the unsealed source adds where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UnsealedSourceAddModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of unsealed source adds
	 * @param end the upper bound of the range of unsealed source adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching unsealed source adds
	 */
	public static List<UnsealedSourceAdd> findBygetHsraById(
		long hsraApplicationId, int start, int end,
		OrderByComparator<UnsealedSourceAdd> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetHsraById(
			hsraApplicationId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first unsealed source add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching unsealed source add
	 * @throws NoSuchUnsealedSourceAddException if a matching unsealed source add could not be found
	 */
	public static UnsealedSourceAdd findBygetHsraById_First(
			long hsraApplicationId,
			OrderByComparator<UnsealedSourceAdd> orderByComparator)
		throws com.nbp.hsra.application.service.exception.
			NoSuchUnsealedSourceAddException {

		return getPersistence().findBygetHsraById_First(
			hsraApplicationId, orderByComparator);
	}

	/**
	 * Returns the first unsealed source add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching unsealed source add, or <code>null</code> if a matching unsealed source add could not be found
	 */
	public static UnsealedSourceAdd fetchBygetHsraById_First(
		long hsraApplicationId,
		OrderByComparator<UnsealedSourceAdd> orderByComparator) {

		return getPersistence().fetchBygetHsraById_First(
			hsraApplicationId, orderByComparator);
	}

	/**
	 * Returns the last unsealed source add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching unsealed source add
	 * @throws NoSuchUnsealedSourceAddException if a matching unsealed source add could not be found
	 */
	public static UnsealedSourceAdd findBygetHsraById_Last(
			long hsraApplicationId,
			OrderByComparator<UnsealedSourceAdd> orderByComparator)
		throws com.nbp.hsra.application.service.exception.
			NoSuchUnsealedSourceAddException {

		return getPersistence().findBygetHsraById_Last(
			hsraApplicationId, orderByComparator);
	}

	/**
	 * Returns the last unsealed source add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching unsealed source add, or <code>null</code> if a matching unsealed source add could not be found
	 */
	public static UnsealedSourceAdd fetchBygetHsraById_Last(
		long hsraApplicationId,
		OrderByComparator<UnsealedSourceAdd> orderByComparator) {

		return getPersistence().fetchBygetHsraById_Last(
			hsraApplicationId, orderByComparator);
	}

	/**
	 * Returns the unsealed source adds before and after the current unsealed source add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param unsealedSourceAddId the primary key of the current unsealed source add
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next unsealed source add
	 * @throws NoSuchUnsealedSourceAddException if a unsealed source add with the primary key could not be found
	 */
	public static UnsealedSourceAdd[] findBygetHsraById_PrevAndNext(
			long unsealedSourceAddId, long hsraApplicationId,
			OrderByComparator<UnsealedSourceAdd> orderByComparator)
		throws com.nbp.hsra.application.service.exception.
			NoSuchUnsealedSourceAddException {

		return getPersistence().findBygetHsraById_PrevAndNext(
			unsealedSourceAddId, hsraApplicationId, orderByComparator);
	}

	/**
	 * Removes all the unsealed source adds where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 */
	public static void removeBygetHsraById(long hsraApplicationId) {
		getPersistence().removeBygetHsraById(hsraApplicationId);
	}

	/**
	 * Returns the number of unsealed source adds where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching unsealed source adds
	 */
	public static int countBygetHsraById(long hsraApplicationId) {
		return getPersistence().countBygetHsraById(hsraApplicationId);
	}

	/**
	 * Caches the unsealed source add in the entity cache if it is enabled.
	 *
	 * @param unsealedSourceAdd the unsealed source add
	 */
	public static void cacheResult(UnsealedSourceAdd unsealedSourceAdd) {
		getPersistence().cacheResult(unsealedSourceAdd);
	}

	/**
	 * Caches the unsealed source adds in the entity cache if it is enabled.
	 *
	 * @param unsealedSourceAdds the unsealed source adds
	 */
	public static void cacheResult(List<UnsealedSourceAdd> unsealedSourceAdds) {
		getPersistence().cacheResult(unsealedSourceAdds);
	}

	/**
	 * Creates a new unsealed source add with the primary key. Does not add the unsealed source add to the database.
	 *
	 * @param unsealedSourceAddId the primary key for the new unsealed source add
	 * @return the new unsealed source add
	 */
	public static UnsealedSourceAdd create(long unsealedSourceAddId) {
		return getPersistence().create(unsealedSourceAddId);
	}

	/**
	 * Removes the unsealed source add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param unsealedSourceAddId the primary key of the unsealed source add
	 * @return the unsealed source add that was removed
	 * @throws NoSuchUnsealedSourceAddException if a unsealed source add with the primary key could not be found
	 */
	public static UnsealedSourceAdd remove(long unsealedSourceAddId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchUnsealedSourceAddException {

		return getPersistence().remove(unsealedSourceAddId);
	}

	public static UnsealedSourceAdd updateImpl(
		UnsealedSourceAdd unsealedSourceAdd) {

		return getPersistence().updateImpl(unsealedSourceAdd);
	}

	/**
	 * Returns the unsealed source add with the primary key or throws a <code>NoSuchUnsealedSourceAddException</code> if it could not be found.
	 *
	 * @param unsealedSourceAddId the primary key of the unsealed source add
	 * @return the unsealed source add
	 * @throws NoSuchUnsealedSourceAddException if a unsealed source add with the primary key could not be found
	 */
	public static UnsealedSourceAdd findByPrimaryKey(long unsealedSourceAddId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchUnsealedSourceAddException {

		return getPersistence().findByPrimaryKey(unsealedSourceAddId);
	}

	/**
	 * Returns the unsealed source add with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param unsealedSourceAddId the primary key of the unsealed source add
	 * @return the unsealed source add, or <code>null</code> if a unsealed source add with the primary key could not be found
	 */
	public static UnsealedSourceAdd fetchByPrimaryKey(
		long unsealedSourceAddId) {

		return getPersistence().fetchByPrimaryKey(unsealedSourceAddId);
	}

	/**
	 * Returns all the unsealed source adds.
	 *
	 * @return the unsealed source adds
	 */
	public static List<UnsealedSourceAdd> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the unsealed source adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UnsealedSourceAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of unsealed source adds
	 * @param end the upper bound of the range of unsealed source adds (not inclusive)
	 * @return the range of unsealed source adds
	 */
	public static List<UnsealedSourceAdd> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the unsealed source adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UnsealedSourceAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of unsealed source adds
	 * @param end the upper bound of the range of unsealed source adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of unsealed source adds
	 */
	public static List<UnsealedSourceAdd> findAll(
		int start, int end,
		OrderByComparator<UnsealedSourceAdd> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the unsealed source adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UnsealedSourceAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of unsealed source adds
	 * @param end the upper bound of the range of unsealed source adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of unsealed source adds
	 */
	public static List<UnsealedSourceAdd> findAll(
		int start, int end,
		OrderByComparator<UnsealedSourceAdd> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the unsealed source adds from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of unsealed source adds.
	 *
	 * @return the number of unsealed source adds
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static UnsealedSourceAddPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		UnsealedSourceAddPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile UnsealedSourceAddPersistence _persistence;

}