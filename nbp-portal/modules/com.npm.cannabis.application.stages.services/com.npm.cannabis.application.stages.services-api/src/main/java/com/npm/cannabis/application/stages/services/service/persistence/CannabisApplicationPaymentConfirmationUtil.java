/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.npm.cannabis.application.stages.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.npm.cannabis.application.stages.services.model.CannabisApplicationPaymentConfirmation;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the cannabis application payment confirmation service. This utility wraps <code>com.npm.cannabis.application.stages.services.service.persistence.impl.CannabisApplicationPaymentConfirmationPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CannabisApplicationPaymentConfirmationPersistence
 * @generated
 */
public class CannabisApplicationPaymentConfirmationUtil {

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
		CannabisApplicationPaymentConfirmation
			cannabisApplicationPaymentConfirmation) {

		getPersistence().clearCache(cannabisApplicationPaymentConfirmation);
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
	public static Map<Serializable, CannabisApplicationPaymentConfirmation>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<CannabisApplicationPaymentConfirmation>
		findWithDynamicQuery(DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CannabisApplicationPaymentConfirmation>
		findWithDynamicQuery(DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CannabisApplicationPaymentConfirmation>
		findWithDynamicQuery(
			DynamicQuery dynamicQuery, int start, int end,
			OrderByComparator<CannabisApplicationPaymentConfirmation>
				orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static CannabisApplicationPaymentConfirmation update(
		CannabisApplicationPaymentConfirmation
			cannabisApplicationPaymentConfirmation) {

		return getPersistence().update(cannabisApplicationPaymentConfirmation);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static CannabisApplicationPaymentConfirmation update(
		CannabisApplicationPaymentConfirmation
			cannabisApplicationPaymentConfirmation,
		ServiceContext serviceContext) {

		return getPersistence().update(
			cannabisApplicationPaymentConfirmation, serviceContext);
	}

	/**
	 * Returns the cannabis application payment confirmation where caseId = &#63; or throws a <code>NoSuchCannabisApplicationPaymentConfirmationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching cannabis application payment confirmation
	 * @throws NoSuchCannabisApplicationPaymentConfirmationException if a matching cannabis application payment confirmation could not be found
	 */
	public static CannabisApplicationPaymentConfirmation
			findBygetCannabisPaymentByCaseId(String caseId)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisApplicationPaymentConfirmationException {

		return getPersistence().findBygetCannabisPaymentByCaseId(caseId);
	}

	/**
	 * Returns the cannabis application payment confirmation where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching cannabis application payment confirmation, or <code>null</code> if a matching cannabis application payment confirmation could not be found
	 */
	public static CannabisApplicationPaymentConfirmation
		fetchBygetCannabisPaymentByCaseId(String caseId) {

		return getPersistence().fetchBygetCannabisPaymentByCaseId(caseId);
	}

	/**
	 * Returns the cannabis application payment confirmation where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cannabis application payment confirmation, or <code>null</code> if a matching cannabis application payment confirmation could not be found
	 */
	public static CannabisApplicationPaymentConfirmation
		fetchBygetCannabisPaymentByCaseId(
			String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetCannabisPaymentByCaseId(
			caseId, useFinderCache);
	}

	/**
	 * Removes the cannabis application payment confirmation where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the cannabis application payment confirmation that was removed
	 */
	public static CannabisApplicationPaymentConfirmation
			removeBygetCannabisPaymentByCaseId(String caseId)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisApplicationPaymentConfirmationException {

		return getPersistence().removeBygetCannabisPaymentByCaseId(caseId);
	}

	/**
	 * Returns the number of cannabis application payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching cannabis application payment confirmations
	 */
	public static int countBygetCannabisPaymentByCaseId(String caseId) {
		return getPersistence().countBygetCannabisPaymentByCaseId(caseId);
	}

	/**
	 * Returns all the cannabis application payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching cannabis application payment confirmations
	 */
	public static List<CannabisApplicationPaymentConfirmation>
		findBygetCA_PC_By_CI(String caseId) {

		return getPersistence().findBygetCA_PC_By_CI(caseId);
	}

	/**
	 * Returns a range of all the cannabis application payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of cannabis application payment confirmations
	 * @param end the upper bound of the range of cannabis application payment confirmations (not inclusive)
	 * @return the range of matching cannabis application payment confirmations
	 */
	public static List<CannabisApplicationPaymentConfirmation>
		findBygetCA_PC_By_CI(String caseId, int start, int end) {

		return getPersistence().findBygetCA_PC_By_CI(caseId, start, end);
	}

	/**
	 * Returns an ordered range of all the cannabis application payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of cannabis application payment confirmations
	 * @param end the upper bound of the range of cannabis application payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis application payment confirmations
	 */
	public static List<CannabisApplicationPaymentConfirmation>
		findBygetCA_PC_By_CI(
			String caseId, int start, int end,
			OrderByComparator<CannabisApplicationPaymentConfirmation>
				orderByComparator) {

		return getPersistence().findBygetCA_PC_By_CI(
			caseId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the cannabis application payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of cannabis application payment confirmations
	 * @param end the upper bound of the range of cannabis application payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis application payment confirmations
	 */
	public static List<CannabisApplicationPaymentConfirmation>
		findBygetCA_PC_By_CI(
			String caseId, int start, int end,
			OrderByComparator<CannabisApplicationPaymentConfirmation>
				orderByComparator,
			boolean useFinderCache) {

		return getPersistence().findBygetCA_PC_By_CI(
			caseId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first cannabis application payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application payment confirmation
	 * @throws NoSuchCannabisApplicationPaymentConfirmationException if a matching cannabis application payment confirmation could not be found
	 */
	public static CannabisApplicationPaymentConfirmation
			findBygetCA_PC_By_CI_First(
				String caseId,
				OrderByComparator<CannabisApplicationPaymentConfirmation>
					orderByComparator)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisApplicationPaymentConfirmationException {

		return getPersistence().findBygetCA_PC_By_CI_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the first cannabis application payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application payment confirmation, or <code>null</code> if a matching cannabis application payment confirmation could not be found
	 */
	public static CannabisApplicationPaymentConfirmation
		fetchBygetCA_PC_By_CI_First(
			String caseId,
			OrderByComparator<CannabisApplicationPaymentConfirmation>
				orderByComparator) {

		return getPersistence().fetchBygetCA_PC_By_CI_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last cannabis application payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application payment confirmation
	 * @throws NoSuchCannabisApplicationPaymentConfirmationException if a matching cannabis application payment confirmation could not be found
	 */
	public static CannabisApplicationPaymentConfirmation
			findBygetCA_PC_By_CI_Last(
				String caseId,
				OrderByComparator<CannabisApplicationPaymentConfirmation>
					orderByComparator)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisApplicationPaymentConfirmationException {

		return getPersistence().findBygetCA_PC_By_CI_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last cannabis application payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application payment confirmation, or <code>null</code> if a matching cannabis application payment confirmation could not be found
	 */
	public static CannabisApplicationPaymentConfirmation
		fetchBygetCA_PC_By_CI_Last(
			String caseId,
			OrderByComparator<CannabisApplicationPaymentConfirmation>
				orderByComparator) {

		return getPersistence().fetchBygetCA_PC_By_CI_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the cannabis application payment confirmations before and after the current cannabis application payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param cannabisAppliPaymentConfirId the primary key of the current cannabis application payment confirmation
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis application payment confirmation
	 * @throws NoSuchCannabisApplicationPaymentConfirmationException if a cannabis application payment confirmation with the primary key could not be found
	 */
	public static CannabisApplicationPaymentConfirmation[]
			findBygetCA_PC_By_CI_PrevAndNext(
				long cannabisAppliPaymentConfirId, String caseId,
				OrderByComparator<CannabisApplicationPaymentConfirmation>
					orderByComparator)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisApplicationPaymentConfirmationException {

		return getPersistence().findBygetCA_PC_By_CI_PrevAndNext(
			cannabisAppliPaymentConfirId, caseId, orderByComparator);
	}

	/**
	 * Removes all the cannabis application payment confirmations where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public static void removeBygetCA_PC_By_CI(String caseId) {
		getPersistence().removeBygetCA_PC_By_CI(caseId);
	}

	/**
	 * Returns the number of cannabis application payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching cannabis application payment confirmations
	 */
	public static int countBygetCA_PC_By_CI(String caseId) {
		return getPersistence().countBygetCA_PC_By_CI(caseId);
	}

	/**
	 * Caches the cannabis application payment confirmation in the entity cache if it is enabled.
	 *
	 * @param cannabisApplicationPaymentConfirmation the cannabis application payment confirmation
	 */
	public static void cacheResult(
		CannabisApplicationPaymentConfirmation
			cannabisApplicationPaymentConfirmation) {

		getPersistence().cacheResult(cannabisApplicationPaymentConfirmation);
	}

	/**
	 * Caches the cannabis application payment confirmations in the entity cache if it is enabled.
	 *
	 * @param cannabisApplicationPaymentConfirmations the cannabis application payment confirmations
	 */
	public static void cacheResult(
		List<CannabisApplicationPaymentConfirmation>
			cannabisApplicationPaymentConfirmations) {

		getPersistence().cacheResult(cannabisApplicationPaymentConfirmations);
	}

	/**
	 * Creates a new cannabis application payment confirmation with the primary key. Does not add the cannabis application payment confirmation to the database.
	 *
	 * @param cannabisAppliPaymentConfirId the primary key for the new cannabis application payment confirmation
	 * @return the new cannabis application payment confirmation
	 */
	public static CannabisApplicationPaymentConfirmation create(
		long cannabisAppliPaymentConfirId) {

		return getPersistence().create(cannabisAppliPaymentConfirId);
	}

	/**
	 * Removes the cannabis application payment confirmation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param cannabisAppliPaymentConfirId the primary key of the cannabis application payment confirmation
	 * @return the cannabis application payment confirmation that was removed
	 * @throws NoSuchCannabisApplicationPaymentConfirmationException if a cannabis application payment confirmation with the primary key could not be found
	 */
	public static CannabisApplicationPaymentConfirmation remove(
			long cannabisAppliPaymentConfirId)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisApplicationPaymentConfirmationException {

		return getPersistence().remove(cannabisAppliPaymentConfirId);
	}

	public static CannabisApplicationPaymentConfirmation updateImpl(
		CannabisApplicationPaymentConfirmation
			cannabisApplicationPaymentConfirmation) {

		return getPersistence().updateImpl(
			cannabisApplicationPaymentConfirmation);
	}

	/**
	 * Returns the cannabis application payment confirmation with the primary key or throws a <code>NoSuchCannabisApplicationPaymentConfirmationException</code> if it could not be found.
	 *
	 * @param cannabisAppliPaymentConfirId the primary key of the cannabis application payment confirmation
	 * @return the cannabis application payment confirmation
	 * @throws NoSuchCannabisApplicationPaymentConfirmationException if a cannabis application payment confirmation with the primary key could not be found
	 */
	public static CannabisApplicationPaymentConfirmation findByPrimaryKey(
			long cannabisAppliPaymentConfirId)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisApplicationPaymentConfirmationException {

		return getPersistence().findByPrimaryKey(cannabisAppliPaymentConfirId);
	}

	/**
	 * Returns the cannabis application payment confirmation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param cannabisAppliPaymentConfirId the primary key of the cannabis application payment confirmation
	 * @return the cannabis application payment confirmation, or <code>null</code> if a cannabis application payment confirmation with the primary key could not be found
	 */
	public static CannabisApplicationPaymentConfirmation fetchByPrimaryKey(
		long cannabisAppliPaymentConfirId) {

		return getPersistence().fetchByPrimaryKey(cannabisAppliPaymentConfirId);
	}

	/**
	 * Returns all the cannabis application payment confirmations.
	 *
	 * @return the cannabis application payment confirmations
	 */
	public static List<CannabisApplicationPaymentConfirmation> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the cannabis application payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis application payment confirmations
	 * @param end the upper bound of the range of cannabis application payment confirmations (not inclusive)
	 * @return the range of cannabis application payment confirmations
	 */
	public static List<CannabisApplicationPaymentConfirmation> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the cannabis application payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis application payment confirmations
	 * @param end the upper bound of the range of cannabis application payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of cannabis application payment confirmations
	 */
	public static List<CannabisApplicationPaymentConfirmation> findAll(
		int start, int end,
		OrderByComparator<CannabisApplicationPaymentConfirmation>
			orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the cannabis application payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis application payment confirmations
	 * @param end the upper bound of the range of cannabis application payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of cannabis application payment confirmations
	 */
	public static List<CannabisApplicationPaymentConfirmation> findAll(
		int start, int end,
		OrderByComparator<CannabisApplicationPaymentConfirmation>
			orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the cannabis application payment confirmations from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of cannabis application payment confirmations.
	 *
	 * @return the number of cannabis application payment confirmations
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static CannabisApplicationPaymentConfirmationPersistence
		getPersistence() {

		return _persistence;
	}

	public static void setPersistence(
		CannabisApplicationPaymentConfirmationPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile CannabisApplicationPaymentConfirmationPersistence
		_persistence;

}