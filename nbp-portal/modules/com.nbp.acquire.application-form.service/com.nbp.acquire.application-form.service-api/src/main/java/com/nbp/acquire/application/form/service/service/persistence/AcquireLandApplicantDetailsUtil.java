/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.acquire.application.form.service.model.AcquireLandApplicantDetails;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the acquire land applicant details service. This utility wraps <code>com.nbp.acquire.application.form.service.service.persistence.impl.AcquireLandApplicantDetailsPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AcquireLandApplicantDetailsPersistence
 * @generated
 */
public class AcquireLandApplicantDetailsUtil {

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
		AcquireLandApplicantDetails acquireLandApplicantDetails) {

		getPersistence().clearCache(acquireLandApplicantDetails);
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
	public static Map<Serializable, AcquireLandApplicantDetails>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AcquireLandApplicantDetails> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AcquireLandApplicantDetails> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AcquireLandApplicantDetails> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AcquireLandApplicantDetails> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AcquireLandApplicantDetails update(
		AcquireLandApplicantDetails acquireLandApplicantDetails) {

		return getPersistence().update(acquireLandApplicantDetails);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AcquireLandApplicantDetails update(
		AcquireLandApplicantDetails acquireLandApplicantDetails,
		ServiceContext serviceContext) {

		return getPersistence().update(
			acquireLandApplicantDetails, serviceContext);
	}

	/**
	 * Returns the acquire land applicant details where acquireApplicationId = &#63; or throws a <code>NoSuchAcquireLandApplicantDetailsException</code> if it could not be found.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the matching acquire land applicant details
	 * @throws NoSuchAcquireLandApplicantDetailsException if a matching acquire land applicant details could not be found
	 */
	public static AcquireLandApplicantDetails findBygetAcquireById(
			long acquireApplicationId)
		throws com.nbp.acquire.application.form.service.exception.
			NoSuchAcquireLandApplicantDetailsException {

		return getPersistence().findBygetAcquireById(acquireApplicationId);
	}

	/**
	 * Returns the acquire land applicant details where acquireApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the matching acquire land applicant details, or <code>null</code> if a matching acquire land applicant details could not be found
	 */
	public static AcquireLandApplicantDetails fetchBygetAcquireById(
		long acquireApplicationId) {

		return getPersistence().fetchBygetAcquireById(acquireApplicationId);
	}

	/**
	 * Returns the acquire land applicant details where acquireApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acquire land applicant details, or <code>null</code> if a matching acquire land applicant details could not be found
	 */
	public static AcquireLandApplicantDetails fetchBygetAcquireById(
		long acquireApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetAcquireById(
			acquireApplicationId, useFinderCache);
	}

	/**
	 * Removes the acquire land applicant details where acquireApplicationId = &#63; from the database.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the acquire land applicant details that was removed
	 */
	public static AcquireLandApplicantDetails removeBygetAcquireById(
			long acquireApplicationId)
		throws com.nbp.acquire.application.form.service.exception.
			NoSuchAcquireLandApplicantDetailsException {

		return getPersistence().removeBygetAcquireById(acquireApplicationId);
	}

	/**
	 * Returns the number of acquire land applicant detailses where acquireApplicationId = &#63;.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the number of matching acquire land applicant detailses
	 */
	public static int countBygetAcquireById(long acquireApplicationId) {
		return getPersistence().countBygetAcquireById(acquireApplicationId);
	}

	/**
	 * Caches the acquire land applicant details in the entity cache if it is enabled.
	 *
	 * @param acquireLandApplicantDetails the acquire land applicant details
	 */
	public static void cacheResult(
		AcquireLandApplicantDetails acquireLandApplicantDetails) {

		getPersistence().cacheResult(acquireLandApplicantDetails);
	}

	/**
	 * Caches the acquire land applicant detailses in the entity cache if it is enabled.
	 *
	 * @param acquireLandApplicantDetailses the acquire land applicant detailses
	 */
	public static void cacheResult(
		List<AcquireLandApplicantDetails> acquireLandApplicantDetailses) {

		getPersistence().cacheResult(acquireLandApplicantDetailses);
	}

	/**
	 * Creates a new acquire land applicant details with the primary key. Does not add the acquire land applicant details to the database.
	 *
	 * @param acquireLandApplicantDetailsId the primary key for the new acquire land applicant details
	 * @return the new acquire land applicant details
	 */
	public static AcquireLandApplicantDetails create(
		long acquireLandApplicantDetailsId) {

		return getPersistence().create(acquireLandApplicantDetailsId);
	}

	/**
	 * Removes the acquire land applicant details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param acquireLandApplicantDetailsId the primary key of the acquire land applicant details
	 * @return the acquire land applicant details that was removed
	 * @throws NoSuchAcquireLandApplicantDetailsException if a acquire land applicant details with the primary key could not be found
	 */
	public static AcquireLandApplicantDetails remove(
			long acquireLandApplicantDetailsId)
		throws com.nbp.acquire.application.form.service.exception.
			NoSuchAcquireLandApplicantDetailsException {

		return getPersistence().remove(acquireLandApplicantDetailsId);
	}

	public static AcquireLandApplicantDetails updateImpl(
		AcquireLandApplicantDetails acquireLandApplicantDetails) {

		return getPersistence().updateImpl(acquireLandApplicantDetails);
	}

	/**
	 * Returns the acquire land applicant details with the primary key or throws a <code>NoSuchAcquireLandApplicantDetailsException</code> if it could not be found.
	 *
	 * @param acquireLandApplicantDetailsId the primary key of the acquire land applicant details
	 * @return the acquire land applicant details
	 * @throws NoSuchAcquireLandApplicantDetailsException if a acquire land applicant details with the primary key could not be found
	 */
	public static AcquireLandApplicantDetails findByPrimaryKey(
			long acquireLandApplicantDetailsId)
		throws com.nbp.acquire.application.form.service.exception.
			NoSuchAcquireLandApplicantDetailsException {

		return getPersistence().findByPrimaryKey(acquireLandApplicantDetailsId);
	}

	/**
	 * Returns the acquire land applicant details with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param acquireLandApplicantDetailsId the primary key of the acquire land applicant details
	 * @return the acquire land applicant details, or <code>null</code> if a acquire land applicant details with the primary key could not be found
	 */
	public static AcquireLandApplicantDetails fetchByPrimaryKey(
		long acquireLandApplicantDetailsId) {

		return getPersistence().fetchByPrimaryKey(
			acquireLandApplicantDetailsId);
	}

	/**
	 * Returns all the acquire land applicant detailses.
	 *
	 * @return the acquire land applicant detailses
	 */
	public static List<AcquireLandApplicantDetails> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the acquire land applicant detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireLandApplicantDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire land applicant detailses
	 * @param end the upper bound of the range of acquire land applicant detailses (not inclusive)
	 * @return the range of acquire land applicant detailses
	 */
	public static List<AcquireLandApplicantDetails> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the acquire land applicant detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireLandApplicantDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire land applicant detailses
	 * @param end the upper bound of the range of acquire land applicant detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of acquire land applicant detailses
	 */
	public static List<AcquireLandApplicantDetails> findAll(
		int start, int end,
		OrderByComparator<AcquireLandApplicantDetails> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the acquire land applicant detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireLandApplicantDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire land applicant detailses
	 * @param end the upper bound of the range of acquire land applicant detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of acquire land applicant detailses
	 */
	public static List<AcquireLandApplicantDetails> findAll(
		int start, int end,
		OrderByComparator<AcquireLandApplicantDetails> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the acquire land applicant detailses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of acquire land applicant detailses.
	 *
	 * @return the number of acquire land applicant detailses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AcquireLandApplicantDetailsPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		AcquireLandApplicantDetailsPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile AcquireLandApplicantDetailsPersistence _persistence;

}