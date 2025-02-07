/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.sez.status.application.form.service.model.SezOccupantPrincipleDirector;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the sez occupant principle director service. This utility wraps <code>com.nbp.sez.status.application.form.service.service.persistence.impl.SezOccupantPrincipleDirectorPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezOccupantPrincipleDirectorPersistence
 * @generated
 */
public class SezOccupantPrincipleDirectorUtil {

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
		SezOccupantPrincipleDirector sezOccupantPrincipleDirector) {

		getPersistence().clearCache(sezOccupantPrincipleDirector);
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
	public static Map<Serializable, SezOccupantPrincipleDirector>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<SezOccupantPrincipleDirector> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<SezOccupantPrincipleDirector> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<SezOccupantPrincipleDirector> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<SezOccupantPrincipleDirector> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static SezOccupantPrincipleDirector update(
		SezOccupantPrincipleDirector sezOccupantPrincipleDirector) {

		return getPersistence().update(sezOccupantPrincipleDirector);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static SezOccupantPrincipleDirector update(
		SezOccupantPrincipleDirector sezOccupantPrincipleDirector,
		ServiceContext serviceContext) {

		return getPersistence().update(
			sezOccupantPrincipleDirector, serviceContext);
	}

	/**
	 * Returns all the sez occupant principle directors where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez occupant principle directors
	 */
	public static List<SezOccupantPrincipleDirector> findBygetSezStatusByAppId(
		long sezStatusApplicationId) {

		return getPersistence().findBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Returns a range of all the sez occupant principle directors where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantPrincipleDirectorModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez occupant principle directors
	 * @param end the upper bound of the range of sez occupant principle directors (not inclusive)
	 * @return the range of matching sez occupant principle directors
	 */
	public static List<SezOccupantPrincipleDirector> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end) {

		return getPersistence().findBygetSezStatusByAppId(
			sezStatusApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the sez occupant principle directors where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantPrincipleDirectorModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez occupant principle directors
	 * @param end the upper bound of the range of sez occupant principle directors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez occupant principle directors
	 */
	public static List<SezOccupantPrincipleDirector> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end,
		OrderByComparator<SezOccupantPrincipleDirector> orderByComparator) {

		return getPersistence().findBygetSezStatusByAppId(
			sezStatusApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the sez occupant principle directors where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantPrincipleDirectorModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez occupant principle directors
	 * @param end the upper bound of the range of sez occupant principle directors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez occupant principle directors
	 */
	public static List<SezOccupantPrincipleDirector> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end,
		OrderByComparator<SezOccupantPrincipleDirector> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetSezStatusByAppId(
			sezStatusApplicationId, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first sez occupant principle director in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez occupant principle director
	 * @throws NoSuchSezOccupantPrincipleDirectorException if a matching sez occupant principle director could not be found
	 */
	public static SezOccupantPrincipleDirector findBygetSezStatusByAppId_First(
			long sezStatusApplicationId,
			OrderByComparator<SezOccupantPrincipleDirector> orderByComparator)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezOccupantPrincipleDirectorException {

		return getPersistence().findBygetSezStatusByAppId_First(
			sezStatusApplicationId, orderByComparator);
	}

	/**
	 * Returns the first sez occupant principle director in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez occupant principle director, or <code>null</code> if a matching sez occupant principle director could not be found
	 */
	public static SezOccupantPrincipleDirector fetchBygetSezStatusByAppId_First(
		long sezStatusApplicationId,
		OrderByComparator<SezOccupantPrincipleDirector> orderByComparator) {

		return getPersistence().fetchBygetSezStatusByAppId_First(
			sezStatusApplicationId, orderByComparator);
	}

	/**
	 * Returns the last sez occupant principle director in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez occupant principle director
	 * @throws NoSuchSezOccupantPrincipleDirectorException if a matching sez occupant principle director could not be found
	 */
	public static SezOccupantPrincipleDirector findBygetSezStatusByAppId_Last(
			long sezStatusApplicationId,
			OrderByComparator<SezOccupantPrincipleDirector> orderByComparator)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezOccupantPrincipleDirectorException {

		return getPersistence().findBygetSezStatusByAppId_Last(
			sezStatusApplicationId, orderByComparator);
	}

	/**
	 * Returns the last sez occupant principle director in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez occupant principle director, or <code>null</code> if a matching sez occupant principle director could not be found
	 */
	public static SezOccupantPrincipleDirector fetchBygetSezStatusByAppId_Last(
		long sezStatusApplicationId,
		OrderByComparator<SezOccupantPrincipleDirector> orderByComparator) {

		return getPersistence().fetchBygetSezStatusByAppId_Last(
			sezStatusApplicationId, orderByComparator);
	}

	/**
	 * Returns the sez occupant principle directors before and after the current sez occupant principle director in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezOccPrincDirectId the primary key of the current sez occupant principle director
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez occupant principle director
	 * @throws NoSuchSezOccupantPrincipleDirectorException if a sez occupant principle director with the primary key could not be found
	 */
	public static SezOccupantPrincipleDirector[]
			findBygetSezStatusByAppId_PrevAndNext(
				long sezOccPrincDirectId, long sezStatusApplicationId,
				OrderByComparator<SezOccupantPrincipleDirector>
					orderByComparator)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezOccupantPrincipleDirectorException {

		return getPersistence().findBygetSezStatusByAppId_PrevAndNext(
			sezOccPrincDirectId, sezStatusApplicationId, orderByComparator);
	}

	/**
	 * Removes all the sez occupant principle directors where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 */
	public static void removeBygetSezStatusByAppId(
		long sezStatusApplicationId) {

		getPersistence().removeBygetSezStatusByAppId(sezStatusApplicationId);
	}

	/**
	 * Returns the number of sez occupant principle directors where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez occupant principle directors
	 */
	public static int countBygetSezStatusByAppId(long sezStatusApplicationId) {
		return getPersistence().countBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Caches the sez occupant principle director in the entity cache if it is enabled.
	 *
	 * @param sezOccupantPrincipleDirector the sez occupant principle director
	 */
	public static void cacheResult(
		SezOccupantPrincipleDirector sezOccupantPrincipleDirector) {

		getPersistence().cacheResult(sezOccupantPrincipleDirector);
	}

	/**
	 * Caches the sez occupant principle directors in the entity cache if it is enabled.
	 *
	 * @param sezOccupantPrincipleDirectors the sez occupant principle directors
	 */
	public static void cacheResult(
		List<SezOccupantPrincipleDirector> sezOccupantPrincipleDirectors) {

		getPersistence().cacheResult(sezOccupantPrincipleDirectors);
	}

	/**
	 * Creates a new sez occupant principle director with the primary key. Does not add the sez occupant principle director to the database.
	 *
	 * @param sezOccPrincDirectId the primary key for the new sez occupant principle director
	 * @return the new sez occupant principle director
	 */
	public static SezOccupantPrincipleDirector create(
		long sezOccPrincDirectId) {

		return getPersistence().create(sezOccPrincDirectId);
	}

	/**
	 * Removes the sez occupant principle director with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezOccPrincDirectId the primary key of the sez occupant principle director
	 * @return the sez occupant principle director that was removed
	 * @throws NoSuchSezOccupantPrincipleDirectorException if a sez occupant principle director with the primary key could not be found
	 */
	public static SezOccupantPrincipleDirector remove(long sezOccPrincDirectId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezOccupantPrincipleDirectorException {

		return getPersistence().remove(sezOccPrincDirectId);
	}

	public static SezOccupantPrincipleDirector updateImpl(
		SezOccupantPrincipleDirector sezOccupantPrincipleDirector) {

		return getPersistence().updateImpl(sezOccupantPrincipleDirector);
	}

	/**
	 * Returns the sez occupant principle director with the primary key or throws a <code>NoSuchSezOccupantPrincipleDirectorException</code> if it could not be found.
	 *
	 * @param sezOccPrincDirectId the primary key of the sez occupant principle director
	 * @return the sez occupant principle director
	 * @throws NoSuchSezOccupantPrincipleDirectorException if a sez occupant principle director with the primary key could not be found
	 */
	public static SezOccupantPrincipleDirector findByPrimaryKey(
			long sezOccPrincDirectId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezOccupantPrincipleDirectorException {

		return getPersistence().findByPrimaryKey(sezOccPrincDirectId);
	}

	/**
	 * Returns the sez occupant principle director with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezOccPrincDirectId the primary key of the sez occupant principle director
	 * @return the sez occupant principle director, or <code>null</code> if a sez occupant principle director with the primary key could not be found
	 */
	public static SezOccupantPrincipleDirector fetchByPrimaryKey(
		long sezOccPrincDirectId) {

		return getPersistence().fetchByPrimaryKey(sezOccPrincDirectId);
	}

	/**
	 * Returns all the sez occupant principle directors.
	 *
	 * @return the sez occupant principle directors
	 */
	public static List<SezOccupantPrincipleDirector> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the sez occupant principle directors.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantPrincipleDirectorModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupant principle directors
	 * @param end the upper bound of the range of sez occupant principle directors (not inclusive)
	 * @return the range of sez occupant principle directors
	 */
	public static List<SezOccupantPrincipleDirector> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the sez occupant principle directors.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantPrincipleDirectorModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupant principle directors
	 * @param end the upper bound of the range of sez occupant principle directors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez occupant principle directors
	 */
	public static List<SezOccupantPrincipleDirector> findAll(
		int start, int end,
		OrderByComparator<SezOccupantPrincipleDirector> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the sez occupant principle directors.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantPrincipleDirectorModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupant principle directors
	 * @param end the upper bound of the range of sez occupant principle directors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez occupant principle directors
	 */
	public static List<SezOccupantPrincipleDirector> findAll(
		int start, int end,
		OrderByComparator<SezOccupantPrincipleDirector> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the sez occupant principle directors from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of sez occupant principle directors.
	 *
	 * @return the number of sez occupant principle directors
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static SezOccupantPrincipleDirectorPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		SezOccupantPrincipleDirectorPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile SezOccupantPrincipleDirectorPersistence
		_persistence;

}