/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.stage.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.hsra.stage.services.model.HSRAPaymentConfirmation;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the hsra payment confirmation service. This utility wraps <code>com.nbp.hsra.stage.services.service.persistence.impl.HSRAPaymentConfirmationPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HSRAPaymentConfirmationPersistence
 * @generated
 */
public class HSRAPaymentConfirmationUtil {

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
		HSRAPaymentConfirmation hsraPaymentConfirmation) {

		getPersistence().clearCache(hsraPaymentConfirmation);
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
	public static Map<Serializable, HSRAPaymentConfirmation> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<HSRAPaymentConfirmation> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<HSRAPaymentConfirmation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<HSRAPaymentConfirmation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<HSRAPaymentConfirmation> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static HSRAPaymentConfirmation update(
		HSRAPaymentConfirmation hsraPaymentConfirmation) {

		return getPersistence().update(hsraPaymentConfirmation);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static HSRAPaymentConfirmation update(
		HSRAPaymentConfirmation hsraPaymentConfirmation,
		ServiceContext serviceContext) {

		return getPersistence().update(hsraPaymentConfirmation, serviceContext);
	}

	/**
	 * Returns the hsra payment confirmation where caseId = &#63; or throws a <code>NoSuchHSRAPaymentConfirmationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching hsra payment confirmation
	 * @throws NoSuchHSRAPaymentConfirmationException if a matching hsra payment confirmation could not be found
	 */
	public static HSRAPaymentConfirmation findBygetPaymentConfirmationBy_CI(
			String caseId)
		throws com.nbp.hsra.stage.services.exception.
			NoSuchHSRAPaymentConfirmationException {

		return getPersistence().findBygetPaymentConfirmationBy_CI(caseId);
	}

	/**
	 * Returns the hsra payment confirmation where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching hsra payment confirmation, or <code>null</code> if a matching hsra payment confirmation could not be found
	 */
	public static HSRAPaymentConfirmation fetchBygetPaymentConfirmationBy_CI(
		String caseId) {

		return getPersistence().fetchBygetPaymentConfirmationBy_CI(caseId);
	}

	/**
	 * Returns the hsra payment confirmation where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching hsra payment confirmation, or <code>null</code> if a matching hsra payment confirmation could not be found
	 */
	public static HSRAPaymentConfirmation fetchBygetPaymentConfirmationBy_CI(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetPaymentConfirmationBy_CI(
			caseId, useFinderCache);
	}

	/**
	 * Removes the hsra payment confirmation where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the hsra payment confirmation that was removed
	 */
	public static HSRAPaymentConfirmation removeBygetPaymentConfirmationBy_CI(
			String caseId)
		throws com.nbp.hsra.stage.services.exception.
			NoSuchHSRAPaymentConfirmationException {

		return getPersistence().removeBygetPaymentConfirmationBy_CI(caseId);
	}

	/**
	 * Returns the number of hsra payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching hsra payment confirmations
	 */
	public static int countBygetPaymentConfirmationBy_CI(String caseId) {
		return getPersistence().countBygetPaymentConfirmationBy_CI(caseId);
	}

	/**
	 * Returns all the hsra payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching hsra payment confirmations
	 */
	public static List<HSRAPaymentConfirmation>
		findBygetPaymentConfirmation_By_CI(String caseId) {

		return getPersistence().findBygetPaymentConfirmation_By_CI(caseId);
	}

	/**
	 * Returns a range of all the hsra payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HSRAPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of hsra payment confirmations
	 * @param end the upper bound of the range of hsra payment confirmations (not inclusive)
	 * @return the range of matching hsra payment confirmations
	 */
	public static List<HSRAPaymentConfirmation>
		findBygetPaymentConfirmation_By_CI(String caseId, int start, int end) {

		return getPersistence().findBygetPaymentConfirmation_By_CI(
			caseId, start, end);
	}

	/**
	 * Returns an ordered range of all the hsra payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HSRAPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of hsra payment confirmations
	 * @param end the upper bound of the range of hsra payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching hsra payment confirmations
	 */
	public static List<HSRAPaymentConfirmation>
		findBygetPaymentConfirmation_By_CI(
			String caseId, int start, int end,
			OrderByComparator<HSRAPaymentConfirmation> orderByComparator) {

		return getPersistence().findBygetPaymentConfirmation_By_CI(
			caseId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the hsra payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HSRAPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of hsra payment confirmations
	 * @param end the upper bound of the range of hsra payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching hsra payment confirmations
	 */
	public static List<HSRAPaymentConfirmation>
		findBygetPaymentConfirmation_By_CI(
			String caseId, int start, int end,
			OrderByComparator<HSRAPaymentConfirmation> orderByComparator,
			boolean useFinderCache) {

		return getPersistence().findBygetPaymentConfirmation_By_CI(
			caseId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first hsra payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra payment confirmation
	 * @throws NoSuchHSRAPaymentConfirmationException if a matching hsra payment confirmation could not be found
	 */
	public static HSRAPaymentConfirmation
			findBygetPaymentConfirmation_By_CI_First(
				String caseId,
				OrderByComparator<HSRAPaymentConfirmation> orderByComparator)
		throws com.nbp.hsra.stage.services.exception.
			NoSuchHSRAPaymentConfirmationException {

		return getPersistence().findBygetPaymentConfirmation_By_CI_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the first hsra payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra payment confirmation, or <code>null</code> if a matching hsra payment confirmation could not be found
	 */
	public static HSRAPaymentConfirmation
		fetchBygetPaymentConfirmation_By_CI_First(
			String caseId,
			OrderByComparator<HSRAPaymentConfirmation> orderByComparator) {

		return getPersistence().fetchBygetPaymentConfirmation_By_CI_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last hsra payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra payment confirmation
	 * @throws NoSuchHSRAPaymentConfirmationException if a matching hsra payment confirmation could not be found
	 */
	public static HSRAPaymentConfirmation
			findBygetPaymentConfirmation_By_CI_Last(
				String caseId,
				OrderByComparator<HSRAPaymentConfirmation> orderByComparator)
		throws com.nbp.hsra.stage.services.exception.
			NoSuchHSRAPaymentConfirmationException {

		return getPersistence().findBygetPaymentConfirmation_By_CI_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last hsra payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra payment confirmation, or <code>null</code> if a matching hsra payment confirmation could not be found
	 */
	public static HSRAPaymentConfirmation
		fetchBygetPaymentConfirmation_By_CI_Last(
			String caseId,
			OrderByComparator<HSRAPaymentConfirmation> orderByComparator) {

		return getPersistence().fetchBygetPaymentConfirmation_By_CI_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the hsra payment confirmations before and after the current hsra payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param hsraPaymentId the primary key of the current hsra payment confirmation
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next hsra payment confirmation
	 * @throws NoSuchHSRAPaymentConfirmationException if a hsra payment confirmation with the primary key could not be found
	 */
	public static HSRAPaymentConfirmation[]
			findBygetPaymentConfirmation_By_CI_PrevAndNext(
				long hsraPaymentId, String caseId,
				OrderByComparator<HSRAPaymentConfirmation> orderByComparator)
		throws com.nbp.hsra.stage.services.exception.
			NoSuchHSRAPaymentConfirmationException {

		return getPersistence().findBygetPaymentConfirmation_By_CI_PrevAndNext(
			hsraPaymentId, caseId, orderByComparator);
	}

	/**
	 * Removes all the hsra payment confirmations where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public static void removeBygetPaymentConfirmation_By_CI(String caseId) {
		getPersistence().removeBygetPaymentConfirmation_By_CI(caseId);
	}

	/**
	 * Returns the number of hsra payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching hsra payment confirmations
	 */
	public static int countBygetPaymentConfirmation_By_CI(String caseId) {
		return getPersistence().countBygetPaymentConfirmation_By_CI(caseId);
	}

	/**
	 * Caches the hsra payment confirmation in the entity cache if it is enabled.
	 *
	 * @param hsraPaymentConfirmation the hsra payment confirmation
	 */
	public static void cacheResult(
		HSRAPaymentConfirmation hsraPaymentConfirmation) {

		getPersistence().cacheResult(hsraPaymentConfirmation);
	}

	/**
	 * Caches the hsra payment confirmations in the entity cache if it is enabled.
	 *
	 * @param hsraPaymentConfirmations the hsra payment confirmations
	 */
	public static void cacheResult(
		List<HSRAPaymentConfirmation> hsraPaymentConfirmations) {

		getPersistence().cacheResult(hsraPaymentConfirmations);
	}

	/**
	 * Creates a new hsra payment confirmation with the primary key. Does not add the hsra payment confirmation to the database.
	 *
	 * @param hsraPaymentId the primary key for the new hsra payment confirmation
	 * @return the new hsra payment confirmation
	 */
	public static HSRAPaymentConfirmation create(long hsraPaymentId) {
		return getPersistence().create(hsraPaymentId);
	}

	/**
	 * Removes the hsra payment confirmation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param hsraPaymentId the primary key of the hsra payment confirmation
	 * @return the hsra payment confirmation that was removed
	 * @throws NoSuchHSRAPaymentConfirmationException if a hsra payment confirmation with the primary key could not be found
	 */
	public static HSRAPaymentConfirmation remove(long hsraPaymentId)
		throws com.nbp.hsra.stage.services.exception.
			NoSuchHSRAPaymentConfirmationException {

		return getPersistence().remove(hsraPaymentId);
	}

	public static HSRAPaymentConfirmation updateImpl(
		HSRAPaymentConfirmation hsraPaymentConfirmation) {

		return getPersistence().updateImpl(hsraPaymentConfirmation);
	}

	/**
	 * Returns the hsra payment confirmation with the primary key or throws a <code>NoSuchHSRAPaymentConfirmationException</code> if it could not be found.
	 *
	 * @param hsraPaymentId the primary key of the hsra payment confirmation
	 * @return the hsra payment confirmation
	 * @throws NoSuchHSRAPaymentConfirmationException if a hsra payment confirmation with the primary key could not be found
	 */
	public static HSRAPaymentConfirmation findByPrimaryKey(long hsraPaymentId)
		throws com.nbp.hsra.stage.services.exception.
			NoSuchHSRAPaymentConfirmationException {

		return getPersistence().findByPrimaryKey(hsraPaymentId);
	}

	/**
	 * Returns the hsra payment confirmation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param hsraPaymentId the primary key of the hsra payment confirmation
	 * @return the hsra payment confirmation, or <code>null</code> if a hsra payment confirmation with the primary key could not be found
	 */
	public static HSRAPaymentConfirmation fetchByPrimaryKey(
		long hsraPaymentId) {

		return getPersistence().fetchByPrimaryKey(hsraPaymentId);
	}

	/**
	 * Returns all the hsra payment confirmations.
	 *
	 * @return the hsra payment confirmations
	 */
	public static List<HSRAPaymentConfirmation> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the hsra payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HSRAPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of hsra payment confirmations
	 * @param end the upper bound of the range of hsra payment confirmations (not inclusive)
	 * @return the range of hsra payment confirmations
	 */
	public static List<HSRAPaymentConfirmation> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the hsra payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HSRAPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of hsra payment confirmations
	 * @param end the upper bound of the range of hsra payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of hsra payment confirmations
	 */
	public static List<HSRAPaymentConfirmation> findAll(
		int start, int end,
		OrderByComparator<HSRAPaymentConfirmation> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the hsra payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HSRAPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of hsra payment confirmations
	 * @param end the upper bound of the range of hsra payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of hsra payment confirmations
	 */
	public static List<HSRAPaymentConfirmation> findAll(
		int start, int end,
		OrderByComparator<HSRAPaymentConfirmation> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the hsra payment confirmations from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of hsra payment confirmations.
	 *
	 * @return the number of hsra payment confirmations
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static HSRAPaymentConfirmationPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		HSRAPaymentConfirmationPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile HSRAPaymentConfirmationPersistence _persistence;

}