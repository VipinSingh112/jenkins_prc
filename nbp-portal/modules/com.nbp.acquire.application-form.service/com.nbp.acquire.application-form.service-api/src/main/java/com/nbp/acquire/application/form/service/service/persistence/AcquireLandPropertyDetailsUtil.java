/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.acquire.application.form.service.model.AcquireLandPropertyDetails;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the acquire land property details service. This utility wraps <code>com.nbp.acquire.application.form.service.service.persistence.impl.AcquireLandPropertyDetailsPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AcquireLandPropertyDetailsPersistence
 * @generated
 */
public class AcquireLandPropertyDetailsUtil {

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
		AcquireLandPropertyDetails acquireLandPropertyDetails) {

		getPersistence().clearCache(acquireLandPropertyDetails);
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
	public static Map<Serializable, AcquireLandPropertyDetails>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AcquireLandPropertyDetails> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AcquireLandPropertyDetails> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AcquireLandPropertyDetails> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AcquireLandPropertyDetails> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AcquireLandPropertyDetails update(
		AcquireLandPropertyDetails acquireLandPropertyDetails) {

		return getPersistence().update(acquireLandPropertyDetails);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AcquireLandPropertyDetails update(
		AcquireLandPropertyDetails acquireLandPropertyDetails,
		ServiceContext serviceContext) {

		return getPersistence().update(
			acquireLandPropertyDetails, serviceContext);
	}

	/**
	 * Returns the acquire land property details where acquireApplicationId = &#63; or throws a <code>NoSuchAcquireLandPropertyDetailsException</code> if it could not be found.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the matching acquire land property details
	 * @throws NoSuchAcquireLandPropertyDetailsException if a matching acquire land property details could not be found
	 */
	public static AcquireLandPropertyDetails findBygetAcquireById(
			long acquireApplicationId)
		throws com.nbp.acquire.application.form.service.exception.
			NoSuchAcquireLandPropertyDetailsException {

		return getPersistence().findBygetAcquireById(acquireApplicationId);
	}

	/**
	 * Returns the acquire land property details where acquireApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the matching acquire land property details, or <code>null</code> if a matching acquire land property details could not be found
	 */
	public static AcquireLandPropertyDetails fetchBygetAcquireById(
		long acquireApplicationId) {

		return getPersistence().fetchBygetAcquireById(acquireApplicationId);
	}

	/**
	 * Returns the acquire land property details where acquireApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acquire land property details, or <code>null</code> if a matching acquire land property details could not be found
	 */
	public static AcquireLandPropertyDetails fetchBygetAcquireById(
		long acquireApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetAcquireById(
			acquireApplicationId, useFinderCache);
	}

	/**
	 * Removes the acquire land property details where acquireApplicationId = &#63; from the database.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the acquire land property details that was removed
	 */
	public static AcquireLandPropertyDetails removeBygetAcquireById(
			long acquireApplicationId)
		throws com.nbp.acquire.application.form.service.exception.
			NoSuchAcquireLandPropertyDetailsException {

		return getPersistence().removeBygetAcquireById(acquireApplicationId);
	}

	/**
	 * Returns the number of acquire land property detailses where acquireApplicationId = &#63;.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the number of matching acquire land property detailses
	 */
	public static int countBygetAcquireById(long acquireApplicationId) {
		return getPersistence().countBygetAcquireById(acquireApplicationId);
	}

	/**
	 * Caches the acquire land property details in the entity cache if it is enabled.
	 *
	 * @param acquireLandPropertyDetails the acquire land property details
	 */
	public static void cacheResult(
		AcquireLandPropertyDetails acquireLandPropertyDetails) {

		getPersistence().cacheResult(acquireLandPropertyDetails);
	}

	/**
	 * Caches the acquire land property detailses in the entity cache if it is enabled.
	 *
	 * @param acquireLandPropertyDetailses the acquire land property detailses
	 */
	public static void cacheResult(
		List<AcquireLandPropertyDetails> acquireLandPropertyDetailses) {

		getPersistence().cacheResult(acquireLandPropertyDetailses);
	}

	/**
	 * Creates a new acquire land property details with the primary key. Does not add the acquire land property details to the database.
	 *
	 * @param acquireLandPropertyDetailsId the primary key for the new acquire land property details
	 * @return the new acquire land property details
	 */
	public static AcquireLandPropertyDetails create(
		long acquireLandPropertyDetailsId) {

		return getPersistence().create(acquireLandPropertyDetailsId);
	}

	/**
	 * Removes the acquire land property details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param acquireLandPropertyDetailsId the primary key of the acquire land property details
	 * @return the acquire land property details that was removed
	 * @throws NoSuchAcquireLandPropertyDetailsException if a acquire land property details with the primary key could not be found
	 */
	public static AcquireLandPropertyDetails remove(
			long acquireLandPropertyDetailsId)
		throws com.nbp.acquire.application.form.service.exception.
			NoSuchAcquireLandPropertyDetailsException {

		return getPersistence().remove(acquireLandPropertyDetailsId);
	}

	public static AcquireLandPropertyDetails updateImpl(
		AcquireLandPropertyDetails acquireLandPropertyDetails) {

		return getPersistence().updateImpl(acquireLandPropertyDetails);
	}

	/**
	 * Returns the acquire land property details with the primary key or throws a <code>NoSuchAcquireLandPropertyDetailsException</code> if it could not be found.
	 *
	 * @param acquireLandPropertyDetailsId the primary key of the acquire land property details
	 * @return the acquire land property details
	 * @throws NoSuchAcquireLandPropertyDetailsException if a acquire land property details with the primary key could not be found
	 */
	public static AcquireLandPropertyDetails findByPrimaryKey(
			long acquireLandPropertyDetailsId)
		throws com.nbp.acquire.application.form.service.exception.
			NoSuchAcquireLandPropertyDetailsException {

		return getPersistence().findByPrimaryKey(acquireLandPropertyDetailsId);
	}

	/**
	 * Returns the acquire land property details with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param acquireLandPropertyDetailsId the primary key of the acquire land property details
	 * @return the acquire land property details, or <code>null</code> if a acquire land property details with the primary key could not be found
	 */
	public static AcquireLandPropertyDetails fetchByPrimaryKey(
		long acquireLandPropertyDetailsId) {

		return getPersistence().fetchByPrimaryKey(acquireLandPropertyDetailsId);
	}

	/**
	 * Returns all the acquire land property detailses.
	 *
	 * @return the acquire land property detailses
	 */
	public static List<AcquireLandPropertyDetails> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the acquire land property detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireLandPropertyDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire land property detailses
	 * @param end the upper bound of the range of acquire land property detailses (not inclusive)
	 * @return the range of acquire land property detailses
	 */
	public static List<AcquireLandPropertyDetails> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the acquire land property detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireLandPropertyDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire land property detailses
	 * @param end the upper bound of the range of acquire land property detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of acquire land property detailses
	 */
	public static List<AcquireLandPropertyDetails> findAll(
		int start, int end,
		OrderByComparator<AcquireLandPropertyDetails> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the acquire land property detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireLandPropertyDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire land property detailses
	 * @param end the upper bound of the range of acquire land property detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of acquire land property detailses
	 */
	public static List<AcquireLandPropertyDetails> findAll(
		int start, int end,
		OrderByComparator<AcquireLandPropertyDetails> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the acquire land property detailses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of acquire land property detailses.
	 *
	 * @return the number of acquire land property detailses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AcquireLandPropertyDetailsPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		AcquireLandPropertyDetailsPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile AcquireLandPropertyDetailsPersistence _persistence;

}