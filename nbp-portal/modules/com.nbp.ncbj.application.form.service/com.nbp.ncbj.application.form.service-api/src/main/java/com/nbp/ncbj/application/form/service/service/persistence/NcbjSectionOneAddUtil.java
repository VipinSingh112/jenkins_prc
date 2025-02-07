/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.ncbj.application.form.service.model.NcbjSectionOneAdd;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the ncbj section one add service. This utility wraps <code>com.nbp.ncbj.application.form.service.service.persistence.impl.NcbjSectionOneAddPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NcbjSectionOneAddPersistence
 * @generated
 */
public class NcbjSectionOneAddUtil {

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
	public static void clearCache(NcbjSectionOneAdd ncbjSectionOneAdd) {
		getPersistence().clearCache(ncbjSectionOneAdd);
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
	public static Map<Serializable, NcbjSectionOneAdd> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<NcbjSectionOneAdd> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<NcbjSectionOneAdd> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<NcbjSectionOneAdd> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<NcbjSectionOneAdd> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static NcbjSectionOneAdd update(
		NcbjSectionOneAdd ncbjSectionOneAdd) {

		return getPersistence().update(ncbjSectionOneAdd);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static NcbjSectionOneAdd update(
		NcbjSectionOneAdd ncbjSectionOneAdd, ServiceContext serviceContext) {

		return getPersistence().update(ncbjSectionOneAdd, serviceContext);
	}

	/**
	 * Returns all the ncbj section one adds where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj section one adds
	 */
	public static List<NcbjSectionOneAdd> findBygetNCBJById(
		long ncbjApplicationId) {

		return getPersistence().findBygetNCBJById(ncbjApplicationId);
	}

	/**
	 * Returns a range of all the ncbj section one adds where ncbjApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjSectionOneAddModelImpl</code>.
	 * </p>
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param start the lower bound of the range of ncbj section one adds
	 * @param end the upper bound of the range of ncbj section one adds (not inclusive)
	 * @return the range of matching ncbj section one adds
	 */
	public static List<NcbjSectionOneAdd> findBygetNCBJById(
		long ncbjApplicationId, int start, int end) {

		return getPersistence().findBygetNCBJById(
			ncbjApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the ncbj section one adds where ncbjApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjSectionOneAddModelImpl</code>.
	 * </p>
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param start the lower bound of the range of ncbj section one adds
	 * @param end the upper bound of the range of ncbj section one adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncbj section one adds
	 */
	public static List<NcbjSectionOneAdd> findBygetNCBJById(
		long ncbjApplicationId, int start, int end,
		OrderByComparator<NcbjSectionOneAdd> orderByComparator) {

		return getPersistence().findBygetNCBJById(
			ncbjApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the ncbj section one adds where ncbjApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjSectionOneAddModelImpl</code>.
	 * </p>
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param start the lower bound of the range of ncbj section one adds
	 * @param end the upper bound of the range of ncbj section one adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncbj section one adds
	 */
	public static List<NcbjSectionOneAdd> findBygetNCBJById(
		long ncbjApplicationId, int start, int end,
		OrderByComparator<NcbjSectionOneAdd> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetNCBJById(
			ncbjApplicationId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first ncbj section one add in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj section one add
	 * @throws NoSuchNcbjSectionOneAddException if a matching ncbj section one add could not be found
	 */
	public static NcbjSectionOneAdd findBygetNCBJById_First(
			long ncbjApplicationId,
			OrderByComparator<NcbjSectionOneAdd> orderByComparator)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjSectionOneAddException {

		return getPersistence().findBygetNCBJById_First(
			ncbjApplicationId, orderByComparator);
	}

	/**
	 * Returns the first ncbj section one add in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj section one add, or <code>null</code> if a matching ncbj section one add could not be found
	 */
	public static NcbjSectionOneAdd fetchBygetNCBJById_First(
		long ncbjApplicationId,
		OrderByComparator<NcbjSectionOneAdd> orderByComparator) {

		return getPersistence().fetchBygetNCBJById_First(
			ncbjApplicationId, orderByComparator);
	}

	/**
	 * Returns the last ncbj section one add in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj section one add
	 * @throws NoSuchNcbjSectionOneAddException if a matching ncbj section one add could not be found
	 */
	public static NcbjSectionOneAdd findBygetNCBJById_Last(
			long ncbjApplicationId,
			OrderByComparator<NcbjSectionOneAdd> orderByComparator)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjSectionOneAddException {

		return getPersistence().findBygetNCBJById_Last(
			ncbjApplicationId, orderByComparator);
	}

	/**
	 * Returns the last ncbj section one add in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj section one add, or <code>null</code> if a matching ncbj section one add could not be found
	 */
	public static NcbjSectionOneAdd fetchBygetNCBJById_Last(
		long ncbjApplicationId,
		OrderByComparator<NcbjSectionOneAdd> orderByComparator) {

		return getPersistence().fetchBygetNCBJById_Last(
			ncbjApplicationId, orderByComparator);
	}

	/**
	 * Returns the ncbj section one adds before and after the current ncbj section one add in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjSectionOneAddId the primary key of the current ncbj section one add
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncbj section one add
	 * @throws NoSuchNcbjSectionOneAddException if a ncbj section one add with the primary key could not be found
	 */
	public static NcbjSectionOneAdd[] findBygetNCBJById_PrevAndNext(
			long ncbjSectionOneAddId, long ncbjApplicationId,
			OrderByComparator<NcbjSectionOneAdd> orderByComparator)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjSectionOneAddException {

		return getPersistence().findBygetNCBJById_PrevAndNext(
			ncbjSectionOneAddId, ncbjApplicationId, orderByComparator);
	}

	/**
	 * Removes all the ncbj section one adds where ncbjApplicationId = &#63; from the database.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 */
	public static void removeBygetNCBJById(long ncbjApplicationId) {
		getPersistence().removeBygetNCBJById(ncbjApplicationId);
	}

	/**
	 * Returns the number of ncbj section one adds where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the number of matching ncbj section one adds
	 */
	public static int countBygetNCBJById(long ncbjApplicationId) {
		return getPersistence().countBygetNCBJById(ncbjApplicationId);
	}

	/**
	 * Caches the ncbj section one add in the entity cache if it is enabled.
	 *
	 * @param ncbjSectionOneAdd the ncbj section one add
	 */
	public static void cacheResult(NcbjSectionOneAdd ncbjSectionOneAdd) {
		getPersistence().cacheResult(ncbjSectionOneAdd);
	}

	/**
	 * Caches the ncbj section one adds in the entity cache if it is enabled.
	 *
	 * @param ncbjSectionOneAdds the ncbj section one adds
	 */
	public static void cacheResult(List<NcbjSectionOneAdd> ncbjSectionOneAdds) {
		getPersistence().cacheResult(ncbjSectionOneAdds);
	}

	/**
	 * Creates a new ncbj section one add with the primary key. Does not add the ncbj section one add to the database.
	 *
	 * @param ncbjSectionOneAddId the primary key for the new ncbj section one add
	 * @return the new ncbj section one add
	 */
	public static NcbjSectionOneAdd create(long ncbjSectionOneAddId) {
		return getPersistence().create(ncbjSectionOneAddId);
	}

	/**
	 * Removes the ncbj section one add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ncbjSectionOneAddId the primary key of the ncbj section one add
	 * @return the ncbj section one add that was removed
	 * @throws NoSuchNcbjSectionOneAddException if a ncbj section one add with the primary key could not be found
	 */
	public static NcbjSectionOneAdd remove(long ncbjSectionOneAddId)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjSectionOneAddException {

		return getPersistence().remove(ncbjSectionOneAddId);
	}

	public static NcbjSectionOneAdd updateImpl(
		NcbjSectionOneAdd ncbjSectionOneAdd) {

		return getPersistence().updateImpl(ncbjSectionOneAdd);
	}

	/**
	 * Returns the ncbj section one add with the primary key or throws a <code>NoSuchNcbjSectionOneAddException</code> if it could not be found.
	 *
	 * @param ncbjSectionOneAddId the primary key of the ncbj section one add
	 * @return the ncbj section one add
	 * @throws NoSuchNcbjSectionOneAddException if a ncbj section one add with the primary key could not be found
	 */
	public static NcbjSectionOneAdd findByPrimaryKey(long ncbjSectionOneAddId)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjSectionOneAddException {

		return getPersistence().findByPrimaryKey(ncbjSectionOneAddId);
	}

	/**
	 * Returns the ncbj section one add with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ncbjSectionOneAddId the primary key of the ncbj section one add
	 * @return the ncbj section one add, or <code>null</code> if a ncbj section one add with the primary key could not be found
	 */
	public static NcbjSectionOneAdd fetchByPrimaryKey(
		long ncbjSectionOneAddId) {

		return getPersistence().fetchByPrimaryKey(ncbjSectionOneAddId);
	}

	/**
	 * Returns all the ncbj section one adds.
	 *
	 * @return the ncbj section one adds
	 */
	public static List<NcbjSectionOneAdd> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the ncbj section one adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjSectionOneAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj section one adds
	 * @param end the upper bound of the range of ncbj section one adds (not inclusive)
	 * @return the range of ncbj section one adds
	 */
	public static List<NcbjSectionOneAdd> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the ncbj section one adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjSectionOneAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj section one adds
	 * @param end the upper bound of the range of ncbj section one adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ncbj section one adds
	 */
	public static List<NcbjSectionOneAdd> findAll(
		int start, int end,
		OrderByComparator<NcbjSectionOneAdd> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the ncbj section one adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjSectionOneAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj section one adds
	 * @param end the upper bound of the range of ncbj section one adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ncbj section one adds
	 */
	public static List<NcbjSectionOneAdd> findAll(
		int start, int end,
		OrderByComparator<NcbjSectionOneAdd> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the ncbj section one adds from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of ncbj section one adds.
	 *
	 * @return the number of ncbj section one adds
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static NcbjSectionOneAddPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		NcbjSectionOneAddPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile NcbjSectionOneAddPersistence _persistence;

}