/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.ncbj.application.form.service.model.NcbjCompanyDetailAdd;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the ncbj company detail add service. This utility wraps <code>com.nbp.ncbj.application.form.service.service.persistence.impl.NcbjCompanyDetailAddPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NcbjCompanyDetailAddPersistence
 * @generated
 */
public class NcbjCompanyDetailAddUtil {

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
	public static void clearCache(NcbjCompanyDetailAdd ncbjCompanyDetailAdd) {
		getPersistence().clearCache(ncbjCompanyDetailAdd);
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
	public static Map<Serializable, NcbjCompanyDetailAdd> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<NcbjCompanyDetailAdd> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<NcbjCompanyDetailAdd> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<NcbjCompanyDetailAdd> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<NcbjCompanyDetailAdd> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static NcbjCompanyDetailAdd update(
		NcbjCompanyDetailAdd ncbjCompanyDetailAdd) {

		return getPersistence().update(ncbjCompanyDetailAdd);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static NcbjCompanyDetailAdd update(
		NcbjCompanyDetailAdd ncbjCompanyDetailAdd,
		ServiceContext serviceContext) {

		return getPersistence().update(ncbjCompanyDetailAdd, serviceContext);
	}

	/**
	 * Returns all the ncbj company detail adds where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj company detail adds
	 */
	public static List<NcbjCompanyDetailAdd> findBygetNCBJById(
		long ncbjApplicationId) {

		return getPersistence().findBygetNCBJById(ncbjApplicationId);
	}

	/**
	 * Returns a range of all the ncbj company detail adds where ncbjApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjCompanyDetailAddModelImpl</code>.
	 * </p>
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param start the lower bound of the range of ncbj company detail adds
	 * @param end the upper bound of the range of ncbj company detail adds (not inclusive)
	 * @return the range of matching ncbj company detail adds
	 */
	public static List<NcbjCompanyDetailAdd> findBygetNCBJById(
		long ncbjApplicationId, int start, int end) {

		return getPersistence().findBygetNCBJById(
			ncbjApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the ncbj company detail adds where ncbjApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjCompanyDetailAddModelImpl</code>.
	 * </p>
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param start the lower bound of the range of ncbj company detail adds
	 * @param end the upper bound of the range of ncbj company detail adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncbj company detail adds
	 */
	public static List<NcbjCompanyDetailAdd> findBygetNCBJById(
		long ncbjApplicationId, int start, int end,
		OrderByComparator<NcbjCompanyDetailAdd> orderByComparator) {

		return getPersistence().findBygetNCBJById(
			ncbjApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the ncbj company detail adds where ncbjApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjCompanyDetailAddModelImpl</code>.
	 * </p>
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param start the lower bound of the range of ncbj company detail adds
	 * @param end the upper bound of the range of ncbj company detail adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncbj company detail adds
	 */
	public static List<NcbjCompanyDetailAdd> findBygetNCBJById(
		long ncbjApplicationId, int start, int end,
		OrderByComparator<NcbjCompanyDetailAdd> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetNCBJById(
			ncbjApplicationId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first ncbj company detail add in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj company detail add
	 * @throws NoSuchNcbjCompanyDetailAddException if a matching ncbj company detail add could not be found
	 */
	public static NcbjCompanyDetailAdd findBygetNCBJById_First(
			long ncbjApplicationId,
			OrderByComparator<NcbjCompanyDetailAdd> orderByComparator)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjCompanyDetailAddException {

		return getPersistence().findBygetNCBJById_First(
			ncbjApplicationId, orderByComparator);
	}

	/**
	 * Returns the first ncbj company detail add in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj company detail add, or <code>null</code> if a matching ncbj company detail add could not be found
	 */
	public static NcbjCompanyDetailAdd fetchBygetNCBJById_First(
		long ncbjApplicationId,
		OrderByComparator<NcbjCompanyDetailAdd> orderByComparator) {

		return getPersistence().fetchBygetNCBJById_First(
			ncbjApplicationId, orderByComparator);
	}

	/**
	 * Returns the last ncbj company detail add in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj company detail add
	 * @throws NoSuchNcbjCompanyDetailAddException if a matching ncbj company detail add could not be found
	 */
	public static NcbjCompanyDetailAdd findBygetNCBJById_Last(
			long ncbjApplicationId,
			OrderByComparator<NcbjCompanyDetailAdd> orderByComparator)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjCompanyDetailAddException {

		return getPersistence().findBygetNCBJById_Last(
			ncbjApplicationId, orderByComparator);
	}

	/**
	 * Returns the last ncbj company detail add in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj company detail add, or <code>null</code> if a matching ncbj company detail add could not be found
	 */
	public static NcbjCompanyDetailAdd fetchBygetNCBJById_Last(
		long ncbjApplicationId,
		OrderByComparator<NcbjCompanyDetailAdd> orderByComparator) {

		return getPersistence().fetchBygetNCBJById_Last(
			ncbjApplicationId, orderByComparator);
	}

	/**
	 * Returns the ncbj company detail adds before and after the current ncbj company detail add in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjCompanyDetailAddId the primary key of the current ncbj company detail add
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncbj company detail add
	 * @throws NoSuchNcbjCompanyDetailAddException if a ncbj company detail add with the primary key could not be found
	 */
	public static NcbjCompanyDetailAdd[] findBygetNCBJById_PrevAndNext(
			long ncbjCompanyDetailAddId, long ncbjApplicationId,
			OrderByComparator<NcbjCompanyDetailAdd> orderByComparator)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjCompanyDetailAddException {

		return getPersistence().findBygetNCBJById_PrevAndNext(
			ncbjCompanyDetailAddId, ncbjApplicationId, orderByComparator);
	}

	/**
	 * Removes all the ncbj company detail adds where ncbjApplicationId = &#63; from the database.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 */
	public static void removeBygetNCBJById(long ncbjApplicationId) {
		getPersistence().removeBygetNCBJById(ncbjApplicationId);
	}

	/**
	 * Returns the number of ncbj company detail adds where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the number of matching ncbj company detail adds
	 */
	public static int countBygetNCBJById(long ncbjApplicationId) {
		return getPersistence().countBygetNCBJById(ncbjApplicationId);
	}

	/**
	 * Caches the ncbj company detail add in the entity cache if it is enabled.
	 *
	 * @param ncbjCompanyDetailAdd the ncbj company detail add
	 */
	public static void cacheResult(NcbjCompanyDetailAdd ncbjCompanyDetailAdd) {
		getPersistence().cacheResult(ncbjCompanyDetailAdd);
	}

	/**
	 * Caches the ncbj company detail adds in the entity cache if it is enabled.
	 *
	 * @param ncbjCompanyDetailAdds the ncbj company detail adds
	 */
	public static void cacheResult(
		List<NcbjCompanyDetailAdd> ncbjCompanyDetailAdds) {

		getPersistence().cacheResult(ncbjCompanyDetailAdds);
	}

	/**
	 * Creates a new ncbj company detail add with the primary key. Does not add the ncbj company detail add to the database.
	 *
	 * @param ncbjCompanyDetailAddId the primary key for the new ncbj company detail add
	 * @return the new ncbj company detail add
	 */
	public static NcbjCompanyDetailAdd create(long ncbjCompanyDetailAddId) {
		return getPersistence().create(ncbjCompanyDetailAddId);
	}

	/**
	 * Removes the ncbj company detail add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ncbjCompanyDetailAddId the primary key of the ncbj company detail add
	 * @return the ncbj company detail add that was removed
	 * @throws NoSuchNcbjCompanyDetailAddException if a ncbj company detail add with the primary key could not be found
	 */
	public static NcbjCompanyDetailAdd remove(long ncbjCompanyDetailAddId)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjCompanyDetailAddException {

		return getPersistence().remove(ncbjCompanyDetailAddId);
	}

	public static NcbjCompanyDetailAdd updateImpl(
		NcbjCompanyDetailAdd ncbjCompanyDetailAdd) {

		return getPersistence().updateImpl(ncbjCompanyDetailAdd);
	}

	/**
	 * Returns the ncbj company detail add with the primary key or throws a <code>NoSuchNcbjCompanyDetailAddException</code> if it could not be found.
	 *
	 * @param ncbjCompanyDetailAddId the primary key of the ncbj company detail add
	 * @return the ncbj company detail add
	 * @throws NoSuchNcbjCompanyDetailAddException if a ncbj company detail add with the primary key could not be found
	 */
	public static NcbjCompanyDetailAdd findByPrimaryKey(
			long ncbjCompanyDetailAddId)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjCompanyDetailAddException {

		return getPersistence().findByPrimaryKey(ncbjCompanyDetailAddId);
	}

	/**
	 * Returns the ncbj company detail add with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ncbjCompanyDetailAddId the primary key of the ncbj company detail add
	 * @return the ncbj company detail add, or <code>null</code> if a ncbj company detail add with the primary key could not be found
	 */
	public static NcbjCompanyDetailAdd fetchByPrimaryKey(
		long ncbjCompanyDetailAddId) {

		return getPersistence().fetchByPrimaryKey(ncbjCompanyDetailAddId);
	}

	/**
	 * Returns all the ncbj company detail adds.
	 *
	 * @return the ncbj company detail adds
	 */
	public static List<NcbjCompanyDetailAdd> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the ncbj company detail adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjCompanyDetailAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj company detail adds
	 * @param end the upper bound of the range of ncbj company detail adds (not inclusive)
	 * @return the range of ncbj company detail adds
	 */
	public static List<NcbjCompanyDetailAdd> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the ncbj company detail adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjCompanyDetailAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj company detail adds
	 * @param end the upper bound of the range of ncbj company detail adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ncbj company detail adds
	 */
	public static List<NcbjCompanyDetailAdd> findAll(
		int start, int end,
		OrderByComparator<NcbjCompanyDetailAdd> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the ncbj company detail adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjCompanyDetailAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj company detail adds
	 * @param end the upper bound of the range of ncbj company detail adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ncbj company detail adds
	 */
	public static List<NcbjCompanyDetailAdd> findAll(
		int start, int end,
		OrderByComparator<NcbjCompanyDetailAdd> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the ncbj company detail adds from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of ncbj company detail adds.
	 *
	 * @return the number of ncbj company detail adds
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static NcbjCompanyDetailAddPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		NcbjCompanyDetailAddPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile NcbjCompanyDetailAddPersistence _persistence;

}