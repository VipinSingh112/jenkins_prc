/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.sez.status.application.form.service.model.SezDevShareDirectorAdd;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the sez dev share director add service. This utility wraps <code>com.nbp.sez.status.application.form.service.service.persistence.impl.SezDevShareDirectorAddPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezDevShareDirectorAddPersistence
 * @generated
 */
public class SezDevShareDirectorAddUtil {

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
		SezDevShareDirectorAdd sezDevShareDirectorAdd) {

		getPersistence().clearCache(sezDevShareDirectorAdd);
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
	public static Map<Serializable, SezDevShareDirectorAdd> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<SezDevShareDirectorAdd> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<SezDevShareDirectorAdd> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<SezDevShareDirectorAdd> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<SezDevShareDirectorAdd> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static SezDevShareDirectorAdd update(
		SezDevShareDirectorAdd sezDevShareDirectorAdd) {

		return getPersistence().update(sezDevShareDirectorAdd);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static SezDevShareDirectorAdd update(
		SezDevShareDirectorAdd sezDevShareDirectorAdd,
		ServiceContext serviceContext) {

		return getPersistence().update(sezDevShareDirectorAdd, serviceContext);
	}

	/**
	 * Returns all the sez dev share director adds where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez dev share director adds
	 */
	public static List<SezDevShareDirectorAdd> findBygetSezStatusByAppId(
		long sezStatusApplicationId) {

		return getPersistence().findBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Returns a range of all the sez dev share director adds where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevShareDirectorAddModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez dev share director adds
	 * @param end the upper bound of the range of sez dev share director adds (not inclusive)
	 * @return the range of matching sez dev share director adds
	 */
	public static List<SezDevShareDirectorAdd> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end) {

		return getPersistence().findBygetSezStatusByAppId(
			sezStatusApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the sez dev share director adds where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevShareDirectorAddModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez dev share director adds
	 * @param end the upper bound of the range of sez dev share director adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez dev share director adds
	 */
	public static List<SezDevShareDirectorAdd> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end,
		OrderByComparator<SezDevShareDirectorAdd> orderByComparator) {

		return getPersistence().findBygetSezStatusByAppId(
			sezStatusApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the sez dev share director adds where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevShareDirectorAddModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez dev share director adds
	 * @param end the upper bound of the range of sez dev share director adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez dev share director adds
	 */
	public static List<SezDevShareDirectorAdd> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end,
		OrderByComparator<SezDevShareDirectorAdd> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetSezStatusByAppId(
			sezStatusApplicationId, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first sez dev share director add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez dev share director add
	 * @throws NoSuchSezDevShareDirectorAddException if a matching sez dev share director add could not be found
	 */
	public static SezDevShareDirectorAdd findBygetSezStatusByAppId_First(
			long sezStatusApplicationId,
			OrderByComparator<SezDevShareDirectorAdd> orderByComparator)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezDevShareDirectorAddException {

		return getPersistence().findBygetSezStatusByAppId_First(
			sezStatusApplicationId, orderByComparator);
	}

	/**
	 * Returns the first sez dev share director add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez dev share director add, or <code>null</code> if a matching sez dev share director add could not be found
	 */
	public static SezDevShareDirectorAdd fetchBygetSezStatusByAppId_First(
		long sezStatusApplicationId,
		OrderByComparator<SezDevShareDirectorAdd> orderByComparator) {

		return getPersistence().fetchBygetSezStatusByAppId_First(
			sezStatusApplicationId, orderByComparator);
	}

	/**
	 * Returns the last sez dev share director add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez dev share director add
	 * @throws NoSuchSezDevShareDirectorAddException if a matching sez dev share director add could not be found
	 */
	public static SezDevShareDirectorAdd findBygetSezStatusByAppId_Last(
			long sezStatusApplicationId,
			OrderByComparator<SezDevShareDirectorAdd> orderByComparator)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezDevShareDirectorAddException {

		return getPersistence().findBygetSezStatusByAppId_Last(
			sezStatusApplicationId, orderByComparator);
	}

	/**
	 * Returns the last sez dev share director add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez dev share director add, or <code>null</code> if a matching sez dev share director add could not be found
	 */
	public static SezDevShareDirectorAdd fetchBygetSezStatusByAppId_Last(
		long sezStatusApplicationId,
		OrderByComparator<SezDevShareDirectorAdd> orderByComparator) {

		return getPersistence().fetchBygetSezStatusByAppId_Last(
			sezStatusApplicationId, orderByComparator);
	}

	/**
	 * Returns the sez dev share director adds before and after the current sez dev share director add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezDevShareDirectorAddId the primary key of the current sez dev share director add
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez dev share director add
	 * @throws NoSuchSezDevShareDirectorAddException if a sez dev share director add with the primary key could not be found
	 */
	public static SezDevShareDirectorAdd[]
			findBygetSezStatusByAppId_PrevAndNext(
				long sezDevShareDirectorAddId, long sezStatusApplicationId,
				OrderByComparator<SezDevShareDirectorAdd> orderByComparator)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezDevShareDirectorAddException {

		return getPersistence().findBygetSezStatusByAppId_PrevAndNext(
			sezDevShareDirectorAddId, sezStatusApplicationId,
			orderByComparator);
	}

	/**
	 * Removes all the sez dev share director adds where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 */
	public static void removeBygetSezStatusByAppId(
		long sezStatusApplicationId) {

		getPersistence().removeBygetSezStatusByAppId(sezStatusApplicationId);
	}

	/**
	 * Returns the number of sez dev share director adds where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez dev share director adds
	 */
	public static int countBygetSezStatusByAppId(long sezStatusApplicationId) {
		return getPersistence().countBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Caches the sez dev share director add in the entity cache if it is enabled.
	 *
	 * @param sezDevShareDirectorAdd the sez dev share director add
	 */
	public static void cacheResult(
		SezDevShareDirectorAdd sezDevShareDirectorAdd) {

		getPersistence().cacheResult(sezDevShareDirectorAdd);
	}

	/**
	 * Caches the sez dev share director adds in the entity cache if it is enabled.
	 *
	 * @param sezDevShareDirectorAdds the sez dev share director adds
	 */
	public static void cacheResult(
		List<SezDevShareDirectorAdd> sezDevShareDirectorAdds) {

		getPersistence().cacheResult(sezDevShareDirectorAdds);
	}

	/**
	 * Creates a new sez dev share director add with the primary key. Does not add the sez dev share director add to the database.
	 *
	 * @param sezDevShareDirectorAddId the primary key for the new sez dev share director add
	 * @return the new sez dev share director add
	 */
	public static SezDevShareDirectorAdd create(long sezDevShareDirectorAddId) {
		return getPersistence().create(sezDevShareDirectorAddId);
	}

	/**
	 * Removes the sez dev share director add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezDevShareDirectorAddId the primary key of the sez dev share director add
	 * @return the sez dev share director add that was removed
	 * @throws NoSuchSezDevShareDirectorAddException if a sez dev share director add with the primary key could not be found
	 */
	public static SezDevShareDirectorAdd remove(long sezDevShareDirectorAddId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezDevShareDirectorAddException {

		return getPersistence().remove(sezDevShareDirectorAddId);
	}

	public static SezDevShareDirectorAdd updateImpl(
		SezDevShareDirectorAdd sezDevShareDirectorAdd) {

		return getPersistence().updateImpl(sezDevShareDirectorAdd);
	}

	/**
	 * Returns the sez dev share director add with the primary key or throws a <code>NoSuchSezDevShareDirectorAddException</code> if it could not be found.
	 *
	 * @param sezDevShareDirectorAddId the primary key of the sez dev share director add
	 * @return the sez dev share director add
	 * @throws NoSuchSezDevShareDirectorAddException if a sez dev share director add with the primary key could not be found
	 */
	public static SezDevShareDirectorAdd findByPrimaryKey(
			long sezDevShareDirectorAddId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezDevShareDirectorAddException {

		return getPersistence().findByPrimaryKey(sezDevShareDirectorAddId);
	}

	/**
	 * Returns the sez dev share director add with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezDevShareDirectorAddId the primary key of the sez dev share director add
	 * @return the sez dev share director add, or <code>null</code> if a sez dev share director add with the primary key could not be found
	 */
	public static SezDevShareDirectorAdd fetchByPrimaryKey(
		long sezDevShareDirectorAddId) {

		return getPersistence().fetchByPrimaryKey(sezDevShareDirectorAddId);
	}

	/**
	 * Returns all the sez dev share director adds.
	 *
	 * @return the sez dev share director adds
	 */
	public static List<SezDevShareDirectorAdd> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the sez dev share director adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevShareDirectorAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev share director adds
	 * @param end the upper bound of the range of sez dev share director adds (not inclusive)
	 * @return the range of sez dev share director adds
	 */
	public static List<SezDevShareDirectorAdd> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the sez dev share director adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevShareDirectorAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev share director adds
	 * @param end the upper bound of the range of sez dev share director adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez dev share director adds
	 */
	public static List<SezDevShareDirectorAdd> findAll(
		int start, int end,
		OrderByComparator<SezDevShareDirectorAdd> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the sez dev share director adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevShareDirectorAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev share director adds
	 * @param end the upper bound of the range of sez dev share director adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez dev share director adds
	 */
	public static List<SezDevShareDirectorAdd> findAll(
		int start, int end,
		OrderByComparator<SezDevShareDirectorAdd> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the sez dev share director adds from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of sez dev share director adds.
	 *
	 * @return the number of sez dev share director adds
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static SezDevShareDirectorAddPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		SezDevShareDirectorAddPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile SezDevShareDirectorAddPersistence _persistence;

}