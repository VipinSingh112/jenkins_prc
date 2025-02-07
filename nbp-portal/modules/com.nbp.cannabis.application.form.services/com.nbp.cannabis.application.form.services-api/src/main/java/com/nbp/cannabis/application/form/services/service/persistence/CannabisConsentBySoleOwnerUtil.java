/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.cannabis.application.form.services.model.CannabisConsentBySoleOwner;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the cannabis consent by sole owner service. This utility wraps <code>com.nbp.cannabis.application.form.services.service.persistence.impl.CannabisConsentBySoleOwnerPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CannabisConsentBySoleOwnerPersistence
 * @generated
 */
public class CannabisConsentBySoleOwnerUtil {

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
		CannabisConsentBySoleOwner cannabisConsentBySoleOwner) {

		getPersistence().clearCache(cannabisConsentBySoleOwner);
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
	public static Map<Serializable, CannabisConsentBySoleOwner>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<CannabisConsentBySoleOwner> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CannabisConsentBySoleOwner> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CannabisConsentBySoleOwner> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<CannabisConsentBySoleOwner> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static CannabisConsentBySoleOwner update(
		CannabisConsentBySoleOwner cannabisConsentBySoleOwner) {

		return getPersistence().update(cannabisConsentBySoleOwner);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static CannabisConsentBySoleOwner update(
		CannabisConsentBySoleOwner cannabisConsentBySoleOwner,
		ServiceContext serviceContext) {

		return getPersistence().update(
			cannabisConsentBySoleOwner, serviceContext);
	}

	/**
	 * Returns all the cannabis consent by sole owners where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the matching cannabis consent by sole owners
	 */
	public static List<CannabisConsentBySoleOwner> findBygetCA_CSO_BY_CAI(
		long cannabisApplicationId) {

		return getPersistence().findBygetCA_CSO_BY_CAI(cannabisApplicationId);
	}

	/**
	 * Returns a range of all the cannabis consent by sole owners where cannabisApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisConsentBySoleOwnerModelImpl</code>.
	 * </p>
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param start the lower bound of the range of cannabis consent by sole owners
	 * @param end the upper bound of the range of cannabis consent by sole owners (not inclusive)
	 * @return the range of matching cannabis consent by sole owners
	 */
	public static List<CannabisConsentBySoleOwner> findBygetCA_CSO_BY_CAI(
		long cannabisApplicationId, int start, int end) {

		return getPersistence().findBygetCA_CSO_BY_CAI(
			cannabisApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the cannabis consent by sole owners where cannabisApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisConsentBySoleOwnerModelImpl</code>.
	 * </p>
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param start the lower bound of the range of cannabis consent by sole owners
	 * @param end the upper bound of the range of cannabis consent by sole owners (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis consent by sole owners
	 */
	public static List<CannabisConsentBySoleOwner> findBygetCA_CSO_BY_CAI(
		long cannabisApplicationId, int start, int end,
		OrderByComparator<CannabisConsentBySoleOwner> orderByComparator) {

		return getPersistence().findBygetCA_CSO_BY_CAI(
			cannabisApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the cannabis consent by sole owners where cannabisApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisConsentBySoleOwnerModelImpl</code>.
	 * </p>
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param start the lower bound of the range of cannabis consent by sole owners
	 * @param end the upper bound of the range of cannabis consent by sole owners (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis consent by sole owners
	 */
	public static List<CannabisConsentBySoleOwner> findBygetCA_CSO_BY_CAI(
		long cannabisApplicationId, int start, int end,
		OrderByComparator<CannabisConsentBySoleOwner> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetCA_CSO_BY_CAI(
			cannabisApplicationId, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first cannabis consent by sole owner in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis consent by sole owner
	 * @throws NoSuchCannabisConsentBySoleOwnerException if a matching cannabis consent by sole owner could not be found
	 */
	public static CannabisConsentBySoleOwner findBygetCA_CSO_BY_CAI_First(
			long cannabisApplicationId,
			OrderByComparator<CannabisConsentBySoleOwner> orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisConsentBySoleOwnerException {

		return getPersistence().findBygetCA_CSO_BY_CAI_First(
			cannabisApplicationId, orderByComparator);
	}

	/**
	 * Returns the first cannabis consent by sole owner in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis consent by sole owner, or <code>null</code> if a matching cannabis consent by sole owner could not be found
	 */
	public static CannabisConsentBySoleOwner fetchBygetCA_CSO_BY_CAI_First(
		long cannabisApplicationId,
		OrderByComparator<CannabisConsentBySoleOwner> orderByComparator) {

		return getPersistence().fetchBygetCA_CSO_BY_CAI_First(
			cannabisApplicationId, orderByComparator);
	}

	/**
	 * Returns the last cannabis consent by sole owner in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis consent by sole owner
	 * @throws NoSuchCannabisConsentBySoleOwnerException if a matching cannabis consent by sole owner could not be found
	 */
	public static CannabisConsentBySoleOwner findBygetCA_CSO_BY_CAI_Last(
			long cannabisApplicationId,
			OrderByComparator<CannabisConsentBySoleOwner> orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisConsentBySoleOwnerException {

		return getPersistence().findBygetCA_CSO_BY_CAI_Last(
			cannabisApplicationId, orderByComparator);
	}

	/**
	 * Returns the last cannabis consent by sole owner in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis consent by sole owner, or <code>null</code> if a matching cannabis consent by sole owner could not be found
	 */
	public static CannabisConsentBySoleOwner fetchBygetCA_CSO_BY_CAI_Last(
		long cannabisApplicationId,
		OrderByComparator<CannabisConsentBySoleOwner> orderByComparator) {

		return getPersistence().fetchBygetCA_CSO_BY_CAI_Last(
			cannabisApplicationId, orderByComparator);
	}

	/**
	 * Returns the cannabis consent by sole owners before and after the current cannabis consent by sole owner in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisConsentBySoleOwnerId the primary key of the current cannabis consent by sole owner
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis consent by sole owner
	 * @throws NoSuchCannabisConsentBySoleOwnerException if a cannabis consent by sole owner with the primary key could not be found
	 */
	public static CannabisConsentBySoleOwner[]
			findBygetCA_CSO_BY_CAI_PrevAndNext(
				long cannabisConsentBySoleOwnerId, long cannabisApplicationId,
				OrderByComparator<CannabisConsentBySoleOwner> orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisConsentBySoleOwnerException {

		return getPersistence().findBygetCA_CSO_BY_CAI_PrevAndNext(
			cannabisConsentBySoleOwnerId, cannabisApplicationId,
			orderByComparator);
	}

	/**
	 * Removes all the cannabis consent by sole owners where cannabisApplicationId = &#63; from the database.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 */
	public static void removeBygetCA_CSO_BY_CAI(long cannabisApplicationId) {
		getPersistence().removeBygetCA_CSO_BY_CAI(cannabisApplicationId);
	}

	/**
	 * Returns the number of cannabis consent by sole owners where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the number of matching cannabis consent by sole owners
	 */
	public static int countBygetCA_CSO_BY_CAI(long cannabisApplicationId) {
		return getPersistence().countBygetCA_CSO_BY_CAI(cannabisApplicationId);
	}

	/**
	 * Caches the cannabis consent by sole owner in the entity cache if it is enabled.
	 *
	 * @param cannabisConsentBySoleOwner the cannabis consent by sole owner
	 */
	public static void cacheResult(
		CannabisConsentBySoleOwner cannabisConsentBySoleOwner) {

		getPersistence().cacheResult(cannabisConsentBySoleOwner);
	}

	/**
	 * Caches the cannabis consent by sole owners in the entity cache if it is enabled.
	 *
	 * @param cannabisConsentBySoleOwners the cannabis consent by sole owners
	 */
	public static void cacheResult(
		List<CannabisConsentBySoleOwner> cannabisConsentBySoleOwners) {

		getPersistence().cacheResult(cannabisConsentBySoleOwners);
	}

	/**
	 * Creates a new cannabis consent by sole owner with the primary key. Does not add the cannabis consent by sole owner to the database.
	 *
	 * @param cannabisConsentBySoleOwnerId the primary key for the new cannabis consent by sole owner
	 * @return the new cannabis consent by sole owner
	 */
	public static CannabisConsentBySoleOwner create(
		long cannabisConsentBySoleOwnerId) {

		return getPersistence().create(cannabisConsentBySoleOwnerId);
	}

	/**
	 * Removes the cannabis consent by sole owner with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param cannabisConsentBySoleOwnerId the primary key of the cannabis consent by sole owner
	 * @return the cannabis consent by sole owner that was removed
	 * @throws NoSuchCannabisConsentBySoleOwnerException if a cannabis consent by sole owner with the primary key could not be found
	 */
	public static CannabisConsentBySoleOwner remove(
			long cannabisConsentBySoleOwnerId)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisConsentBySoleOwnerException {

		return getPersistence().remove(cannabisConsentBySoleOwnerId);
	}

	public static CannabisConsentBySoleOwner updateImpl(
		CannabisConsentBySoleOwner cannabisConsentBySoleOwner) {

		return getPersistence().updateImpl(cannabisConsentBySoleOwner);
	}

	/**
	 * Returns the cannabis consent by sole owner with the primary key or throws a <code>NoSuchCannabisConsentBySoleOwnerException</code> if it could not be found.
	 *
	 * @param cannabisConsentBySoleOwnerId the primary key of the cannabis consent by sole owner
	 * @return the cannabis consent by sole owner
	 * @throws NoSuchCannabisConsentBySoleOwnerException if a cannabis consent by sole owner with the primary key could not be found
	 */
	public static CannabisConsentBySoleOwner findByPrimaryKey(
			long cannabisConsentBySoleOwnerId)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisConsentBySoleOwnerException {

		return getPersistence().findByPrimaryKey(cannabisConsentBySoleOwnerId);
	}

	/**
	 * Returns the cannabis consent by sole owner with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param cannabisConsentBySoleOwnerId the primary key of the cannabis consent by sole owner
	 * @return the cannabis consent by sole owner, or <code>null</code> if a cannabis consent by sole owner with the primary key could not be found
	 */
	public static CannabisConsentBySoleOwner fetchByPrimaryKey(
		long cannabisConsentBySoleOwnerId) {

		return getPersistence().fetchByPrimaryKey(cannabisConsentBySoleOwnerId);
	}

	/**
	 * Returns all the cannabis consent by sole owners.
	 *
	 * @return the cannabis consent by sole owners
	 */
	public static List<CannabisConsentBySoleOwner> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the cannabis consent by sole owners.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisConsentBySoleOwnerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis consent by sole owners
	 * @param end the upper bound of the range of cannabis consent by sole owners (not inclusive)
	 * @return the range of cannabis consent by sole owners
	 */
	public static List<CannabisConsentBySoleOwner> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the cannabis consent by sole owners.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisConsentBySoleOwnerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis consent by sole owners
	 * @param end the upper bound of the range of cannabis consent by sole owners (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of cannabis consent by sole owners
	 */
	public static List<CannabisConsentBySoleOwner> findAll(
		int start, int end,
		OrderByComparator<CannabisConsentBySoleOwner> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the cannabis consent by sole owners.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisConsentBySoleOwnerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis consent by sole owners
	 * @param end the upper bound of the range of cannabis consent by sole owners (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of cannabis consent by sole owners
	 */
	public static List<CannabisConsentBySoleOwner> findAll(
		int start, int end,
		OrderByComparator<CannabisConsentBySoleOwner> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the cannabis consent by sole owners from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of cannabis consent by sole owners.
	 *
	 * @return the number of cannabis consent by sole owners
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static CannabisConsentBySoleOwnerPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		CannabisConsentBySoleOwnerPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile CannabisConsentBySoleOwnerPersistence _persistence;

}