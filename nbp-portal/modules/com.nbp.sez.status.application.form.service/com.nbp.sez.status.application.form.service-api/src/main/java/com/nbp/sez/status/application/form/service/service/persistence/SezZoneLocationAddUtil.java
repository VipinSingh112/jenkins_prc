/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.sez.status.application.form.service.model.SezZoneLocationAdd;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the sez zone location add service. This utility wraps <code>com.nbp.sez.status.application.form.service.service.persistence.impl.SezZoneLocationAddPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezZoneLocationAddPersistence
 * @generated
 */
public class SezZoneLocationAddUtil {

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
	public static void clearCache(SezZoneLocationAdd sezZoneLocationAdd) {
		getPersistence().clearCache(sezZoneLocationAdd);
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
	public static Map<Serializable, SezZoneLocationAdd> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<SezZoneLocationAdd> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<SezZoneLocationAdd> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<SezZoneLocationAdd> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<SezZoneLocationAdd> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static SezZoneLocationAdd update(
		SezZoneLocationAdd sezZoneLocationAdd) {

		return getPersistence().update(sezZoneLocationAdd);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static SezZoneLocationAdd update(
		SezZoneLocationAdd sezZoneLocationAdd, ServiceContext serviceContext) {

		return getPersistence().update(sezZoneLocationAdd, serviceContext);
	}

	/**
	 * Returns all the sez zone location adds where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez zone location adds
	 */
	public static List<SezZoneLocationAdd> findBygetSezStatusByAppId(
		long sezStatusApplicationId) {

		return getPersistence().findBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Returns a range of all the sez zone location adds where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezZoneLocationAddModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez zone location adds
	 * @param end the upper bound of the range of sez zone location adds (not inclusive)
	 * @return the range of matching sez zone location adds
	 */
	public static List<SezZoneLocationAdd> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end) {

		return getPersistence().findBygetSezStatusByAppId(
			sezStatusApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the sez zone location adds where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezZoneLocationAddModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez zone location adds
	 * @param end the upper bound of the range of sez zone location adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez zone location adds
	 */
	public static List<SezZoneLocationAdd> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end,
		OrderByComparator<SezZoneLocationAdd> orderByComparator) {

		return getPersistence().findBygetSezStatusByAppId(
			sezStatusApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the sez zone location adds where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezZoneLocationAddModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez zone location adds
	 * @param end the upper bound of the range of sez zone location adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez zone location adds
	 */
	public static List<SezZoneLocationAdd> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end,
		OrderByComparator<SezZoneLocationAdd> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetSezStatusByAppId(
			sezStatusApplicationId, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first sez zone location add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez zone location add
	 * @throws NoSuchSezZoneLocationAddException if a matching sez zone location add could not be found
	 */
	public static SezZoneLocationAdd findBygetSezStatusByAppId_First(
			long sezStatusApplicationId,
			OrderByComparator<SezZoneLocationAdd> orderByComparator)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezZoneLocationAddException {

		return getPersistence().findBygetSezStatusByAppId_First(
			sezStatusApplicationId, orderByComparator);
	}

	/**
	 * Returns the first sez zone location add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez zone location add, or <code>null</code> if a matching sez zone location add could not be found
	 */
	public static SezZoneLocationAdd fetchBygetSezStatusByAppId_First(
		long sezStatusApplicationId,
		OrderByComparator<SezZoneLocationAdd> orderByComparator) {

		return getPersistence().fetchBygetSezStatusByAppId_First(
			sezStatusApplicationId, orderByComparator);
	}

	/**
	 * Returns the last sez zone location add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez zone location add
	 * @throws NoSuchSezZoneLocationAddException if a matching sez zone location add could not be found
	 */
	public static SezZoneLocationAdd findBygetSezStatusByAppId_Last(
			long sezStatusApplicationId,
			OrderByComparator<SezZoneLocationAdd> orderByComparator)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezZoneLocationAddException {

		return getPersistence().findBygetSezStatusByAppId_Last(
			sezStatusApplicationId, orderByComparator);
	}

	/**
	 * Returns the last sez zone location add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez zone location add, or <code>null</code> if a matching sez zone location add could not be found
	 */
	public static SezZoneLocationAdd fetchBygetSezStatusByAppId_Last(
		long sezStatusApplicationId,
		OrderByComparator<SezZoneLocationAdd> orderByComparator) {

		return getPersistence().fetchBygetSezStatusByAppId_Last(
			sezStatusApplicationId, orderByComparator);
	}

	/**
	 * Returns the sez zone location adds before and after the current sez zone location add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezZoneLocationAddId the primary key of the current sez zone location add
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez zone location add
	 * @throws NoSuchSezZoneLocationAddException if a sez zone location add with the primary key could not be found
	 */
	public static SezZoneLocationAdd[] findBygetSezStatusByAppId_PrevAndNext(
			long sezZoneLocationAddId, long sezStatusApplicationId,
			OrderByComparator<SezZoneLocationAdd> orderByComparator)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezZoneLocationAddException {

		return getPersistence().findBygetSezStatusByAppId_PrevAndNext(
			sezZoneLocationAddId, sezStatusApplicationId, orderByComparator);
	}

	/**
	 * Removes all the sez zone location adds where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 */
	public static void removeBygetSezStatusByAppId(
		long sezStatusApplicationId) {

		getPersistence().removeBygetSezStatusByAppId(sezStatusApplicationId);
	}

	/**
	 * Returns the number of sez zone location adds where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez zone location adds
	 */
	public static int countBygetSezStatusByAppId(long sezStatusApplicationId) {
		return getPersistence().countBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Caches the sez zone location add in the entity cache if it is enabled.
	 *
	 * @param sezZoneLocationAdd the sez zone location add
	 */
	public static void cacheResult(SezZoneLocationAdd sezZoneLocationAdd) {
		getPersistence().cacheResult(sezZoneLocationAdd);
	}

	/**
	 * Caches the sez zone location adds in the entity cache if it is enabled.
	 *
	 * @param sezZoneLocationAdds the sez zone location adds
	 */
	public static void cacheResult(
		List<SezZoneLocationAdd> sezZoneLocationAdds) {

		getPersistence().cacheResult(sezZoneLocationAdds);
	}

	/**
	 * Creates a new sez zone location add with the primary key. Does not add the sez zone location add to the database.
	 *
	 * @param sezZoneLocationAddId the primary key for the new sez zone location add
	 * @return the new sez zone location add
	 */
	public static SezZoneLocationAdd create(long sezZoneLocationAddId) {
		return getPersistence().create(sezZoneLocationAddId);
	}

	/**
	 * Removes the sez zone location add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezZoneLocationAddId the primary key of the sez zone location add
	 * @return the sez zone location add that was removed
	 * @throws NoSuchSezZoneLocationAddException if a sez zone location add with the primary key could not be found
	 */
	public static SezZoneLocationAdd remove(long sezZoneLocationAddId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezZoneLocationAddException {

		return getPersistence().remove(sezZoneLocationAddId);
	}

	public static SezZoneLocationAdd updateImpl(
		SezZoneLocationAdd sezZoneLocationAdd) {

		return getPersistence().updateImpl(sezZoneLocationAdd);
	}

	/**
	 * Returns the sez zone location add with the primary key or throws a <code>NoSuchSezZoneLocationAddException</code> if it could not be found.
	 *
	 * @param sezZoneLocationAddId the primary key of the sez zone location add
	 * @return the sez zone location add
	 * @throws NoSuchSezZoneLocationAddException if a sez zone location add with the primary key could not be found
	 */
	public static SezZoneLocationAdd findByPrimaryKey(long sezZoneLocationAddId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezZoneLocationAddException {

		return getPersistence().findByPrimaryKey(sezZoneLocationAddId);
	}

	/**
	 * Returns the sez zone location add with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezZoneLocationAddId the primary key of the sez zone location add
	 * @return the sez zone location add, or <code>null</code> if a sez zone location add with the primary key could not be found
	 */
	public static SezZoneLocationAdd fetchByPrimaryKey(
		long sezZoneLocationAddId) {

		return getPersistence().fetchByPrimaryKey(sezZoneLocationAddId);
	}

	/**
	 * Returns all the sez zone location adds.
	 *
	 * @return the sez zone location adds
	 */
	public static List<SezZoneLocationAdd> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the sez zone location adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezZoneLocationAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez zone location adds
	 * @param end the upper bound of the range of sez zone location adds (not inclusive)
	 * @return the range of sez zone location adds
	 */
	public static List<SezZoneLocationAdd> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the sez zone location adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezZoneLocationAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez zone location adds
	 * @param end the upper bound of the range of sez zone location adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez zone location adds
	 */
	public static List<SezZoneLocationAdd> findAll(
		int start, int end,
		OrderByComparator<SezZoneLocationAdd> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the sez zone location adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezZoneLocationAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez zone location adds
	 * @param end the upper bound of the range of sez zone location adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez zone location adds
	 */
	public static List<SezZoneLocationAdd> findAll(
		int start, int end,
		OrderByComparator<SezZoneLocationAdd> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the sez zone location adds from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of sez zone location adds.
	 *
	 * @return the number of sez zone location adds
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static SezZoneLocationAddPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		SezZoneLocationAddPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile SezZoneLocationAddPersistence _persistence;

}