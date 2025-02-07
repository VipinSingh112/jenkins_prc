/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.stage.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.sez.status.application.stage.services.model.SezStatusPaymentConfirmation;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the sez status payment confirmation service. This utility wraps <code>com.nbp.sez.status.application.stage.services.service.persistence.impl.SezStatusPaymentConfirmationPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezStatusPaymentConfirmationPersistence
 * @generated
 */
public class SezStatusPaymentConfirmationUtil {

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
		SezStatusPaymentConfirmation sezStatusPaymentConfirmation) {

		getPersistence().clearCache(sezStatusPaymentConfirmation);
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
	public static Map<Serializable, SezStatusPaymentConfirmation>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<SezStatusPaymentConfirmation> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<SezStatusPaymentConfirmation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<SezStatusPaymentConfirmation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<SezStatusPaymentConfirmation> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static SezStatusPaymentConfirmation update(
		SezStatusPaymentConfirmation sezStatusPaymentConfirmation) {

		return getPersistence().update(sezStatusPaymentConfirmation);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static SezStatusPaymentConfirmation update(
		SezStatusPaymentConfirmation sezStatusPaymentConfirmation,
		ServiceContext serviceContext) {

		return getPersistence().update(
			sezStatusPaymentConfirmation, serviceContext);
	}

	/**
	 * Returns the sez status payment confirmation where caseId = &#63; or throws a <code>NoSuchSezStatusPaymentConfirmationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching sez status payment confirmation
	 * @throws NoSuchSezStatusPaymentConfirmationException if a matching sez status payment confirmation could not be found
	 */
	public static SezStatusPaymentConfirmation
			findBygetPaymentConfirmationBy_CI(String caseId)
		throws com.nbp.sez.status.application.stage.services.exception.
			NoSuchSezStatusPaymentConfirmationException {

		return getPersistence().findBygetPaymentConfirmationBy_CI(caseId);
	}

	/**
	 * Returns the sez status payment confirmation where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching sez status payment confirmation, or <code>null</code> if a matching sez status payment confirmation could not be found
	 */
	public static SezStatusPaymentConfirmation
		fetchBygetPaymentConfirmationBy_CI(String caseId) {

		return getPersistence().fetchBygetPaymentConfirmationBy_CI(caseId);
	}

	/**
	 * Returns the sez status payment confirmation where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez status payment confirmation, or <code>null</code> if a matching sez status payment confirmation could not be found
	 */
	public static SezStatusPaymentConfirmation
		fetchBygetPaymentConfirmationBy_CI(
			String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetPaymentConfirmationBy_CI(
			caseId, useFinderCache);
	}

	/**
	 * Removes the sez status payment confirmation where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the sez status payment confirmation that was removed
	 */
	public static SezStatusPaymentConfirmation
			removeBygetPaymentConfirmationBy_CI(String caseId)
		throws com.nbp.sez.status.application.stage.services.exception.
			NoSuchSezStatusPaymentConfirmationException {

		return getPersistence().removeBygetPaymentConfirmationBy_CI(caseId);
	}

	/**
	 * Returns the number of sez status payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching sez status payment confirmations
	 */
	public static int countBygetPaymentConfirmationBy_CI(String caseId) {
		return getPersistence().countBygetPaymentConfirmationBy_CI(caseId);
	}

	/**
	 * Returns all the sez status payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching sez status payment confirmations
	 */
	public static List<SezStatusPaymentConfirmation>
		findBygetPaymentConfirmation_By_CI(String caseId) {

		return getPersistence().findBygetPaymentConfirmation_By_CI(caseId);
	}

	/**
	 * Returns a range of all the sez status payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of sez status payment confirmations
	 * @param end the upper bound of the range of sez status payment confirmations (not inclusive)
	 * @return the range of matching sez status payment confirmations
	 */
	public static List<SezStatusPaymentConfirmation>
		findBygetPaymentConfirmation_By_CI(String caseId, int start, int end) {

		return getPersistence().findBygetPaymentConfirmation_By_CI(
			caseId, start, end);
	}

	/**
	 * Returns an ordered range of all the sez status payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of sez status payment confirmations
	 * @param end the upper bound of the range of sez status payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez status payment confirmations
	 */
	public static List<SezStatusPaymentConfirmation>
		findBygetPaymentConfirmation_By_CI(
			String caseId, int start, int end,
			OrderByComparator<SezStatusPaymentConfirmation> orderByComparator) {

		return getPersistence().findBygetPaymentConfirmation_By_CI(
			caseId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the sez status payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of sez status payment confirmations
	 * @param end the upper bound of the range of sez status payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez status payment confirmations
	 */
	public static List<SezStatusPaymentConfirmation>
		findBygetPaymentConfirmation_By_CI(
			String caseId, int start, int end,
			OrderByComparator<SezStatusPaymentConfirmation> orderByComparator,
			boolean useFinderCache) {

		return getPersistence().findBygetPaymentConfirmation_By_CI(
			caseId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first sez status payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status payment confirmation
	 * @throws NoSuchSezStatusPaymentConfirmationException if a matching sez status payment confirmation could not be found
	 */
	public static SezStatusPaymentConfirmation
			findBygetPaymentConfirmation_By_CI_First(
				String caseId,
				OrderByComparator<SezStatusPaymentConfirmation>
					orderByComparator)
		throws com.nbp.sez.status.application.stage.services.exception.
			NoSuchSezStatusPaymentConfirmationException {

		return getPersistence().findBygetPaymentConfirmation_By_CI_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the first sez status payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status payment confirmation, or <code>null</code> if a matching sez status payment confirmation could not be found
	 */
	public static SezStatusPaymentConfirmation
		fetchBygetPaymentConfirmation_By_CI_First(
			String caseId,
			OrderByComparator<SezStatusPaymentConfirmation> orderByComparator) {

		return getPersistence().fetchBygetPaymentConfirmation_By_CI_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last sez status payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status payment confirmation
	 * @throws NoSuchSezStatusPaymentConfirmationException if a matching sez status payment confirmation could not be found
	 */
	public static SezStatusPaymentConfirmation
			findBygetPaymentConfirmation_By_CI_Last(
				String caseId,
				OrderByComparator<SezStatusPaymentConfirmation>
					orderByComparator)
		throws com.nbp.sez.status.application.stage.services.exception.
			NoSuchSezStatusPaymentConfirmationException {

		return getPersistence().findBygetPaymentConfirmation_By_CI_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last sez status payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status payment confirmation, or <code>null</code> if a matching sez status payment confirmation could not be found
	 */
	public static SezStatusPaymentConfirmation
		fetchBygetPaymentConfirmation_By_CI_Last(
			String caseId,
			OrderByComparator<SezStatusPaymentConfirmation> orderByComparator) {

		return getPersistence().fetchBygetPaymentConfirmation_By_CI_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the sez status payment confirmations before and after the current sez status payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param sezPaymentId the primary key of the current sez status payment confirmation
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez status payment confirmation
	 * @throws NoSuchSezStatusPaymentConfirmationException if a sez status payment confirmation with the primary key could not be found
	 */
	public static SezStatusPaymentConfirmation[]
			findBygetPaymentConfirmation_By_CI_PrevAndNext(
				long sezPaymentId, String caseId,
				OrderByComparator<SezStatusPaymentConfirmation>
					orderByComparator)
		throws com.nbp.sez.status.application.stage.services.exception.
			NoSuchSezStatusPaymentConfirmationException {

		return getPersistence().findBygetPaymentConfirmation_By_CI_PrevAndNext(
			sezPaymentId, caseId, orderByComparator);
	}

	/**
	 * Removes all the sez status payment confirmations where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public static void removeBygetPaymentConfirmation_By_CI(String caseId) {
		getPersistence().removeBygetPaymentConfirmation_By_CI(caseId);
	}

	/**
	 * Returns the number of sez status payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching sez status payment confirmations
	 */
	public static int countBygetPaymentConfirmation_By_CI(String caseId) {
		return getPersistence().countBygetPaymentConfirmation_By_CI(caseId);
	}

	/**
	 * Caches the sez status payment confirmation in the entity cache if it is enabled.
	 *
	 * @param sezStatusPaymentConfirmation the sez status payment confirmation
	 */
	public static void cacheResult(
		SezStatusPaymentConfirmation sezStatusPaymentConfirmation) {

		getPersistence().cacheResult(sezStatusPaymentConfirmation);
	}

	/**
	 * Caches the sez status payment confirmations in the entity cache if it is enabled.
	 *
	 * @param sezStatusPaymentConfirmations the sez status payment confirmations
	 */
	public static void cacheResult(
		List<SezStatusPaymentConfirmation> sezStatusPaymentConfirmations) {

		getPersistence().cacheResult(sezStatusPaymentConfirmations);
	}

	/**
	 * Creates a new sez status payment confirmation with the primary key. Does not add the sez status payment confirmation to the database.
	 *
	 * @param sezPaymentId the primary key for the new sez status payment confirmation
	 * @return the new sez status payment confirmation
	 */
	public static SezStatusPaymentConfirmation create(long sezPaymentId) {
		return getPersistence().create(sezPaymentId);
	}

	/**
	 * Removes the sez status payment confirmation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezPaymentId the primary key of the sez status payment confirmation
	 * @return the sez status payment confirmation that was removed
	 * @throws NoSuchSezStatusPaymentConfirmationException if a sez status payment confirmation with the primary key could not be found
	 */
	public static SezStatusPaymentConfirmation remove(long sezPaymentId)
		throws com.nbp.sez.status.application.stage.services.exception.
			NoSuchSezStatusPaymentConfirmationException {

		return getPersistence().remove(sezPaymentId);
	}

	public static SezStatusPaymentConfirmation updateImpl(
		SezStatusPaymentConfirmation sezStatusPaymentConfirmation) {

		return getPersistence().updateImpl(sezStatusPaymentConfirmation);
	}

	/**
	 * Returns the sez status payment confirmation with the primary key or throws a <code>NoSuchSezStatusPaymentConfirmationException</code> if it could not be found.
	 *
	 * @param sezPaymentId the primary key of the sez status payment confirmation
	 * @return the sez status payment confirmation
	 * @throws NoSuchSezStatusPaymentConfirmationException if a sez status payment confirmation with the primary key could not be found
	 */
	public static SezStatusPaymentConfirmation findByPrimaryKey(
			long sezPaymentId)
		throws com.nbp.sez.status.application.stage.services.exception.
			NoSuchSezStatusPaymentConfirmationException {

		return getPersistence().findByPrimaryKey(sezPaymentId);
	}

	/**
	 * Returns the sez status payment confirmation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezPaymentId the primary key of the sez status payment confirmation
	 * @return the sez status payment confirmation, or <code>null</code> if a sez status payment confirmation with the primary key could not be found
	 */
	public static SezStatusPaymentConfirmation fetchByPrimaryKey(
		long sezPaymentId) {

		return getPersistence().fetchByPrimaryKey(sezPaymentId);
	}

	/**
	 * Returns all the sez status payment confirmations.
	 *
	 * @return the sez status payment confirmations
	 */
	public static List<SezStatusPaymentConfirmation> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the sez status payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status payment confirmations
	 * @param end the upper bound of the range of sez status payment confirmations (not inclusive)
	 * @return the range of sez status payment confirmations
	 */
	public static List<SezStatusPaymentConfirmation> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the sez status payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status payment confirmations
	 * @param end the upper bound of the range of sez status payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez status payment confirmations
	 */
	public static List<SezStatusPaymentConfirmation> findAll(
		int start, int end,
		OrderByComparator<SezStatusPaymentConfirmation> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the sez status payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status payment confirmations
	 * @param end the upper bound of the range of sez status payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez status payment confirmations
	 */
	public static List<SezStatusPaymentConfirmation> findAll(
		int start, int end,
		OrderByComparator<SezStatusPaymentConfirmation> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the sez status payment confirmations from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of sez status payment confirmations.
	 *
	 * @return the number of sez status payment confirmations
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static SezStatusPaymentConfirmationPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		SezStatusPaymentConfirmationPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile SezStatusPaymentConfirmationPersistence
		_persistence;

}