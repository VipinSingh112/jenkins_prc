/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quary.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.quary.application.form.service.model.DirectorDetailsAdd;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the director details add service. This utility wraps <code>com.nbp.quary.application.form.service.service.persistence.impl.DirectorDetailsAddPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DirectorDetailsAddPersistence
 * @generated
 */
public class DirectorDetailsAddUtil {

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
	public static void clearCache(DirectorDetailsAdd directorDetailsAdd) {
		getPersistence().clearCache(directorDetailsAdd);
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
	public static Map<Serializable, DirectorDetailsAdd> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<DirectorDetailsAdd> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DirectorDetailsAdd> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DirectorDetailsAdd> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<DirectorDetailsAdd> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static DirectorDetailsAdd update(
		DirectorDetailsAdd directorDetailsAdd) {

		return getPersistence().update(directorDetailsAdd);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static DirectorDetailsAdd update(
		DirectorDetailsAdd directorDetailsAdd, ServiceContext serviceContext) {

		return getPersistence().update(directorDetailsAdd, serviceContext);
	}

	/**
	 * Returns all the director details adds where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the matching director details adds
	 */
	public static List<DirectorDetailsAdd> findBygetQuarry_ById(
		long quarryApplicationId) {

		return getPersistence().findBygetQuarry_ById(quarryApplicationId);
	}

	/**
	 * Returns a range of all the director details adds where quarryApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DirectorDetailsAddModelImpl</code>.
	 * </p>
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param start the lower bound of the range of director details adds
	 * @param end the upper bound of the range of director details adds (not inclusive)
	 * @return the range of matching director details adds
	 */
	public static List<DirectorDetailsAdd> findBygetQuarry_ById(
		long quarryApplicationId, int start, int end) {

		return getPersistence().findBygetQuarry_ById(
			quarryApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the director details adds where quarryApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DirectorDetailsAddModelImpl</code>.
	 * </p>
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param start the lower bound of the range of director details adds
	 * @param end the upper bound of the range of director details adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching director details adds
	 */
	public static List<DirectorDetailsAdd> findBygetQuarry_ById(
		long quarryApplicationId, int start, int end,
		OrderByComparator<DirectorDetailsAdd> orderByComparator) {

		return getPersistence().findBygetQuarry_ById(
			quarryApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the director details adds where quarryApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DirectorDetailsAddModelImpl</code>.
	 * </p>
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param start the lower bound of the range of director details adds
	 * @param end the upper bound of the range of director details adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching director details adds
	 */
	public static List<DirectorDetailsAdd> findBygetQuarry_ById(
		long quarryApplicationId, int start, int end,
		OrderByComparator<DirectorDetailsAdd> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetQuarry_ById(
			quarryApplicationId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first director details add in the ordered set where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching director details add
	 * @throws NoSuchDirectorDetailsAddException if a matching director details add could not be found
	 */
	public static DirectorDetailsAdd findBygetQuarry_ById_First(
			long quarryApplicationId,
			OrderByComparator<DirectorDetailsAdd> orderByComparator)
		throws com.nbp.quary.application.form.service.exception.
			NoSuchDirectorDetailsAddException {

		return getPersistence().findBygetQuarry_ById_First(
			quarryApplicationId, orderByComparator);
	}

	/**
	 * Returns the first director details add in the ordered set where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching director details add, or <code>null</code> if a matching director details add could not be found
	 */
	public static DirectorDetailsAdd fetchBygetQuarry_ById_First(
		long quarryApplicationId,
		OrderByComparator<DirectorDetailsAdd> orderByComparator) {

		return getPersistence().fetchBygetQuarry_ById_First(
			quarryApplicationId, orderByComparator);
	}

	/**
	 * Returns the last director details add in the ordered set where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching director details add
	 * @throws NoSuchDirectorDetailsAddException if a matching director details add could not be found
	 */
	public static DirectorDetailsAdd findBygetQuarry_ById_Last(
			long quarryApplicationId,
			OrderByComparator<DirectorDetailsAdd> orderByComparator)
		throws com.nbp.quary.application.form.service.exception.
			NoSuchDirectorDetailsAddException {

		return getPersistence().findBygetQuarry_ById_Last(
			quarryApplicationId, orderByComparator);
	}

	/**
	 * Returns the last director details add in the ordered set where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching director details add, or <code>null</code> if a matching director details add could not be found
	 */
	public static DirectorDetailsAdd fetchBygetQuarry_ById_Last(
		long quarryApplicationId,
		OrderByComparator<DirectorDetailsAdd> orderByComparator) {

		return getPersistence().fetchBygetQuarry_ById_Last(
			quarryApplicationId, orderByComparator);
	}

	/**
	 * Returns the director details adds before and after the current director details add in the ordered set where quarryApplicationId = &#63;.
	 *
	 * @param directorDetailsAddId the primary key of the current director details add
	 * @param quarryApplicationId the quarry application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next director details add
	 * @throws NoSuchDirectorDetailsAddException if a director details add with the primary key could not be found
	 */
	public static DirectorDetailsAdd[] findBygetQuarry_ById_PrevAndNext(
			long directorDetailsAddId, long quarryApplicationId,
			OrderByComparator<DirectorDetailsAdd> orderByComparator)
		throws com.nbp.quary.application.form.service.exception.
			NoSuchDirectorDetailsAddException {

		return getPersistence().findBygetQuarry_ById_PrevAndNext(
			directorDetailsAddId, quarryApplicationId, orderByComparator);
	}

	/**
	 * Removes all the director details adds where quarryApplicationId = &#63; from the database.
	 *
	 * @param quarryApplicationId the quarry application ID
	 */
	public static void removeBygetQuarry_ById(long quarryApplicationId) {
		getPersistence().removeBygetQuarry_ById(quarryApplicationId);
	}

	/**
	 * Returns the number of director details adds where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the number of matching director details adds
	 */
	public static int countBygetQuarry_ById(long quarryApplicationId) {
		return getPersistence().countBygetQuarry_ById(quarryApplicationId);
	}

	/**
	 * Caches the director details add in the entity cache if it is enabled.
	 *
	 * @param directorDetailsAdd the director details add
	 */
	public static void cacheResult(DirectorDetailsAdd directorDetailsAdd) {
		getPersistence().cacheResult(directorDetailsAdd);
	}

	/**
	 * Caches the director details adds in the entity cache if it is enabled.
	 *
	 * @param directorDetailsAdds the director details adds
	 */
	public static void cacheResult(
		List<DirectorDetailsAdd> directorDetailsAdds) {

		getPersistence().cacheResult(directorDetailsAdds);
	}

	/**
	 * Creates a new director details add with the primary key. Does not add the director details add to the database.
	 *
	 * @param directorDetailsAddId the primary key for the new director details add
	 * @return the new director details add
	 */
	public static DirectorDetailsAdd create(long directorDetailsAddId) {
		return getPersistence().create(directorDetailsAddId);
	}

	/**
	 * Removes the director details add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param directorDetailsAddId the primary key of the director details add
	 * @return the director details add that was removed
	 * @throws NoSuchDirectorDetailsAddException if a director details add with the primary key could not be found
	 */
	public static DirectorDetailsAdd remove(long directorDetailsAddId)
		throws com.nbp.quary.application.form.service.exception.
			NoSuchDirectorDetailsAddException {

		return getPersistence().remove(directorDetailsAddId);
	}

	public static DirectorDetailsAdd updateImpl(
		DirectorDetailsAdd directorDetailsAdd) {

		return getPersistence().updateImpl(directorDetailsAdd);
	}

	/**
	 * Returns the director details add with the primary key or throws a <code>NoSuchDirectorDetailsAddException</code> if it could not be found.
	 *
	 * @param directorDetailsAddId the primary key of the director details add
	 * @return the director details add
	 * @throws NoSuchDirectorDetailsAddException if a director details add with the primary key could not be found
	 */
	public static DirectorDetailsAdd findByPrimaryKey(long directorDetailsAddId)
		throws com.nbp.quary.application.form.service.exception.
			NoSuchDirectorDetailsAddException {

		return getPersistence().findByPrimaryKey(directorDetailsAddId);
	}

	/**
	 * Returns the director details add with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param directorDetailsAddId the primary key of the director details add
	 * @return the director details add, or <code>null</code> if a director details add with the primary key could not be found
	 */
	public static DirectorDetailsAdd fetchByPrimaryKey(
		long directorDetailsAddId) {

		return getPersistence().fetchByPrimaryKey(directorDetailsAddId);
	}

	/**
	 * Returns all the director details adds.
	 *
	 * @return the director details adds
	 */
	public static List<DirectorDetailsAdd> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the director details adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DirectorDetailsAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of director details adds
	 * @param end the upper bound of the range of director details adds (not inclusive)
	 * @return the range of director details adds
	 */
	public static List<DirectorDetailsAdd> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the director details adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DirectorDetailsAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of director details adds
	 * @param end the upper bound of the range of director details adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of director details adds
	 */
	public static List<DirectorDetailsAdd> findAll(
		int start, int end,
		OrderByComparator<DirectorDetailsAdd> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the director details adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DirectorDetailsAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of director details adds
	 * @param end the upper bound of the range of director details adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of director details adds
	 */
	public static List<DirectorDetailsAdd> findAll(
		int start, int end,
		OrderByComparator<DirectorDetailsAdd> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the director details adds from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of director details adds.
	 *
	 * @return the number of director details adds
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static DirectorDetailsAddPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		DirectorDetailsAddPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile DirectorDetailsAddPersistence _persistence;

}