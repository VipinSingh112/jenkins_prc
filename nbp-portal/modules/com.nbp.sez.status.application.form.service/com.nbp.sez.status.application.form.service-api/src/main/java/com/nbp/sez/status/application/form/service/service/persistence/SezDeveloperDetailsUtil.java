/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.sez.status.application.form.service.model.SezDeveloperDetails;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the sez developer details service. This utility wraps <code>com.nbp.sez.status.application.form.service.service.persistence.impl.SezDeveloperDetailsPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezDeveloperDetailsPersistence
 * @generated
 */
public class SezDeveloperDetailsUtil {

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
	public static void clearCache(SezDeveloperDetails sezDeveloperDetails) {
		getPersistence().clearCache(sezDeveloperDetails);
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
	public static Map<Serializable, SezDeveloperDetails> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<SezDeveloperDetails> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<SezDeveloperDetails> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<SezDeveloperDetails> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<SezDeveloperDetails> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static SezDeveloperDetails update(
		SezDeveloperDetails sezDeveloperDetails) {

		return getPersistence().update(sezDeveloperDetails);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static SezDeveloperDetails update(
		SezDeveloperDetails sezDeveloperDetails,
		ServiceContext serviceContext) {

		return getPersistence().update(sezDeveloperDetails, serviceContext);
	}

	/**
	 * Returns the sez developer details where sezStatusApplicationId = &#63; or throws a <code>NoSuchSezDeveloperDetailsException</code> if it could not be found.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez developer details
	 * @throws NoSuchSezDeveloperDetailsException if a matching sez developer details could not be found
	 */
	public static SezDeveloperDetails findBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezDeveloperDetailsException {

		return getPersistence().findBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Returns the sez developer details where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez developer details, or <code>null</code> if a matching sez developer details could not be found
	 */
	public static SezDeveloperDetails fetchBygetSezStatusByAppId(
		long sezStatusApplicationId) {

		return getPersistence().fetchBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Returns the sez developer details where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez developer details, or <code>null</code> if a matching sez developer details could not be found
	 */
	public static SezDeveloperDetails fetchBygetSezStatusByAppId(
		long sezStatusApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetSezStatusByAppId(
			sezStatusApplicationId, useFinderCache);
	}

	/**
	 * Removes the sez developer details where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the sez developer details that was removed
	 */
	public static SezDeveloperDetails removeBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezDeveloperDetailsException {

		return getPersistence().removeBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Returns the number of sez developer detailses where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez developer detailses
	 */
	public static int countBygetSezStatusByAppId(long sezStatusApplicationId) {
		return getPersistence().countBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Caches the sez developer details in the entity cache if it is enabled.
	 *
	 * @param sezDeveloperDetails the sez developer details
	 */
	public static void cacheResult(SezDeveloperDetails sezDeveloperDetails) {
		getPersistence().cacheResult(sezDeveloperDetails);
	}

	/**
	 * Caches the sez developer detailses in the entity cache if it is enabled.
	 *
	 * @param sezDeveloperDetailses the sez developer detailses
	 */
	public static void cacheResult(
		List<SezDeveloperDetails> sezDeveloperDetailses) {

		getPersistence().cacheResult(sezDeveloperDetailses);
	}

	/**
	 * Creates a new sez developer details with the primary key. Does not add the sez developer details to the database.
	 *
	 * @param sezDeveloperDetailsId the primary key for the new sez developer details
	 * @return the new sez developer details
	 */
	public static SezDeveloperDetails create(long sezDeveloperDetailsId) {
		return getPersistence().create(sezDeveloperDetailsId);
	}

	/**
	 * Removes the sez developer details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezDeveloperDetailsId the primary key of the sez developer details
	 * @return the sez developer details that was removed
	 * @throws NoSuchSezDeveloperDetailsException if a sez developer details with the primary key could not be found
	 */
	public static SezDeveloperDetails remove(long sezDeveloperDetailsId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezDeveloperDetailsException {

		return getPersistence().remove(sezDeveloperDetailsId);
	}

	public static SezDeveloperDetails updateImpl(
		SezDeveloperDetails sezDeveloperDetails) {

		return getPersistence().updateImpl(sezDeveloperDetails);
	}

	/**
	 * Returns the sez developer details with the primary key or throws a <code>NoSuchSezDeveloperDetailsException</code> if it could not be found.
	 *
	 * @param sezDeveloperDetailsId the primary key of the sez developer details
	 * @return the sez developer details
	 * @throws NoSuchSezDeveloperDetailsException if a sez developer details with the primary key could not be found
	 */
	public static SezDeveloperDetails findByPrimaryKey(
			long sezDeveloperDetailsId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezDeveloperDetailsException {

		return getPersistence().findByPrimaryKey(sezDeveloperDetailsId);
	}

	/**
	 * Returns the sez developer details with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezDeveloperDetailsId the primary key of the sez developer details
	 * @return the sez developer details, or <code>null</code> if a sez developer details with the primary key could not be found
	 */
	public static SezDeveloperDetails fetchByPrimaryKey(
		long sezDeveloperDetailsId) {

		return getPersistence().fetchByPrimaryKey(sezDeveloperDetailsId);
	}

	/**
	 * Returns all the sez developer detailses.
	 *
	 * @return the sez developer detailses
	 */
	public static List<SezDeveloperDetails> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the sez developer detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDeveloperDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez developer detailses
	 * @param end the upper bound of the range of sez developer detailses (not inclusive)
	 * @return the range of sez developer detailses
	 */
	public static List<SezDeveloperDetails> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the sez developer detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDeveloperDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez developer detailses
	 * @param end the upper bound of the range of sez developer detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez developer detailses
	 */
	public static List<SezDeveloperDetails> findAll(
		int start, int end,
		OrderByComparator<SezDeveloperDetails> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the sez developer detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDeveloperDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez developer detailses
	 * @param end the upper bound of the range of sez developer detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez developer detailses
	 */
	public static List<SezDeveloperDetails> findAll(
		int start, int end,
		OrderByComparator<SezDeveloperDetails> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the sez developer detailses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of sez developer detailses.
	 *
	 * @return the number of sez developer detailses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static SezDeveloperDetailsPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		SezDeveloperDetailsPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile SezDeveloperDetailsPersistence _persistence;

}