/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.sez.status.application.form.service.model.SezDevSharePleaseStateAdd;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the sez dev share please state add service. This utility wraps <code>com.nbp.sez.status.application.form.service.service.persistence.impl.SezDevSharePleaseStateAddPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezDevSharePleaseStateAddPersistence
 * @generated
 */
public class SezDevSharePleaseStateAddUtil {

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
		SezDevSharePleaseStateAdd sezDevSharePleaseStateAdd) {

		getPersistence().clearCache(sezDevSharePleaseStateAdd);
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
	public static Map<Serializable, SezDevSharePleaseStateAdd>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<SezDevSharePleaseStateAdd> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<SezDevSharePleaseStateAdd> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<SezDevSharePleaseStateAdd> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<SezDevSharePleaseStateAdd> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static SezDevSharePleaseStateAdd update(
		SezDevSharePleaseStateAdd sezDevSharePleaseStateAdd) {

		return getPersistence().update(sezDevSharePleaseStateAdd);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static SezDevSharePleaseStateAdd update(
		SezDevSharePleaseStateAdd sezDevSharePleaseStateAdd,
		ServiceContext serviceContext) {

		return getPersistence().update(
			sezDevSharePleaseStateAdd, serviceContext);
	}

	/**
	 * Returns all the sez dev share please state adds where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez dev share please state adds
	 */
	public static List<SezDevSharePleaseStateAdd> findBygetSezStatusByAppId(
		long sezStatusApplicationId) {

		return getPersistence().findBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Returns a range of all the sez dev share please state adds where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevSharePleaseStateAddModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez dev share please state adds
	 * @param end the upper bound of the range of sez dev share please state adds (not inclusive)
	 * @return the range of matching sez dev share please state adds
	 */
	public static List<SezDevSharePleaseStateAdd> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end) {

		return getPersistence().findBygetSezStatusByAppId(
			sezStatusApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the sez dev share please state adds where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevSharePleaseStateAddModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez dev share please state adds
	 * @param end the upper bound of the range of sez dev share please state adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez dev share please state adds
	 */
	public static List<SezDevSharePleaseStateAdd> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end,
		OrderByComparator<SezDevSharePleaseStateAdd> orderByComparator) {

		return getPersistence().findBygetSezStatusByAppId(
			sezStatusApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the sez dev share please state adds where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevSharePleaseStateAddModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez dev share please state adds
	 * @param end the upper bound of the range of sez dev share please state adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez dev share please state adds
	 */
	public static List<SezDevSharePleaseStateAdd> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end,
		OrderByComparator<SezDevSharePleaseStateAdd> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetSezStatusByAppId(
			sezStatusApplicationId, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first sez dev share please state add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez dev share please state add
	 * @throws NoSuchSezDevSharePleaseStateAddException if a matching sez dev share please state add could not be found
	 */
	public static SezDevSharePleaseStateAdd findBygetSezStatusByAppId_First(
			long sezStatusApplicationId,
			OrderByComparator<SezDevSharePleaseStateAdd> orderByComparator)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezDevSharePleaseStateAddException {

		return getPersistence().findBygetSezStatusByAppId_First(
			sezStatusApplicationId, orderByComparator);
	}

	/**
	 * Returns the first sez dev share please state add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez dev share please state add, or <code>null</code> if a matching sez dev share please state add could not be found
	 */
	public static SezDevSharePleaseStateAdd fetchBygetSezStatusByAppId_First(
		long sezStatusApplicationId,
		OrderByComparator<SezDevSharePleaseStateAdd> orderByComparator) {

		return getPersistence().fetchBygetSezStatusByAppId_First(
			sezStatusApplicationId, orderByComparator);
	}

	/**
	 * Returns the last sez dev share please state add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez dev share please state add
	 * @throws NoSuchSezDevSharePleaseStateAddException if a matching sez dev share please state add could not be found
	 */
	public static SezDevSharePleaseStateAdd findBygetSezStatusByAppId_Last(
			long sezStatusApplicationId,
			OrderByComparator<SezDevSharePleaseStateAdd> orderByComparator)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezDevSharePleaseStateAddException {

		return getPersistence().findBygetSezStatusByAppId_Last(
			sezStatusApplicationId, orderByComparator);
	}

	/**
	 * Returns the last sez dev share please state add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez dev share please state add, or <code>null</code> if a matching sez dev share please state add could not be found
	 */
	public static SezDevSharePleaseStateAdd fetchBygetSezStatusByAppId_Last(
		long sezStatusApplicationId,
		OrderByComparator<SezDevSharePleaseStateAdd> orderByComparator) {

		return getPersistence().fetchBygetSezStatusByAppId_Last(
			sezStatusApplicationId, orderByComparator);
	}

	/**
	 * Returns the sez dev share please state adds before and after the current sez dev share please state add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezDevPleaseStateAddId the primary key of the current sez dev share please state add
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez dev share please state add
	 * @throws NoSuchSezDevSharePleaseStateAddException if a sez dev share please state add with the primary key could not be found
	 */
	public static SezDevSharePleaseStateAdd[]
			findBygetSezStatusByAppId_PrevAndNext(
				long sezDevPleaseStateAddId, long sezStatusApplicationId,
				OrderByComparator<SezDevSharePleaseStateAdd> orderByComparator)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezDevSharePleaseStateAddException {

		return getPersistence().findBygetSezStatusByAppId_PrevAndNext(
			sezDevPleaseStateAddId, sezStatusApplicationId, orderByComparator);
	}

	/**
	 * Removes all the sez dev share please state adds where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 */
	public static void removeBygetSezStatusByAppId(
		long sezStatusApplicationId) {

		getPersistence().removeBygetSezStatusByAppId(sezStatusApplicationId);
	}

	/**
	 * Returns the number of sez dev share please state adds where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez dev share please state adds
	 */
	public static int countBygetSezStatusByAppId(long sezStatusApplicationId) {
		return getPersistence().countBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Caches the sez dev share please state add in the entity cache if it is enabled.
	 *
	 * @param sezDevSharePleaseStateAdd the sez dev share please state add
	 */
	public static void cacheResult(
		SezDevSharePleaseStateAdd sezDevSharePleaseStateAdd) {

		getPersistence().cacheResult(sezDevSharePleaseStateAdd);
	}

	/**
	 * Caches the sez dev share please state adds in the entity cache if it is enabled.
	 *
	 * @param sezDevSharePleaseStateAdds the sez dev share please state adds
	 */
	public static void cacheResult(
		List<SezDevSharePleaseStateAdd> sezDevSharePleaseStateAdds) {

		getPersistence().cacheResult(sezDevSharePleaseStateAdds);
	}

	/**
	 * Creates a new sez dev share please state add with the primary key. Does not add the sez dev share please state add to the database.
	 *
	 * @param sezDevPleaseStateAddId the primary key for the new sez dev share please state add
	 * @return the new sez dev share please state add
	 */
	public static SezDevSharePleaseStateAdd create(
		long sezDevPleaseStateAddId) {

		return getPersistence().create(sezDevPleaseStateAddId);
	}

	/**
	 * Removes the sez dev share please state add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezDevPleaseStateAddId the primary key of the sez dev share please state add
	 * @return the sez dev share please state add that was removed
	 * @throws NoSuchSezDevSharePleaseStateAddException if a sez dev share please state add with the primary key could not be found
	 */
	public static SezDevSharePleaseStateAdd remove(long sezDevPleaseStateAddId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezDevSharePleaseStateAddException {

		return getPersistence().remove(sezDevPleaseStateAddId);
	}

	public static SezDevSharePleaseStateAdd updateImpl(
		SezDevSharePleaseStateAdd sezDevSharePleaseStateAdd) {

		return getPersistence().updateImpl(sezDevSharePleaseStateAdd);
	}

	/**
	 * Returns the sez dev share please state add with the primary key or throws a <code>NoSuchSezDevSharePleaseStateAddException</code> if it could not be found.
	 *
	 * @param sezDevPleaseStateAddId the primary key of the sez dev share please state add
	 * @return the sez dev share please state add
	 * @throws NoSuchSezDevSharePleaseStateAddException if a sez dev share please state add with the primary key could not be found
	 */
	public static SezDevSharePleaseStateAdd findByPrimaryKey(
			long sezDevPleaseStateAddId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezDevSharePleaseStateAddException {

		return getPersistence().findByPrimaryKey(sezDevPleaseStateAddId);
	}

	/**
	 * Returns the sez dev share please state add with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezDevPleaseStateAddId the primary key of the sez dev share please state add
	 * @return the sez dev share please state add, or <code>null</code> if a sez dev share please state add with the primary key could not be found
	 */
	public static SezDevSharePleaseStateAdd fetchByPrimaryKey(
		long sezDevPleaseStateAddId) {

		return getPersistence().fetchByPrimaryKey(sezDevPleaseStateAddId);
	}

	/**
	 * Returns all the sez dev share please state adds.
	 *
	 * @return the sez dev share please state adds
	 */
	public static List<SezDevSharePleaseStateAdd> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the sez dev share please state adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevSharePleaseStateAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev share please state adds
	 * @param end the upper bound of the range of sez dev share please state adds (not inclusive)
	 * @return the range of sez dev share please state adds
	 */
	public static List<SezDevSharePleaseStateAdd> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the sez dev share please state adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevSharePleaseStateAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev share please state adds
	 * @param end the upper bound of the range of sez dev share please state adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez dev share please state adds
	 */
	public static List<SezDevSharePleaseStateAdd> findAll(
		int start, int end,
		OrderByComparator<SezDevSharePleaseStateAdd> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the sez dev share please state adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevSharePleaseStateAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev share please state adds
	 * @param end the upper bound of the range of sez dev share please state adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez dev share please state adds
	 */
	public static List<SezDevSharePleaseStateAdd> findAll(
		int start, int end,
		OrderByComparator<SezDevSharePleaseStateAdd> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the sez dev share please state adds from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of sez dev share please state adds.
	 *
	 * @return the number of sez dev share please state adds
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static SezDevSharePleaseStateAddPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		SezDevSharePleaseStateAddPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile SezDevSharePleaseStateAddPersistence _persistence;

}