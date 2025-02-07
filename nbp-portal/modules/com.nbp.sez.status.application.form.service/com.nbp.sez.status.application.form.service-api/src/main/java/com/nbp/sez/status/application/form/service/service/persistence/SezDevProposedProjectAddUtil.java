/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.sez.status.application.form.service.model.SezDevProposedProjectAdd;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the sez dev proposed project add service. This utility wraps <code>com.nbp.sez.status.application.form.service.service.persistence.impl.SezDevProposedProjectAddPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezDevProposedProjectAddPersistence
 * @generated
 */
public class SezDevProposedProjectAddUtil {

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
		SezDevProposedProjectAdd sezDevProposedProjectAdd) {

		getPersistence().clearCache(sezDevProposedProjectAdd);
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
	public static Map<Serializable, SezDevProposedProjectAdd>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<SezDevProposedProjectAdd> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<SezDevProposedProjectAdd> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<SezDevProposedProjectAdd> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<SezDevProposedProjectAdd> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static SezDevProposedProjectAdd update(
		SezDevProposedProjectAdd sezDevProposedProjectAdd) {

		return getPersistence().update(sezDevProposedProjectAdd);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static SezDevProposedProjectAdd update(
		SezDevProposedProjectAdd sezDevProposedProjectAdd,
		ServiceContext serviceContext) {

		return getPersistence().update(
			sezDevProposedProjectAdd, serviceContext);
	}

	/**
	 * Returns all the sez dev proposed project adds where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez dev proposed project adds
	 */
	public static List<SezDevProposedProjectAdd> findBygetSezStatusByAppId(
		long sezStatusApplicationId) {

		return getPersistence().findBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Returns a range of all the sez dev proposed project adds where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevProposedProjectAddModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez dev proposed project adds
	 * @param end the upper bound of the range of sez dev proposed project adds (not inclusive)
	 * @return the range of matching sez dev proposed project adds
	 */
	public static List<SezDevProposedProjectAdd> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end) {

		return getPersistence().findBygetSezStatusByAppId(
			sezStatusApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the sez dev proposed project adds where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevProposedProjectAddModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez dev proposed project adds
	 * @param end the upper bound of the range of sez dev proposed project adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez dev proposed project adds
	 */
	public static List<SezDevProposedProjectAdd> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end,
		OrderByComparator<SezDevProposedProjectAdd> orderByComparator) {

		return getPersistence().findBygetSezStatusByAppId(
			sezStatusApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the sez dev proposed project adds where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevProposedProjectAddModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez dev proposed project adds
	 * @param end the upper bound of the range of sez dev proposed project adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez dev proposed project adds
	 */
	public static List<SezDevProposedProjectAdd> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end,
		OrderByComparator<SezDevProposedProjectAdd> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetSezStatusByAppId(
			sezStatusApplicationId, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first sez dev proposed project add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez dev proposed project add
	 * @throws NoSuchSezDevProposedProjectAddException if a matching sez dev proposed project add could not be found
	 */
	public static SezDevProposedProjectAdd findBygetSezStatusByAppId_First(
			long sezStatusApplicationId,
			OrderByComparator<SezDevProposedProjectAdd> orderByComparator)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezDevProposedProjectAddException {

		return getPersistence().findBygetSezStatusByAppId_First(
			sezStatusApplicationId, orderByComparator);
	}

	/**
	 * Returns the first sez dev proposed project add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez dev proposed project add, or <code>null</code> if a matching sez dev proposed project add could not be found
	 */
	public static SezDevProposedProjectAdd fetchBygetSezStatusByAppId_First(
		long sezStatusApplicationId,
		OrderByComparator<SezDevProposedProjectAdd> orderByComparator) {

		return getPersistence().fetchBygetSezStatusByAppId_First(
			sezStatusApplicationId, orderByComparator);
	}

	/**
	 * Returns the last sez dev proposed project add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez dev proposed project add
	 * @throws NoSuchSezDevProposedProjectAddException if a matching sez dev proposed project add could not be found
	 */
	public static SezDevProposedProjectAdd findBygetSezStatusByAppId_Last(
			long sezStatusApplicationId,
			OrderByComparator<SezDevProposedProjectAdd> orderByComparator)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezDevProposedProjectAddException {

		return getPersistence().findBygetSezStatusByAppId_Last(
			sezStatusApplicationId, orderByComparator);
	}

	/**
	 * Returns the last sez dev proposed project add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez dev proposed project add, or <code>null</code> if a matching sez dev proposed project add could not be found
	 */
	public static SezDevProposedProjectAdd fetchBygetSezStatusByAppId_Last(
		long sezStatusApplicationId,
		OrderByComparator<SezDevProposedProjectAdd> orderByComparator) {

		return getPersistence().fetchBygetSezStatusByAppId_Last(
			sezStatusApplicationId, orderByComparator);
	}

	/**
	 * Returns the sez dev proposed project adds before and after the current sez dev proposed project add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezDevProposedProjectAddId the primary key of the current sez dev proposed project add
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez dev proposed project add
	 * @throws NoSuchSezDevProposedProjectAddException if a sez dev proposed project add with the primary key could not be found
	 */
	public static SezDevProposedProjectAdd[]
			findBygetSezStatusByAppId_PrevAndNext(
				long sezDevProposedProjectAddId, long sezStatusApplicationId,
				OrderByComparator<SezDevProposedProjectAdd> orderByComparator)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezDevProposedProjectAddException {

		return getPersistence().findBygetSezStatusByAppId_PrevAndNext(
			sezDevProposedProjectAddId, sezStatusApplicationId,
			orderByComparator);
	}

	/**
	 * Removes all the sez dev proposed project adds where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 */
	public static void removeBygetSezStatusByAppId(
		long sezStatusApplicationId) {

		getPersistence().removeBygetSezStatusByAppId(sezStatusApplicationId);
	}

	/**
	 * Returns the number of sez dev proposed project adds where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez dev proposed project adds
	 */
	public static int countBygetSezStatusByAppId(long sezStatusApplicationId) {
		return getPersistence().countBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Caches the sez dev proposed project add in the entity cache if it is enabled.
	 *
	 * @param sezDevProposedProjectAdd the sez dev proposed project add
	 */
	public static void cacheResult(
		SezDevProposedProjectAdd sezDevProposedProjectAdd) {

		getPersistence().cacheResult(sezDevProposedProjectAdd);
	}

	/**
	 * Caches the sez dev proposed project adds in the entity cache if it is enabled.
	 *
	 * @param sezDevProposedProjectAdds the sez dev proposed project adds
	 */
	public static void cacheResult(
		List<SezDevProposedProjectAdd> sezDevProposedProjectAdds) {

		getPersistence().cacheResult(sezDevProposedProjectAdds);
	}

	/**
	 * Creates a new sez dev proposed project add with the primary key. Does not add the sez dev proposed project add to the database.
	 *
	 * @param sezDevProposedProjectAddId the primary key for the new sez dev proposed project add
	 * @return the new sez dev proposed project add
	 */
	public static SezDevProposedProjectAdd create(
		long sezDevProposedProjectAddId) {

		return getPersistence().create(sezDevProposedProjectAddId);
	}

	/**
	 * Removes the sez dev proposed project add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezDevProposedProjectAddId the primary key of the sez dev proposed project add
	 * @return the sez dev proposed project add that was removed
	 * @throws NoSuchSezDevProposedProjectAddException if a sez dev proposed project add with the primary key could not be found
	 */
	public static SezDevProposedProjectAdd remove(
			long sezDevProposedProjectAddId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezDevProposedProjectAddException {

		return getPersistence().remove(sezDevProposedProjectAddId);
	}

	public static SezDevProposedProjectAdd updateImpl(
		SezDevProposedProjectAdd sezDevProposedProjectAdd) {

		return getPersistence().updateImpl(sezDevProposedProjectAdd);
	}

	/**
	 * Returns the sez dev proposed project add with the primary key or throws a <code>NoSuchSezDevProposedProjectAddException</code> if it could not be found.
	 *
	 * @param sezDevProposedProjectAddId the primary key of the sez dev proposed project add
	 * @return the sez dev proposed project add
	 * @throws NoSuchSezDevProposedProjectAddException if a sez dev proposed project add with the primary key could not be found
	 */
	public static SezDevProposedProjectAdd findByPrimaryKey(
			long sezDevProposedProjectAddId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezDevProposedProjectAddException {

		return getPersistence().findByPrimaryKey(sezDevProposedProjectAddId);
	}

	/**
	 * Returns the sez dev proposed project add with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezDevProposedProjectAddId the primary key of the sez dev proposed project add
	 * @return the sez dev proposed project add, or <code>null</code> if a sez dev proposed project add with the primary key could not be found
	 */
	public static SezDevProposedProjectAdd fetchByPrimaryKey(
		long sezDevProposedProjectAddId) {

		return getPersistence().fetchByPrimaryKey(sezDevProposedProjectAddId);
	}

	/**
	 * Returns all the sez dev proposed project adds.
	 *
	 * @return the sez dev proposed project adds
	 */
	public static List<SezDevProposedProjectAdd> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the sez dev proposed project adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevProposedProjectAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev proposed project adds
	 * @param end the upper bound of the range of sez dev proposed project adds (not inclusive)
	 * @return the range of sez dev proposed project adds
	 */
	public static List<SezDevProposedProjectAdd> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the sez dev proposed project adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevProposedProjectAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev proposed project adds
	 * @param end the upper bound of the range of sez dev proposed project adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez dev proposed project adds
	 */
	public static List<SezDevProposedProjectAdd> findAll(
		int start, int end,
		OrderByComparator<SezDevProposedProjectAdd> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the sez dev proposed project adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevProposedProjectAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev proposed project adds
	 * @param end the upper bound of the range of sez dev proposed project adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez dev proposed project adds
	 */
	public static List<SezDevProposedProjectAdd> findAll(
		int start, int end,
		OrderByComparator<SezDevProposedProjectAdd> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the sez dev proposed project adds from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of sez dev proposed project adds.
	 *
	 * @return the number of sez dev proposed project adds
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static SezDevProposedProjectAddPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		SezDevProposedProjectAddPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile SezDevProposedProjectAddPersistence _persistence;

}