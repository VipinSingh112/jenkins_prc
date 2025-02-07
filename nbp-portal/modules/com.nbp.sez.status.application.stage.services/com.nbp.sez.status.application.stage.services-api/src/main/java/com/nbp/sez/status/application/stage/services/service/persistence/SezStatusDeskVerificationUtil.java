/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.stage.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.sez.status.application.stage.services.model.SezStatusDeskVerification;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the sez status desk verification service. This utility wraps <code>com.nbp.sez.status.application.stage.services.service.persistence.impl.SezStatusDeskVerificationPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezStatusDeskVerificationPersistence
 * @generated
 */
public class SezStatusDeskVerificationUtil {

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
		SezStatusDeskVerification sezStatusDeskVerification) {

		getPersistence().clearCache(sezStatusDeskVerification);
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
	public static Map<Serializable, SezStatusDeskVerification>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<SezStatusDeskVerification> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<SezStatusDeskVerification> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<SezStatusDeskVerification> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<SezStatusDeskVerification> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static SezStatusDeskVerification update(
		SezStatusDeskVerification sezStatusDeskVerification) {

		return getPersistence().update(sezStatusDeskVerification);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static SezStatusDeskVerification update(
		SezStatusDeskVerification sezStatusDeskVerification,
		ServiceContext serviceContext) {

		return getPersistence().update(
			sezStatusDeskVerification, serviceContext);
	}

	/**
	 * Returns all the sez status desk verifications where sezApplicationId = &#63;.
	 *
	 * @param sezApplicationId the sez application ID
	 * @return the matching sez status desk verifications
	 */
	public static List<SezStatusDeskVerification>
		findBygetDeskVerificationSezById(long sezApplicationId) {

		return getPersistence().findBygetDeskVerificationSezById(
			sezApplicationId);
	}

	/**
	 * Returns a range of all the sez status desk verifications where sezApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param sezApplicationId the sez application ID
	 * @param start the lower bound of the range of sez status desk verifications
	 * @param end the upper bound of the range of sez status desk verifications (not inclusive)
	 * @return the range of matching sez status desk verifications
	 */
	public static List<SezStatusDeskVerification>
		findBygetDeskVerificationSezById(
			long sezApplicationId, int start, int end) {

		return getPersistence().findBygetDeskVerificationSezById(
			sezApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the sez status desk verifications where sezApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param sezApplicationId the sez application ID
	 * @param start the lower bound of the range of sez status desk verifications
	 * @param end the upper bound of the range of sez status desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez status desk verifications
	 */
	public static List<SezStatusDeskVerification>
		findBygetDeskVerificationSezById(
			long sezApplicationId, int start, int end,
			OrderByComparator<SezStatusDeskVerification> orderByComparator) {

		return getPersistence().findBygetDeskVerificationSezById(
			sezApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the sez status desk verifications where sezApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param sezApplicationId the sez application ID
	 * @param start the lower bound of the range of sez status desk verifications
	 * @param end the upper bound of the range of sez status desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez status desk verifications
	 */
	public static List<SezStatusDeskVerification>
		findBygetDeskVerificationSezById(
			long sezApplicationId, int start, int end,
			OrderByComparator<SezStatusDeskVerification> orderByComparator,
			boolean useFinderCache) {

		return getPersistence().findBygetDeskVerificationSezById(
			sezApplicationId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first sez status desk verification in the ordered set where sezApplicationId = &#63;.
	 *
	 * @param sezApplicationId the sez application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status desk verification
	 * @throws NoSuchSezStatusDeskVerificationException if a matching sez status desk verification could not be found
	 */
	public static SezStatusDeskVerification
			findBygetDeskVerificationSezById_First(
				long sezApplicationId,
				OrderByComparator<SezStatusDeskVerification> orderByComparator)
		throws com.nbp.sez.status.application.stage.services.exception.
			NoSuchSezStatusDeskVerificationException {

		return getPersistence().findBygetDeskVerificationSezById_First(
			sezApplicationId, orderByComparator);
	}

	/**
	 * Returns the first sez status desk verification in the ordered set where sezApplicationId = &#63;.
	 *
	 * @param sezApplicationId the sez application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status desk verification, or <code>null</code> if a matching sez status desk verification could not be found
	 */
	public static SezStatusDeskVerification
		fetchBygetDeskVerificationSezById_First(
			long sezApplicationId,
			OrderByComparator<SezStatusDeskVerification> orderByComparator) {

		return getPersistence().fetchBygetDeskVerificationSezById_First(
			sezApplicationId, orderByComparator);
	}

	/**
	 * Returns the last sez status desk verification in the ordered set where sezApplicationId = &#63;.
	 *
	 * @param sezApplicationId the sez application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status desk verification
	 * @throws NoSuchSezStatusDeskVerificationException if a matching sez status desk verification could not be found
	 */
	public static SezStatusDeskVerification
			findBygetDeskVerificationSezById_Last(
				long sezApplicationId,
				OrderByComparator<SezStatusDeskVerification> orderByComparator)
		throws com.nbp.sez.status.application.stage.services.exception.
			NoSuchSezStatusDeskVerificationException {

		return getPersistence().findBygetDeskVerificationSezById_Last(
			sezApplicationId, orderByComparator);
	}

	/**
	 * Returns the last sez status desk verification in the ordered set where sezApplicationId = &#63;.
	 *
	 * @param sezApplicationId the sez application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status desk verification, or <code>null</code> if a matching sez status desk verification could not be found
	 */
	public static SezStatusDeskVerification
		fetchBygetDeskVerificationSezById_Last(
			long sezApplicationId,
			OrderByComparator<SezStatusDeskVerification> orderByComparator) {

		return getPersistence().fetchBygetDeskVerificationSezById_Last(
			sezApplicationId, orderByComparator);
	}

	/**
	 * Returns the sez status desk verifications before and after the current sez status desk verification in the ordered set where sezApplicationId = &#63;.
	 *
	 * @param SezDeskVerificationId the primary key of the current sez status desk verification
	 * @param sezApplicationId the sez application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez status desk verification
	 * @throws NoSuchSezStatusDeskVerificationException if a sez status desk verification with the primary key could not be found
	 */
	public static SezStatusDeskVerification[]
			findBygetDeskVerificationSezById_PrevAndNext(
				long SezDeskVerificationId, long sezApplicationId,
				OrderByComparator<SezStatusDeskVerification> orderByComparator)
		throws com.nbp.sez.status.application.stage.services.exception.
			NoSuchSezStatusDeskVerificationException {

		return getPersistence().findBygetDeskVerificationSezById_PrevAndNext(
			SezDeskVerificationId, sezApplicationId, orderByComparator);
	}

	/**
	 * Removes all the sez status desk verifications where sezApplicationId = &#63; from the database.
	 *
	 * @param sezApplicationId the sez application ID
	 */
	public static void removeBygetDeskVerificationSezById(
		long sezApplicationId) {

		getPersistence().removeBygetDeskVerificationSezById(sezApplicationId);
	}

	/**
	 * Returns the number of sez status desk verifications where sezApplicationId = &#63;.
	 *
	 * @param sezApplicationId the sez application ID
	 * @return the number of matching sez status desk verifications
	 */
	public static int countBygetDeskVerificationSezById(long sezApplicationId) {
		return getPersistence().countBygetDeskVerificationSezById(
			sezApplicationId);
	}

	/**
	 * Caches the sez status desk verification in the entity cache if it is enabled.
	 *
	 * @param sezStatusDeskVerification the sez status desk verification
	 */
	public static void cacheResult(
		SezStatusDeskVerification sezStatusDeskVerification) {

		getPersistence().cacheResult(sezStatusDeskVerification);
	}

	/**
	 * Caches the sez status desk verifications in the entity cache if it is enabled.
	 *
	 * @param sezStatusDeskVerifications the sez status desk verifications
	 */
	public static void cacheResult(
		List<SezStatusDeskVerification> sezStatusDeskVerifications) {

		getPersistence().cacheResult(sezStatusDeskVerifications);
	}

	/**
	 * Creates a new sez status desk verification with the primary key. Does not add the sez status desk verification to the database.
	 *
	 * @param SezDeskVerificationId the primary key for the new sez status desk verification
	 * @return the new sez status desk verification
	 */
	public static SezStatusDeskVerification create(long SezDeskVerificationId) {
		return getPersistence().create(SezDeskVerificationId);
	}

	/**
	 * Removes the sez status desk verification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param SezDeskVerificationId the primary key of the sez status desk verification
	 * @return the sez status desk verification that was removed
	 * @throws NoSuchSezStatusDeskVerificationException if a sez status desk verification with the primary key could not be found
	 */
	public static SezStatusDeskVerification remove(long SezDeskVerificationId)
		throws com.nbp.sez.status.application.stage.services.exception.
			NoSuchSezStatusDeskVerificationException {

		return getPersistence().remove(SezDeskVerificationId);
	}

	public static SezStatusDeskVerification updateImpl(
		SezStatusDeskVerification sezStatusDeskVerification) {

		return getPersistence().updateImpl(sezStatusDeskVerification);
	}

	/**
	 * Returns the sez status desk verification with the primary key or throws a <code>NoSuchSezStatusDeskVerificationException</code> if it could not be found.
	 *
	 * @param SezDeskVerificationId the primary key of the sez status desk verification
	 * @return the sez status desk verification
	 * @throws NoSuchSezStatusDeskVerificationException if a sez status desk verification with the primary key could not be found
	 */
	public static SezStatusDeskVerification findByPrimaryKey(
			long SezDeskVerificationId)
		throws com.nbp.sez.status.application.stage.services.exception.
			NoSuchSezStatusDeskVerificationException {

		return getPersistence().findByPrimaryKey(SezDeskVerificationId);
	}

	/**
	 * Returns the sez status desk verification with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param SezDeskVerificationId the primary key of the sez status desk verification
	 * @return the sez status desk verification, or <code>null</code> if a sez status desk verification with the primary key could not be found
	 */
	public static SezStatusDeskVerification fetchByPrimaryKey(
		long SezDeskVerificationId) {

		return getPersistence().fetchByPrimaryKey(SezDeskVerificationId);
	}

	/**
	 * Returns all the sez status desk verifications.
	 *
	 * @return the sez status desk verifications
	 */
	public static List<SezStatusDeskVerification> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the sez status desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status desk verifications
	 * @param end the upper bound of the range of sez status desk verifications (not inclusive)
	 * @return the range of sez status desk verifications
	 */
	public static List<SezStatusDeskVerification> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the sez status desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status desk verifications
	 * @param end the upper bound of the range of sez status desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez status desk verifications
	 */
	public static List<SezStatusDeskVerification> findAll(
		int start, int end,
		OrderByComparator<SezStatusDeskVerification> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the sez status desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status desk verifications
	 * @param end the upper bound of the range of sez status desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez status desk verifications
	 */
	public static List<SezStatusDeskVerification> findAll(
		int start, int end,
		OrderByComparator<SezStatusDeskVerification> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the sez status desk verifications from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of sez status desk verifications.
	 *
	 * @return the number of sez status desk verifications
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static SezStatusDeskVerificationPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		SezStatusDeskVerificationPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile SezStatusDeskVerificationPersistence _persistence;

}