/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.sez.status.application.form.service.model.SezDevEmployeeDefineOccuAdd;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the sez dev employee define occu add service. This utility wraps <code>com.nbp.sez.status.application.form.service.service.persistence.impl.SezDevEmployeeDefineOccuAddPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezDevEmployeeDefineOccuAddPersistence
 * @generated
 */
public class SezDevEmployeeDefineOccuAddUtil {

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
		SezDevEmployeeDefineOccuAdd sezDevEmployeeDefineOccuAdd) {

		getPersistence().clearCache(sezDevEmployeeDefineOccuAdd);
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
	public static Map<Serializable, SezDevEmployeeDefineOccuAdd>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<SezDevEmployeeDefineOccuAdd> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<SezDevEmployeeDefineOccuAdd> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<SezDevEmployeeDefineOccuAdd> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<SezDevEmployeeDefineOccuAdd> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static SezDevEmployeeDefineOccuAdd update(
		SezDevEmployeeDefineOccuAdd sezDevEmployeeDefineOccuAdd) {

		return getPersistence().update(sezDevEmployeeDefineOccuAdd);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static SezDevEmployeeDefineOccuAdd update(
		SezDevEmployeeDefineOccuAdd sezDevEmployeeDefineOccuAdd,
		ServiceContext serviceContext) {

		return getPersistence().update(
			sezDevEmployeeDefineOccuAdd, serviceContext);
	}

	/**
	 * Returns all the sez dev employee define occu adds where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez dev employee define occu adds
	 */
	public static List<SezDevEmployeeDefineOccuAdd> findBygetSezStatusByAppId(
		long sezStatusApplicationId) {

		return getPersistence().findBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Returns a range of all the sez dev employee define occu adds where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevEmployeeDefineOccuAddModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez dev employee define occu adds
	 * @param end the upper bound of the range of sez dev employee define occu adds (not inclusive)
	 * @return the range of matching sez dev employee define occu adds
	 */
	public static List<SezDevEmployeeDefineOccuAdd> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end) {

		return getPersistence().findBygetSezStatusByAppId(
			sezStatusApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the sez dev employee define occu adds where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevEmployeeDefineOccuAddModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez dev employee define occu adds
	 * @param end the upper bound of the range of sez dev employee define occu adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez dev employee define occu adds
	 */
	public static List<SezDevEmployeeDefineOccuAdd> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end,
		OrderByComparator<SezDevEmployeeDefineOccuAdd> orderByComparator) {

		return getPersistence().findBygetSezStatusByAppId(
			sezStatusApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the sez dev employee define occu adds where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevEmployeeDefineOccuAddModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez dev employee define occu adds
	 * @param end the upper bound of the range of sez dev employee define occu adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez dev employee define occu adds
	 */
	public static List<SezDevEmployeeDefineOccuAdd> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end,
		OrderByComparator<SezDevEmployeeDefineOccuAdd> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetSezStatusByAppId(
			sezStatusApplicationId, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first sez dev employee define occu add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez dev employee define occu add
	 * @throws NoSuchSezDevEmployeeDefineOccuAddException if a matching sez dev employee define occu add could not be found
	 */
	public static SezDevEmployeeDefineOccuAdd findBygetSezStatusByAppId_First(
			long sezStatusApplicationId,
			OrderByComparator<SezDevEmployeeDefineOccuAdd> orderByComparator)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezDevEmployeeDefineOccuAddException {

		return getPersistence().findBygetSezStatusByAppId_First(
			sezStatusApplicationId, orderByComparator);
	}

	/**
	 * Returns the first sez dev employee define occu add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez dev employee define occu add, or <code>null</code> if a matching sez dev employee define occu add could not be found
	 */
	public static SezDevEmployeeDefineOccuAdd fetchBygetSezStatusByAppId_First(
		long sezStatusApplicationId,
		OrderByComparator<SezDevEmployeeDefineOccuAdd> orderByComparator) {

		return getPersistence().fetchBygetSezStatusByAppId_First(
			sezStatusApplicationId, orderByComparator);
	}

	/**
	 * Returns the last sez dev employee define occu add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez dev employee define occu add
	 * @throws NoSuchSezDevEmployeeDefineOccuAddException if a matching sez dev employee define occu add could not be found
	 */
	public static SezDevEmployeeDefineOccuAdd findBygetSezStatusByAppId_Last(
			long sezStatusApplicationId,
			OrderByComparator<SezDevEmployeeDefineOccuAdd> orderByComparator)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezDevEmployeeDefineOccuAddException {

		return getPersistence().findBygetSezStatusByAppId_Last(
			sezStatusApplicationId, orderByComparator);
	}

	/**
	 * Returns the last sez dev employee define occu add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez dev employee define occu add, or <code>null</code> if a matching sez dev employee define occu add could not be found
	 */
	public static SezDevEmployeeDefineOccuAdd fetchBygetSezStatusByAppId_Last(
		long sezStatusApplicationId,
		OrderByComparator<SezDevEmployeeDefineOccuAdd> orderByComparator) {

		return getPersistence().fetchBygetSezStatusByAppId_Last(
			sezStatusApplicationId, orderByComparator);
	}

	/**
	 * Returns the sez dev employee define occu adds before and after the current sez dev employee define occu add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezDevEmployeeDefineOccuAddId the primary key of the current sez dev employee define occu add
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez dev employee define occu add
	 * @throws NoSuchSezDevEmployeeDefineOccuAddException if a sez dev employee define occu add with the primary key could not be found
	 */
	public static SezDevEmployeeDefineOccuAdd[]
			findBygetSezStatusByAppId_PrevAndNext(
				long sezDevEmployeeDefineOccuAddId, long sezStatusApplicationId,
				OrderByComparator<SezDevEmployeeDefineOccuAdd>
					orderByComparator)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezDevEmployeeDefineOccuAddException {

		return getPersistence().findBygetSezStatusByAppId_PrevAndNext(
			sezDevEmployeeDefineOccuAddId, sezStatusApplicationId,
			orderByComparator);
	}

	/**
	 * Removes all the sez dev employee define occu adds where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 */
	public static void removeBygetSezStatusByAppId(
		long sezStatusApplicationId) {

		getPersistence().removeBygetSezStatusByAppId(sezStatusApplicationId);
	}

	/**
	 * Returns the number of sez dev employee define occu adds where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez dev employee define occu adds
	 */
	public static int countBygetSezStatusByAppId(long sezStatusApplicationId) {
		return getPersistence().countBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Caches the sez dev employee define occu add in the entity cache if it is enabled.
	 *
	 * @param sezDevEmployeeDefineOccuAdd the sez dev employee define occu add
	 */
	public static void cacheResult(
		SezDevEmployeeDefineOccuAdd sezDevEmployeeDefineOccuAdd) {

		getPersistence().cacheResult(sezDevEmployeeDefineOccuAdd);
	}

	/**
	 * Caches the sez dev employee define occu adds in the entity cache if it is enabled.
	 *
	 * @param sezDevEmployeeDefineOccuAdds the sez dev employee define occu adds
	 */
	public static void cacheResult(
		List<SezDevEmployeeDefineOccuAdd> sezDevEmployeeDefineOccuAdds) {

		getPersistence().cacheResult(sezDevEmployeeDefineOccuAdds);
	}

	/**
	 * Creates a new sez dev employee define occu add with the primary key. Does not add the sez dev employee define occu add to the database.
	 *
	 * @param sezDevEmployeeDefineOccuAddId the primary key for the new sez dev employee define occu add
	 * @return the new sez dev employee define occu add
	 */
	public static SezDevEmployeeDefineOccuAdd create(
		long sezDevEmployeeDefineOccuAddId) {

		return getPersistence().create(sezDevEmployeeDefineOccuAddId);
	}

	/**
	 * Removes the sez dev employee define occu add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezDevEmployeeDefineOccuAddId the primary key of the sez dev employee define occu add
	 * @return the sez dev employee define occu add that was removed
	 * @throws NoSuchSezDevEmployeeDefineOccuAddException if a sez dev employee define occu add with the primary key could not be found
	 */
	public static SezDevEmployeeDefineOccuAdd remove(
			long sezDevEmployeeDefineOccuAddId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezDevEmployeeDefineOccuAddException {

		return getPersistence().remove(sezDevEmployeeDefineOccuAddId);
	}

	public static SezDevEmployeeDefineOccuAdd updateImpl(
		SezDevEmployeeDefineOccuAdd sezDevEmployeeDefineOccuAdd) {

		return getPersistence().updateImpl(sezDevEmployeeDefineOccuAdd);
	}

	/**
	 * Returns the sez dev employee define occu add with the primary key or throws a <code>NoSuchSezDevEmployeeDefineOccuAddException</code> if it could not be found.
	 *
	 * @param sezDevEmployeeDefineOccuAddId the primary key of the sez dev employee define occu add
	 * @return the sez dev employee define occu add
	 * @throws NoSuchSezDevEmployeeDefineOccuAddException if a sez dev employee define occu add with the primary key could not be found
	 */
	public static SezDevEmployeeDefineOccuAdd findByPrimaryKey(
			long sezDevEmployeeDefineOccuAddId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezDevEmployeeDefineOccuAddException {

		return getPersistence().findByPrimaryKey(sezDevEmployeeDefineOccuAddId);
	}

	/**
	 * Returns the sez dev employee define occu add with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezDevEmployeeDefineOccuAddId the primary key of the sez dev employee define occu add
	 * @return the sez dev employee define occu add, or <code>null</code> if a sez dev employee define occu add with the primary key could not be found
	 */
	public static SezDevEmployeeDefineOccuAdd fetchByPrimaryKey(
		long sezDevEmployeeDefineOccuAddId) {

		return getPersistence().fetchByPrimaryKey(
			sezDevEmployeeDefineOccuAddId);
	}

	/**
	 * Returns all the sez dev employee define occu adds.
	 *
	 * @return the sez dev employee define occu adds
	 */
	public static List<SezDevEmployeeDefineOccuAdd> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the sez dev employee define occu adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevEmployeeDefineOccuAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev employee define occu adds
	 * @param end the upper bound of the range of sez dev employee define occu adds (not inclusive)
	 * @return the range of sez dev employee define occu adds
	 */
	public static List<SezDevEmployeeDefineOccuAdd> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the sez dev employee define occu adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevEmployeeDefineOccuAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev employee define occu adds
	 * @param end the upper bound of the range of sez dev employee define occu adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez dev employee define occu adds
	 */
	public static List<SezDevEmployeeDefineOccuAdd> findAll(
		int start, int end,
		OrderByComparator<SezDevEmployeeDefineOccuAdd> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the sez dev employee define occu adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevEmployeeDefineOccuAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev employee define occu adds
	 * @param end the upper bound of the range of sez dev employee define occu adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez dev employee define occu adds
	 */
	public static List<SezDevEmployeeDefineOccuAdd> findAll(
		int start, int end,
		OrderByComparator<SezDevEmployeeDefineOccuAdd> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the sez dev employee define occu adds from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of sez dev employee define occu adds.
	 *
	 * @return the number of sez dev employee define occu adds
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static SezDevEmployeeDefineOccuAddPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		SezDevEmployeeDefineOccuAddPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile SezDevEmployeeDefineOccuAddPersistence _persistence;

}