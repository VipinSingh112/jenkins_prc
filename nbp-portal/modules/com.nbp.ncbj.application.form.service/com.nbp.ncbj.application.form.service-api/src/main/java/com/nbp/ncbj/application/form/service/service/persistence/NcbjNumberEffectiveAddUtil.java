/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.ncbj.application.form.service.model.NcbjNumberEffectiveAdd;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the ncbj number effective add service. This utility wraps <code>com.nbp.ncbj.application.form.service.service.persistence.impl.NcbjNumberEffectiveAddPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NcbjNumberEffectiveAddPersistence
 * @generated
 */
public class NcbjNumberEffectiveAddUtil {

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
		NcbjNumberEffectiveAdd ncbjNumberEffectiveAdd) {

		getPersistence().clearCache(ncbjNumberEffectiveAdd);
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
	public static Map<Serializable, NcbjNumberEffectiveAdd> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<NcbjNumberEffectiveAdd> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<NcbjNumberEffectiveAdd> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<NcbjNumberEffectiveAdd> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<NcbjNumberEffectiveAdd> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static NcbjNumberEffectiveAdd update(
		NcbjNumberEffectiveAdd ncbjNumberEffectiveAdd) {

		return getPersistence().update(ncbjNumberEffectiveAdd);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static NcbjNumberEffectiveAdd update(
		NcbjNumberEffectiveAdd ncbjNumberEffectiveAdd,
		ServiceContext serviceContext) {

		return getPersistence().update(ncbjNumberEffectiveAdd, serviceContext);
	}

	/**
	 * Returns all the ncbj number effective adds where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj number effective adds
	 */
	public static List<NcbjNumberEffectiveAdd> findBygetNCBJById(
		long ncbjApplicationId) {

		return getPersistence().findBygetNCBJById(ncbjApplicationId);
	}

	/**
	 * Returns a range of all the ncbj number effective adds where ncbjApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjNumberEffectiveAddModelImpl</code>.
	 * </p>
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param start the lower bound of the range of ncbj number effective adds
	 * @param end the upper bound of the range of ncbj number effective adds (not inclusive)
	 * @return the range of matching ncbj number effective adds
	 */
	public static List<NcbjNumberEffectiveAdd> findBygetNCBJById(
		long ncbjApplicationId, int start, int end) {

		return getPersistence().findBygetNCBJById(
			ncbjApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the ncbj number effective adds where ncbjApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjNumberEffectiveAddModelImpl</code>.
	 * </p>
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param start the lower bound of the range of ncbj number effective adds
	 * @param end the upper bound of the range of ncbj number effective adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncbj number effective adds
	 */
	public static List<NcbjNumberEffectiveAdd> findBygetNCBJById(
		long ncbjApplicationId, int start, int end,
		OrderByComparator<NcbjNumberEffectiveAdd> orderByComparator) {

		return getPersistence().findBygetNCBJById(
			ncbjApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the ncbj number effective adds where ncbjApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjNumberEffectiveAddModelImpl</code>.
	 * </p>
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param start the lower bound of the range of ncbj number effective adds
	 * @param end the upper bound of the range of ncbj number effective adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncbj number effective adds
	 */
	public static List<NcbjNumberEffectiveAdd> findBygetNCBJById(
		long ncbjApplicationId, int start, int end,
		OrderByComparator<NcbjNumberEffectiveAdd> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetNCBJById(
			ncbjApplicationId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first ncbj number effective add in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj number effective add
	 * @throws NoSuchNcbjNumberEffectiveAddException if a matching ncbj number effective add could not be found
	 */
	public static NcbjNumberEffectiveAdd findBygetNCBJById_First(
			long ncbjApplicationId,
			OrderByComparator<NcbjNumberEffectiveAdd> orderByComparator)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjNumberEffectiveAddException {

		return getPersistence().findBygetNCBJById_First(
			ncbjApplicationId, orderByComparator);
	}

	/**
	 * Returns the first ncbj number effective add in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj number effective add, or <code>null</code> if a matching ncbj number effective add could not be found
	 */
	public static NcbjNumberEffectiveAdd fetchBygetNCBJById_First(
		long ncbjApplicationId,
		OrderByComparator<NcbjNumberEffectiveAdd> orderByComparator) {

		return getPersistence().fetchBygetNCBJById_First(
			ncbjApplicationId, orderByComparator);
	}

	/**
	 * Returns the last ncbj number effective add in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj number effective add
	 * @throws NoSuchNcbjNumberEffectiveAddException if a matching ncbj number effective add could not be found
	 */
	public static NcbjNumberEffectiveAdd findBygetNCBJById_Last(
			long ncbjApplicationId,
			OrderByComparator<NcbjNumberEffectiveAdd> orderByComparator)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjNumberEffectiveAddException {

		return getPersistence().findBygetNCBJById_Last(
			ncbjApplicationId, orderByComparator);
	}

	/**
	 * Returns the last ncbj number effective add in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj number effective add, or <code>null</code> if a matching ncbj number effective add could not be found
	 */
	public static NcbjNumberEffectiveAdd fetchBygetNCBJById_Last(
		long ncbjApplicationId,
		OrderByComparator<NcbjNumberEffectiveAdd> orderByComparator) {

		return getPersistence().fetchBygetNCBJById_Last(
			ncbjApplicationId, orderByComparator);
	}

	/**
	 * Returns the ncbj number effective adds before and after the current ncbj number effective add in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjNumberEffectiveAddId the primary key of the current ncbj number effective add
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncbj number effective add
	 * @throws NoSuchNcbjNumberEffectiveAddException if a ncbj number effective add with the primary key could not be found
	 */
	public static NcbjNumberEffectiveAdd[] findBygetNCBJById_PrevAndNext(
			long ncbjNumberEffectiveAddId, long ncbjApplicationId,
			OrderByComparator<NcbjNumberEffectiveAdd> orderByComparator)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjNumberEffectiveAddException {

		return getPersistence().findBygetNCBJById_PrevAndNext(
			ncbjNumberEffectiveAddId, ncbjApplicationId, orderByComparator);
	}

	/**
	 * Removes all the ncbj number effective adds where ncbjApplicationId = &#63; from the database.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 */
	public static void removeBygetNCBJById(long ncbjApplicationId) {
		getPersistence().removeBygetNCBJById(ncbjApplicationId);
	}

	/**
	 * Returns the number of ncbj number effective adds where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the number of matching ncbj number effective adds
	 */
	public static int countBygetNCBJById(long ncbjApplicationId) {
		return getPersistence().countBygetNCBJById(ncbjApplicationId);
	}

	/**
	 * Caches the ncbj number effective add in the entity cache if it is enabled.
	 *
	 * @param ncbjNumberEffectiveAdd the ncbj number effective add
	 */
	public static void cacheResult(
		NcbjNumberEffectiveAdd ncbjNumberEffectiveAdd) {

		getPersistence().cacheResult(ncbjNumberEffectiveAdd);
	}

	/**
	 * Caches the ncbj number effective adds in the entity cache if it is enabled.
	 *
	 * @param ncbjNumberEffectiveAdds the ncbj number effective adds
	 */
	public static void cacheResult(
		List<NcbjNumberEffectiveAdd> ncbjNumberEffectiveAdds) {

		getPersistence().cacheResult(ncbjNumberEffectiveAdds);
	}

	/**
	 * Creates a new ncbj number effective add with the primary key. Does not add the ncbj number effective add to the database.
	 *
	 * @param ncbjNumberEffectiveAddId the primary key for the new ncbj number effective add
	 * @return the new ncbj number effective add
	 */
	public static NcbjNumberEffectiveAdd create(long ncbjNumberEffectiveAddId) {
		return getPersistence().create(ncbjNumberEffectiveAddId);
	}

	/**
	 * Removes the ncbj number effective add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ncbjNumberEffectiveAddId the primary key of the ncbj number effective add
	 * @return the ncbj number effective add that was removed
	 * @throws NoSuchNcbjNumberEffectiveAddException if a ncbj number effective add with the primary key could not be found
	 */
	public static NcbjNumberEffectiveAdd remove(long ncbjNumberEffectiveAddId)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjNumberEffectiveAddException {

		return getPersistence().remove(ncbjNumberEffectiveAddId);
	}

	public static NcbjNumberEffectiveAdd updateImpl(
		NcbjNumberEffectiveAdd ncbjNumberEffectiveAdd) {

		return getPersistence().updateImpl(ncbjNumberEffectiveAdd);
	}

	/**
	 * Returns the ncbj number effective add with the primary key or throws a <code>NoSuchNcbjNumberEffectiveAddException</code> if it could not be found.
	 *
	 * @param ncbjNumberEffectiveAddId the primary key of the ncbj number effective add
	 * @return the ncbj number effective add
	 * @throws NoSuchNcbjNumberEffectiveAddException if a ncbj number effective add with the primary key could not be found
	 */
	public static NcbjNumberEffectiveAdd findByPrimaryKey(
			long ncbjNumberEffectiveAddId)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjNumberEffectiveAddException {

		return getPersistence().findByPrimaryKey(ncbjNumberEffectiveAddId);
	}

	/**
	 * Returns the ncbj number effective add with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ncbjNumberEffectiveAddId the primary key of the ncbj number effective add
	 * @return the ncbj number effective add, or <code>null</code> if a ncbj number effective add with the primary key could not be found
	 */
	public static NcbjNumberEffectiveAdd fetchByPrimaryKey(
		long ncbjNumberEffectiveAddId) {

		return getPersistence().fetchByPrimaryKey(ncbjNumberEffectiveAddId);
	}

	/**
	 * Returns all the ncbj number effective adds.
	 *
	 * @return the ncbj number effective adds
	 */
	public static List<NcbjNumberEffectiveAdd> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the ncbj number effective adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjNumberEffectiveAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj number effective adds
	 * @param end the upper bound of the range of ncbj number effective adds (not inclusive)
	 * @return the range of ncbj number effective adds
	 */
	public static List<NcbjNumberEffectiveAdd> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the ncbj number effective adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjNumberEffectiveAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj number effective adds
	 * @param end the upper bound of the range of ncbj number effective adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ncbj number effective adds
	 */
	public static List<NcbjNumberEffectiveAdd> findAll(
		int start, int end,
		OrderByComparator<NcbjNumberEffectiveAdd> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the ncbj number effective adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjNumberEffectiveAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj number effective adds
	 * @param end the upper bound of the range of ncbj number effective adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ncbj number effective adds
	 */
	public static List<NcbjNumberEffectiveAdd> findAll(
		int start, int end,
		OrderByComparator<NcbjNumberEffectiveAdd> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the ncbj number effective adds from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of ncbj number effective adds.
	 *
	 * @return the number of ncbj number effective adds
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static NcbjNumberEffectiveAddPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		NcbjNumberEffectiveAddPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile NcbjNumberEffectiveAddPersistence _persistence;

}