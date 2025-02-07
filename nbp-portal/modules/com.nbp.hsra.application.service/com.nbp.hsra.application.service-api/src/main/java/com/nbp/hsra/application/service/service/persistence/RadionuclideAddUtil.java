/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.hsra.application.service.model.RadionuclideAdd;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the radionuclide add service. This utility wraps <code>com.nbp.hsra.application.service.service.persistence.impl.RadionuclideAddPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RadionuclideAddPersistence
 * @generated
 */
public class RadionuclideAddUtil {

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
	public static void clearCache(RadionuclideAdd radionuclideAdd) {
		getPersistence().clearCache(radionuclideAdd);
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
	public static Map<Serializable, RadionuclideAdd> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<RadionuclideAdd> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<RadionuclideAdd> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<RadionuclideAdd> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<RadionuclideAdd> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static RadionuclideAdd update(RadionuclideAdd radionuclideAdd) {
		return getPersistence().update(radionuclideAdd);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static RadionuclideAdd update(
		RadionuclideAdd radionuclideAdd, ServiceContext serviceContext) {

		return getPersistence().update(radionuclideAdd, serviceContext);
	}

	/**
	 * Returns all the radionuclide adds where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching radionuclide adds
	 */
	public static List<RadionuclideAdd> findBygetHsraById(
		long hsraApplicationId) {

		return getPersistence().findBygetHsraById(hsraApplicationId);
	}

	/**
	 * Returns a range of all the radionuclide adds where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RadionuclideAddModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of radionuclide adds
	 * @param end the upper bound of the range of radionuclide adds (not inclusive)
	 * @return the range of matching radionuclide adds
	 */
	public static List<RadionuclideAdd> findBygetHsraById(
		long hsraApplicationId, int start, int end) {

		return getPersistence().findBygetHsraById(
			hsraApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the radionuclide adds where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RadionuclideAddModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of radionuclide adds
	 * @param end the upper bound of the range of radionuclide adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching radionuclide adds
	 */
	public static List<RadionuclideAdd> findBygetHsraById(
		long hsraApplicationId, int start, int end,
		OrderByComparator<RadionuclideAdd> orderByComparator) {

		return getPersistence().findBygetHsraById(
			hsraApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the radionuclide adds where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RadionuclideAddModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of radionuclide adds
	 * @param end the upper bound of the range of radionuclide adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching radionuclide adds
	 */
	public static List<RadionuclideAdd> findBygetHsraById(
		long hsraApplicationId, int start, int end,
		OrderByComparator<RadionuclideAdd> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetHsraById(
			hsraApplicationId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first radionuclide add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching radionuclide add
	 * @throws NoSuchRadionuclideAddException if a matching radionuclide add could not be found
	 */
	public static RadionuclideAdd findBygetHsraById_First(
			long hsraApplicationId,
			OrderByComparator<RadionuclideAdd> orderByComparator)
		throws com.nbp.hsra.application.service.exception.
			NoSuchRadionuclideAddException {

		return getPersistence().findBygetHsraById_First(
			hsraApplicationId, orderByComparator);
	}

	/**
	 * Returns the first radionuclide add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching radionuclide add, or <code>null</code> if a matching radionuclide add could not be found
	 */
	public static RadionuclideAdd fetchBygetHsraById_First(
		long hsraApplicationId,
		OrderByComparator<RadionuclideAdd> orderByComparator) {

		return getPersistence().fetchBygetHsraById_First(
			hsraApplicationId, orderByComparator);
	}

	/**
	 * Returns the last radionuclide add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching radionuclide add
	 * @throws NoSuchRadionuclideAddException if a matching radionuclide add could not be found
	 */
	public static RadionuclideAdd findBygetHsraById_Last(
			long hsraApplicationId,
			OrderByComparator<RadionuclideAdd> orderByComparator)
		throws com.nbp.hsra.application.service.exception.
			NoSuchRadionuclideAddException {

		return getPersistence().findBygetHsraById_Last(
			hsraApplicationId, orderByComparator);
	}

	/**
	 * Returns the last radionuclide add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching radionuclide add, or <code>null</code> if a matching radionuclide add could not be found
	 */
	public static RadionuclideAdd fetchBygetHsraById_Last(
		long hsraApplicationId,
		OrderByComparator<RadionuclideAdd> orderByComparator) {

		return getPersistence().fetchBygetHsraById_Last(
			hsraApplicationId, orderByComparator);
	}

	/**
	 * Returns the radionuclide adds before and after the current radionuclide add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param radionuclideAddId the primary key of the current radionuclide add
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next radionuclide add
	 * @throws NoSuchRadionuclideAddException if a radionuclide add with the primary key could not be found
	 */
	public static RadionuclideAdd[] findBygetHsraById_PrevAndNext(
			long radionuclideAddId, long hsraApplicationId,
			OrderByComparator<RadionuclideAdd> orderByComparator)
		throws com.nbp.hsra.application.service.exception.
			NoSuchRadionuclideAddException {

		return getPersistence().findBygetHsraById_PrevAndNext(
			radionuclideAddId, hsraApplicationId, orderByComparator);
	}

	/**
	 * Removes all the radionuclide adds where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 */
	public static void removeBygetHsraById(long hsraApplicationId) {
		getPersistence().removeBygetHsraById(hsraApplicationId);
	}

	/**
	 * Returns the number of radionuclide adds where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching radionuclide adds
	 */
	public static int countBygetHsraById(long hsraApplicationId) {
		return getPersistence().countBygetHsraById(hsraApplicationId);
	}

	/**
	 * Caches the radionuclide add in the entity cache if it is enabled.
	 *
	 * @param radionuclideAdd the radionuclide add
	 */
	public static void cacheResult(RadionuclideAdd radionuclideAdd) {
		getPersistence().cacheResult(radionuclideAdd);
	}

	/**
	 * Caches the radionuclide adds in the entity cache if it is enabled.
	 *
	 * @param radionuclideAdds the radionuclide adds
	 */
	public static void cacheResult(List<RadionuclideAdd> radionuclideAdds) {
		getPersistence().cacheResult(radionuclideAdds);
	}

	/**
	 * Creates a new radionuclide add with the primary key. Does not add the radionuclide add to the database.
	 *
	 * @param radionuclideAddId the primary key for the new radionuclide add
	 * @return the new radionuclide add
	 */
	public static RadionuclideAdd create(long radionuclideAddId) {
		return getPersistence().create(radionuclideAddId);
	}

	/**
	 * Removes the radionuclide add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param radionuclideAddId the primary key of the radionuclide add
	 * @return the radionuclide add that was removed
	 * @throws NoSuchRadionuclideAddException if a radionuclide add with the primary key could not be found
	 */
	public static RadionuclideAdd remove(long radionuclideAddId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchRadionuclideAddException {

		return getPersistence().remove(radionuclideAddId);
	}

	public static RadionuclideAdd updateImpl(RadionuclideAdd radionuclideAdd) {
		return getPersistence().updateImpl(radionuclideAdd);
	}

	/**
	 * Returns the radionuclide add with the primary key or throws a <code>NoSuchRadionuclideAddException</code> if it could not be found.
	 *
	 * @param radionuclideAddId the primary key of the radionuclide add
	 * @return the radionuclide add
	 * @throws NoSuchRadionuclideAddException if a radionuclide add with the primary key could not be found
	 */
	public static RadionuclideAdd findByPrimaryKey(long radionuclideAddId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchRadionuclideAddException {

		return getPersistence().findByPrimaryKey(radionuclideAddId);
	}

	/**
	 * Returns the radionuclide add with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param radionuclideAddId the primary key of the radionuclide add
	 * @return the radionuclide add, or <code>null</code> if a radionuclide add with the primary key could not be found
	 */
	public static RadionuclideAdd fetchByPrimaryKey(long radionuclideAddId) {
		return getPersistence().fetchByPrimaryKey(radionuclideAddId);
	}

	/**
	 * Returns all the radionuclide adds.
	 *
	 * @return the radionuclide adds
	 */
	public static List<RadionuclideAdd> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the radionuclide adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RadionuclideAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of radionuclide adds
	 * @param end the upper bound of the range of radionuclide adds (not inclusive)
	 * @return the range of radionuclide adds
	 */
	public static List<RadionuclideAdd> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the radionuclide adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RadionuclideAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of radionuclide adds
	 * @param end the upper bound of the range of radionuclide adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of radionuclide adds
	 */
	public static List<RadionuclideAdd> findAll(
		int start, int end,
		OrderByComparator<RadionuclideAdd> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the radionuclide adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RadionuclideAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of radionuclide adds
	 * @param end the upper bound of the range of radionuclide adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of radionuclide adds
	 */
	public static List<RadionuclideAdd> findAll(
		int start, int end,
		OrderByComparator<RadionuclideAdd> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the radionuclide adds from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of radionuclide adds.
	 *
	 * @return the number of radionuclide adds
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static RadionuclideAddPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(RadionuclideAddPersistence persistence) {
		_persistence = persistence;
	}

	private static volatile RadionuclideAddPersistence _persistence;

}