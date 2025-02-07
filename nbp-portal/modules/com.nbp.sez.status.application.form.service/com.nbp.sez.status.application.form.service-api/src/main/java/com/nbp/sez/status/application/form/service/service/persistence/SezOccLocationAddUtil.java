/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.sez.status.application.form.service.model.SezOccLocationAdd;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the sez occ location add service. This utility wraps <code>com.nbp.sez.status.application.form.service.service.persistence.impl.SezOccLocationAddPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezOccLocationAddPersistence
 * @generated
 */
public class SezOccLocationAddUtil {

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
	public static void clearCache(SezOccLocationAdd sezOccLocationAdd) {
		getPersistence().clearCache(sezOccLocationAdd);
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
	public static Map<Serializable, SezOccLocationAdd> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<SezOccLocationAdd> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<SezOccLocationAdd> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<SezOccLocationAdd> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<SezOccLocationAdd> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static SezOccLocationAdd update(
		SezOccLocationAdd sezOccLocationAdd) {

		return getPersistence().update(sezOccLocationAdd);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static SezOccLocationAdd update(
		SezOccLocationAdd sezOccLocationAdd, ServiceContext serviceContext) {

		return getPersistence().update(sezOccLocationAdd, serviceContext);
	}

	/**
	 * Returns all the sez occ location adds where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez occ location adds
	 */
	public static List<SezOccLocationAdd> findBygetSezStatusByAppId(
		long sezStatusApplicationId) {

		return getPersistence().findBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Returns a range of all the sez occ location adds where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccLocationAddModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez occ location adds
	 * @param end the upper bound of the range of sez occ location adds (not inclusive)
	 * @return the range of matching sez occ location adds
	 */
	public static List<SezOccLocationAdd> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end) {

		return getPersistence().findBygetSezStatusByAppId(
			sezStatusApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the sez occ location adds where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccLocationAddModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez occ location adds
	 * @param end the upper bound of the range of sez occ location adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez occ location adds
	 */
	public static List<SezOccLocationAdd> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end,
		OrderByComparator<SezOccLocationAdd> orderByComparator) {

		return getPersistence().findBygetSezStatusByAppId(
			sezStatusApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the sez occ location adds where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccLocationAddModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez occ location adds
	 * @param end the upper bound of the range of sez occ location adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez occ location adds
	 */
	public static List<SezOccLocationAdd> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end,
		OrderByComparator<SezOccLocationAdd> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetSezStatusByAppId(
			sezStatusApplicationId, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first sez occ location add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez occ location add
	 * @throws NoSuchSezOccLocationAddException if a matching sez occ location add could not be found
	 */
	public static SezOccLocationAdd findBygetSezStatusByAppId_First(
			long sezStatusApplicationId,
			OrderByComparator<SezOccLocationAdd> orderByComparator)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezOccLocationAddException {

		return getPersistence().findBygetSezStatusByAppId_First(
			sezStatusApplicationId, orderByComparator);
	}

	/**
	 * Returns the first sez occ location add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez occ location add, or <code>null</code> if a matching sez occ location add could not be found
	 */
	public static SezOccLocationAdd fetchBygetSezStatusByAppId_First(
		long sezStatusApplicationId,
		OrderByComparator<SezOccLocationAdd> orderByComparator) {

		return getPersistence().fetchBygetSezStatusByAppId_First(
			sezStatusApplicationId, orderByComparator);
	}

	/**
	 * Returns the last sez occ location add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez occ location add
	 * @throws NoSuchSezOccLocationAddException if a matching sez occ location add could not be found
	 */
	public static SezOccLocationAdd findBygetSezStatusByAppId_Last(
			long sezStatusApplicationId,
			OrderByComparator<SezOccLocationAdd> orderByComparator)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezOccLocationAddException {

		return getPersistence().findBygetSezStatusByAppId_Last(
			sezStatusApplicationId, orderByComparator);
	}

	/**
	 * Returns the last sez occ location add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez occ location add, or <code>null</code> if a matching sez occ location add could not be found
	 */
	public static SezOccLocationAdd fetchBygetSezStatusByAppId_Last(
		long sezStatusApplicationId,
		OrderByComparator<SezOccLocationAdd> orderByComparator) {

		return getPersistence().fetchBygetSezStatusByAppId_Last(
			sezStatusApplicationId, orderByComparator);
	}

	/**
	 * Returns the sez occ location adds before and after the current sez occ location add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezOccLocationAddId the primary key of the current sez occ location add
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez occ location add
	 * @throws NoSuchSezOccLocationAddException if a sez occ location add with the primary key could not be found
	 */
	public static SezOccLocationAdd[] findBygetSezStatusByAppId_PrevAndNext(
			long sezOccLocationAddId, long sezStatusApplicationId,
			OrderByComparator<SezOccLocationAdd> orderByComparator)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezOccLocationAddException {

		return getPersistence().findBygetSezStatusByAppId_PrevAndNext(
			sezOccLocationAddId, sezStatusApplicationId, orderByComparator);
	}

	/**
	 * Removes all the sez occ location adds where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 */
	public static void removeBygetSezStatusByAppId(
		long sezStatusApplicationId) {

		getPersistence().removeBygetSezStatusByAppId(sezStatusApplicationId);
	}

	/**
	 * Returns the number of sez occ location adds where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez occ location adds
	 */
	public static int countBygetSezStatusByAppId(long sezStatusApplicationId) {
		return getPersistence().countBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Caches the sez occ location add in the entity cache if it is enabled.
	 *
	 * @param sezOccLocationAdd the sez occ location add
	 */
	public static void cacheResult(SezOccLocationAdd sezOccLocationAdd) {
		getPersistence().cacheResult(sezOccLocationAdd);
	}

	/**
	 * Caches the sez occ location adds in the entity cache if it is enabled.
	 *
	 * @param sezOccLocationAdds the sez occ location adds
	 */
	public static void cacheResult(List<SezOccLocationAdd> sezOccLocationAdds) {
		getPersistence().cacheResult(sezOccLocationAdds);
	}

	/**
	 * Creates a new sez occ location add with the primary key. Does not add the sez occ location add to the database.
	 *
	 * @param sezOccLocationAddId the primary key for the new sez occ location add
	 * @return the new sez occ location add
	 */
	public static SezOccLocationAdd create(long sezOccLocationAddId) {
		return getPersistence().create(sezOccLocationAddId);
	}

	/**
	 * Removes the sez occ location add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezOccLocationAddId the primary key of the sez occ location add
	 * @return the sez occ location add that was removed
	 * @throws NoSuchSezOccLocationAddException if a sez occ location add with the primary key could not be found
	 */
	public static SezOccLocationAdd remove(long sezOccLocationAddId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezOccLocationAddException {

		return getPersistence().remove(sezOccLocationAddId);
	}

	public static SezOccLocationAdd updateImpl(
		SezOccLocationAdd sezOccLocationAdd) {

		return getPersistence().updateImpl(sezOccLocationAdd);
	}

	/**
	 * Returns the sez occ location add with the primary key or throws a <code>NoSuchSezOccLocationAddException</code> if it could not be found.
	 *
	 * @param sezOccLocationAddId the primary key of the sez occ location add
	 * @return the sez occ location add
	 * @throws NoSuchSezOccLocationAddException if a sez occ location add with the primary key could not be found
	 */
	public static SezOccLocationAdd findByPrimaryKey(long sezOccLocationAddId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezOccLocationAddException {

		return getPersistence().findByPrimaryKey(sezOccLocationAddId);
	}

	/**
	 * Returns the sez occ location add with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezOccLocationAddId the primary key of the sez occ location add
	 * @return the sez occ location add, or <code>null</code> if a sez occ location add with the primary key could not be found
	 */
	public static SezOccLocationAdd fetchByPrimaryKey(
		long sezOccLocationAddId) {

		return getPersistence().fetchByPrimaryKey(sezOccLocationAddId);
	}

	/**
	 * Returns all the sez occ location adds.
	 *
	 * @return the sez occ location adds
	 */
	public static List<SezOccLocationAdd> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the sez occ location adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccLocationAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occ location adds
	 * @param end the upper bound of the range of sez occ location adds (not inclusive)
	 * @return the range of sez occ location adds
	 */
	public static List<SezOccLocationAdd> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the sez occ location adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccLocationAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occ location adds
	 * @param end the upper bound of the range of sez occ location adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez occ location adds
	 */
	public static List<SezOccLocationAdd> findAll(
		int start, int end,
		OrderByComparator<SezOccLocationAdd> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the sez occ location adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccLocationAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occ location adds
	 * @param end the upper bound of the range of sez occ location adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez occ location adds
	 */
	public static List<SezOccLocationAdd> findAll(
		int start, int end,
		OrderByComparator<SezOccLocationAdd> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the sez occ location adds from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of sez occ location adds.
	 *
	 * @return the number of sez occ location adds
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static SezOccLocationAddPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		SezOccLocationAddPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile SezOccLocationAddPersistence _persistence;

}