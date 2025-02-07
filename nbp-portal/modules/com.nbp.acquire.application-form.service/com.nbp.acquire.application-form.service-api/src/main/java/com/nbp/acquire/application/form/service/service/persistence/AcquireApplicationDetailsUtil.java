/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.acquire.application.form.service.model.AcquireApplicationDetails;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the acquire application details service. This utility wraps <code>com.nbp.acquire.application.form.service.service.persistence.impl.AcquireApplicationDetailsPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AcquireApplicationDetailsPersistence
 * @generated
 */
public class AcquireApplicationDetailsUtil {

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
		AcquireApplicationDetails acquireApplicationDetails) {

		getPersistence().clearCache(acquireApplicationDetails);
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
	public static Map<Serializable, AcquireApplicationDetails>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AcquireApplicationDetails> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AcquireApplicationDetails> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AcquireApplicationDetails> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AcquireApplicationDetails> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AcquireApplicationDetails update(
		AcquireApplicationDetails acquireApplicationDetails) {

		return getPersistence().update(acquireApplicationDetails);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AcquireApplicationDetails update(
		AcquireApplicationDetails acquireApplicationDetails,
		ServiceContext serviceContext) {

		return getPersistence().update(
			acquireApplicationDetails, serviceContext);
	}

	/**
	 * Returns the acquire application details where acquireApplicationId = &#63; or throws a <code>NoSuchAcquireApplicationDetailsException</code> if it could not be found.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the matching acquire application details
	 * @throws NoSuchAcquireApplicationDetailsException if a matching acquire application details could not be found
	 */
	public static AcquireApplicationDetails findBygetAcquireById(
			long acquireApplicationId)
		throws com.nbp.acquire.application.form.service.exception.
			NoSuchAcquireApplicationDetailsException {

		return getPersistence().findBygetAcquireById(acquireApplicationId);
	}

	/**
	 * Returns the acquire application details where acquireApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the matching acquire application details, or <code>null</code> if a matching acquire application details could not be found
	 */
	public static AcquireApplicationDetails fetchBygetAcquireById(
		long acquireApplicationId) {

		return getPersistence().fetchBygetAcquireById(acquireApplicationId);
	}

	/**
	 * Returns the acquire application details where acquireApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acquire application details, or <code>null</code> if a matching acquire application details could not be found
	 */
	public static AcquireApplicationDetails fetchBygetAcquireById(
		long acquireApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetAcquireById(
			acquireApplicationId, useFinderCache);
	}

	/**
	 * Removes the acquire application details where acquireApplicationId = &#63; from the database.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the acquire application details that was removed
	 */
	public static AcquireApplicationDetails removeBygetAcquireById(
			long acquireApplicationId)
		throws com.nbp.acquire.application.form.service.exception.
			NoSuchAcquireApplicationDetailsException {

		return getPersistence().removeBygetAcquireById(acquireApplicationId);
	}

	/**
	 * Returns the number of acquire application detailses where acquireApplicationId = &#63;.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the number of matching acquire application detailses
	 */
	public static int countBygetAcquireById(long acquireApplicationId) {
		return getPersistence().countBygetAcquireById(acquireApplicationId);
	}

	/**
	 * Caches the acquire application details in the entity cache if it is enabled.
	 *
	 * @param acquireApplicationDetails the acquire application details
	 */
	public static void cacheResult(
		AcquireApplicationDetails acquireApplicationDetails) {

		getPersistence().cacheResult(acquireApplicationDetails);
	}

	/**
	 * Caches the acquire application detailses in the entity cache if it is enabled.
	 *
	 * @param acquireApplicationDetailses the acquire application detailses
	 */
	public static void cacheResult(
		List<AcquireApplicationDetails> acquireApplicationDetailses) {

		getPersistence().cacheResult(acquireApplicationDetailses);
	}

	/**
	 * Creates a new acquire application details with the primary key. Does not add the acquire application details to the database.
	 *
	 * @param acquireApplicationDetailsId the primary key for the new acquire application details
	 * @return the new acquire application details
	 */
	public static AcquireApplicationDetails create(
		long acquireApplicationDetailsId) {

		return getPersistence().create(acquireApplicationDetailsId);
	}

	/**
	 * Removes the acquire application details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param acquireApplicationDetailsId the primary key of the acquire application details
	 * @return the acquire application details that was removed
	 * @throws NoSuchAcquireApplicationDetailsException if a acquire application details with the primary key could not be found
	 */
	public static AcquireApplicationDetails remove(
			long acquireApplicationDetailsId)
		throws com.nbp.acquire.application.form.service.exception.
			NoSuchAcquireApplicationDetailsException {

		return getPersistence().remove(acquireApplicationDetailsId);
	}

	public static AcquireApplicationDetails updateImpl(
		AcquireApplicationDetails acquireApplicationDetails) {

		return getPersistence().updateImpl(acquireApplicationDetails);
	}

	/**
	 * Returns the acquire application details with the primary key or throws a <code>NoSuchAcquireApplicationDetailsException</code> if it could not be found.
	 *
	 * @param acquireApplicationDetailsId the primary key of the acquire application details
	 * @return the acquire application details
	 * @throws NoSuchAcquireApplicationDetailsException if a acquire application details with the primary key could not be found
	 */
	public static AcquireApplicationDetails findByPrimaryKey(
			long acquireApplicationDetailsId)
		throws com.nbp.acquire.application.form.service.exception.
			NoSuchAcquireApplicationDetailsException {

		return getPersistence().findByPrimaryKey(acquireApplicationDetailsId);
	}

	/**
	 * Returns the acquire application details with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param acquireApplicationDetailsId the primary key of the acquire application details
	 * @return the acquire application details, or <code>null</code> if a acquire application details with the primary key could not be found
	 */
	public static AcquireApplicationDetails fetchByPrimaryKey(
		long acquireApplicationDetailsId) {

		return getPersistence().fetchByPrimaryKey(acquireApplicationDetailsId);
	}

	/**
	 * Returns all the acquire application detailses.
	 *
	 * @return the acquire application detailses
	 */
	public static List<AcquireApplicationDetails> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the acquire application detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireApplicationDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire application detailses
	 * @param end the upper bound of the range of acquire application detailses (not inclusive)
	 * @return the range of acquire application detailses
	 */
	public static List<AcquireApplicationDetails> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the acquire application detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireApplicationDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire application detailses
	 * @param end the upper bound of the range of acquire application detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of acquire application detailses
	 */
	public static List<AcquireApplicationDetails> findAll(
		int start, int end,
		OrderByComparator<AcquireApplicationDetails> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the acquire application detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireApplicationDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire application detailses
	 * @param end the upper bound of the range of acquire application detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of acquire application detailses
	 */
	public static List<AcquireApplicationDetails> findAll(
		int start, int end,
		OrderByComparator<AcquireApplicationDetails> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the acquire application detailses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of acquire application detailses.
	 *
	 * @return the number of acquire application detailses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AcquireApplicationDetailsPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		AcquireApplicationDetailsPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile AcquireApplicationDetailsPersistence _persistence;

}