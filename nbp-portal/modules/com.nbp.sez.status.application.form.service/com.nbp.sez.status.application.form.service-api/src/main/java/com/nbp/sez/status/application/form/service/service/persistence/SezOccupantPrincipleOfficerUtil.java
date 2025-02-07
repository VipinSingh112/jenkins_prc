/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.sez.status.application.form.service.model.SezOccupantPrincipleOfficer;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the sez occupant principle officer service. This utility wraps <code>com.nbp.sez.status.application.form.service.service.persistence.impl.SezOccupantPrincipleOfficerPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezOccupantPrincipleOfficerPersistence
 * @generated
 */
public class SezOccupantPrincipleOfficerUtil {

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
		SezOccupantPrincipleOfficer sezOccupantPrincipleOfficer) {

		getPersistence().clearCache(sezOccupantPrincipleOfficer);
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
	public static Map<Serializable, SezOccupantPrincipleOfficer>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<SezOccupantPrincipleOfficer> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<SezOccupantPrincipleOfficer> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<SezOccupantPrincipleOfficer> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<SezOccupantPrincipleOfficer> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static SezOccupantPrincipleOfficer update(
		SezOccupantPrincipleOfficer sezOccupantPrincipleOfficer) {

		return getPersistence().update(sezOccupantPrincipleOfficer);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static SezOccupantPrincipleOfficer update(
		SezOccupantPrincipleOfficer sezOccupantPrincipleOfficer,
		ServiceContext serviceContext) {

		return getPersistence().update(
			sezOccupantPrincipleOfficer, serviceContext);
	}

	/**
	 * Returns all the sez occupant principle officers where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez occupant principle officers
	 */
	public static List<SezOccupantPrincipleOfficer> findBygetSezStatusByAppId(
		long sezStatusApplicationId) {

		return getPersistence().findBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Returns a range of all the sez occupant principle officers where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantPrincipleOfficerModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez occupant principle officers
	 * @param end the upper bound of the range of sez occupant principle officers (not inclusive)
	 * @return the range of matching sez occupant principle officers
	 */
	public static List<SezOccupantPrincipleOfficer> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end) {

		return getPersistence().findBygetSezStatusByAppId(
			sezStatusApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the sez occupant principle officers where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantPrincipleOfficerModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez occupant principle officers
	 * @param end the upper bound of the range of sez occupant principle officers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez occupant principle officers
	 */
	public static List<SezOccupantPrincipleOfficer> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end,
		OrderByComparator<SezOccupantPrincipleOfficer> orderByComparator) {

		return getPersistence().findBygetSezStatusByAppId(
			sezStatusApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the sez occupant principle officers where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantPrincipleOfficerModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez occupant principle officers
	 * @param end the upper bound of the range of sez occupant principle officers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez occupant principle officers
	 */
	public static List<SezOccupantPrincipleOfficer> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end,
		OrderByComparator<SezOccupantPrincipleOfficer> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetSezStatusByAppId(
			sezStatusApplicationId, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first sez occupant principle officer in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez occupant principle officer
	 * @throws NoSuchSezOccupantPrincipleOfficerException if a matching sez occupant principle officer could not be found
	 */
	public static SezOccupantPrincipleOfficer findBygetSezStatusByAppId_First(
			long sezStatusApplicationId,
			OrderByComparator<SezOccupantPrincipleOfficer> orderByComparator)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezOccupantPrincipleOfficerException {

		return getPersistence().findBygetSezStatusByAppId_First(
			sezStatusApplicationId, orderByComparator);
	}

	/**
	 * Returns the first sez occupant principle officer in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez occupant principle officer, or <code>null</code> if a matching sez occupant principle officer could not be found
	 */
	public static SezOccupantPrincipleOfficer fetchBygetSezStatusByAppId_First(
		long sezStatusApplicationId,
		OrderByComparator<SezOccupantPrincipleOfficer> orderByComparator) {

		return getPersistence().fetchBygetSezStatusByAppId_First(
			sezStatusApplicationId, orderByComparator);
	}

	/**
	 * Returns the last sez occupant principle officer in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez occupant principle officer
	 * @throws NoSuchSezOccupantPrincipleOfficerException if a matching sez occupant principle officer could not be found
	 */
	public static SezOccupantPrincipleOfficer findBygetSezStatusByAppId_Last(
			long sezStatusApplicationId,
			OrderByComparator<SezOccupantPrincipleOfficer> orderByComparator)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezOccupantPrincipleOfficerException {

		return getPersistence().findBygetSezStatusByAppId_Last(
			sezStatusApplicationId, orderByComparator);
	}

	/**
	 * Returns the last sez occupant principle officer in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez occupant principle officer, or <code>null</code> if a matching sez occupant principle officer could not be found
	 */
	public static SezOccupantPrincipleOfficer fetchBygetSezStatusByAppId_Last(
		long sezStatusApplicationId,
		OrderByComparator<SezOccupantPrincipleOfficer> orderByComparator) {

		return getPersistence().fetchBygetSezStatusByAppId_Last(
			sezStatusApplicationId, orderByComparator);
	}

	/**
	 * Returns the sez occupant principle officers before and after the current sez occupant principle officer in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezOccPrincOffId the primary key of the current sez occupant principle officer
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez occupant principle officer
	 * @throws NoSuchSezOccupantPrincipleOfficerException if a sez occupant principle officer with the primary key could not be found
	 */
	public static SezOccupantPrincipleOfficer[]
			findBygetSezStatusByAppId_PrevAndNext(
				long sezOccPrincOffId, long sezStatusApplicationId,
				OrderByComparator<SezOccupantPrincipleOfficer>
					orderByComparator)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezOccupantPrincipleOfficerException {

		return getPersistence().findBygetSezStatusByAppId_PrevAndNext(
			sezOccPrincOffId, sezStatusApplicationId, orderByComparator);
	}

	/**
	 * Removes all the sez occupant principle officers where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 */
	public static void removeBygetSezStatusByAppId(
		long sezStatusApplicationId) {

		getPersistence().removeBygetSezStatusByAppId(sezStatusApplicationId);
	}

	/**
	 * Returns the number of sez occupant principle officers where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez occupant principle officers
	 */
	public static int countBygetSezStatusByAppId(long sezStatusApplicationId) {
		return getPersistence().countBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Caches the sez occupant principle officer in the entity cache if it is enabled.
	 *
	 * @param sezOccupantPrincipleOfficer the sez occupant principle officer
	 */
	public static void cacheResult(
		SezOccupantPrincipleOfficer sezOccupantPrincipleOfficer) {

		getPersistence().cacheResult(sezOccupantPrincipleOfficer);
	}

	/**
	 * Caches the sez occupant principle officers in the entity cache if it is enabled.
	 *
	 * @param sezOccupantPrincipleOfficers the sez occupant principle officers
	 */
	public static void cacheResult(
		List<SezOccupantPrincipleOfficer> sezOccupantPrincipleOfficers) {

		getPersistence().cacheResult(sezOccupantPrincipleOfficers);
	}

	/**
	 * Creates a new sez occupant principle officer with the primary key. Does not add the sez occupant principle officer to the database.
	 *
	 * @param sezOccPrincOffId the primary key for the new sez occupant principle officer
	 * @return the new sez occupant principle officer
	 */
	public static SezOccupantPrincipleOfficer create(long sezOccPrincOffId) {
		return getPersistence().create(sezOccPrincOffId);
	}

	/**
	 * Removes the sez occupant principle officer with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezOccPrincOffId the primary key of the sez occupant principle officer
	 * @return the sez occupant principle officer that was removed
	 * @throws NoSuchSezOccupantPrincipleOfficerException if a sez occupant principle officer with the primary key could not be found
	 */
	public static SezOccupantPrincipleOfficer remove(long sezOccPrincOffId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezOccupantPrincipleOfficerException {

		return getPersistence().remove(sezOccPrincOffId);
	}

	public static SezOccupantPrincipleOfficer updateImpl(
		SezOccupantPrincipleOfficer sezOccupantPrincipleOfficer) {

		return getPersistence().updateImpl(sezOccupantPrincipleOfficer);
	}

	/**
	 * Returns the sez occupant principle officer with the primary key or throws a <code>NoSuchSezOccupantPrincipleOfficerException</code> if it could not be found.
	 *
	 * @param sezOccPrincOffId the primary key of the sez occupant principle officer
	 * @return the sez occupant principle officer
	 * @throws NoSuchSezOccupantPrincipleOfficerException if a sez occupant principle officer with the primary key could not be found
	 */
	public static SezOccupantPrincipleOfficer findByPrimaryKey(
			long sezOccPrincOffId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezOccupantPrincipleOfficerException {

		return getPersistence().findByPrimaryKey(sezOccPrincOffId);
	}

	/**
	 * Returns the sez occupant principle officer with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezOccPrincOffId the primary key of the sez occupant principle officer
	 * @return the sez occupant principle officer, or <code>null</code> if a sez occupant principle officer with the primary key could not be found
	 */
	public static SezOccupantPrincipleOfficer fetchByPrimaryKey(
		long sezOccPrincOffId) {

		return getPersistence().fetchByPrimaryKey(sezOccPrincOffId);
	}

	/**
	 * Returns all the sez occupant principle officers.
	 *
	 * @return the sez occupant principle officers
	 */
	public static List<SezOccupantPrincipleOfficer> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the sez occupant principle officers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantPrincipleOfficerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupant principle officers
	 * @param end the upper bound of the range of sez occupant principle officers (not inclusive)
	 * @return the range of sez occupant principle officers
	 */
	public static List<SezOccupantPrincipleOfficer> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the sez occupant principle officers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantPrincipleOfficerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupant principle officers
	 * @param end the upper bound of the range of sez occupant principle officers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez occupant principle officers
	 */
	public static List<SezOccupantPrincipleOfficer> findAll(
		int start, int end,
		OrderByComparator<SezOccupantPrincipleOfficer> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the sez occupant principle officers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantPrincipleOfficerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupant principle officers
	 * @param end the upper bound of the range of sez occupant principle officers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez occupant principle officers
	 */
	public static List<SezOccupantPrincipleOfficer> findAll(
		int start, int end,
		OrderByComparator<SezOccupantPrincipleOfficer> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the sez occupant principle officers from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of sez occupant principle officers.
	 *
	 * @return the number of sez occupant principle officers
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static SezOccupantPrincipleOfficerPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		SezOccupantPrincipleOfficerPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile SezOccupantPrincipleOfficerPersistence _persistence;

}