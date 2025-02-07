/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.stages.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.acquire.stages.service.model.AcquireDeskVerification;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the acquire desk verification service. This utility wraps <code>com.nbp.acquire.stages.service.service.persistence.impl.AcquireDeskVerificationPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AcquireDeskVerificationPersistence
 * @generated
 */
public class AcquireDeskVerificationUtil {

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
		AcquireDeskVerification acquireDeskVerification) {

		getPersistence().clearCache(acquireDeskVerification);
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
	public static Map<Serializable, AcquireDeskVerification> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AcquireDeskVerification> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AcquireDeskVerification> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AcquireDeskVerification> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AcquireDeskVerification> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AcquireDeskVerification update(
		AcquireDeskVerification acquireDeskVerification) {

		return getPersistence().update(acquireDeskVerification);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AcquireDeskVerification update(
		AcquireDeskVerification acquireDeskVerification,
		ServiceContext serviceContext) {

		return getPersistence().update(acquireDeskVerification, serviceContext);
	}

	/**
	 * Returns all the acquire desk verifications where acquireApplicationId = &#63;.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the matching acquire desk verifications
	 */
	public static List<AcquireDeskVerification>
		findBygetDeskVerificationAcquireById(long acquireApplicationId) {

		return getPersistence().findBygetDeskVerificationAcquireById(
			acquireApplicationId);
	}

	/**
	 * Returns a range of all the acquire desk verifications where acquireApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @param start the lower bound of the range of acquire desk verifications
	 * @param end the upper bound of the range of acquire desk verifications (not inclusive)
	 * @return the range of matching acquire desk verifications
	 */
	public static List<AcquireDeskVerification>
		findBygetDeskVerificationAcquireById(
			long acquireApplicationId, int start, int end) {

		return getPersistence().findBygetDeskVerificationAcquireById(
			acquireApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the acquire desk verifications where acquireApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @param start the lower bound of the range of acquire desk verifications
	 * @param end the upper bound of the range of acquire desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acquire desk verifications
	 */
	public static List<AcquireDeskVerification>
		findBygetDeskVerificationAcquireById(
			long acquireApplicationId, int start, int end,
			OrderByComparator<AcquireDeskVerification> orderByComparator) {

		return getPersistence().findBygetDeskVerificationAcquireById(
			acquireApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the acquire desk verifications where acquireApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @param start the lower bound of the range of acquire desk verifications
	 * @param end the upper bound of the range of acquire desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acquire desk verifications
	 */
	public static List<AcquireDeskVerification>
		findBygetDeskVerificationAcquireById(
			long acquireApplicationId, int start, int end,
			OrderByComparator<AcquireDeskVerification> orderByComparator,
			boolean useFinderCache) {

		return getPersistence().findBygetDeskVerificationAcquireById(
			acquireApplicationId, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first acquire desk verification in the ordered set where acquireApplicationId = &#63;.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acquire desk verification
	 * @throws NoSuchAcquireDeskVerificationException if a matching acquire desk verification could not be found
	 */
	public static AcquireDeskVerification
			findBygetDeskVerificationAcquireById_First(
				long acquireApplicationId,
				OrderByComparator<AcquireDeskVerification> orderByComparator)
		throws com.nbp.acquire.stages.service.exception.
			NoSuchAcquireDeskVerificationException {

		return getPersistence().findBygetDeskVerificationAcquireById_First(
			acquireApplicationId, orderByComparator);
	}

	/**
	 * Returns the first acquire desk verification in the ordered set where acquireApplicationId = &#63;.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acquire desk verification, or <code>null</code> if a matching acquire desk verification could not be found
	 */
	public static AcquireDeskVerification
		fetchBygetDeskVerificationAcquireById_First(
			long acquireApplicationId,
			OrderByComparator<AcquireDeskVerification> orderByComparator) {

		return getPersistence().fetchBygetDeskVerificationAcquireById_First(
			acquireApplicationId, orderByComparator);
	}

	/**
	 * Returns the last acquire desk verification in the ordered set where acquireApplicationId = &#63;.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acquire desk verification
	 * @throws NoSuchAcquireDeskVerificationException if a matching acquire desk verification could not be found
	 */
	public static AcquireDeskVerification
			findBygetDeskVerificationAcquireById_Last(
				long acquireApplicationId,
				OrderByComparator<AcquireDeskVerification> orderByComparator)
		throws com.nbp.acquire.stages.service.exception.
			NoSuchAcquireDeskVerificationException {

		return getPersistence().findBygetDeskVerificationAcquireById_Last(
			acquireApplicationId, orderByComparator);
	}

	/**
	 * Returns the last acquire desk verification in the ordered set where acquireApplicationId = &#63;.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acquire desk verification, or <code>null</code> if a matching acquire desk verification could not be found
	 */
	public static AcquireDeskVerification
		fetchBygetDeskVerificationAcquireById_Last(
			long acquireApplicationId,
			OrderByComparator<AcquireDeskVerification> orderByComparator) {

		return getPersistence().fetchBygetDeskVerificationAcquireById_Last(
			acquireApplicationId, orderByComparator);
	}

	/**
	 * Returns the acquire desk verifications before and after the current acquire desk verification in the ordered set where acquireApplicationId = &#63;.
	 *
	 * @param acquireDeskVerificationId the primary key of the current acquire desk verification
	 * @param acquireApplicationId the acquire application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acquire desk verification
	 * @throws NoSuchAcquireDeskVerificationException if a acquire desk verification with the primary key could not be found
	 */
	public static AcquireDeskVerification[]
			findBygetDeskVerificationAcquireById_PrevAndNext(
				long acquireDeskVerificationId, long acquireApplicationId,
				OrderByComparator<AcquireDeskVerification> orderByComparator)
		throws com.nbp.acquire.stages.service.exception.
			NoSuchAcquireDeskVerificationException {

		return getPersistence().
			findBygetDeskVerificationAcquireById_PrevAndNext(
				acquireDeskVerificationId, acquireApplicationId,
				orderByComparator);
	}

	/**
	 * Removes all the acquire desk verifications where acquireApplicationId = &#63; from the database.
	 *
	 * @param acquireApplicationId the acquire application ID
	 */
	public static void removeBygetDeskVerificationAcquireById(
		long acquireApplicationId) {

		getPersistence().removeBygetDeskVerificationAcquireById(
			acquireApplicationId);
	}

	/**
	 * Returns the number of acquire desk verifications where acquireApplicationId = &#63;.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the number of matching acquire desk verifications
	 */
	public static int countBygetDeskVerificationAcquireById(
		long acquireApplicationId) {

		return getPersistence().countBygetDeskVerificationAcquireById(
			acquireApplicationId);
	}

	/**
	 * Caches the acquire desk verification in the entity cache if it is enabled.
	 *
	 * @param acquireDeskVerification the acquire desk verification
	 */
	public static void cacheResult(
		AcquireDeskVerification acquireDeskVerification) {

		getPersistence().cacheResult(acquireDeskVerification);
	}

	/**
	 * Caches the acquire desk verifications in the entity cache if it is enabled.
	 *
	 * @param acquireDeskVerifications the acquire desk verifications
	 */
	public static void cacheResult(
		List<AcquireDeskVerification> acquireDeskVerifications) {

		getPersistence().cacheResult(acquireDeskVerifications);
	}

	/**
	 * Creates a new acquire desk verification with the primary key. Does not add the acquire desk verification to the database.
	 *
	 * @param acquireDeskVerificationId the primary key for the new acquire desk verification
	 * @return the new acquire desk verification
	 */
	public static AcquireDeskVerification create(
		long acquireDeskVerificationId) {

		return getPersistence().create(acquireDeskVerificationId);
	}

	/**
	 * Removes the acquire desk verification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param acquireDeskVerificationId the primary key of the acquire desk verification
	 * @return the acquire desk verification that was removed
	 * @throws NoSuchAcquireDeskVerificationException if a acquire desk verification with the primary key could not be found
	 */
	public static AcquireDeskVerification remove(long acquireDeskVerificationId)
		throws com.nbp.acquire.stages.service.exception.
			NoSuchAcquireDeskVerificationException {

		return getPersistence().remove(acquireDeskVerificationId);
	}

	public static AcquireDeskVerification updateImpl(
		AcquireDeskVerification acquireDeskVerification) {

		return getPersistence().updateImpl(acquireDeskVerification);
	}

	/**
	 * Returns the acquire desk verification with the primary key or throws a <code>NoSuchAcquireDeskVerificationException</code> if it could not be found.
	 *
	 * @param acquireDeskVerificationId the primary key of the acquire desk verification
	 * @return the acquire desk verification
	 * @throws NoSuchAcquireDeskVerificationException if a acquire desk verification with the primary key could not be found
	 */
	public static AcquireDeskVerification findByPrimaryKey(
			long acquireDeskVerificationId)
		throws com.nbp.acquire.stages.service.exception.
			NoSuchAcquireDeskVerificationException {

		return getPersistence().findByPrimaryKey(acquireDeskVerificationId);
	}

	/**
	 * Returns the acquire desk verification with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param acquireDeskVerificationId the primary key of the acquire desk verification
	 * @return the acquire desk verification, or <code>null</code> if a acquire desk verification with the primary key could not be found
	 */
	public static AcquireDeskVerification fetchByPrimaryKey(
		long acquireDeskVerificationId) {

		return getPersistence().fetchByPrimaryKey(acquireDeskVerificationId);
	}

	/**
	 * Returns all the acquire desk verifications.
	 *
	 * @return the acquire desk verifications
	 */
	public static List<AcquireDeskVerification> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the acquire desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire desk verifications
	 * @param end the upper bound of the range of acquire desk verifications (not inclusive)
	 * @return the range of acquire desk verifications
	 */
	public static List<AcquireDeskVerification> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the acquire desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire desk verifications
	 * @param end the upper bound of the range of acquire desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of acquire desk verifications
	 */
	public static List<AcquireDeskVerification> findAll(
		int start, int end,
		OrderByComparator<AcquireDeskVerification> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the acquire desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire desk verifications
	 * @param end the upper bound of the range of acquire desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of acquire desk verifications
	 */
	public static List<AcquireDeskVerification> findAll(
		int start, int end,
		OrderByComparator<AcquireDeskVerification> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the acquire desk verifications from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of acquire desk verifications.
	 *
	 * @return the number of acquire desk verifications
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AcquireDeskVerificationPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		AcquireDeskVerificationPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile AcquireDeskVerificationPersistence _persistence;

}