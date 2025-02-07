/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.stages.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.osi.stages.services.model.OsiDeskVerification;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the osi desk verification service. This utility wraps <code>com.nbp.osi.stages.services.service.persistence.impl.OsiDeskVerificationPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OsiDeskVerificationPersistence
 * @generated
 */
public class OsiDeskVerificationUtil {

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
	public static void clearCache(OsiDeskVerification osiDeskVerification) {
		getPersistence().clearCache(osiDeskVerification);
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
	public static Map<Serializable, OsiDeskVerification> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<OsiDeskVerification> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<OsiDeskVerification> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<OsiDeskVerification> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<OsiDeskVerification> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static OsiDeskVerification update(
		OsiDeskVerification osiDeskVerification) {

		return getPersistence().update(osiDeskVerification);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static OsiDeskVerification update(
		OsiDeskVerification osiDeskVerification,
		ServiceContext serviceContext) {

		return getPersistence().update(osiDeskVerification, serviceContext);
	}

	/**
	 * Returns all the osi desk verifications where osiApplicationId = &#63;.
	 *
	 * @param osiApplicationId the osi application ID
	 * @return the matching osi desk verifications
	 */
	public static List<OsiDeskVerification> findBygetDeskVerificationOsiById(
		long osiApplicationId) {

		return getPersistence().findBygetDeskVerificationOsiById(
			osiApplicationId);
	}

	/**
	 * Returns a range of all the osi desk verifications where osiApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param osiApplicationId the osi application ID
	 * @param start the lower bound of the range of osi desk verifications
	 * @param end the upper bound of the range of osi desk verifications (not inclusive)
	 * @return the range of matching osi desk verifications
	 */
	public static List<OsiDeskVerification> findBygetDeskVerificationOsiById(
		long osiApplicationId, int start, int end) {

		return getPersistence().findBygetDeskVerificationOsiById(
			osiApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the osi desk verifications where osiApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param osiApplicationId the osi application ID
	 * @param start the lower bound of the range of osi desk verifications
	 * @param end the upper bound of the range of osi desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi desk verifications
	 */
	public static List<OsiDeskVerification> findBygetDeskVerificationOsiById(
		long osiApplicationId, int start, int end,
		OrderByComparator<OsiDeskVerification> orderByComparator) {

		return getPersistence().findBygetDeskVerificationOsiById(
			osiApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the osi desk verifications where osiApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param osiApplicationId the osi application ID
	 * @param start the lower bound of the range of osi desk verifications
	 * @param end the upper bound of the range of osi desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi desk verifications
	 */
	public static List<OsiDeskVerification> findBygetDeskVerificationOsiById(
		long osiApplicationId, int start, int end,
		OrderByComparator<OsiDeskVerification> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetDeskVerificationOsiById(
			osiApplicationId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first osi desk verification in the ordered set where osiApplicationId = &#63;.
	 *
	 * @param osiApplicationId the osi application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi desk verification
	 * @throws NoSuchOsiDeskVerificationException if a matching osi desk verification could not be found
	 */
	public static OsiDeskVerification findBygetDeskVerificationOsiById_First(
			long osiApplicationId,
			OrderByComparator<OsiDeskVerification> orderByComparator)
		throws com.nbp.osi.stages.services.exception.
			NoSuchOsiDeskVerificationException {

		return getPersistence().findBygetDeskVerificationOsiById_First(
			osiApplicationId, orderByComparator);
	}

	/**
	 * Returns the first osi desk verification in the ordered set where osiApplicationId = &#63;.
	 *
	 * @param osiApplicationId the osi application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi desk verification, or <code>null</code> if a matching osi desk verification could not be found
	 */
	public static OsiDeskVerification fetchBygetDeskVerificationOsiById_First(
		long osiApplicationId,
		OrderByComparator<OsiDeskVerification> orderByComparator) {

		return getPersistence().fetchBygetDeskVerificationOsiById_First(
			osiApplicationId, orderByComparator);
	}

	/**
	 * Returns the last osi desk verification in the ordered set where osiApplicationId = &#63;.
	 *
	 * @param osiApplicationId the osi application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi desk verification
	 * @throws NoSuchOsiDeskVerificationException if a matching osi desk verification could not be found
	 */
	public static OsiDeskVerification findBygetDeskVerificationOsiById_Last(
			long osiApplicationId,
			OrderByComparator<OsiDeskVerification> orderByComparator)
		throws com.nbp.osi.stages.services.exception.
			NoSuchOsiDeskVerificationException {

		return getPersistence().findBygetDeskVerificationOsiById_Last(
			osiApplicationId, orderByComparator);
	}

	/**
	 * Returns the last osi desk verification in the ordered set where osiApplicationId = &#63;.
	 *
	 * @param osiApplicationId the osi application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi desk verification, or <code>null</code> if a matching osi desk verification could not be found
	 */
	public static OsiDeskVerification fetchBygetDeskVerificationOsiById_Last(
		long osiApplicationId,
		OrderByComparator<OsiDeskVerification> orderByComparator) {

		return getPersistence().fetchBygetDeskVerificationOsiById_Last(
			osiApplicationId, orderByComparator);
	}

	/**
	 * Returns the osi desk verifications before and after the current osi desk verification in the ordered set where osiApplicationId = &#63;.
	 *
	 * @param osiDeskVerificationId the primary key of the current osi desk verification
	 * @param osiApplicationId the osi application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi desk verification
	 * @throws NoSuchOsiDeskVerificationException if a osi desk verification with the primary key could not be found
	 */
	public static OsiDeskVerification[]
			findBygetDeskVerificationOsiById_PrevAndNext(
				long osiDeskVerificationId, long osiApplicationId,
				OrderByComparator<OsiDeskVerification> orderByComparator)
		throws com.nbp.osi.stages.services.exception.
			NoSuchOsiDeskVerificationException {

		return getPersistence().findBygetDeskVerificationOsiById_PrevAndNext(
			osiDeskVerificationId, osiApplicationId, orderByComparator);
	}

	/**
	 * Removes all the osi desk verifications where osiApplicationId = &#63; from the database.
	 *
	 * @param osiApplicationId the osi application ID
	 */
	public static void removeBygetDeskVerificationOsiById(
		long osiApplicationId) {

		getPersistence().removeBygetDeskVerificationOsiById(osiApplicationId);
	}

	/**
	 * Returns the number of osi desk verifications where osiApplicationId = &#63;.
	 *
	 * @param osiApplicationId the osi application ID
	 * @return the number of matching osi desk verifications
	 */
	public static int countBygetDeskVerificationOsiById(long osiApplicationId) {
		return getPersistence().countBygetDeskVerificationOsiById(
			osiApplicationId);
	}

	/**
	 * Caches the osi desk verification in the entity cache if it is enabled.
	 *
	 * @param osiDeskVerification the osi desk verification
	 */
	public static void cacheResult(OsiDeskVerification osiDeskVerification) {
		getPersistence().cacheResult(osiDeskVerification);
	}

	/**
	 * Caches the osi desk verifications in the entity cache if it is enabled.
	 *
	 * @param osiDeskVerifications the osi desk verifications
	 */
	public static void cacheResult(
		List<OsiDeskVerification> osiDeskVerifications) {

		getPersistence().cacheResult(osiDeskVerifications);
	}

	/**
	 * Creates a new osi desk verification with the primary key. Does not add the osi desk verification to the database.
	 *
	 * @param osiDeskVerificationId the primary key for the new osi desk verification
	 * @return the new osi desk verification
	 */
	public static OsiDeskVerification create(long osiDeskVerificationId) {
		return getPersistence().create(osiDeskVerificationId);
	}

	/**
	 * Removes the osi desk verification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param osiDeskVerificationId the primary key of the osi desk verification
	 * @return the osi desk verification that was removed
	 * @throws NoSuchOsiDeskVerificationException if a osi desk verification with the primary key could not be found
	 */
	public static OsiDeskVerification remove(long osiDeskVerificationId)
		throws com.nbp.osi.stages.services.exception.
			NoSuchOsiDeskVerificationException {

		return getPersistence().remove(osiDeskVerificationId);
	}

	public static OsiDeskVerification updateImpl(
		OsiDeskVerification osiDeskVerification) {

		return getPersistence().updateImpl(osiDeskVerification);
	}

	/**
	 * Returns the osi desk verification with the primary key or throws a <code>NoSuchOsiDeskVerificationException</code> if it could not be found.
	 *
	 * @param osiDeskVerificationId the primary key of the osi desk verification
	 * @return the osi desk verification
	 * @throws NoSuchOsiDeskVerificationException if a osi desk verification with the primary key could not be found
	 */
	public static OsiDeskVerification findByPrimaryKey(
			long osiDeskVerificationId)
		throws com.nbp.osi.stages.services.exception.
			NoSuchOsiDeskVerificationException {

		return getPersistence().findByPrimaryKey(osiDeskVerificationId);
	}

	/**
	 * Returns the osi desk verification with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param osiDeskVerificationId the primary key of the osi desk verification
	 * @return the osi desk verification, or <code>null</code> if a osi desk verification with the primary key could not be found
	 */
	public static OsiDeskVerification fetchByPrimaryKey(
		long osiDeskVerificationId) {

		return getPersistence().fetchByPrimaryKey(osiDeskVerificationId);
	}

	/**
	 * Returns all the osi desk verifications.
	 *
	 * @return the osi desk verifications
	 */
	public static List<OsiDeskVerification> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the osi desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi desk verifications
	 * @param end the upper bound of the range of osi desk verifications (not inclusive)
	 * @return the range of osi desk verifications
	 */
	public static List<OsiDeskVerification> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the osi desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi desk verifications
	 * @param end the upper bound of the range of osi desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of osi desk verifications
	 */
	public static List<OsiDeskVerification> findAll(
		int start, int end,
		OrderByComparator<OsiDeskVerification> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the osi desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi desk verifications
	 * @param end the upper bound of the range of osi desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of osi desk verifications
	 */
	public static List<OsiDeskVerification> findAll(
		int start, int end,
		OrderByComparator<OsiDeskVerification> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the osi desk verifications from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of osi desk verifications.
	 *
	 * @return the number of osi desk verifications
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static OsiDeskVerificationPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		OsiDeskVerificationPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile OsiDeskVerificationPersistence _persistence;

}