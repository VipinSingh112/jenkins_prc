/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.fire.brigade.stage.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.fire.brigade.stage.service.model.FireBrigadePaymentConfirmation;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the fire brigade payment confirmation service. This utility wraps <code>com.nbp.fire.brigade.stage.service.service.persistence.impl.FireBrigadePaymentConfirmationPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FireBrigadePaymentConfirmationPersistence
 * @generated
 */
public class FireBrigadePaymentConfirmationUtil {

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
		FireBrigadePaymentConfirmation fireBrigadePaymentConfirmation) {

		getPersistence().clearCache(fireBrigadePaymentConfirmation);
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
	public static Map<Serializable, FireBrigadePaymentConfirmation>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<FireBrigadePaymentConfirmation> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<FireBrigadePaymentConfirmation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<FireBrigadePaymentConfirmation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<FireBrigadePaymentConfirmation> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static FireBrigadePaymentConfirmation update(
		FireBrigadePaymentConfirmation fireBrigadePaymentConfirmation) {

		return getPersistence().update(fireBrigadePaymentConfirmation);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static FireBrigadePaymentConfirmation update(
		FireBrigadePaymentConfirmation fireBrigadePaymentConfirmation,
		ServiceContext serviceContext) {

		return getPersistence().update(
			fireBrigadePaymentConfirmation, serviceContext);
	}

	/**
	 * Returns all the fire brigade payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching fire brigade payment confirmations
	 */
	public static List<FireBrigadePaymentConfirmation> findBygetFBA_PC_By_FBI(
		String caseId) {

		return getPersistence().findBygetFBA_PC_By_FBI(caseId);
	}

	/**
	 * Returns a range of all the fire brigade payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadePaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of fire brigade payment confirmations
	 * @param end the upper bound of the range of fire brigade payment confirmations (not inclusive)
	 * @return the range of matching fire brigade payment confirmations
	 */
	public static List<FireBrigadePaymentConfirmation> findBygetFBA_PC_By_FBI(
		String caseId, int start, int end) {

		return getPersistence().findBygetFBA_PC_By_FBI(caseId, start, end);
	}

	/**
	 * Returns an ordered range of all the fire brigade payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadePaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of fire brigade payment confirmations
	 * @param end the upper bound of the range of fire brigade payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching fire brigade payment confirmations
	 */
	public static List<FireBrigadePaymentConfirmation> findBygetFBA_PC_By_FBI(
		String caseId, int start, int end,
		OrderByComparator<FireBrigadePaymentConfirmation> orderByComparator) {

		return getPersistence().findBygetFBA_PC_By_FBI(
			caseId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the fire brigade payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadePaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of fire brigade payment confirmations
	 * @param end the upper bound of the range of fire brigade payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching fire brigade payment confirmations
	 */
	public static List<FireBrigadePaymentConfirmation> findBygetFBA_PC_By_FBI(
		String caseId, int start, int end,
		OrderByComparator<FireBrigadePaymentConfirmation> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetFBA_PC_By_FBI(
			caseId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first fire brigade payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fire brigade payment confirmation
	 * @throws NoSuchFireBrigadePaymentConfirmationException if a matching fire brigade payment confirmation could not be found
	 */
	public static FireBrigadePaymentConfirmation findBygetFBA_PC_By_FBI_First(
			String caseId,
			OrderByComparator<FireBrigadePaymentConfirmation> orderByComparator)
		throws com.nbp.fire.brigade.stage.service.exception.
			NoSuchFireBrigadePaymentConfirmationException {

		return getPersistence().findBygetFBA_PC_By_FBI_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the first fire brigade payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fire brigade payment confirmation, or <code>null</code> if a matching fire brigade payment confirmation could not be found
	 */
	public static FireBrigadePaymentConfirmation fetchBygetFBA_PC_By_FBI_First(
		String caseId,
		OrderByComparator<FireBrigadePaymentConfirmation> orderByComparator) {

		return getPersistence().fetchBygetFBA_PC_By_FBI_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last fire brigade payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fire brigade payment confirmation
	 * @throws NoSuchFireBrigadePaymentConfirmationException if a matching fire brigade payment confirmation could not be found
	 */
	public static FireBrigadePaymentConfirmation findBygetFBA_PC_By_FBI_Last(
			String caseId,
			OrderByComparator<FireBrigadePaymentConfirmation> orderByComparator)
		throws com.nbp.fire.brigade.stage.service.exception.
			NoSuchFireBrigadePaymentConfirmationException {

		return getPersistence().findBygetFBA_PC_By_FBI_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last fire brigade payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fire brigade payment confirmation, or <code>null</code> if a matching fire brigade payment confirmation could not be found
	 */
	public static FireBrigadePaymentConfirmation fetchBygetFBA_PC_By_FBI_Last(
		String caseId,
		OrderByComparator<FireBrigadePaymentConfirmation> orderByComparator) {

		return getPersistence().fetchBygetFBA_PC_By_FBI_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the fire brigade payment confirmations before and after the current fire brigade payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param fireBrigadePaymentConfirId the primary key of the current fire brigade payment confirmation
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next fire brigade payment confirmation
	 * @throws NoSuchFireBrigadePaymentConfirmationException if a fire brigade payment confirmation with the primary key could not be found
	 */
	public static FireBrigadePaymentConfirmation[]
			findBygetFBA_PC_By_FBI_PrevAndNext(
				long fireBrigadePaymentConfirId, String caseId,
				OrderByComparator<FireBrigadePaymentConfirmation>
					orderByComparator)
		throws com.nbp.fire.brigade.stage.service.exception.
			NoSuchFireBrigadePaymentConfirmationException {

		return getPersistence().findBygetFBA_PC_By_FBI_PrevAndNext(
			fireBrigadePaymentConfirId, caseId, orderByComparator);
	}

	/**
	 * Removes all the fire brigade payment confirmations where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public static void removeBygetFBA_PC_By_FBI(String caseId) {
		getPersistence().removeBygetFBA_PC_By_FBI(caseId);
	}

	/**
	 * Returns the number of fire brigade payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching fire brigade payment confirmations
	 */
	public static int countBygetFBA_PC_By_FBI(String caseId) {
		return getPersistence().countBygetFBA_PC_By_FBI(caseId);
	}

	/**
	 * Returns the fire brigade payment confirmation where caseId = &#63; or throws a <code>NoSuchFireBrigadePaymentConfirmationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching fire brigade payment confirmation
	 * @throws NoSuchFireBrigadePaymentConfirmationException if a matching fire brigade payment confirmation could not be found
	 */
	public static FireBrigadePaymentConfirmation
			findBygetFireBrigadePaymentByCaseId(String caseId)
		throws com.nbp.fire.brigade.stage.service.exception.
			NoSuchFireBrigadePaymentConfirmationException {

		return getPersistence().findBygetFireBrigadePaymentByCaseId(caseId);
	}

	/**
	 * Returns the fire brigade payment confirmation where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching fire brigade payment confirmation, or <code>null</code> if a matching fire brigade payment confirmation could not be found
	 */
	public static FireBrigadePaymentConfirmation
		fetchBygetFireBrigadePaymentByCaseId(String caseId) {

		return getPersistence().fetchBygetFireBrigadePaymentByCaseId(caseId);
	}

	/**
	 * Returns the fire brigade payment confirmation where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching fire brigade payment confirmation, or <code>null</code> if a matching fire brigade payment confirmation could not be found
	 */
	public static FireBrigadePaymentConfirmation
		fetchBygetFireBrigadePaymentByCaseId(
			String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetFireBrigadePaymentByCaseId(
			caseId, useFinderCache);
	}

	/**
	 * Removes the fire brigade payment confirmation where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the fire brigade payment confirmation that was removed
	 */
	public static FireBrigadePaymentConfirmation
			removeBygetFireBrigadePaymentByCaseId(String caseId)
		throws com.nbp.fire.brigade.stage.service.exception.
			NoSuchFireBrigadePaymentConfirmationException {

		return getPersistence().removeBygetFireBrigadePaymentByCaseId(caseId);
	}

	/**
	 * Returns the number of fire brigade payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching fire brigade payment confirmations
	 */
	public static int countBygetFireBrigadePaymentByCaseId(String caseId) {
		return getPersistence().countBygetFireBrigadePaymentByCaseId(caseId);
	}

	/**
	 * Caches the fire brigade payment confirmation in the entity cache if it is enabled.
	 *
	 * @param fireBrigadePaymentConfirmation the fire brigade payment confirmation
	 */
	public static void cacheResult(
		FireBrigadePaymentConfirmation fireBrigadePaymentConfirmation) {

		getPersistence().cacheResult(fireBrigadePaymentConfirmation);
	}

	/**
	 * Caches the fire brigade payment confirmations in the entity cache if it is enabled.
	 *
	 * @param fireBrigadePaymentConfirmations the fire brigade payment confirmations
	 */
	public static void cacheResult(
		List<FireBrigadePaymentConfirmation> fireBrigadePaymentConfirmations) {

		getPersistence().cacheResult(fireBrigadePaymentConfirmations);
	}

	/**
	 * Creates a new fire brigade payment confirmation with the primary key. Does not add the fire brigade payment confirmation to the database.
	 *
	 * @param fireBrigadePaymentConfirId the primary key for the new fire brigade payment confirmation
	 * @return the new fire brigade payment confirmation
	 */
	public static FireBrigadePaymentConfirmation create(
		long fireBrigadePaymentConfirId) {

		return getPersistence().create(fireBrigadePaymentConfirId);
	}

	/**
	 * Removes the fire brigade payment confirmation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param fireBrigadePaymentConfirId the primary key of the fire brigade payment confirmation
	 * @return the fire brigade payment confirmation that was removed
	 * @throws NoSuchFireBrigadePaymentConfirmationException if a fire brigade payment confirmation with the primary key could not be found
	 */
	public static FireBrigadePaymentConfirmation remove(
			long fireBrigadePaymentConfirId)
		throws com.nbp.fire.brigade.stage.service.exception.
			NoSuchFireBrigadePaymentConfirmationException {

		return getPersistence().remove(fireBrigadePaymentConfirId);
	}

	public static FireBrigadePaymentConfirmation updateImpl(
		FireBrigadePaymentConfirmation fireBrigadePaymentConfirmation) {

		return getPersistence().updateImpl(fireBrigadePaymentConfirmation);
	}

	/**
	 * Returns the fire brigade payment confirmation with the primary key or throws a <code>NoSuchFireBrigadePaymentConfirmationException</code> if it could not be found.
	 *
	 * @param fireBrigadePaymentConfirId the primary key of the fire brigade payment confirmation
	 * @return the fire brigade payment confirmation
	 * @throws NoSuchFireBrigadePaymentConfirmationException if a fire brigade payment confirmation with the primary key could not be found
	 */
	public static FireBrigadePaymentConfirmation findByPrimaryKey(
			long fireBrigadePaymentConfirId)
		throws com.nbp.fire.brigade.stage.service.exception.
			NoSuchFireBrigadePaymentConfirmationException {

		return getPersistence().findByPrimaryKey(fireBrigadePaymentConfirId);
	}

	/**
	 * Returns the fire brigade payment confirmation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param fireBrigadePaymentConfirId the primary key of the fire brigade payment confirmation
	 * @return the fire brigade payment confirmation, or <code>null</code> if a fire brigade payment confirmation with the primary key could not be found
	 */
	public static FireBrigadePaymentConfirmation fetchByPrimaryKey(
		long fireBrigadePaymentConfirId) {

		return getPersistence().fetchByPrimaryKey(fireBrigadePaymentConfirId);
	}

	/**
	 * Returns all the fire brigade payment confirmations.
	 *
	 * @return the fire brigade payment confirmations
	 */
	public static List<FireBrigadePaymentConfirmation> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the fire brigade payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadePaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade payment confirmations
	 * @param end the upper bound of the range of fire brigade payment confirmations (not inclusive)
	 * @return the range of fire brigade payment confirmations
	 */
	public static List<FireBrigadePaymentConfirmation> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the fire brigade payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadePaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade payment confirmations
	 * @param end the upper bound of the range of fire brigade payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of fire brigade payment confirmations
	 */
	public static List<FireBrigadePaymentConfirmation> findAll(
		int start, int end,
		OrderByComparator<FireBrigadePaymentConfirmation> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the fire brigade payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadePaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade payment confirmations
	 * @param end the upper bound of the range of fire brigade payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of fire brigade payment confirmations
	 */
	public static List<FireBrigadePaymentConfirmation> findAll(
		int start, int end,
		OrderByComparator<FireBrigadePaymentConfirmation> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the fire brigade payment confirmations from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of fire brigade payment confirmations.
	 *
	 * @return the number of fire brigade payment confirmations
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static FireBrigadePaymentConfirmationPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		FireBrigadePaymentConfirmationPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile FireBrigadePaymentConfirmationPersistence
		_persistence;

}