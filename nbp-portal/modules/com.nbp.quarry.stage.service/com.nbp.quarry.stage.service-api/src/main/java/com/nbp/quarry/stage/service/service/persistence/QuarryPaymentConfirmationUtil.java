/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quarry.stage.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.quarry.stage.service.model.QuarryPaymentConfirmation;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the quarry payment confirmation service. This utility wraps <code>com.nbp.quarry.stage.service.service.persistence.impl.QuarryPaymentConfirmationPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see QuarryPaymentConfirmationPersistence
 * @generated
 */
public class QuarryPaymentConfirmationUtil {

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
		QuarryPaymentConfirmation quarryPaymentConfirmation) {

		getPersistence().clearCache(quarryPaymentConfirmation);
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
	public static Map<Serializable, QuarryPaymentConfirmation>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<QuarryPaymentConfirmation> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<QuarryPaymentConfirmation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<QuarryPaymentConfirmation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<QuarryPaymentConfirmation> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static QuarryPaymentConfirmation update(
		QuarryPaymentConfirmation quarryPaymentConfirmation) {

		return getPersistence().update(quarryPaymentConfirmation);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static QuarryPaymentConfirmation update(
		QuarryPaymentConfirmation quarryPaymentConfirmation,
		ServiceContext serviceContext) {

		return getPersistence().update(
			quarryPaymentConfirmation, serviceContext);
	}

	/**
	 * Returns the quarry payment confirmation where caseId = &#63; or throws a <code>NoSuchQuarryPaymentConfirmationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching quarry payment confirmation
	 * @throws NoSuchQuarryPaymentConfirmationException if a matching quarry payment confirmation could not be found
	 */
	public static QuarryPaymentConfirmation findBygetQuarryPaymentConfBy_CI(
			String caseId)
		throws com.nbp.quarry.stage.service.exception.
			NoSuchQuarryPaymentConfirmationException {

		return getPersistence().findBygetQuarryPaymentConfBy_CI(caseId);
	}

	/**
	 * Returns the quarry payment confirmation where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching quarry payment confirmation, or <code>null</code> if a matching quarry payment confirmation could not be found
	 */
	public static QuarryPaymentConfirmation fetchBygetQuarryPaymentConfBy_CI(
		String caseId) {

		return getPersistence().fetchBygetQuarryPaymentConfBy_CI(caseId);
	}

	/**
	 * Returns the quarry payment confirmation where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching quarry payment confirmation, or <code>null</code> if a matching quarry payment confirmation could not be found
	 */
	public static QuarryPaymentConfirmation fetchBygetQuarryPaymentConfBy_CI(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetQuarryPaymentConfBy_CI(
			caseId, useFinderCache);
	}

	/**
	 * Removes the quarry payment confirmation where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the quarry payment confirmation that was removed
	 */
	public static QuarryPaymentConfirmation removeBygetQuarryPaymentConfBy_CI(
			String caseId)
		throws com.nbp.quarry.stage.service.exception.
			NoSuchQuarryPaymentConfirmationException {

		return getPersistence().removeBygetQuarryPaymentConfBy_CI(caseId);
	}

	/**
	 * Returns the number of quarry payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching quarry payment confirmations
	 */
	public static int countBygetQuarryPaymentConfBy_CI(String caseId) {
		return getPersistence().countBygetQuarryPaymentConfBy_CI(caseId);
	}

	/**
	 * Returns all the quarry payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching quarry payment confirmations
	 */
	public static List<QuarryPaymentConfirmation> findBygetQuarryPayConfBy_CI(
		String caseId) {

		return getPersistence().findBygetQuarryPayConfBy_CI(caseId);
	}

	/**
	 * Returns a range of all the quarry payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of quarry payment confirmations
	 * @param end the upper bound of the range of quarry payment confirmations (not inclusive)
	 * @return the range of matching quarry payment confirmations
	 */
	public static List<QuarryPaymentConfirmation> findBygetQuarryPayConfBy_CI(
		String caseId, int start, int end) {

		return getPersistence().findBygetQuarryPayConfBy_CI(caseId, start, end);
	}

	/**
	 * Returns an ordered range of all the quarry payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of quarry payment confirmations
	 * @param end the upper bound of the range of quarry payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching quarry payment confirmations
	 */
	public static List<QuarryPaymentConfirmation> findBygetQuarryPayConfBy_CI(
		String caseId, int start, int end,
		OrderByComparator<QuarryPaymentConfirmation> orderByComparator) {

		return getPersistence().findBygetQuarryPayConfBy_CI(
			caseId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the quarry payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of quarry payment confirmations
	 * @param end the upper bound of the range of quarry payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching quarry payment confirmations
	 */
	public static List<QuarryPaymentConfirmation> findBygetQuarryPayConfBy_CI(
		String caseId, int start, int end,
		OrderByComparator<QuarryPaymentConfirmation> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetQuarryPayConfBy_CI(
			caseId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first quarry payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry payment confirmation
	 * @throws NoSuchQuarryPaymentConfirmationException if a matching quarry payment confirmation could not be found
	 */
	public static QuarryPaymentConfirmation findBygetQuarryPayConfBy_CI_First(
			String caseId,
			OrderByComparator<QuarryPaymentConfirmation> orderByComparator)
		throws com.nbp.quarry.stage.service.exception.
			NoSuchQuarryPaymentConfirmationException {

		return getPersistence().findBygetQuarryPayConfBy_CI_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the first quarry payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry payment confirmation, or <code>null</code> if a matching quarry payment confirmation could not be found
	 */
	public static QuarryPaymentConfirmation fetchBygetQuarryPayConfBy_CI_First(
		String caseId,
		OrderByComparator<QuarryPaymentConfirmation> orderByComparator) {

		return getPersistence().fetchBygetQuarryPayConfBy_CI_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last quarry payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry payment confirmation
	 * @throws NoSuchQuarryPaymentConfirmationException if a matching quarry payment confirmation could not be found
	 */
	public static QuarryPaymentConfirmation findBygetQuarryPayConfBy_CI_Last(
			String caseId,
			OrderByComparator<QuarryPaymentConfirmation> orderByComparator)
		throws com.nbp.quarry.stage.service.exception.
			NoSuchQuarryPaymentConfirmationException {

		return getPersistence().findBygetQuarryPayConfBy_CI_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last quarry payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry payment confirmation, or <code>null</code> if a matching quarry payment confirmation could not be found
	 */
	public static QuarryPaymentConfirmation fetchBygetQuarryPayConfBy_CI_Last(
		String caseId,
		OrderByComparator<QuarryPaymentConfirmation> orderByComparator) {

		return getPersistence().fetchBygetQuarryPayConfBy_CI_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the quarry payment confirmations before and after the current quarry payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param quarryPaymentConfirmationId the primary key of the current quarry payment confirmation
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next quarry payment confirmation
	 * @throws NoSuchQuarryPaymentConfirmationException if a quarry payment confirmation with the primary key could not be found
	 */
	public static QuarryPaymentConfirmation[]
			findBygetQuarryPayConfBy_CI_PrevAndNext(
				long quarryPaymentConfirmationId, String caseId,
				OrderByComparator<QuarryPaymentConfirmation> orderByComparator)
		throws com.nbp.quarry.stage.service.exception.
			NoSuchQuarryPaymentConfirmationException {

		return getPersistence().findBygetQuarryPayConfBy_CI_PrevAndNext(
			quarryPaymentConfirmationId, caseId, orderByComparator);
	}

	/**
	 * Removes all the quarry payment confirmations where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public static void removeBygetQuarryPayConfBy_CI(String caseId) {
		getPersistence().removeBygetQuarryPayConfBy_CI(caseId);
	}

	/**
	 * Returns the number of quarry payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching quarry payment confirmations
	 */
	public static int countBygetQuarryPayConfBy_CI(String caseId) {
		return getPersistence().countBygetQuarryPayConfBy_CI(caseId);
	}

	/**
	 * Caches the quarry payment confirmation in the entity cache if it is enabled.
	 *
	 * @param quarryPaymentConfirmation the quarry payment confirmation
	 */
	public static void cacheResult(
		QuarryPaymentConfirmation quarryPaymentConfirmation) {

		getPersistence().cacheResult(quarryPaymentConfirmation);
	}

	/**
	 * Caches the quarry payment confirmations in the entity cache if it is enabled.
	 *
	 * @param quarryPaymentConfirmations the quarry payment confirmations
	 */
	public static void cacheResult(
		List<QuarryPaymentConfirmation> quarryPaymentConfirmations) {

		getPersistence().cacheResult(quarryPaymentConfirmations);
	}

	/**
	 * Creates a new quarry payment confirmation with the primary key. Does not add the quarry payment confirmation to the database.
	 *
	 * @param quarryPaymentConfirmationId the primary key for the new quarry payment confirmation
	 * @return the new quarry payment confirmation
	 */
	public static QuarryPaymentConfirmation create(
		long quarryPaymentConfirmationId) {

		return getPersistence().create(quarryPaymentConfirmationId);
	}

	/**
	 * Removes the quarry payment confirmation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param quarryPaymentConfirmationId the primary key of the quarry payment confirmation
	 * @return the quarry payment confirmation that was removed
	 * @throws NoSuchQuarryPaymentConfirmationException if a quarry payment confirmation with the primary key could not be found
	 */
	public static QuarryPaymentConfirmation remove(
			long quarryPaymentConfirmationId)
		throws com.nbp.quarry.stage.service.exception.
			NoSuchQuarryPaymentConfirmationException {

		return getPersistence().remove(quarryPaymentConfirmationId);
	}

	public static QuarryPaymentConfirmation updateImpl(
		QuarryPaymentConfirmation quarryPaymentConfirmation) {

		return getPersistence().updateImpl(quarryPaymentConfirmation);
	}

	/**
	 * Returns the quarry payment confirmation with the primary key or throws a <code>NoSuchQuarryPaymentConfirmationException</code> if it could not be found.
	 *
	 * @param quarryPaymentConfirmationId the primary key of the quarry payment confirmation
	 * @return the quarry payment confirmation
	 * @throws NoSuchQuarryPaymentConfirmationException if a quarry payment confirmation with the primary key could not be found
	 */
	public static QuarryPaymentConfirmation findByPrimaryKey(
			long quarryPaymentConfirmationId)
		throws com.nbp.quarry.stage.service.exception.
			NoSuchQuarryPaymentConfirmationException {

		return getPersistence().findByPrimaryKey(quarryPaymentConfirmationId);
	}

	/**
	 * Returns the quarry payment confirmation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param quarryPaymentConfirmationId the primary key of the quarry payment confirmation
	 * @return the quarry payment confirmation, or <code>null</code> if a quarry payment confirmation with the primary key could not be found
	 */
	public static QuarryPaymentConfirmation fetchByPrimaryKey(
		long quarryPaymentConfirmationId) {

		return getPersistence().fetchByPrimaryKey(quarryPaymentConfirmationId);
	}

	/**
	 * Returns all the quarry payment confirmations.
	 *
	 * @return the quarry payment confirmations
	 */
	public static List<QuarryPaymentConfirmation> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the quarry payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry payment confirmations
	 * @param end the upper bound of the range of quarry payment confirmations (not inclusive)
	 * @return the range of quarry payment confirmations
	 */
	public static List<QuarryPaymentConfirmation> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the quarry payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry payment confirmations
	 * @param end the upper bound of the range of quarry payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of quarry payment confirmations
	 */
	public static List<QuarryPaymentConfirmation> findAll(
		int start, int end,
		OrderByComparator<QuarryPaymentConfirmation> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the quarry payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry payment confirmations
	 * @param end the upper bound of the range of quarry payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of quarry payment confirmations
	 */
	public static List<QuarryPaymentConfirmation> findAll(
		int start, int end,
		OrderByComparator<QuarryPaymentConfirmation> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the quarry payment confirmations from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of quarry payment confirmations.
	 *
	 * @return the number of quarry payment confirmations
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static QuarryPaymentConfirmationPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		QuarryPaymentConfirmationPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile QuarryPaymentConfirmationPersistence _persistence;

}