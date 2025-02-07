/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.stages.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.creative.stages.services.model.CreativeDeskVerification;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the creative desk verification service. This utility wraps <code>com.nbp.creative.stages.services.service.persistence.impl.CreativeDeskVerificationPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CreativeDeskVerificationPersistence
 * @generated
 */
public class CreativeDeskVerificationUtil {

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
		CreativeDeskVerification creativeDeskVerification) {

		getPersistence().clearCache(creativeDeskVerification);
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
	public static Map<Serializable, CreativeDeskVerification>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<CreativeDeskVerification> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CreativeDeskVerification> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CreativeDeskVerification> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<CreativeDeskVerification> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static CreativeDeskVerification update(
		CreativeDeskVerification creativeDeskVerification) {

		return getPersistence().update(creativeDeskVerification);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static CreativeDeskVerification update(
		CreativeDeskVerification creativeDeskVerification,
		ServiceContext serviceContext) {

		return getPersistence().update(
			creativeDeskVerification, serviceContext);
	}

	/**
	 * Returns all the creative desk verifications where creativeApplicationId = &#63;.
	 *
	 * @param creativeApplicationId the creative application ID
	 * @return the matching creative desk verifications
	 */
	public static List<CreativeDeskVerification> findBygetDeskVerCreativeById(
		long creativeApplicationId) {

		return getPersistence().findBygetDeskVerCreativeById(
			creativeApplicationId);
	}

	/**
	 * Returns a range of all the creative desk verifications where creativeApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param creativeApplicationId the creative application ID
	 * @param start the lower bound of the range of creative desk verifications
	 * @param end the upper bound of the range of creative desk verifications (not inclusive)
	 * @return the range of matching creative desk verifications
	 */
	public static List<CreativeDeskVerification> findBygetDeskVerCreativeById(
		long creativeApplicationId, int start, int end) {

		return getPersistence().findBygetDeskVerCreativeById(
			creativeApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the creative desk verifications where creativeApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param creativeApplicationId the creative application ID
	 * @param start the lower bound of the range of creative desk verifications
	 * @param end the upper bound of the range of creative desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching creative desk verifications
	 */
	public static List<CreativeDeskVerification> findBygetDeskVerCreativeById(
		long creativeApplicationId, int start, int end,
		OrderByComparator<CreativeDeskVerification> orderByComparator) {

		return getPersistence().findBygetDeskVerCreativeById(
			creativeApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the creative desk verifications where creativeApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param creativeApplicationId the creative application ID
	 * @param start the lower bound of the range of creative desk verifications
	 * @param end the upper bound of the range of creative desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching creative desk verifications
	 */
	public static List<CreativeDeskVerification> findBygetDeskVerCreativeById(
		long creativeApplicationId, int start, int end,
		OrderByComparator<CreativeDeskVerification> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetDeskVerCreativeById(
			creativeApplicationId, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first creative desk verification in the ordered set where creativeApplicationId = &#63;.
	 *
	 * @param creativeApplicationId the creative application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching creative desk verification
	 * @throws NoSuchCreativeDeskVerificationException if a matching creative desk verification could not be found
	 */
	public static CreativeDeskVerification findBygetDeskVerCreativeById_First(
			long creativeApplicationId,
			OrderByComparator<CreativeDeskVerification> orderByComparator)
		throws com.nbp.creative.stages.services.exception.
			NoSuchCreativeDeskVerificationException {

		return getPersistence().findBygetDeskVerCreativeById_First(
			creativeApplicationId, orderByComparator);
	}

	/**
	 * Returns the first creative desk verification in the ordered set where creativeApplicationId = &#63;.
	 *
	 * @param creativeApplicationId the creative application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching creative desk verification, or <code>null</code> if a matching creative desk verification could not be found
	 */
	public static CreativeDeskVerification fetchBygetDeskVerCreativeById_First(
		long creativeApplicationId,
		OrderByComparator<CreativeDeskVerification> orderByComparator) {

		return getPersistence().fetchBygetDeskVerCreativeById_First(
			creativeApplicationId, orderByComparator);
	}

	/**
	 * Returns the last creative desk verification in the ordered set where creativeApplicationId = &#63;.
	 *
	 * @param creativeApplicationId the creative application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching creative desk verification
	 * @throws NoSuchCreativeDeskVerificationException if a matching creative desk verification could not be found
	 */
	public static CreativeDeskVerification findBygetDeskVerCreativeById_Last(
			long creativeApplicationId,
			OrderByComparator<CreativeDeskVerification> orderByComparator)
		throws com.nbp.creative.stages.services.exception.
			NoSuchCreativeDeskVerificationException {

		return getPersistence().findBygetDeskVerCreativeById_Last(
			creativeApplicationId, orderByComparator);
	}

	/**
	 * Returns the last creative desk verification in the ordered set where creativeApplicationId = &#63;.
	 *
	 * @param creativeApplicationId the creative application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching creative desk verification, or <code>null</code> if a matching creative desk verification could not be found
	 */
	public static CreativeDeskVerification fetchBygetDeskVerCreativeById_Last(
		long creativeApplicationId,
		OrderByComparator<CreativeDeskVerification> orderByComparator) {

		return getPersistence().fetchBygetDeskVerCreativeById_Last(
			creativeApplicationId, orderByComparator);
	}

	/**
	 * Returns the creative desk verifications before and after the current creative desk verification in the ordered set where creativeApplicationId = &#63;.
	 *
	 * @param creativeDeskVerificationId the primary key of the current creative desk verification
	 * @param creativeApplicationId the creative application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next creative desk verification
	 * @throws NoSuchCreativeDeskVerificationException if a creative desk verification with the primary key could not be found
	 */
	public static CreativeDeskVerification[]
			findBygetDeskVerCreativeById_PrevAndNext(
				long creativeDeskVerificationId, long creativeApplicationId,
				OrderByComparator<CreativeDeskVerification> orderByComparator)
		throws com.nbp.creative.stages.services.exception.
			NoSuchCreativeDeskVerificationException {

		return getPersistence().findBygetDeskVerCreativeById_PrevAndNext(
			creativeDeskVerificationId, creativeApplicationId,
			orderByComparator);
	}

	/**
	 * Removes all the creative desk verifications where creativeApplicationId = &#63; from the database.
	 *
	 * @param creativeApplicationId the creative application ID
	 */
	public static void removeBygetDeskVerCreativeById(
		long creativeApplicationId) {

		getPersistence().removeBygetDeskVerCreativeById(creativeApplicationId);
	}

	/**
	 * Returns the number of creative desk verifications where creativeApplicationId = &#63;.
	 *
	 * @param creativeApplicationId the creative application ID
	 * @return the number of matching creative desk verifications
	 */
	public static int countBygetDeskVerCreativeById(
		long creativeApplicationId) {

		return getPersistence().countBygetDeskVerCreativeById(
			creativeApplicationId);
	}

	/**
	 * Caches the creative desk verification in the entity cache if it is enabled.
	 *
	 * @param creativeDeskVerification the creative desk verification
	 */
	public static void cacheResult(
		CreativeDeskVerification creativeDeskVerification) {

		getPersistence().cacheResult(creativeDeskVerification);
	}

	/**
	 * Caches the creative desk verifications in the entity cache if it is enabled.
	 *
	 * @param creativeDeskVerifications the creative desk verifications
	 */
	public static void cacheResult(
		List<CreativeDeskVerification> creativeDeskVerifications) {

		getPersistence().cacheResult(creativeDeskVerifications);
	}

	/**
	 * Creates a new creative desk verification with the primary key. Does not add the creative desk verification to the database.
	 *
	 * @param creativeDeskVerificationId the primary key for the new creative desk verification
	 * @return the new creative desk verification
	 */
	public static CreativeDeskVerification create(
		long creativeDeskVerificationId) {

		return getPersistence().create(creativeDeskVerificationId);
	}

	/**
	 * Removes the creative desk verification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param creativeDeskVerificationId the primary key of the creative desk verification
	 * @return the creative desk verification that was removed
	 * @throws NoSuchCreativeDeskVerificationException if a creative desk verification with the primary key could not be found
	 */
	public static CreativeDeskVerification remove(
			long creativeDeskVerificationId)
		throws com.nbp.creative.stages.services.exception.
			NoSuchCreativeDeskVerificationException {

		return getPersistence().remove(creativeDeskVerificationId);
	}

	public static CreativeDeskVerification updateImpl(
		CreativeDeskVerification creativeDeskVerification) {

		return getPersistence().updateImpl(creativeDeskVerification);
	}

	/**
	 * Returns the creative desk verification with the primary key or throws a <code>NoSuchCreativeDeskVerificationException</code> if it could not be found.
	 *
	 * @param creativeDeskVerificationId the primary key of the creative desk verification
	 * @return the creative desk verification
	 * @throws NoSuchCreativeDeskVerificationException if a creative desk verification with the primary key could not be found
	 */
	public static CreativeDeskVerification findByPrimaryKey(
			long creativeDeskVerificationId)
		throws com.nbp.creative.stages.services.exception.
			NoSuchCreativeDeskVerificationException {

		return getPersistence().findByPrimaryKey(creativeDeskVerificationId);
	}

	/**
	 * Returns the creative desk verification with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param creativeDeskVerificationId the primary key of the creative desk verification
	 * @return the creative desk verification, or <code>null</code> if a creative desk verification with the primary key could not be found
	 */
	public static CreativeDeskVerification fetchByPrimaryKey(
		long creativeDeskVerificationId) {

		return getPersistence().fetchByPrimaryKey(creativeDeskVerificationId);
	}

	/**
	 * Returns all the creative desk verifications.
	 *
	 * @return the creative desk verifications
	 */
	public static List<CreativeDeskVerification> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the creative desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative desk verifications
	 * @param end the upper bound of the range of creative desk verifications (not inclusive)
	 * @return the range of creative desk verifications
	 */
	public static List<CreativeDeskVerification> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the creative desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative desk verifications
	 * @param end the upper bound of the range of creative desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of creative desk verifications
	 */
	public static List<CreativeDeskVerification> findAll(
		int start, int end,
		OrderByComparator<CreativeDeskVerification> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the creative desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative desk verifications
	 * @param end the upper bound of the range of creative desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of creative desk verifications
	 */
	public static List<CreativeDeskVerification> findAll(
		int start, int end,
		OrderByComparator<CreativeDeskVerification> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the creative desk verifications from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of creative desk verifications.
	 *
	 * @return the number of creative desk verifications
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static CreativeDeskVerificationPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		CreativeDeskVerificationPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile CreativeDeskVerificationPersistence _persistence;

}