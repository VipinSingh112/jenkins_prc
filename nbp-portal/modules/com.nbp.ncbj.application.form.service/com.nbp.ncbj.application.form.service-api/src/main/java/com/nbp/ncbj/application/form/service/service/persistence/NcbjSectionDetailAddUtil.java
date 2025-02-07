/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.ncbj.application.form.service.model.NcbjSectionDetailAdd;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the ncbj section detail add service. This utility wraps <code>com.nbp.ncbj.application.form.service.service.persistence.impl.NcbjSectionDetailAddPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NcbjSectionDetailAddPersistence
 * @generated
 */
public class NcbjSectionDetailAddUtil {

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
	public static void clearCache(NcbjSectionDetailAdd ncbjSectionDetailAdd) {
		getPersistence().clearCache(ncbjSectionDetailAdd);
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
	public static Map<Serializable, NcbjSectionDetailAdd> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<NcbjSectionDetailAdd> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<NcbjSectionDetailAdd> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<NcbjSectionDetailAdd> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<NcbjSectionDetailAdd> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static NcbjSectionDetailAdd update(
		NcbjSectionDetailAdd ncbjSectionDetailAdd) {

		return getPersistence().update(ncbjSectionDetailAdd);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static NcbjSectionDetailAdd update(
		NcbjSectionDetailAdd ncbjSectionDetailAdd,
		ServiceContext serviceContext) {

		return getPersistence().update(ncbjSectionDetailAdd, serviceContext);
	}

	/**
	 * Returns the ncbj section detail add where ncbjApplicationId = &#63; or throws a <code>NoSuchNcbjSectionDetailAddException</code> if it could not be found.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj section detail add
	 * @throws NoSuchNcbjSectionDetailAddException if a matching ncbj section detail add could not be found
	 */
	public static NcbjSectionDetailAdd findBygetNCBJ_ById(
			long ncbjApplicationId)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjSectionDetailAddException {

		return getPersistence().findBygetNCBJ_ById(ncbjApplicationId);
	}

	/**
	 * Returns the ncbj section detail add where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj section detail add, or <code>null</code> if a matching ncbj section detail add could not be found
	 */
	public static NcbjSectionDetailAdd fetchBygetNCBJ_ById(
		long ncbjApplicationId) {

		return getPersistence().fetchBygetNCBJ_ById(ncbjApplicationId);
	}

	/**
	 * Returns the ncbj section detail add where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncbj section detail add, or <code>null</code> if a matching ncbj section detail add could not be found
	 */
	public static NcbjSectionDetailAdd fetchBygetNCBJ_ById(
		long ncbjApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetNCBJ_ById(
			ncbjApplicationId, useFinderCache);
	}

	/**
	 * Removes the ncbj section detail add where ncbjApplicationId = &#63; from the database.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the ncbj section detail add that was removed
	 */
	public static NcbjSectionDetailAdd removeBygetNCBJ_ById(
			long ncbjApplicationId)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjSectionDetailAddException {

		return getPersistence().removeBygetNCBJ_ById(ncbjApplicationId);
	}

	/**
	 * Returns the number of ncbj section detail adds where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the number of matching ncbj section detail adds
	 */
	public static int countBygetNCBJ_ById(long ncbjApplicationId) {
		return getPersistence().countBygetNCBJ_ById(ncbjApplicationId);
	}

	/**
	 * Returns all the ncbj section detail adds where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj section detail adds
	 */
	public static List<NcbjSectionDetailAdd> findBygetNCBJ_ByAppId(
		long ncbjApplicationId) {

		return getPersistence().findBygetNCBJ_ByAppId(ncbjApplicationId);
	}

	/**
	 * Returns a range of all the ncbj section detail adds where ncbjApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjSectionDetailAddModelImpl</code>.
	 * </p>
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param start the lower bound of the range of ncbj section detail adds
	 * @param end the upper bound of the range of ncbj section detail adds (not inclusive)
	 * @return the range of matching ncbj section detail adds
	 */
	public static List<NcbjSectionDetailAdd> findBygetNCBJ_ByAppId(
		long ncbjApplicationId, int start, int end) {

		return getPersistence().findBygetNCBJ_ByAppId(
			ncbjApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the ncbj section detail adds where ncbjApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjSectionDetailAddModelImpl</code>.
	 * </p>
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param start the lower bound of the range of ncbj section detail adds
	 * @param end the upper bound of the range of ncbj section detail adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncbj section detail adds
	 */
	public static List<NcbjSectionDetailAdd> findBygetNCBJ_ByAppId(
		long ncbjApplicationId, int start, int end,
		OrderByComparator<NcbjSectionDetailAdd> orderByComparator) {

		return getPersistence().findBygetNCBJ_ByAppId(
			ncbjApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the ncbj section detail adds where ncbjApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjSectionDetailAddModelImpl</code>.
	 * </p>
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param start the lower bound of the range of ncbj section detail adds
	 * @param end the upper bound of the range of ncbj section detail adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncbj section detail adds
	 */
	public static List<NcbjSectionDetailAdd> findBygetNCBJ_ByAppId(
		long ncbjApplicationId, int start, int end,
		OrderByComparator<NcbjSectionDetailAdd> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetNCBJ_ByAppId(
			ncbjApplicationId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first ncbj section detail add in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj section detail add
	 * @throws NoSuchNcbjSectionDetailAddException if a matching ncbj section detail add could not be found
	 */
	public static NcbjSectionDetailAdd findBygetNCBJ_ByAppId_First(
			long ncbjApplicationId,
			OrderByComparator<NcbjSectionDetailAdd> orderByComparator)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjSectionDetailAddException {

		return getPersistence().findBygetNCBJ_ByAppId_First(
			ncbjApplicationId, orderByComparator);
	}

	/**
	 * Returns the first ncbj section detail add in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj section detail add, or <code>null</code> if a matching ncbj section detail add could not be found
	 */
	public static NcbjSectionDetailAdd fetchBygetNCBJ_ByAppId_First(
		long ncbjApplicationId,
		OrderByComparator<NcbjSectionDetailAdd> orderByComparator) {

		return getPersistence().fetchBygetNCBJ_ByAppId_First(
			ncbjApplicationId, orderByComparator);
	}

	/**
	 * Returns the last ncbj section detail add in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj section detail add
	 * @throws NoSuchNcbjSectionDetailAddException if a matching ncbj section detail add could not be found
	 */
	public static NcbjSectionDetailAdd findBygetNCBJ_ByAppId_Last(
			long ncbjApplicationId,
			OrderByComparator<NcbjSectionDetailAdd> orderByComparator)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjSectionDetailAddException {

		return getPersistence().findBygetNCBJ_ByAppId_Last(
			ncbjApplicationId, orderByComparator);
	}

	/**
	 * Returns the last ncbj section detail add in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj section detail add, or <code>null</code> if a matching ncbj section detail add could not be found
	 */
	public static NcbjSectionDetailAdd fetchBygetNCBJ_ByAppId_Last(
		long ncbjApplicationId,
		OrderByComparator<NcbjSectionDetailAdd> orderByComparator) {

		return getPersistence().fetchBygetNCBJ_ByAppId_Last(
			ncbjApplicationId, orderByComparator);
	}

	/**
	 * Returns the ncbj section detail adds before and after the current ncbj section detail add in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjSectionDetailAddId the primary key of the current ncbj section detail add
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncbj section detail add
	 * @throws NoSuchNcbjSectionDetailAddException if a ncbj section detail add with the primary key could not be found
	 */
	public static NcbjSectionDetailAdd[] findBygetNCBJ_ByAppId_PrevAndNext(
			long ncbjSectionDetailAddId, long ncbjApplicationId,
			OrderByComparator<NcbjSectionDetailAdd> orderByComparator)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjSectionDetailAddException {

		return getPersistence().findBygetNCBJ_ByAppId_PrevAndNext(
			ncbjSectionDetailAddId, ncbjApplicationId, orderByComparator);
	}

	/**
	 * Removes all the ncbj section detail adds where ncbjApplicationId = &#63; from the database.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 */
	public static void removeBygetNCBJ_ByAppId(long ncbjApplicationId) {
		getPersistence().removeBygetNCBJ_ByAppId(ncbjApplicationId);
	}

	/**
	 * Returns the number of ncbj section detail adds where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the number of matching ncbj section detail adds
	 */
	public static int countBygetNCBJ_ByAppId(long ncbjApplicationId) {
		return getPersistence().countBygetNCBJ_ByAppId(ncbjApplicationId);
	}

	/**
	 * Caches the ncbj section detail add in the entity cache if it is enabled.
	 *
	 * @param ncbjSectionDetailAdd the ncbj section detail add
	 */
	public static void cacheResult(NcbjSectionDetailAdd ncbjSectionDetailAdd) {
		getPersistence().cacheResult(ncbjSectionDetailAdd);
	}

	/**
	 * Caches the ncbj section detail adds in the entity cache if it is enabled.
	 *
	 * @param ncbjSectionDetailAdds the ncbj section detail adds
	 */
	public static void cacheResult(
		List<NcbjSectionDetailAdd> ncbjSectionDetailAdds) {

		getPersistence().cacheResult(ncbjSectionDetailAdds);
	}

	/**
	 * Creates a new ncbj section detail add with the primary key. Does not add the ncbj section detail add to the database.
	 *
	 * @param ncbjSectionDetailAddId the primary key for the new ncbj section detail add
	 * @return the new ncbj section detail add
	 */
	public static NcbjSectionDetailAdd create(long ncbjSectionDetailAddId) {
		return getPersistence().create(ncbjSectionDetailAddId);
	}

	/**
	 * Removes the ncbj section detail add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ncbjSectionDetailAddId the primary key of the ncbj section detail add
	 * @return the ncbj section detail add that was removed
	 * @throws NoSuchNcbjSectionDetailAddException if a ncbj section detail add with the primary key could not be found
	 */
	public static NcbjSectionDetailAdd remove(long ncbjSectionDetailAddId)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjSectionDetailAddException {

		return getPersistence().remove(ncbjSectionDetailAddId);
	}

	public static NcbjSectionDetailAdd updateImpl(
		NcbjSectionDetailAdd ncbjSectionDetailAdd) {

		return getPersistence().updateImpl(ncbjSectionDetailAdd);
	}

	/**
	 * Returns the ncbj section detail add with the primary key or throws a <code>NoSuchNcbjSectionDetailAddException</code> if it could not be found.
	 *
	 * @param ncbjSectionDetailAddId the primary key of the ncbj section detail add
	 * @return the ncbj section detail add
	 * @throws NoSuchNcbjSectionDetailAddException if a ncbj section detail add with the primary key could not be found
	 */
	public static NcbjSectionDetailAdd findByPrimaryKey(
			long ncbjSectionDetailAddId)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjSectionDetailAddException {

		return getPersistence().findByPrimaryKey(ncbjSectionDetailAddId);
	}

	/**
	 * Returns the ncbj section detail add with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ncbjSectionDetailAddId the primary key of the ncbj section detail add
	 * @return the ncbj section detail add, or <code>null</code> if a ncbj section detail add with the primary key could not be found
	 */
	public static NcbjSectionDetailAdd fetchByPrimaryKey(
		long ncbjSectionDetailAddId) {

		return getPersistence().fetchByPrimaryKey(ncbjSectionDetailAddId);
	}

	/**
	 * Returns all the ncbj section detail adds.
	 *
	 * @return the ncbj section detail adds
	 */
	public static List<NcbjSectionDetailAdd> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the ncbj section detail adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjSectionDetailAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj section detail adds
	 * @param end the upper bound of the range of ncbj section detail adds (not inclusive)
	 * @return the range of ncbj section detail adds
	 */
	public static List<NcbjSectionDetailAdd> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the ncbj section detail adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjSectionDetailAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj section detail adds
	 * @param end the upper bound of the range of ncbj section detail adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ncbj section detail adds
	 */
	public static List<NcbjSectionDetailAdd> findAll(
		int start, int end,
		OrderByComparator<NcbjSectionDetailAdd> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the ncbj section detail adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjSectionDetailAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj section detail adds
	 * @param end the upper bound of the range of ncbj section detail adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ncbj section detail adds
	 */
	public static List<NcbjSectionDetailAdd> findAll(
		int start, int end,
		OrderByComparator<NcbjSectionDetailAdd> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the ncbj section detail adds from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of ncbj section detail adds.
	 *
	 * @return the number of ncbj section detail adds
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static NcbjSectionDetailAddPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		NcbjSectionDetailAddPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile NcbjSectionDetailAddPersistence _persistence;

}