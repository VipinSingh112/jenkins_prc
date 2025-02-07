/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.acquire.application.form.service.model.AcquireLandEmployment;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the acquire land employment service. This utility wraps <code>com.nbp.acquire.application.form.service.service.persistence.impl.AcquireLandEmploymentPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AcquireLandEmploymentPersistence
 * @generated
 */
public class AcquireLandEmploymentUtil {

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
	public static void clearCache(AcquireLandEmployment acquireLandEmployment) {
		getPersistence().clearCache(acquireLandEmployment);
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
	public static Map<Serializable, AcquireLandEmployment> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AcquireLandEmployment> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AcquireLandEmployment> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AcquireLandEmployment> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AcquireLandEmployment> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AcquireLandEmployment update(
		AcquireLandEmployment acquireLandEmployment) {

		return getPersistence().update(acquireLandEmployment);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AcquireLandEmployment update(
		AcquireLandEmployment acquireLandEmployment,
		ServiceContext serviceContext) {

		return getPersistence().update(acquireLandEmployment, serviceContext);
	}

	/**
	 * Returns the acquire land employment where acquireApplicationId = &#63; or throws a <code>NoSuchAcquireLandEmploymentException</code> if it could not be found.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the matching acquire land employment
	 * @throws NoSuchAcquireLandEmploymentException if a matching acquire land employment could not be found
	 */
	public static AcquireLandEmployment findBygetAcquireById(
			long acquireApplicationId)
		throws com.nbp.acquire.application.form.service.exception.
			NoSuchAcquireLandEmploymentException {

		return getPersistence().findBygetAcquireById(acquireApplicationId);
	}

	/**
	 * Returns the acquire land employment where acquireApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the matching acquire land employment, or <code>null</code> if a matching acquire land employment could not be found
	 */
	public static AcquireLandEmployment fetchBygetAcquireById(
		long acquireApplicationId) {

		return getPersistence().fetchBygetAcquireById(acquireApplicationId);
	}

	/**
	 * Returns the acquire land employment where acquireApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acquire land employment, or <code>null</code> if a matching acquire land employment could not be found
	 */
	public static AcquireLandEmployment fetchBygetAcquireById(
		long acquireApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetAcquireById(
			acquireApplicationId, useFinderCache);
	}

	/**
	 * Removes the acquire land employment where acquireApplicationId = &#63; from the database.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the acquire land employment that was removed
	 */
	public static AcquireLandEmployment removeBygetAcquireById(
			long acquireApplicationId)
		throws com.nbp.acquire.application.form.service.exception.
			NoSuchAcquireLandEmploymentException {

		return getPersistence().removeBygetAcquireById(acquireApplicationId);
	}

	/**
	 * Returns the number of acquire land employments where acquireApplicationId = &#63;.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the number of matching acquire land employments
	 */
	public static int countBygetAcquireById(long acquireApplicationId) {
		return getPersistence().countBygetAcquireById(acquireApplicationId);
	}

	/**
	 * Caches the acquire land employment in the entity cache if it is enabled.
	 *
	 * @param acquireLandEmployment the acquire land employment
	 */
	public static void cacheResult(
		AcquireLandEmployment acquireLandEmployment) {

		getPersistence().cacheResult(acquireLandEmployment);
	}

	/**
	 * Caches the acquire land employments in the entity cache if it is enabled.
	 *
	 * @param acquireLandEmployments the acquire land employments
	 */
	public static void cacheResult(
		List<AcquireLandEmployment> acquireLandEmployments) {

		getPersistence().cacheResult(acquireLandEmployments);
	}

	/**
	 * Creates a new acquire land employment with the primary key. Does not add the acquire land employment to the database.
	 *
	 * @param acquireLandEmploymentId the primary key for the new acquire land employment
	 * @return the new acquire land employment
	 */
	public static AcquireLandEmployment create(long acquireLandEmploymentId) {
		return getPersistence().create(acquireLandEmploymentId);
	}

	/**
	 * Removes the acquire land employment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param acquireLandEmploymentId the primary key of the acquire land employment
	 * @return the acquire land employment that was removed
	 * @throws NoSuchAcquireLandEmploymentException if a acquire land employment with the primary key could not be found
	 */
	public static AcquireLandEmployment remove(long acquireLandEmploymentId)
		throws com.nbp.acquire.application.form.service.exception.
			NoSuchAcquireLandEmploymentException {

		return getPersistence().remove(acquireLandEmploymentId);
	}

	public static AcquireLandEmployment updateImpl(
		AcquireLandEmployment acquireLandEmployment) {

		return getPersistence().updateImpl(acquireLandEmployment);
	}

	/**
	 * Returns the acquire land employment with the primary key or throws a <code>NoSuchAcquireLandEmploymentException</code> if it could not be found.
	 *
	 * @param acquireLandEmploymentId the primary key of the acquire land employment
	 * @return the acquire land employment
	 * @throws NoSuchAcquireLandEmploymentException if a acquire land employment with the primary key could not be found
	 */
	public static AcquireLandEmployment findByPrimaryKey(
			long acquireLandEmploymentId)
		throws com.nbp.acquire.application.form.service.exception.
			NoSuchAcquireLandEmploymentException {

		return getPersistence().findByPrimaryKey(acquireLandEmploymentId);
	}

	/**
	 * Returns the acquire land employment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param acquireLandEmploymentId the primary key of the acquire land employment
	 * @return the acquire land employment, or <code>null</code> if a acquire land employment with the primary key could not be found
	 */
	public static AcquireLandEmployment fetchByPrimaryKey(
		long acquireLandEmploymentId) {

		return getPersistence().fetchByPrimaryKey(acquireLandEmploymentId);
	}

	/**
	 * Returns all the acquire land employments.
	 *
	 * @return the acquire land employments
	 */
	public static List<AcquireLandEmployment> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the acquire land employments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireLandEmploymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire land employments
	 * @param end the upper bound of the range of acquire land employments (not inclusive)
	 * @return the range of acquire land employments
	 */
	public static List<AcquireLandEmployment> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the acquire land employments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireLandEmploymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire land employments
	 * @param end the upper bound of the range of acquire land employments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of acquire land employments
	 */
	public static List<AcquireLandEmployment> findAll(
		int start, int end,
		OrderByComparator<AcquireLandEmployment> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the acquire land employments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireLandEmploymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire land employments
	 * @param end the upper bound of the range of acquire land employments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of acquire land employments
	 */
	public static List<AcquireLandEmployment> findAll(
		int start, int end,
		OrderByComparator<AcquireLandEmployment> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the acquire land employments from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of acquire land employments.
	 *
	 * @return the number of acquire land employments
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AcquireLandEmploymentPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		AcquireLandEmploymentPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile AcquireLandEmploymentPersistence _persistence;

}