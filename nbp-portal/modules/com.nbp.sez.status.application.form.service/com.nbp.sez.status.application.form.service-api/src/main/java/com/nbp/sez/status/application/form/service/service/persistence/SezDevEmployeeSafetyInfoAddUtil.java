/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.sez.status.application.form.service.model.SezDevEmployeeSafetyInfoAdd;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the sez dev employee safety info add service. This utility wraps <code>com.nbp.sez.status.application.form.service.service.persistence.impl.SezDevEmployeeSafetyInfoAddPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezDevEmployeeSafetyInfoAddPersistence
 * @generated
 */
public class SezDevEmployeeSafetyInfoAddUtil {

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
		SezDevEmployeeSafetyInfoAdd sezDevEmployeeSafetyInfoAdd) {

		getPersistence().clearCache(sezDevEmployeeSafetyInfoAdd);
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
	public static Map<Serializable, SezDevEmployeeSafetyInfoAdd>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<SezDevEmployeeSafetyInfoAdd> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<SezDevEmployeeSafetyInfoAdd> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<SezDevEmployeeSafetyInfoAdd> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<SezDevEmployeeSafetyInfoAdd> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static SezDevEmployeeSafetyInfoAdd update(
		SezDevEmployeeSafetyInfoAdd sezDevEmployeeSafetyInfoAdd) {

		return getPersistence().update(sezDevEmployeeSafetyInfoAdd);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static SezDevEmployeeSafetyInfoAdd update(
		SezDevEmployeeSafetyInfoAdd sezDevEmployeeSafetyInfoAdd,
		ServiceContext serviceContext) {

		return getPersistence().update(
			sezDevEmployeeSafetyInfoAdd, serviceContext);
	}

	/**
	 * Returns all the sez dev employee safety info adds where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez dev employee safety info adds
	 */
	public static List<SezDevEmployeeSafetyInfoAdd> findBygetSezStatusByAppId(
		long sezStatusApplicationId) {

		return getPersistence().findBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Returns a range of all the sez dev employee safety info adds where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevEmployeeSafetyInfoAddModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez dev employee safety info adds
	 * @param end the upper bound of the range of sez dev employee safety info adds (not inclusive)
	 * @return the range of matching sez dev employee safety info adds
	 */
	public static List<SezDevEmployeeSafetyInfoAdd> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end) {

		return getPersistence().findBygetSezStatusByAppId(
			sezStatusApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the sez dev employee safety info adds where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevEmployeeSafetyInfoAddModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez dev employee safety info adds
	 * @param end the upper bound of the range of sez dev employee safety info adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez dev employee safety info adds
	 */
	public static List<SezDevEmployeeSafetyInfoAdd> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end,
		OrderByComparator<SezDevEmployeeSafetyInfoAdd> orderByComparator) {

		return getPersistence().findBygetSezStatusByAppId(
			sezStatusApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the sez dev employee safety info adds where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevEmployeeSafetyInfoAddModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez dev employee safety info adds
	 * @param end the upper bound of the range of sez dev employee safety info adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez dev employee safety info adds
	 */
	public static List<SezDevEmployeeSafetyInfoAdd> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end,
		OrderByComparator<SezDevEmployeeSafetyInfoAdd> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetSezStatusByAppId(
			sezStatusApplicationId, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first sez dev employee safety info add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez dev employee safety info add
	 * @throws NoSuchSezDevEmployeeSafetyInfoAddException if a matching sez dev employee safety info add could not be found
	 */
	public static SezDevEmployeeSafetyInfoAdd findBygetSezStatusByAppId_First(
			long sezStatusApplicationId,
			OrderByComparator<SezDevEmployeeSafetyInfoAdd> orderByComparator)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezDevEmployeeSafetyInfoAddException {

		return getPersistence().findBygetSezStatusByAppId_First(
			sezStatusApplicationId, orderByComparator);
	}

	/**
	 * Returns the first sez dev employee safety info add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez dev employee safety info add, or <code>null</code> if a matching sez dev employee safety info add could not be found
	 */
	public static SezDevEmployeeSafetyInfoAdd fetchBygetSezStatusByAppId_First(
		long sezStatusApplicationId,
		OrderByComparator<SezDevEmployeeSafetyInfoAdd> orderByComparator) {

		return getPersistence().fetchBygetSezStatusByAppId_First(
			sezStatusApplicationId, orderByComparator);
	}

	/**
	 * Returns the last sez dev employee safety info add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez dev employee safety info add
	 * @throws NoSuchSezDevEmployeeSafetyInfoAddException if a matching sez dev employee safety info add could not be found
	 */
	public static SezDevEmployeeSafetyInfoAdd findBygetSezStatusByAppId_Last(
			long sezStatusApplicationId,
			OrderByComparator<SezDevEmployeeSafetyInfoAdd> orderByComparator)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezDevEmployeeSafetyInfoAddException {

		return getPersistence().findBygetSezStatusByAppId_Last(
			sezStatusApplicationId, orderByComparator);
	}

	/**
	 * Returns the last sez dev employee safety info add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez dev employee safety info add, or <code>null</code> if a matching sez dev employee safety info add could not be found
	 */
	public static SezDevEmployeeSafetyInfoAdd fetchBygetSezStatusByAppId_Last(
		long sezStatusApplicationId,
		OrderByComparator<SezDevEmployeeSafetyInfoAdd> orderByComparator) {

		return getPersistence().fetchBygetSezStatusByAppId_Last(
			sezStatusApplicationId, orderByComparator);
	}

	/**
	 * Returns the sez dev employee safety info adds before and after the current sez dev employee safety info add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezDevEmployeeSafetyInfoAddId the primary key of the current sez dev employee safety info add
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez dev employee safety info add
	 * @throws NoSuchSezDevEmployeeSafetyInfoAddException if a sez dev employee safety info add with the primary key could not be found
	 */
	public static SezDevEmployeeSafetyInfoAdd[]
			findBygetSezStatusByAppId_PrevAndNext(
				long sezDevEmployeeSafetyInfoAddId, long sezStatusApplicationId,
				OrderByComparator<SezDevEmployeeSafetyInfoAdd>
					orderByComparator)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezDevEmployeeSafetyInfoAddException {

		return getPersistence().findBygetSezStatusByAppId_PrevAndNext(
			sezDevEmployeeSafetyInfoAddId, sezStatusApplicationId,
			orderByComparator);
	}

	/**
	 * Removes all the sez dev employee safety info adds where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 */
	public static void removeBygetSezStatusByAppId(
		long sezStatusApplicationId) {

		getPersistence().removeBygetSezStatusByAppId(sezStatusApplicationId);
	}

	/**
	 * Returns the number of sez dev employee safety info adds where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez dev employee safety info adds
	 */
	public static int countBygetSezStatusByAppId(long sezStatusApplicationId) {
		return getPersistence().countBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Caches the sez dev employee safety info add in the entity cache if it is enabled.
	 *
	 * @param sezDevEmployeeSafetyInfoAdd the sez dev employee safety info add
	 */
	public static void cacheResult(
		SezDevEmployeeSafetyInfoAdd sezDevEmployeeSafetyInfoAdd) {

		getPersistence().cacheResult(sezDevEmployeeSafetyInfoAdd);
	}

	/**
	 * Caches the sez dev employee safety info adds in the entity cache if it is enabled.
	 *
	 * @param sezDevEmployeeSafetyInfoAdds the sez dev employee safety info adds
	 */
	public static void cacheResult(
		List<SezDevEmployeeSafetyInfoAdd> sezDevEmployeeSafetyInfoAdds) {

		getPersistence().cacheResult(sezDevEmployeeSafetyInfoAdds);
	}

	/**
	 * Creates a new sez dev employee safety info add with the primary key. Does not add the sez dev employee safety info add to the database.
	 *
	 * @param sezDevEmployeeSafetyInfoAddId the primary key for the new sez dev employee safety info add
	 * @return the new sez dev employee safety info add
	 */
	public static SezDevEmployeeSafetyInfoAdd create(
		long sezDevEmployeeSafetyInfoAddId) {

		return getPersistence().create(sezDevEmployeeSafetyInfoAddId);
	}

	/**
	 * Removes the sez dev employee safety info add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezDevEmployeeSafetyInfoAddId the primary key of the sez dev employee safety info add
	 * @return the sez dev employee safety info add that was removed
	 * @throws NoSuchSezDevEmployeeSafetyInfoAddException if a sez dev employee safety info add with the primary key could not be found
	 */
	public static SezDevEmployeeSafetyInfoAdd remove(
			long sezDevEmployeeSafetyInfoAddId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezDevEmployeeSafetyInfoAddException {

		return getPersistence().remove(sezDevEmployeeSafetyInfoAddId);
	}

	public static SezDevEmployeeSafetyInfoAdd updateImpl(
		SezDevEmployeeSafetyInfoAdd sezDevEmployeeSafetyInfoAdd) {

		return getPersistence().updateImpl(sezDevEmployeeSafetyInfoAdd);
	}

	/**
	 * Returns the sez dev employee safety info add with the primary key or throws a <code>NoSuchSezDevEmployeeSafetyInfoAddException</code> if it could not be found.
	 *
	 * @param sezDevEmployeeSafetyInfoAddId the primary key of the sez dev employee safety info add
	 * @return the sez dev employee safety info add
	 * @throws NoSuchSezDevEmployeeSafetyInfoAddException if a sez dev employee safety info add with the primary key could not be found
	 */
	public static SezDevEmployeeSafetyInfoAdd findByPrimaryKey(
			long sezDevEmployeeSafetyInfoAddId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezDevEmployeeSafetyInfoAddException {

		return getPersistence().findByPrimaryKey(sezDevEmployeeSafetyInfoAddId);
	}

	/**
	 * Returns the sez dev employee safety info add with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezDevEmployeeSafetyInfoAddId the primary key of the sez dev employee safety info add
	 * @return the sez dev employee safety info add, or <code>null</code> if a sez dev employee safety info add with the primary key could not be found
	 */
	public static SezDevEmployeeSafetyInfoAdd fetchByPrimaryKey(
		long sezDevEmployeeSafetyInfoAddId) {

		return getPersistence().fetchByPrimaryKey(
			sezDevEmployeeSafetyInfoAddId);
	}

	/**
	 * Returns all the sez dev employee safety info adds.
	 *
	 * @return the sez dev employee safety info adds
	 */
	public static List<SezDevEmployeeSafetyInfoAdd> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the sez dev employee safety info adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevEmployeeSafetyInfoAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev employee safety info adds
	 * @param end the upper bound of the range of sez dev employee safety info adds (not inclusive)
	 * @return the range of sez dev employee safety info adds
	 */
	public static List<SezDevEmployeeSafetyInfoAdd> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the sez dev employee safety info adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevEmployeeSafetyInfoAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev employee safety info adds
	 * @param end the upper bound of the range of sez dev employee safety info adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez dev employee safety info adds
	 */
	public static List<SezDevEmployeeSafetyInfoAdd> findAll(
		int start, int end,
		OrderByComparator<SezDevEmployeeSafetyInfoAdd> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the sez dev employee safety info adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevEmployeeSafetyInfoAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev employee safety info adds
	 * @param end the upper bound of the range of sez dev employee safety info adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez dev employee safety info adds
	 */
	public static List<SezDevEmployeeSafetyInfoAdd> findAll(
		int start, int end,
		OrderByComparator<SezDevEmployeeSafetyInfoAdd> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the sez dev employee safety info adds from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of sez dev employee safety info adds.
	 *
	 * @return the number of sez dev employee safety info adds
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static SezDevEmployeeSafetyInfoAddPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		SezDevEmployeeSafetyInfoAddPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile SezDevEmployeeSafetyInfoAddPersistence _persistence;

}