/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.ncbj.application.form.service.model.NcbjNumOfEmpAdd;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the ncbj num of emp add service. This utility wraps <code>com.nbp.ncbj.application.form.service.service.persistence.impl.NcbjNumOfEmpAddPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NcbjNumOfEmpAddPersistence
 * @generated
 */
public class NcbjNumOfEmpAddUtil {

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
	public static void clearCache(NcbjNumOfEmpAdd ncbjNumOfEmpAdd) {
		getPersistence().clearCache(ncbjNumOfEmpAdd);
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
	public static Map<Serializable, NcbjNumOfEmpAdd> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<NcbjNumOfEmpAdd> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<NcbjNumOfEmpAdd> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<NcbjNumOfEmpAdd> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<NcbjNumOfEmpAdd> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static NcbjNumOfEmpAdd update(NcbjNumOfEmpAdd ncbjNumOfEmpAdd) {
		return getPersistence().update(ncbjNumOfEmpAdd);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static NcbjNumOfEmpAdd update(
		NcbjNumOfEmpAdd ncbjNumOfEmpAdd, ServiceContext serviceContext) {

		return getPersistence().update(ncbjNumOfEmpAdd, serviceContext);
	}

	/**
	 * Returns the ncbj num of emp add where ncbjApplicationId = &#63; or throws a <code>NoSuchNcbjNumOfEmpAddException</code> if it could not be found.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj num of emp add
	 * @throws NoSuchNcbjNumOfEmpAddException if a matching ncbj num of emp add could not be found
	 */
	public static NcbjNumOfEmpAdd findBygetNCBJ_ById(long ncbjApplicationId)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjNumOfEmpAddException {

		return getPersistence().findBygetNCBJ_ById(ncbjApplicationId);
	}

	/**
	 * Returns the ncbj num of emp add where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj num of emp add, or <code>null</code> if a matching ncbj num of emp add could not be found
	 */
	public static NcbjNumOfEmpAdd fetchBygetNCBJ_ById(long ncbjApplicationId) {
		return getPersistence().fetchBygetNCBJ_ById(ncbjApplicationId);
	}

	/**
	 * Returns the ncbj num of emp add where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncbj num of emp add, or <code>null</code> if a matching ncbj num of emp add could not be found
	 */
	public static NcbjNumOfEmpAdd fetchBygetNCBJ_ById(
		long ncbjApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetNCBJ_ById(
			ncbjApplicationId, useFinderCache);
	}

	/**
	 * Removes the ncbj num of emp add where ncbjApplicationId = &#63; from the database.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the ncbj num of emp add that was removed
	 */
	public static NcbjNumOfEmpAdd removeBygetNCBJ_ById(long ncbjApplicationId)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjNumOfEmpAddException {

		return getPersistence().removeBygetNCBJ_ById(ncbjApplicationId);
	}

	/**
	 * Returns the number of ncbj num of emp adds where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the number of matching ncbj num of emp adds
	 */
	public static int countBygetNCBJ_ById(long ncbjApplicationId) {
		return getPersistence().countBygetNCBJ_ById(ncbjApplicationId);
	}

	/**
	 * Returns all the ncbj num of emp adds where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj num of emp adds
	 */
	public static List<NcbjNumOfEmpAdd> findBygetNCBJ_ByAppId(
		long ncbjApplicationId) {

		return getPersistence().findBygetNCBJ_ByAppId(ncbjApplicationId);
	}

	/**
	 * Returns a range of all the ncbj num of emp adds where ncbjApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjNumOfEmpAddModelImpl</code>.
	 * </p>
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param start the lower bound of the range of ncbj num of emp adds
	 * @param end the upper bound of the range of ncbj num of emp adds (not inclusive)
	 * @return the range of matching ncbj num of emp adds
	 */
	public static List<NcbjNumOfEmpAdd> findBygetNCBJ_ByAppId(
		long ncbjApplicationId, int start, int end) {

		return getPersistence().findBygetNCBJ_ByAppId(
			ncbjApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the ncbj num of emp adds where ncbjApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjNumOfEmpAddModelImpl</code>.
	 * </p>
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param start the lower bound of the range of ncbj num of emp adds
	 * @param end the upper bound of the range of ncbj num of emp adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncbj num of emp adds
	 */
	public static List<NcbjNumOfEmpAdd> findBygetNCBJ_ByAppId(
		long ncbjApplicationId, int start, int end,
		OrderByComparator<NcbjNumOfEmpAdd> orderByComparator) {

		return getPersistence().findBygetNCBJ_ByAppId(
			ncbjApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the ncbj num of emp adds where ncbjApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjNumOfEmpAddModelImpl</code>.
	 * </p>
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param start the lower bound of the range of ncbj num of emp adds
	 * @param end the upper bound of the range of ncbj num of emp adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncbj num of emp adds
	 */
	public static List<NcbjNumOfEmpAdd> findBygetNCBJ_ByAppId(
		long ncbjApplicationId, int start, int end,
		OrderByComparator<NcbjNumOfEmpAdd> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetNCBJ_ByAppId(
			ncbjApplicationId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first ncbj num of emp add in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj num of emp add
	 * @throws NoSuchNcbjNumOfEmpAddException if a matching ncbj num of emp add could not be found
	 */
	public static NcbjNumOfEmpAdd findBygetNCBJ_ByAppId_First(
			long ncbjApplicationId,
			OrderByComparator<NcbjNumOfEmpAdd> orderByComparator)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjNumOfEmpAddException {

		return getPersistence().findBygetNCBJ_ByAppId_First(
			ncbjApplicationId, orderByComparator);
	}

	/**
	 * Returns the first ncbj num of emp add in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj num of emp add, or <code>null</code> if a matching ncbj num of emp add could not be found
	 */
	public static NcbjNumOfEmpAdd fetchBygetNCBJ_ByAppId_First(
		long ncbjApplicationId,
		OrderByComparator<NcbjNumOfEmpAdd> orderByComparator) {

		return getPersistence().fetchBygetNCBJ_ByAppId_First(
			ncbjApplicationId, orderByComparator);
	}

	/**
	 * Returns the last ncbj num of emp add in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj num of emp add
	 * @throws NoSuchNcbjNumOfEmpAddException if a matching ncbj num of emp add could not be found
	 */
	public static NcbjNumOfEmpAdd findBygetNCBJ_ByAppId_Last(
			long ncbjApplicationId,
			OrderByComparator<NcbjNumOfEmpAdd> orderByComparator)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjNumOfEmpAddException {

		return getPersistence().findBygetNCBJ_ByAppId_Last(
			ncbjApplicationId, orderByComparator);
	}

	/**
	 * Returns the last ncbj num of emp add in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj num of emp add, or <code>null</code> if a matching ncbj num of emp add could not be found
	 */
	public static NcbjNumOfEmpAdd fetchBygetNCBJ_ByAppId_Last(
		long ncbjApplicationId,
		OrderByComparator<NcbjNumOfEmpAdd> orderByComparator) {

		return getPersistence().fetchBygetNCBJ_ByAppId_Last(
			ncbjApplicationId, orderByComparator);
	}

	/**
	 * Returns the ncbj num of emp adds before and after the current ncbj num of emp add in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjNumOfEmpAddId the primary key of the current ncbj num of emp add
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncbj num of emp add
	 * @throws NoSuchNcbjNumOfEmpAddException if a ncbj num of emp add with the primary key could not be found
	 */
	public static NcbjNumOfEmpAdd[] findBygetNCBJ_ByAppId_PrevAndNext(
			long ncbjNumOfEmpAddId, long ncbjApplicationId,
			OrderByComparator<NcbjNumOfEmpAdd> orderByComparator)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjNumOfEmpAddException {

		return getPersistence().findBygetNCBJ_ByAppId_PrevAndNext(
			ncbjNumOfEmpAddId, ncbjApplicationId, orderByComparator);
	}

	/**
	 * Removes all the ncbj num of emp adds where ncbjApplicationId = &#63; from the database.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 */
	public static void removeBygetNCBJ_ByAppId(long ncbjApplicationId) {
		getPersistence().removeBygetNCBJ_ByAppId(ncbjApplicationId);
	}

	/**
	 * Returns the number of ncbj num of emp adds where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the number of matching ncbj num of emp adds
	 */
	public static int countBygetNCBJ_ByAppId(long ncbjApplicationId) {
		return getPersistence().countBygetNCBJ_ByAppId(ncbjApplicationId);
	}

	/**
	 * Caches the ncbj num of emp add in the entity cache if it is enabled.
	 *
	 * @param ncbjNumOfEmpAdd the ncbj num of emp add
	 */
	public static void cacheResult(NcbjNumOfEmpAdd ncbjNumOfEmpAdd) {
		getPersistence().cacheResult(ncbjNumOfEmpAdd);
	}

	/**
	 * Caches the ncbj num of emp adds in the entity cache if it is enabled.
	 *
	 * @param ncbjNumOfEmpAdds the ncbj num of emp adds
	 */
	public static void cacheResult(List<NcbjNumOfEmpAdd> ncbjNumOfEmpAdds) {
		getPersistence().cacheResult(ncbjNumOfEmpAdds);
	}

	/**
	 * Creates a new ncbj num of emp add with the primary key. Does not add the ncbj num of emp add to the database.
	 *
	 * @param ncbjNumOfEmpAddId the primary key for the new ncbj num of emp add
	 * @return the new ncbj num of emp add
	 */
	public static NcbjNumOfEmpAdd create(long ncbjNumOfEmpAddId) {
		return getPersistence().create(ncbjNumOfEmpAddId);
	}

	/**
	 * Removes the ncbj num of emp add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ncbjNumOfEmpAddId the primary key of the ncbj num of emp add
	 * @return the ncbj num of emp add that was removed
	 * @throws NoSuchNcbjNumOfEmpAddException if a ncbj num of emp add with the primary key could not be found
	 */
	public static NcbjNumOfEmpAdd remove(long ncbjNumOfEmpAddId)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjNumOfEmpAddException {

		return getPersistence().remove(ncbjNumOfEmpAddId);
	}

	public static NcbjNumOfEmpAdd updateImpl(NcbjNumOfEmpAdd ncbjNumOfEmpAdd) {
		return getPersistence().updateImpl(ncbjNumOfEmpAdd);
	}

	/**
	 * Returns the ncbj num of emp add with the primary key or throws a <code>NoSuchNcbjNumOfEmpAddException</code> if it could not be found.
	 *
	 * @param ncbjNumOfEmpAddId the primary key of the ncbj num of emp add
	 * @return the ncbj num of emp add
	 * @throws NoSuchNcbjNumOfEmpAddException if a ncbj num of emp add with the primary key could not be found
	 */
	public static NcbjNumOfEmpAdd findByPrimaryKey(long ncbjNumOfEmpAddId)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjNumOfEmpAddException {

		return getPersistence().findByPrimaryKey(ncbjNumOfEmpAddId);
	}

	/**
	 * Returns the ncbj num of emp add with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ncbjNumOfEmpAddId the primary key of the ncbj num of emp add
	 * @return the ncbj num of emp add, or <code>null</code> if a ncbj num of emp add with the primary key could not be found
	 */
	public static NcbjNumOfEmpAdd fetchByPrimaryKey(long ncbjNumOfEmpAddId) {
		return getPersistence().fetchByPrimaryKey(ncbjNumOfEmpAddId);
	}

	/**
	 * Returns all the ncbj num of emp adds.
	 *
	 * @return the ncbj num of emp adds
	 */
	public static List<NcbjNumOfEmpAdd> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the ncbj num of emp adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjNumOfEmpAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj num of emp adds
	 * @param end the upper bound of the range of ncbj num of emp adds (not inclusive)
	 * @return the range of ncbj num of emp adds
	 */
	public static List<NcbjNumOfEmpAdd> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the ncbj num of emp adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjNumOfEmpAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj num of emp adds
	 * @param end the upper bound of the range of ncbj num of emp adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ncbj num of emp adds
	 */
	public static List<NcbjNumOfEmpAdd> findAll(
		int start, int end,
		OrderByComparator<NcbjNumOfEmpAdd> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the ncbj num of emp adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjNumOfEmpAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj num of emp adds
	 * @param end the upper bound of the range of ncbj num of emp adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ncbj num of emp adds
	 */
	public static List<NcbjNumOfEmpAdd> findAll(
		int start, int end,
		OrderByComparator<NcbjNumOfEmpAdd> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the ncbj num of emp adds from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of ncbj num of emp adds.
	 *
	 * @return the number of ncbj num of emp adds
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static NcbjNumOfEmpAddPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(NcbjNumOfEmpAddPersistence persistence) {
		_persistence = persistence;
	}

	private static volatile NcbjNumOfEmpAddPersistence _persistence;

}