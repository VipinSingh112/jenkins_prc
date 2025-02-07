/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.acquire.application.form.service.model.AcquirePropertyDetails;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the acquire property details service. This utility wraps <code>com.nbp.acquire.application.form.service.service.persistence.impl.AcquirePropertyDetailsPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AcquirePropertyDetailsPersistence
 * @generated
 */
public class AcquirePropertyDetailsUtil {

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
		AcquirePropertyDetails acquirePropertyDetails) {

		getPersistence().clearCache(acquirePropertyDetails);
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
	public static Map<Serializable, AcquirePropertyDetails> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AcquirePropertyDetails> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AcquirePropertyDetails> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AcquirePropertyDetails> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AcquirePropertyDetails> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AcquirePropertyDetails update(
		AcquirePropertyDetails acquirePropertyDetails) {

		return getPersistence().update(acquirePropertyDetails);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AcquirePropertyDetails update(
		AcquirePropertyDetails acquirePropertyDetails,
		ServiceContext serviceContext) {

		return getPersistence().update(acquirePropertyDetails, serviceContext);
	}

	/**
	 * Returns the acquire property details where acquireApplicationId = &#63; or throws a <code>NoSuchAcquirePropertyDetailsException</code> if it could not be found.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the matching acquire property details
	 * @throws NoSuchAcquirePropertyDetailsException if a matching acquire property details could not be found
	 */
	public static AcquirePropertyDetails findBygetAcquireById(
			long acquireApplicationId)
		throws com.nbp.acquire.application.form.service.exception.
			NoSuchAcquirePropertyDetailsException {

		return getPersistence().findBygetAcquireById(acquireApplicationId);
	}

	/**
	 * Returns the acquire property details where acquireApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the matching acquire property details, or <code>null</code> if a matching acquire property details could not be found
	 */
	public static AcquirePropertyDetails fetchBygetAcquireById(
		long acquireApplicationId) {

		return getPersistence().fetchBygetAcquireById(acquireApplicationId);
	}

	/**
	 * Returns the acquire property details where acquireApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acquire property details, or <code>null</code> if a matching acquire property details could not be found
	 */
	public static AcquirePropertyDetails fetchBygetAcquireById(
		long acquireApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetAcquireById(
			acquireApplicationId, useFinderCache);
	}

	/**
	 * Removes the acquire property details where acquireApplicationId = &#63; from the database.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the acquire property details that was removed
	 */
	public static AcquirePropertyDetails removeBygetAcquireById(
			long acquireApplicationId)
		throws com.nbp.acquire.application.form.service.exception.
			NoSuchAcquirePropertyDetailsException {

		return getPersistence().removeBygetAcquireById(acquireApplicationId);
	}

	/**
	 * Returns the number of acquire property detailses where acquireApplicationId = &#63;.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the number of matching acquire property detailses
	 */
	public static int countBygetAcquireById(long acquireApplicationId) {
		return getPersistence().countBygetAcquireById(acquireApplicationId);
	}

	/**
	 * Caches the acquire property details in the entity cache if it is enabled.
	 *
	 * @param acquirePropertyDetails the acquire property details
	 */
	public static void cacheResult(
		AcquirePropertyDetails acquirePropertyDetails) {

		getPersistence().cacheResult(acquirePropertyDetails);
	}

	/**
	 * Caches the acquire property detailses in the entity cache if it is enabled.
	 *
	 * @param acquirePropertyDetailses the acquire property detailses
	 */
	public static void cacheResult(
		List<AcquirePropertyDetails> acquirePropertyDetailses) {

		getPersistence().cacheResult(acquirePropertyDetailses);
	}

	/**
	 * Creates a new acquire property details with the primary key. Does not add the acquire property details to the database.
	 *
	 * @param acquirePropertyDetailsId the primary key for the new acquire property details
	 * @return the new acquire property details
	 */
	public static AcquirePropertyDetails create(long acquirePropertyDetailsId) {
		return getPersistence().create(acquirePropertyDetailsId);
	}

	/**
	 * Removes the acquire property details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param acquirePropertyDetailsId the primary key of the acquire property details
	 * @return the acquire property details that was removed
	 * @throws NoSuchAcquirePropertyDetailsException if a acquire property details with the primary key could not be found
	 */
	public static AcquirePropertyDetails remove(long acquirePropertyDetailsId)
		throws com.nbp.acquire.application.form.service.exception.
			NoSuchAcquirePropertyDetailsException {

		return getPersistence().remove(acquirePropertyDetailsId);
	}

	public static AcquirePropertyDetails updateImpl(
		AcquirePropertyDetails acquirePropertyDetails) {

		return getPersistence().updateImpl(acquirePropertyDetails);
	}

	/**
	 * Returns the acquire property details with the primary key or throws a <code>NoSuchAcquirePropertyDetailsException</code> if it could not be found.
	 *
	 * @param acquirePropertyDetailsId the primary key of the acquire property details
	 * @return the acquire property details
	 * @throws NoSuchAcquirePropertyDetailsException if a acquire property details with the primary key could not be found
	 */
	public static AcquirePropertyDetails findByPrimaryKey(
			long acquirePropertyDetailsId)
		throws com.nbp.acquire.application.form.service.exception.
			NoSuchAcquirePropertyDetailsException {

		return getPersistence().findByPrimaryKey(acquirePropertyDetailsId);
	}

	/**
	 * Returns the acquire property details with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param acquirePropertyDetailsId the primary key of the acquire property details
	 * @return the acquire property details, or <code>null</code> if a acquire property details with the primary key could not be found
	 */
	public static AcquirePropertyDetails fetchByPrimaryKey(
		long acquirePropertyDetailsId) {

		return getPersistence().fetchByPrimaryKey(acquirePropertyDetailsId);
	}

	/**
	 * Returns all the acquire property detailses.
	 *
	 * @return the acquire property detailses
	 */
	public static List<AcquirePropertyDetails> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the acquire property detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquirePropertyDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire property detailses
	 * @param end the upper bound of the range of acquire property detailses (not inclusive)
	 * @return the range of acquire property detailses
	 */
	public static List<AcquirePropertyDetails> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the acquire property detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquirePropertyDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire property detailses
	 * @param end the upper bound of the range of acquire property detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of acquire property detailses
	 */
	public static List<AcquirePropertyDetails> findAll(
		int start, int end,
		OrderByComparator<AcquirePropertyDetails> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the acquire property detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquirePropertyDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire property detailses
	 * @param end the upper bound of the range of acquire property detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of acquire property detailses
	 */
	public static List<AcquirePropertyDetails> findAll(
		int start, int end,
		OrderByComparator<AcquirePropertyDetails> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the acquire property detailses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of acquire property detailses.
	 *
	 * @return the number of acquire property detailses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AcquirePropertyDetailsPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		AcquirePropertyDetailsPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile AcquirePropertyDetailsPersistence _persistence;

}