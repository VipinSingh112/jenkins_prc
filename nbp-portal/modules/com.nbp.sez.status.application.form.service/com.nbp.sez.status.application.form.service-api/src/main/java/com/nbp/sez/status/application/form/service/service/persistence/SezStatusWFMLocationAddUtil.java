/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.sez.status.application.form.service.model.SezStatusWFMLocationAdd;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the sez status wfm location add service. This utility wraps <code>com.nbp.sez.status.application.form.service.service.persistence.impl.SezStatusWFMLocationAddPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezStatusWFMLocationAddPersistence
 * @generated
 */
public class SezStatusWFMLocationAddUtil {

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
		SezStatusWFMLocationAdd sezStatusWFMLocationAdd) {

		getPersistence().clearCache(sezStatusWFMLocationAdd);
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
	public static Map<Serializable, SezStatusWFMLocationAdd> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<SezStatusWFMLocationAdd> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<SezStatusWFMLocationAdd> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<SezStatusWFMLocationAdd> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<SezStatusWFMLocationAdd> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static SezStatusWFMLocationAdd update(
		SezStatusWFMLocationAdd sezStatusWFMLocationAdd) {

		return getPersistence().update(sezStatusWFMLocationAdd);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static SezStatusWFMLocationAdd update(
		SezStatusWFMLocationAdd sezStatusWFMLocationAdd,
		ServiceContext serviceContext) {

		return getPersistence().update(sezStatusWFMLocationAdd, serviceContext);
	}

	/**
	 * Returns the sez status wfm location add where sezStatusApplicationId = &#63; or throws a <code>NoSuchSezStatusWFMLocationAddException</code> if it could not be found.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez status wfm location add
	 * @throws NoSuchSezStatusWFMLocationAddException if a matching sez status wfm location add could not be found
	 */
	public static SezStatusWFMLocationAdd findBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezStatusWFMLocationAddException {

		return getPersistence().findBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Returns the sez status wfm location add where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez status wfm location add, or <code>null</code> if a matching sez status wfm location add could not be found
	 */
	public static SezStatusWFMLocationAdd fetchBygetSezStatusByAppId(
		long sezStatusApplicationId) {

		return getPersistence().fetchBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Returns the sez status wfm location add where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez status wfm location add, or <code>null</code> if a matching sez status wfm location add could not be found
	 */
	public static SezStatusWFMLocationAdd fetchBygetSezStatusByAppId(
		long sezStatusApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetSezStatusByAppId(
			sezStatusApplicationId, useFinderCache);
	}

	/**
	 * Removes the sez status wfm location add where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the sez status wfm location add that was removed
	 */
	public static SezStatusWFMLocationAdd removeBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezStatusWFMLocationAddException {

		return getPersistence().removeBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Returns the number of sez status wfm location adds where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez status wfm location adds
	 */
	public static int countBygetSezStatusByAppId(long sezStatusApplicationId) {
		return getPersistence().countBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Returns all the sez status wfm location adds where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez status wfm location adds
	 */
	public static List<SezStatusWFMLocationAdd> findBygetSezStatusListByAppId(
		long sezStatusApplicationId) {

		return getPersistence().findBygetSezStatusListByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Returns a range of all the sez status wfm location adds where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusWFMLocationAddModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez status wfm location adds
	 * @param end the upper bound of the range of sez status wfm location adds (not inclusive)
	 * @return the range of matching sez status wfm location adds
	 */
	public static List<SezStatusWFMLocationAdd> findBygetSezStatusListByAppId(
		long sezStatusApplicationId, int start, int end) {

		return getPersistence().findBygetSezStatusListByAppId(
			sezStatusApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the sez status wfm location adds where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusWFMLocationAddModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez status wfm location adds
	 * @param end the upper bound of the range of sez status wfm location adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez status wfm location adds
	 */
	public static List<SezStatusWFMLocationAdd> findBygetSezStatusListByAppId(
		long sezStatusApplicationId, int start, int end,
		OrderByComparator<SezStatusWFMLocationAdd> orderByComparator) {

		return getPersistence().findBygetSezStatusListByAppId(
			sezStatusApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the sez status wfm location adds where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusWFMLocationAddModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez status wfm location adds
	 * @param end the upper bound of the range of sez status wfm location adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez status wfm location adds
	 */
	public static List<SezStatusWFMLocationAdd> findBygetSezStatusListByAppId(
		long sezStatusApplicationId, int start, int end,
		OrderByComparator<SezStatusWFMLocationAdd> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetSezStatusListByAppId(
			sezStatusApplicationId, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first sez status wfm location add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status wfm location add
	 * @throws NoSuchSezStatusWFMLocationAddException if a matching sez status wfm location add could not be found
	 */
	public static SezStatusWFMLocationAdd findBygetSezStatusListByAppId_First(
			long sezStatusApplicationId,
			OrderByComparator<SezStatusWFMLocationAdd> orderByComparator)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezStatusWFMLocationAddException {

		return getPersistence().findBygetSezStatusListByAppId_First(
			sezStatusApplicationId, orderByComparator);
	}

	/**
	 * Returns the first sez status wfm location add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status wfm location add, or <code>null</code> if a matching sez status wfm location add could not be found
	 */
	public static SezStatusWFMLocationAdd fetchBygetSezStatusListByAppId_First(
		long sezStatusApplicationId,
		OrderByComparator<SezStatusWFMLocationAdd> orderByComparator) {

		return getPersistence().fetchBygetSezStatusListByAppId_First(
			sezStatusApplicationId, orderByComparator);
	}

	/**
	 * Returns the last sez status wfm location add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status wfm location add
	 * @throws NoSuchSezStatusWFMLocationAddException if a matching sez status wfm location add could not be found
	 */
	public static SezStatusWFMLocationAdd findBygetSezStatusListByAppId_Last(
			long sezStatusApplicationId,
			OrderByComparator<SezStatusWFMLocationAdd> orderByComparator)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezStatusWFMLocationAddException {

		return getPersistence().findBygetSezStatusListByAppId_Last(
			sezStatusApplicationId, orderByComparator);
	}

	/**
	 * Returns the last sez status wfm location add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status wfm location add, or <code>null</code> if a matching sez status wfm location add could not be found
	 */
	public static SezStatusWFMLocationAdd fetchBygetSezStatusListByAppId_Last(
		long sezStatusApplicationId,
		OrderByComparator<SezStatusWFMLocationAdd> orderByComparator) {

		return getPersistence().fetchBygetSezStatusListByAppId_Last(
			sezStatusApplicationId, orderByComparator);
	}

	/**
	 * Returns the sez status wfm location adds before and after the current sez status wfm location add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusWFHLocId the primary key of the current sez status wfm location add
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez status wfm location add
	 * @throws NoSuchSezStatusWFMLocationAddException if a sez status wfm location add with the primary key could not be found
	 */
	public static SezStatusWFMLocationAdd[]
			findBygetSezStatusListByAppId_PrevAndNext(
				long sezStatusWFHLocId, long sezStatusApplicationId,
				OrderByComparator<SezStatusWFMLocationAdd> orderByComparator)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezStatusWFMLocationAddException {

		return getPersistence().findBygetSezStatusListByAppId_PrevAndNext(
			sezStatusWFHLocId, sezStatusApplicationId, orderByComparator);
	}

	/**
	 * Removes all the sez status wfm location adds where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 */
	public static void removeBygetSezStatusListByAppId(
		long sezStatusApplicationId) {

		getPersistence().removeBygetSezStatusListByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Returns the number of sez status wfm location adds where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez status wfm location adds
	 */
	public static int countBygetSezStatusListByAppId(
		long sezStatusApplicationId) {

		return getPersistence().countBygetSezStatusListByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Caches the sez status wfm location add in the entity cache if it is enabled.
	 *
	 * @param sezStatusWFMLocationAdd the sez status wfm location add
	 */
	public static void cacheResult(
		SezStatusWFMLocationAdd sezStatusWFMLocationAdd) {

		getPersistence().cacheResult(sezStatusWFMLocationAdd);
	}

	/**
	 * Caches the sez status wfm location adds in the entity cache if it is enabled.
	 *
	 * @param sezStatusWFMLocationAdds the sez status wfm location adds
	 */
	public static void cacheResult(
		List<SezStatusWFMLocationAdd> sezStatusWFMLocationAdds) {

		getPersistence().cacheResult(sezStatusWFMLocationAdds);
	}

	/**
	 * Creates a new sez status wfm location add with the primary key. Does not add the sez status wfm location add to the database.
	 *
	 * @param sezStatusWFHLocId the primary key for the new sez status wfm location add
	 * @return the new sez status wfm location add
	 */
	public static SezStatusWFMLocationAdd create(long sezStatusWFHLocId) {
		return getPersistence().create(sezStatusWFHLocId);
	}

	/**
	 * Removes the sez status wfm location add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezStatusWFHLocId the primary key of the sez status wfm location add
	 * @return the sez status wfm location add that was removed
	 * @throws NoSuchSezStatusWFMLocationAddException if a sez status wfm location add with the primary key could not be found
	 */
	public static SezStatusWFMLocationAdd remove(long sezStatusWFHLocId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezStatusWFMLocationAddException {

		return getPersistence().remove(sezStatusWFHLocId);
	}

	public static SezStatusWFMLocationAdd updateImpl(
		SezStatusWFMLocationAdd sezStatusWFMLocationAdd) {

		return getPersistence().updateImpl(sezStatusWFMLocationAdd);
	}

	/**
	 * Returns the sez status wfm location add with the primary key or throws a <code>NoSuchSezStatusWFMLocationAddException</code> if it could not be found.
	 *
	 * @param sezStatusWFHLocId the primary key of the sez status wfm location add
	 * @return the sez status wfm location add
	 * @throws NoSuchSezStatusWFMLocationAddException if a sez status wfm location add with the primary key could not be found
	 */
	public static SezStatusWFMLocationAdd findByPrimaryKey(
			long sezStatusWFHLocId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezStatusWFMLocationAddException {

		return getPersistence().findByPrimaryKey(sezStatusWFHLocId);
	}

	/**
	 * Returns the sez status wfm location add with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezStatusWFHLocId the primary key of the sez status wfm location add
	 * @return the sez status wfm location add, or <code>null</code> if a sez status wfm location add with the primary key could not be found
	 */
	public static SezStatusWFMLocationAdd fetchByPrimaryKey(
		long sezStatusWFHLocId) {

		return getPersistence().fetchByPrimaryKey(sezStatusWFHLocId);
	}

	/**
	 * Returns all the sez status wfm location adds.
	 *
	 * @return the sez status wfm location adds
	 */
	public static List<SezStatusWFMLocationAdd> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the sez status wfm location adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusWFMLocationAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status wfm location adds
	 * @param end the upper bound of the range of sez status wfm location adds (not inclusive)
	 * @return the range of sez status wfm location adds
	 */
	public static List<SezStatusWFMLocationAdd> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the sez status wfm location adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusWFMLocationAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status wfm location adds
	 * @param end the upper bound of the range of sez status wfm location adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez status wfm location adds
	 */
	public static List<SezStatusWFMLocationAdd> findAll(
		int start, int end,
		OrderByComparator<SezStatusWFMLocationAdd> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the sez status wfm location adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusWFMLocationAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status wfm location adds
	 * @param end the upper bound of the range of sez status wfm location adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez status wfm location adds
	 */
	public static List<SezStatusWFMLocationAdd> findAll(
		int start, int end,
		OrderByComparator<SezStatusWFMLocationAdd> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the sez status wfm location adds from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of sez status wfm location adds.
	 *
	 * @return the number of sez status wfm location adds
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static SezStatusWFMLocationAddPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		SezStatusWFMLocationAddPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile SezStatusWFMLocationAddPersistence _persistence;

}