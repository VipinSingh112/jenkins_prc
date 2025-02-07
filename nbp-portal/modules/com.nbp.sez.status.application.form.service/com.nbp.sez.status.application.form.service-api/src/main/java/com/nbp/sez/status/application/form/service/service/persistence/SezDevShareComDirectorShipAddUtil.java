/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.sez.status.application.form.service.model.SezDevShareComDirectorShipAdd;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the sez dev share com director ship add service. This utility wraps <code>com.nbp.sez.status.application.form.service.service.persistence.impl.SezDevShareComDirectorShipAddPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezDevShareComDirectorShipAddPersistence
 * @generated
 */
public class SezDevShareComDirectorShipAddUtil {

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
		SezDevShareComDirectorShipAdd sezDevShareComDirectorShipAdd) {

		getPersistence().clearCache(sezDevShareComDirectorShipAdd);
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
	public static Map<Serializable, SezDevShareComDirectorShipAdd>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<SezDevShareComDirectorShipAdd> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<SezDevShareComDirectorShipAdd> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<SezDevShareComDirectorShipAdd> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<SezDevShareComDirectorShipAdd> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static SezDevShareComDirectorShipAdd update(
		SezDevShareComDirectorShipAdd sezDevShareComDirectorShipAdd) {

		return getPersistence().update(sezDevShareComDirectorShipAdd);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static SezDevShareComDirectorShipAdd update(
		SezDevShareComDirectorShipAdd sezDevShareComDirectorShipAdd,
		ServiceContext serviceContext) {

		return getPersistence().update(
			sezDevShareComDirectorShipAdd, serviceContext);
	}

	/**
	 * Returns all the sez dev share com director ship adds where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez dev share com director ship adds
	 */
	public static List<SezDevShareComDirectorShipAdd> findBygetSezStatusByAppId(
		long sezStatusApplicationId) {

		return getPersistence().findBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Returns a range of all the sez dev share com director ship adds where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevShareComDirectorShipAddModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez dev share com director ship adds
	 * @param end the upper bound of the range of sez dev share com director ship adds (not inclusive)
	 * @return the range of matching sez dev share com director ship adds
	 */
	public static List<SezDevShareComDirectorShipAdd> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end) {

		return getPersistence().findBygetSezStatusByAppId(
			sezStatusApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the sez dev share com director ship adds where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevShareComDirectorShipAddModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez dev share com director ship adds
	 * @param end the upper bound of the range of sez dev share com director ship adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez dev share com director ship adds
	 */
	public static List<SezDevShareComDirectorShipAdd> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end,
		OrderByComparator<SezDevShareComDirectorShipAdd> orderByComparator) {

		return getPersistence().findBygetSezStatusByAppId(
			sezStatusApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the sez dev share com director ship adds where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevShareComDirectorShipAddModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez dev share com director ship adds
	 * @param end the upper bound of the range of sez dev share com director ship adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez dev share com director ship adds
	 */
	public static List<SezDevShareComDirectorShipAdd> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end,
		OrderByComparator<SezDevShareComDirectorShipAdd> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetSezStatusByAppId(
			sezStatusApplicationId, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first sez dev share com director ship add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez dev share com director ship add
	 * @throws NoSuchSezDevShareComDirectorShipAddException if a matching sez dev share com director ship add could not be found
	 */
	public static SezDevShareComDirectorShipAdd findBygetSezStatusByAppId_First(
			long sezStatusApplicationId,
			OrderByComparator<SezDevShareComDirectorShipAdd> orderByComparator)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezDevShareComDirectorShipAddException {

		return getPersistence().findBygetSezStatusByAppId_First(
			sezStatusApplicationId, orderByComparator);
	}

	/**
	 * Returns the first sez dev share com director ship add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez dev share com director ship add, or <code>null</code> if a matching sez dev share com director ship add could not be found
	 */
	public static SezDevShareComDirectorShipAdd
		fetchBygetSezStatusByAppId_First(
			long sezStatusApplicationId,
			OrderByComparator<SezDevShareComDirectorShipAdd>
				orderByComparator) {

		return getPersistence().fetchBygetSezStatusByAppId_First(
			sezStatusApplicationId, orderByComparator);
	}

	/**
	 * Returns the last sez dev share com director ship add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez dev share com director ship add
	 * @throws NoSuchSezDevShareComDirectorShipAddException if a matching sez dev share com director ship add could not be found
	 */
	public static SezDevShareComDirectorShipAdd findBygetSezStatusByAppId_Last(
			long sezStatusApplicationId,
			OrderByComparator<SezDevShareComDirectorShipAdd> orderByComparator)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezDevShareComDirectorShipAddException {

		return getPersistence().findBygetSezStatusByAppId_Last(
			sezStatusApplicationId, orderByComparator);
	}

	/**
	 * Returns the last sez dev share com director ship add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez dev share com director ship add, or <code>null</code> if a matching sez dev share com director ship add could not be found
	 */
	public static SezDevShareComDirectorShipAdd fetchBygetSezStatusByAppId_Last(
		long sezStatusApplicationId,
		OrderByComparator<SezDevShareComDirectorShipAdd> orderByComparator) {

		return getPersistence().fetchBygetSezStatusByAppId_Last(
			sezStatusApplicationId, orderByComparator);
	}

	/**
	 * Returns the sez dev share com director ship adds before and after the current sez dev share com director ship add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezDevSharComDirectorShipAddId the primary key of the current sez dev share com director ship add
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez dev share com director ship add
	 * @throws NoSuchSezDevShareComDirectorShipAddException if a sez dev share com director ship add with the primary key could not be found
	 */
	public static SezDevShareComDirectorShipAdd[]
			findBygetSezStatusByAppId_PrevAndNext(
				long sezDevSharComDirectorShipAddId,
				long sezStatusApplicationId,
				OrderByComparator<SezDevShareComDirectorShipAdd>
					orderByComparator)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezDevShareComDirectorShipAddException {

		return getPersistence().findBygetSezStatusByAppId_PrevAndNext(
			sezDevSharComDirectorShipAddId, sezStatusApplicationId,
			orderByComparator);
	}

	/**
	 * Removes all the sez dev share com director ship adds where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 */
	public static void removeBygetSezStatusByAppId(
		long sezStatusApplicationId) {

		getPersistence().removeBygetSezStatusByAppId(sezStatusApplicationId);
	}

	/**
	 * Returns the number of sez dev share com director ship adds where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez dev share com director ship adds
	 */
	public static int countBygetSezStatusByAppId(long sezStatusApplicationId) {
		return getPersistence().countBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Caches the sez dev share com director ship add in the entity cache if it is enabled.
	 *
	 * @param sezDevShareComDirectorShipAdd the sez dev share com director ship add
	 */
	public static void cacheResult(
		SezDevShareComDirectorShipAdd sezDevShareComDirectorShipAdd) {

		getPersistence().cacheResult(sezDevShareComDirectorShipAdd);
	}

	/**
	 * Caches the sez dev share com director ship adds in the entity cache if it is enabled.
	 *
	 * @param sezDevShareComDirectorShipAdds the sez dev share com director ship adds
	 */
	public static void cacheResult(
		List<SezDevShareComDirectorShipAdd> sezDevShareComDirectorShipAdds) {

		getPersistence().cacheResult(sezDevShareComDirectorShipAdds);
	}

	/**
	 * Creates a new sez dev share com director ship add with the primary key. Does not add the sez dev share com director ship add to the database.
	 *
	 * @param sezDevSharComDirectorShipAddId the primary key for the new sez dev share com director ship add
	 * @return the new sez dev share com director ship add
	 */
	public static SezDevShareComDirectorShipAdd create(
		long sezDevSharComDirectorShipAddId) {

		return getPersistence().create(sezDevSharComDirectorShipAddId);
	}

	/**
	 * Removes the sez dev share com director ship add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezDevSharComDirectorShipAddId the primary key of the sez dev share com director ship add
	 * @return the sez dev share com director ship add that was removed
	 * @throws NoSuchSezDevShareComDirectorShipAddException if a sez dev share com director ship add with the primary key could not be found
	 */
	public static SezDevShareComDirectorShipAdd remove(
			long sezDevSharComDirectorShipAddId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezDevShareComDirectorShipAddException {

		return getPersistence().remove(sezDevSharComDirectorShipAddId);
	}

	public static SezDevShareComDirectorShipAdd updateImpl(
		SezDevShareComDirectorShipAdd sezDevShareComDirectorShipAdd) {

		return getPersistence().updateImpl(sezDevShareComDirectorShipAdd);
	}

	/**
	 * Returns the sez dev share com director ship add with the primary key or throws a <code>NoSuchSezDevShareComDirectorShipAddException</code> if it could not be found.
	 *
	 * @param sezDevSharComDirectorShipAddId the primary key of the sez dev share com director ship add
	 * @return the sez dev share com director ship add
	 * @throws NoSuchSezDevShareComDirectorShipAddException if a sez dev share com director ship add with the primary key could not be found
	 */
	public static SezDevShareComDirectorShipAdd findByPrimaryKey(
			long sezDevSharComDirectorShipAddId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezDevShareComDirectorShipAddException {

		return getPersistence().findByPrimaryKey(
			sezDevSharComDirectorShipAddId);
	}

	/**
	 * Returns the sez dev share com director ship add with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezDevSharComDirectorShipAddId the primary key of the sez dev share com director ship add
	 * @return the sez dev share com director ship add, or <code>null</code> if a sez dev share com director ship add with the primary key could not be found
	 */
	public static SezDevShareComDirectorShipAdd fetchByPrimaryKey(
		long sezDevSharComDirectorShipAddId) {

		return getPersistence().fetchByPrimaryKey(
			sezDevSharComDirectorShipAddId);
	}

	/**
	 * Returns all the sez dev share com director ship adds.
	 *
	 * @return the sez dev share com director ship adds
	 */
	public static List<SezDevShareComDirectorShipAdd> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the sez dev share com director ship adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevShareComDirectorShipAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev share com director ship adds
	 * @param end the upper bound of the range of sez dev share com director ship adds (not inclusive)
	 * @return the range of sez dev share com director ship adds
	 */
	public static List<SezDevShareComDirectorShipAdd> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the sez dev share com director ship adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevShareComDirectorShipAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev share com director ship adds
	 * @param end the upper bound of the range of sez dev share com director ship adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez dev share com director ship adds
	 */
	public static List<SezDevShareComDirectorShipAdd> findAll(
		int start, int end,
		OrderByComparator<SezDevShareComDirectorShipAdd> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the sez dev share com director ship adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevShareComDirectorShipAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev share com director ship adds
	 * @param end the upper bound of the range of sez dev share com director ship adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez dev share com director ship adds
	 */
	public static List<SezDevShareComDirectorShipAdd> findAll(
		int start, int end,
		OrderByComparator<SezDevShareComDirectorShipAdd> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the sez dev share com director ship adds from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of sez dev share com director ship adds.
	 *
	 * @return the number of sez dev share com director ship adds
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static SezDevShareComDirectorShipAddPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		SezDevShareComDirectorShipAddPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile SezDevShareComDirectorShipAddPersistence
		_persistence;

}