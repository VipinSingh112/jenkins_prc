/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.stages.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.acquire.stages.service.model.AcquirePaymentConfirmation;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the acquire payment confirmation service. This utility wraps <code>com.nbp.acquire.stages.service.service.persistence.impl.AcquirePaymentConfirmationPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AcquirePaymentConfirmationPersistence
 * @generated
 */
public class AcquirePaymentConfirmationUtil {

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
		AcquirePaymentConfirmation acquirePaymentConfirmation) {

		getPersistence().clearCache(acquirePaymentConfirmation);
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
	public static Map<Serializable, AcquirePaymentConfirmation>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AcquirePaymentConfirmation> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AcquirePaymentConfirmation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AcquirePaymentConfirmation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AcquirePaymentConfirmation> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AcquirePaymentConfirmation update(
		AcquirePaymentConfirmation acquirePaymentConfirmation) {

		return getPersistence().update(acquirePaymentConfirmation);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AcquirePaymentConfirmation update(
		AcquirePaymentConfirmation acquirePaymentConfirmation,
		ServiceContext serviceContext) {

		return getPersistence().update(
			acquirePaymentConfirmation, serviceContext);
	}

	/**
	 * Returns the acquire payment confirmation where caseId = &#63; or throws a <code>NoSuchAcquirePaymentConfirmationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching acquire payment confirmation
	 * @throws NoSuchAcquirePaymentConfirmationException if a matching acquire payment confirmation could not be found
	 */
	public static AcquirePaymentConfirmation
			findBygetAcquirePaymentConfirmationBy_CI(String caseId)
		throws com.nbp.acquire.stages.service.exception.
			NoSuchAcquirePaymentConfirmationException {

		return getPersistence().findBygetAcquirePaymentConfirmationBy_CI(
			caseId);
	}

	/**
	 * Returns the acquire payment confirmation where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching acquire payment confirmation, or <code>null</code> if a matching acquire payment confirmation could not be found
	 */
	public static AcquirePaymentConfirmation
		fetchBygetAcquirePaymentConfirmationBy_CI(String caseId) {

		return getPersistence().fetchBygetAcquirePaymentConfirmationBy_CI(
			caseId);
	}

	/**
	 * Returns the acquire payment confirmation where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acquire payment confirmation, or <code>null</code> if a matching acquire payment confirmation could not be found
	 */
	public static AcquirePaymentConfirmation
		fetchBygetAcquirePaymentConfirmationBy_CI(
			String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetAcquirePaymentConfirmationBy_CI(
			caseId, useFinderCache);
	}

	/**
	 * Removes the acquire payment confirmation where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the acquire payment confirmation that was removed
	 */
	public static AcquirePaymentConfirmation
			removeBygetAcquirePaymentConfirmationBy_CI(String caseId)
		throws com.nbp.acquire.stages.service.exception.
			NoSuchAcquirePaymentConfirmationException {

		return getPersistence().removeBygetAcquirePaymentConfirmationBy_CI(
			caseId);
	}

	/**
	 * Returns the number of acquire payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching acquire payment confirmations
	 */
	public static int countBygetAcquirePaymentConfirmationBy_CI(String caseId) {
		return getPersistence().countBygetAcquirePaymentConfirmationBy_CI(
			caseId);
	}

	/**
	 * Returns all the acquire payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching acquire payment confirmations
	 */
	public static List<AcquirePaymentConfirmation>
		findBygetAcquirePaymentConfirmations_By_CI(String caseId) {

		return getPersistence().findBygetAcquirePaymentConfirmations_By_CI(
			caseId);
	}

	/**
	 * Returns a range of all the acquire payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquirePaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of acquire payment confirmations
	 * @param end the upper bound of the range of acquire payment confirmations (not inclusive)
	 * @return the range of matching acquire payment confirmations
	 */
	public static List<AcquirePaymentConfirmation>
		findBygetAcquirePaymentConfirmations_By_CI(
			String caseId, int start, int end) {

		return getPersistence().findBygetAcquirePaymentConfirmations_By_CI(
			caseId, start, end);
	}

	/**
	 * Returns an ordered range of all the acquire payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquirePaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of acquire payment confirmations
	 * @param end the upper bound of the range of acquire payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acquire payment confirmations
	 */
	public static List<AcquirePaymentConfirmation>
		findBygetAcquirePaymentConfirmations_By_CI(
			String caseId, int start, int end,
			OrderByComparator<AcquirePaymentConfirmation> orderByComparator) {

		return getPersistence().findBygetAcquirePaymentConfirmations_By_CI(
			caseId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the acquire payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquirePaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of acquire payment confirmations
	 * @param end the upper bound of the range of acquire payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acquire payment confirmations
	 */
	public static List<AcquirePaymentConfirmation>
		findBygetAcquirePaymentConfirmations_By_CI(
			String caseId, int start, int end,
			OrderByComparator<AcquirePaymentConfirmation> orderByComparator,
			boolean useFinderCache) {

		return getPersistence().findBygetAcquirePaymentConfirmations_By_CI(
			caseId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first acquire payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acquire payment confirmation
	 * @throws NoSuchAcquirePaymentConfirmationException if a matching acquire payment confirmation could not be found
	 */
	public static AcquirePaymentConfirmation
			findBygetAcquirePaymentConfirmations_By_CI_First(
				String caseId,
				OrderByComparator<AcquirePaymentConfirmation> orderByComparator)
		throws com.nbp.acquire.stages.service.exception.
			NoSuchAcquirePaymentConfirmationException {

		return getPersistence().
			findBygetAcquirePaymentConfirmations_By_CI_First(
				caseId, orderByComparator);
	}

	/**
	 * Returns the first acquire payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acquire payment confirmation, or <code>null</code> if a matching acquire payment confirmation could not be found
	 */
	public static AcquirePaymentConfirmation
		fetchBygetAcquirePaymentConfirmations_By_CI_First(
			String caseId,
			OrderByComparator<AcquirePaymentConfirmation> orderByComparator) {

		return getPersistence().
			fetchBygetAcquirePaymentConfirmations_By_CI_First(
				caseId, orderByComparator);
	}

	/**
	 * Returns the last acquire payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acquire payment confirmation
	 * @throws NoSuchAcquirePaymentConfirmationException if a matching acquire payment confirmation could not be found
	 */
	public static AcquirePaymentConfirmation
			findBygetAcquirePaymentConfirmations_By_CI_Last(
				String caseId,
				OrderByComparator<AcquirePaymentConfirmation> orderByComparator)
		throws com.nbp.acquire.stages.service.exception.
			NoSuchAcquirePaymentConfirmationException {

		return getPersistence().findBygetAcquirePaymentConfirmations_By_CI_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last acquire payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acquire payment confirmation, or <code>null</code> if a matching acquire payment confirmation could not be found
	 */
	public static AcquirePaymentConfirmation
		fetchBygetAcquirePaymentConfirmations_By_CI_Last(
			String caseId,
			OrderByComparator<AcquirePaymentConfirmation> orderByComparator) {

		return getPersistence().
			fetchBygetAcquirePaymentConfirmations_By_CI_Last(
				caseId, orderByComparator);
	}

	/**
	 * Returns the acquire payment confirmations before and after the current acquire payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param acquirePaymentId the primary key of the current acquire payment confirmation
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acquire payment confirmation
	 * @throws NoSuchAcquirePaymentConfirmationException if a acquire payment confirmation with the primary key could not be found
	 */
	public static AcquirePaymentConfirmation[]
			findBygetAcquirePaymentConfirmations_By_CI_PrevAndNext(
				long acquirePaymentId, String caseId,
				OrderByComparator<AcquirePaymentConfirmation> orderByComparator)
		throws com.nbp.acquire.stages.service.exception.
			NoSuchAcquirePaymentConfirmationException {

		return getPersistence().
			findBygetAcquirePaymentConfirmations_By_CI_PrevAndNext(
				acquirePaymentId, caseId, orderByComparator);
	}

	/**
	 * Removes all the acquire payment confirmations where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public static void removeBygetAcquirePaymentConfirmations_By_CI(
		String caseId) {

		getPersistence().removeBygetAcquirePaymentConfirmations_By_CI(caseId);
	}

	/**
	 * Returns the number of acquire payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching acquire payment confirmations
	 */
	public static int countBygetAcquirePaymentConfirmations_By_CI(
		String caseId) {

		return getPersistence().countBygetAcquirePaymentConfirmations_By_CI(
			caseId);
	}

	/**
	 * Caches the acquire payment confirmation in the entity cache if it is enabled.
	 *
	 * @param acquirePaymentConfirmation the acquire payment confirmation
	 */
	public static void cacheResult(
		AcquirePaymentConfirmation acquirePaymentConfirmation) {

		getPersistence().cacheResult(acquirePaymentConfirmation);
	}

	/**
	 * Caches the acquire payment confirmations in the entity cache if it is enabled.
	 *
	 * @param acquirePaymentConfirmations the acquire payment confirmations
	 */
	public static void cacheResult(
		List<AcquirePaymentConfirmation> acquirePaymentConfirmations) {

		getPersistence().cacheResult(acquirePaymentConfirmations);
	}

	/**
	 * Creates a new acquire payment confirmation with the primary key. Does not add the acquire payment confirmation to the database.
	 *
	 * @param acquirePaymentId the primary key for the new acquire payment confirmation
	 * @return the new acquire payment confirmation
	 */
	public static AcquirePaymentConfirmation create(long acquirePaymentId) {
		return getPersistence().create(acquirePaymentId);
	}

	/**
	 * Removes the acquire payment confirmation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param acquirePaymentId the primary key of the acquire payment confirmation
	 * @return the acquire payment confirmation that was removed
	 * @throws NoSuchAcquirePaymentConfirmationException if a acquire payment confirmation with the primary key could not be found
	 */
	public static AcquirePaymentConfirmation remove(long acquirePaymentId)
		throws com.nbp.acquire.stages.service.exception.
			NoSuchAcquirePaymentConfirmationException {

		return getPersistence().remove(acquirePaymentId);
	}

	public static AcquirePaymentConfirmation updateImpl(
		AcquirePaymentConfirmation acquirePaymentConfirmation) {

		return getPersistence().updateImpl(acquirePaymentConfirmation);
	}

	/**
	 * Returns the acquire payment confirmation with the primary key or throws a <code>NoSuchAcquirePaymentConfirmationException</code> if it could not be found.
	 *
	 * @param acquirePaymentId the primary key of the acquire payment confirmation
	 * @return the acquire payment confirmation
	 * @throws NoSuchAcquirePaymentConfirmationException if a acquire payment confirmation with the primary key could not be found
	 */
	public static AcquirePaymentConfirmation findByPrimaryKey(
			long acquirePaymentId)
		throws com.nbp.acquire.stages.service.exception.
			NoSuchAcquirePaymentConfirmationException {

		return getPersistence().findByPrimaryKey(acquirePaymentId);
	}

	/**
	 * Returns the acquire payment confirmation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param acquirePaymentId the primary key of the acquire payment confirmation
	 * @return the acquire payment confirmation, or <code>null</code> if a acquire payment confirmation with the primary key could not be found
	 */
	public static AcquirePaymentConfirmation fetchByPrimaryKey(
		long acquirePaymentId) {

		return getPersistence().fetchByPrimaryKey(acquirePaymentId);
	}

	/**
	 * Returns all the acquire payment confirmations.
	 *
	 * @return the acquire payment confirmations
	 */
	public static List<AcquirePaymentConfirmation> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the acquire payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquirePaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire payment confirmations
	 * @param end the upper bound of the range of acquire payment confirmations (not inclusive)
	 * @return the range of acquire payment confirmations
	 */
	public static List<AcquirePaymentConfirmation> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the acquire payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquirePaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire payment confirmations
	 * @param end the upper bound of the range of acquire payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of acquire payment confirmations
	 */
	public static List<AcquirePaymentConfirmation> findAll(
		int start, int end,
		OrderByComparator<AcquirePaymentConfirmation> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the acquire payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquirePaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire payment confirmations
	 * @param end the upper bound of the range of acquire payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of acquire payment confirmations
	 */
	public static List<AcquirePaymentConfirmation> findAll(
		int start, int end,
		OrderByComparator<AcquirePaymentConfirmation> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the acquire payment confirmations from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of acquire payment confirmations.
	 *
	 * @return the number of acquire payment confirmations
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AcquirePaymentConfirmationPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		AcquirePaymentConfirmationPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile AcquirePaymentConfirmationPersistence _persistence;

}