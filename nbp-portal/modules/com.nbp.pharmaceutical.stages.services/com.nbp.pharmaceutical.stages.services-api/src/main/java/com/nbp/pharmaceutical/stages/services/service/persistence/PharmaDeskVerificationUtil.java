/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.stages.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.pharmaceutical.stages.services.model.PharmaDeskVerification;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the pharma desk verification service. This utility wraps <code>com.nbp.pharmaceutical.stages.services.service.persistence.impl.PharmaDeskVerificationPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PharmaDeskVerificationPersistence
 * @generated
 */
public class PharmaDeskVerificationUtil {

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
		PharmaDeskVerification pharmaDeskVerification) {

		getPersistence().clearCache(pharmaDeskVerification);
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
	public static Map<Serializable, PharmaDeskVerification> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<PharmaDeskVerification> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<PharmaDeskVerification> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<PharmaDeskVerification> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<PharmaDeskVerification> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static PharmaDeskVerification update(
		PharmaDeskVerification pharmaDeskVerification) {

		return getPersistence().update(pharmaDeskVerification);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static PharmaDeskVerification update(
		PharmaDeskVerification pharmaDeskVerification,
		ServiceContext serviceContext) {

		return getPersistence().update(pharmaDeskVerification, serviceContext);
	}

	/**
	 * Returns all the pharma desk verifications where pharmaApplicationId = &#63;.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the matching pharma desk verifications
	 */
	public static List<PharmaDeskVerification>
		findBygetDeskVerificationPharmaById(long pharmaApplicationId) {

		return getPersistence().findBygetDeskVerificationPharmaById(
			pharmaApplicationId);
	}

	/**
	 * Returns a range of all the pharma desk verifications where pharmaApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @param start the lower bound of the range of pharma desk verifications
	 * @param end the upper bound of the range of pharma desk verifications (not inclusive)
	 * @return the range of matching pharma desk verifications
	 */
	public static List<PharmaDeskVerification>
		findBygetDeskVerificationPharmaById(
			long pharmaApplicationId, int start, int end) {

		return getPersistence().findBygetDeskVerificationPharmaById(
			pharmaApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the pharma desk verifications where pharmaApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @param start the lower bound of the range of pharma desk verifications
	 * @param end the upper bound of the range of pharma desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching pharma desk verifications
	 */
	public static List<PharmaDeskVerification>
		findBygetDeskVerificationPharmaById(
			long pharmaApplicationId, int start, int end,
			OrderByComparator<PharmaDeskVerification> orderByComparator) {

		return getPersistence().findBygetDeskVerificationPharmaById(
			pharmaApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the pharma desk verifications where pharmaApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @param start the lower bound of the range of pharma desk verifications
	 * @param end the upper bound of the range of pharma desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching pharma desk verifications
	 */
	public static List<PharmaDeskVerification>
		findBygetDeskVerificationPharmaById(
			long pharmaApplicationId, int start, int end,
			OrderByComparator<PharmaDeskVerification> orderByComparator,
			boolean useFinderCache) {

		return getPersistence().findBygetDeskVerificationPharmaById(
			pharmaApplicationId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first pharma desk verification in the ordered set where pharmaApplicationId = &#63;.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pharma desk verification
	 * @throws NoSuchPharmaDeskVerificationException if a matching pharma desk verification could not be found
	 */
	public static PharmaDeskVerification
			findBygetDeskVerificationPharmaById_First(
				long pharmaApplicationId,
				OrderByComparator<PharmaDeskVerification> orderByComparator)
		throws com.nbp.pharmaceutical.stages.services.exception.
			NoSuchPharmaDeskVerificationException {

		return getPersistence().findBygetDeskVerificationPharmaById_First(
			pharmaApplicationId, orderByComparator);
	}

	/**
	 * Returns the first pharma desk verification in the ordered set where pharmaApplicationId = &#63;.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pharma desk verification, or <code>null</code> if a matching pharma desk verification could not be found
	 */
	public static PharmaDeskVerification
		fetchBygetDeskVerificationPharmaById_First(
			long pharmaApplicationId,
			OrderByComparator<PharmaDeskVerification> orderByComparator) {

		return getPersistence().fetchBygetDeskVerificationPharmaById_First(
			pharmaApplicationId, orderByComparator);
	}

	/**
	 * Returns the last pharma desk verification in the ordered set where pharmaApplicationId = &#63;.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pharma desk verification
	 * @throws NoSuchPharmaDeskVerificationException if a matching pharma desk verification could not be found
	 */
	public static PharmaDeskVerification
			findBygetDeskVerificationPharmaById_Last(
				long pharmaApplicationId,
				OrderByComparator<PharmaDeskVerification> orderByComparator)
		throws com.nbp.pharmaceutical.stages.services.exception.
			NoSuchPharmaDeskVerificationException {

		return getPersistence().findBygetDeskVerificationPharmaById_Last(
			pharmaApplicationId, orderByComparator);
	}

	/**
	 * Returns the last pharma desk verification in the ordered set where pharmaApplicationId = &#63;.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pharma desk verification, or <code>null</code> if a matching pharma desk verification could not be found
	 */
	public static PharmaDeskVerification
		fetchBygetDeskVerificationPharmaById_Last(
			long pharmaApplicationId,
			OrderByComparator<PharmaDeskVerification> orderByComparator) {

		return getPersistence().fetchBygetDeskVerificationPharmaById_Last(
			pharmaApplicationId, orderByComparator);
	}

	/**
	 * Returns the pharma desk verifications before and after the current pharma desk verification in the ordered set where pharmaApplicationId = &#63;.
	 *
	 * @param pharmaDeskVerificationId the primary key of the current pharma desk verification
	 * @param pharmaApplicationId the pharma application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next pharma desk verification
	 * @throws NoSuchPharmaDeskVerificationException if a pharma desk verification with the primary key could not be found
	 */
	public static PharmaDeskVerification[]
			findBygetDeskVerificationPharmaById_PrevAndNext(
				long pharmaDeskVerificationId, long pharmaApplicationId,
				OrderByComparator<PharmaDeskVerification> orderByComparator)
		throws com.nbp.pharmaceutical.stages.services.exception.
			NoSuchPharmaDeskVerificationException {

		return getPersistence().findBygetDeskVerificationPharmaById_PrevAndNext(
			pharmaDeskVerificationId, pharmaApplicationId, orderByComparator);
	}

	/**
	 * Removes all the pharma desk verifications where pharmaApplicationId = &#63; from the database.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 */
	public static void removeBygetDeskVerificationPharmaById(
		long pharmaApplicationId) {

		getPersistence().removeBygetDeskVerificationPharmaById(
			pharmaApplicationId);
	}

	/**
	 * Returns the number of pharma desk verifications where pharmaApplicationId = &#63;.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the number of matching pharma desk verifications
	 */
	public static int countBygetDeskVerificationPharmaById(
		long pharmaApplicationId) {

		return getPersistence().countBygetDeskVerificationPharmaById(
			pharmaApplicationId);
	}

	/**
	 * Caches the pharma desk verification in the entity cache if it is enabled.
	 *
	 * @param pharmaDeskVerification the pharma desk verification
	 */
	public static void cacheResult(
		PharmaDeskVerification pharmaDeskVerification) {

		getPersistence().cacheResult(pharmaDeskVerification);
	}

	/**
	 * Caches the pharma desk verifications in the entity cache if it is enabled.
	 *
	 * @param pharmaDeskVerifications the pharma desk verifications
	 */
	public static void cacheResult(
		List<PharmaDeskVerification> pharmaDeskVerifications) {

		getPersistence().cacheResult(pharmaDeskVerifications);
	}

	/**
	 * Creates a new pharma desk verification with the primary key. Does not add the pharma desk verification to the database.
	 *
	 * @param pharmaDeskVerificationId the primary key for the new pharma desk verification
	 * @return the new pharma desk verification
	 */
	public static PharmaDeskVerification create(long pharmaDeskVerificationId) {
		return getPersistence().create(pharmaDeskVerificationId);
	}

	/**
	 * Removes the pharma desk verification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param pharmaDeskVerificationId the primary key of the pharma desk verification
	 * @return the pharma desk verification that was removed
	 * @throws NoSuchPharmaDeskVerificationException if a pharma desk verification with the primary key could not be found
	 */
	public static PharmaDeskVerification remove(long pharmaDeskVerificationId)
		throws com.nbp.pharmaceutical.stages.services.exception.
			NoSuchPharmaDeskVerificationException {

		return getPersistence().remove(pharmaDeskVerificationId);
	}

	public static PharmaDeskVerification updateImpl(
		PharmaDeskVerification pharmaDeskVerification) {

		return getPersistence().updateImpl(pharmaDeskVerification);
	}

	/**
	 * Returns the pharma desk verification with the primary key or throws a <code>NoSuchPharmaDeskVerificationException</code> if it could not be found.
	 *
	 * @param pharmaDeskVerificationId the primary key of the pharma desk verification
	 * @return the pharma desk verification
	 * @throws NoSuchPharmaDeskVerificationException if a pharma desk verification with the primary key could not be found
	 */
	public static PharmaDeskVerification findByPrimaryKey(
			long pharmaDeskVerificationId)
		throws com.nbp.pharmaceutical.stages.services.exception.
			NoSuchPharmaDeskVerificationException {

		return getPersistence().findByPrimaryKey(pharmaDeskVerificationId);
	}

	/**
	 * Returns the pharma desk verification with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param pharmaDeskVerificationId the primary key of the pharma desk verification
	 * @return the pharma desk verification, or <code>null</code> if a pharma desk verification with the primary key could not be found
	 */
	public static PharmaDeskVerification fetchByPrimaryKey(
		long pharmaDeskVerificationId) {

		return getPersistence().fetchByPrimaryKey(pharmaDeskVerificationId);
	}

	/**
	 * Returns all the pharma desk verifications.
	 *
	 * @return the pharma desk verifications
	 */
	public static List<PharmaDeskVerification> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the pharma desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma desk verifications
	 * @param end the upper bound of the range of pharma desk verifications (not inclusive)
	 * @return the range of pharma desk verifications
	 */
	public static List<PharmaDeskVerification> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the pharma desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma desk verifications
	 * @param end the upper bound of the range of pharma desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of pharma desk verifications
	 */
	public static List<PharmaDeskVerification> findAll(
		int start, int end,
		OrderByComparator<PharmaDeskVerification> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the pharma desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma desk verifications
	 * @param end the upper bound of the range of pharma desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of pharma desk verifications
	 */
	public static List<PharmaDeskVerification> findAll(
		int start, int end,
		OrderByComparator<PharmaDeskVerification> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the pharma desk verifications from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of pharma desk verifications.
	 *
	 * @return the number of pharma desk verifications
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static PharmaDeskVerificationPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		PharmaDeskVerificationPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile PharmaDeskVerificationPersistence _persistence;

}