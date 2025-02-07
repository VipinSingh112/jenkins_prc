/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.stages.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.pharmaceutical.stages.services.model.PharmaPaymentConfirmation;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the pharma payment confirmation service. This utility wraps <code>com.nbp.pharmaceutical.stages.services.service.persistence.impl.PharmaPaymentConfirmationPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PharmaPaymentConfirmationPersistence
 * @generated
 */
public class PharmaPaymentConfirmationUtil {

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
		PharmaPaymentConfirmation pharmaPaymentConfirmation) {

		getPersistence().clearCache(pharmaPaymentConfirmation);
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
	public static Map<Serializable, PharmaPaymentConfirmation>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<PharmaPaymentConfirmation> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<PharmaPaymentConfirmation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<PharmaPaymentConfirmation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<PharmaPaymentConfirmation> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static PharmaPaymentConfirmation update(
		PharmaPaymentConfirmation pharmaPaymentConfirmation) {

		return getPersistence().update(pharmaPaymentConfirmation);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static PharmaPaymentConfirmation update(
		PharmaPaymentConfirmation pharmaPaymentConfirmation,
		ServiceContext serviceContext) {

		return getPersistence().update(
			pharmaPaymentConfirmation, serviceContext);
	}

	/**
	 * Returns the pharma payment confirmation where caseId = &#63; or throws a <code>NoSuchPharmaPaymentConfirmationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching pharma payment confirmation
	 * @throws NoSuchPharmaPaymentConfirmationException if a matching pharma payment confirmation could not be found
	 */
	public static PharmaPaymentConfirmation findBygetPaymentConfirmationBy_CI(
			String caseId)
		throws com.nbp.pharmaceutical.stages.services.exception.
			NoSuchPharmaPaymentConfirmationException {

		return getPersistence().findBygetPaymentConfirmationBy_CI(caseId);
	}

	/**
	 * Returns the pharma payment confirmation where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching pharma payment confirmation, or <code>null</code> if a matching pharma payment confirmation could not be found
	 */
	public static PharmaPaymentConfirmation fetchBygetPaymentConfirmationBy_CI(
		String caseId) {

		return getPersistence().fetchBygetPaymentConfirmationBy_CI(caseId);
	}

	/**
	 * Returns the pharma payment confirmation where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching pharma payment confirmation, or <code>null</code> if a matching pharma payment confirmation could not be found
	 */
	public static PharmaPaymentConfirmation fetchBygetPaymentConfirmationBy_CI(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetPaymentConfirmationBy_CI(
			caseId, useFinderCache);
	}

	/**
	 * Removes the pharma payment confirmation where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the pharma payment confirmation that was removed
	 */
	public static PharmaPaymentConfirmation removeBygetPaymentConfirmationBy_CI(
			String caseId)
		throws com.nbp.pharmaceutical.stages.services.exception.
			NoSuchPharmaPaymentConfirmationException {

		return getPersistence().removeBygetPaymentConfirmationBy_CI(caseId);
	}

	/**
	 * Returns the number of pharma payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching pharma payment confirmations
	 */
	public static int countBygetPaymentConfirmationBy_CI(String caseId) {
		return getPersistence().countBygetPaymentConfirmationBy_CI(caseId);
	}

	/**
	 * Returns all the pharma payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching pharma payment confirmations
	 */
	public static List<PharmaPaymentConfirmation>
		findBygetPaymentConfirmation_By_CI(String caseId) {

		return getPersistence().findBygetPaymentConfirmation_By_CI(caseId);
	}

	/**
	 * Returns a range of all the pharma payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of pharma payment confirmations
	 * @param end the upper bound of the range of pharma payment confirmations (not inclusive)
	 * @return the range of matching pharma payment confirmations
	 */
	public static List<PharmaPaymentConfirmation>
		findBygetPaymentConfirmation_By_CI(String caseId, int start, int end) {

		return getPersistence().findBygetPaymentConfirmation_By_CI(
			caseId, start, end);
	}

	/**
	 * Returns an ordered range of all the pharma payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of pharma payment confirmations
	 * @param end the upper bound of the range of pharma payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching pharma payment confirmations
	 */
	public static List<PharmaPaymentConfirmation>
		findBygetPaymentConfirmation_By_CI(
			String caseId, int start, int end,
			OrderByComparator<PharmaPaymentConfirmation> orderByComparator) {

		return getPersistence().findBygetPaymentConfirmation_By_CI(
			caseId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the pharma payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of pharma payment confirmations
	 * @param end the upper bound of the range of pharma payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching pharma payment confirmations
	 */
	public static List<PharmaPaymentConfirmation>
		findBygetPaymentConfirmation_By_CI(
			String caseId, int start, int end,
			OrderByComparator<PharmaPaymentConfirmation> orderByComparator,
			boolean useFinderCache) {

		return getPersistence().findBygetPaymentConfirmation_By_CI(
			caseId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first pharma payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pharma payment confirmation
	 * @throws NoSuchPharmaPaymentConfirmationException if a matching pharma payment confirmation could not be found
	 */
	public static PharmaPaymentConfirmation
			findBygetPaymentConfirmation_By_CI_First(
				String caseId,
				OrderByComparator<PharmaPaymentConfirmation> orderByComparator)
		throws com.nbp.pharmaceutical.stages.services.exception.
			NoSuchPharmaPaymentConfirmationException {

		return getPersistence().findBygetPaymentConfirmation_By_CI_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the first pharma payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pharma payment confirmation, or <code>null</code> if a matching pharma payment confirmation could not be found
	 */
	public static PharmaPaymentConfirmation
		fetchBygetPaymentConfirmation_By_CI_First(
			String caseId,
			OrderByComparator<PharmaPaymentConfirmation> orderByComparator) {

		return getPersistence().fetchBygetPaymentConfirmation_By_CI_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last pharma payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pharma payment confirmation
	 * @throws NoSuchPharmaPaymentConfirmationException if a matching pharma payment confirmation could not be found
	 */
	public static PharmaPaymentConfirmation
			findBygetPaymentConfirmation_By_CI_Last(
				String caseId,
				OrderByComparator<PharmaPaymentConfirmation> orderByComparator)
		throws com.nbp.pharmaceutical.stages.services.exception.
			NoSuchPharmaPaymentConfirmationException {

		return getPersistence().findBygetPaymentConfirmation_By_CI_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last pharma payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pharma payment confirmation, or <code>null</code> if a matching pharma payment confirmation could not be found
	 */
	public static PharmaPaymentConfirmation
		fetchBygetPaymentConfirmation_By_CI_Last(
			String caseId,
			OrderByComparator<PharmaPaymentConfirmation> orderByComparator) {

		return getPersistence().fetchBygetPaymentConfirmation_By_CI_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the pharma payment confirmations before and after the current pharma payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param pharmaPaymentId the primary key of the current pharma payment confirmation
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next pharma payment confirmation
	 * @throws NoSuchPharmaPaymentConfirmationException if a pharma payment confirmation with the primary key could not be found
	 */
	public static PharmaPaymentConfirmation[]
			findBygetPaymentConfirmation_By_CI_PrevAndNext(
				long pharmaPaymentId, String caseId,
				OrderByComparator<PharmaPaymentConfirmation> orderByComparator)
		throws com.nbp.pharmaceutical.stages.services.exception.
			NoSuchPharmaPaymentConfirmationException {

		return getPersistence().findBygetPaymentConfirmation_By_CI_PrevAndNext(
			pharmaPaymentId, caseId, orderByComparator);
	}

	/**
	 * Removes all the pharma payment confirmations where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public static void removeBygetPaymentConfirmation_By_CI(String caseId) {
		getPersistence().removeBygetPaymentConfirmation_By_CI(caseId);
	}

	/**
	 * Returns the number of pharma payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching pharma payment confirmations
	 */
	public static int countBygetPaymentConfirmation_By_CI(String caseId) {
		return getPersistence().countBygetPaymentConfirmation_By_CI(caseId);
	}

	/**
	 * Caches the pharma payment confirmation in the entity cache if it is enabled.
	 *
	 * @param pharmaPaymentConfirmation the pharma payment confirmation
	 */
	public static void cacheResult(
		PharmaPaymentConfirmation pharmaPaymentConfirmation) {

		getPersistence().cacheResult(pharmaPaymentConfirmation);
	}

	/**
	 * Caches the pharma payment confirmations in the entity cache if it is enabled.
	 *
	 * @param pharmaPaymentConfirmations the pharma payment confirmations
	 */
	public static void cacheResult(
		List<PharmaPaymentConfirmation> pharmaPaymentConfirmations) {

		getPersistence().cacheResult(pharmaPaymentConfirmations);
	}

	/**
	 * Creates a new pharma payment confirmation with the primary key. Does not add the pharma payment confirmation to the database.
	 *
	 * @param pharmaPaymentId the primary key for the new pharma payment confirmation
	 * @return the new pharma payment confirmation
	 */
	public static PharmaPaymentConfirmation create(long pharmaPaymentId) {
		return getPersistence().create(pharmaPaymentId);
	}

	/**
	 * Removes the pharma payment confirmation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param pharmaPaymentId the primary key of the pharma payment confirmation
	 * @return the pharma payment confirmation that was removed
	 * @throws NoSuchPharmaPaymentConfirmationException if a pharma payment confirmation with the primary key could not be found
	 */
	public static PharmaPaymentConfirmation remove(long pharmaPaymentId)
		throws com.nbp.pharmaceutical.stages.services.exception.
			NoSuchPharmaPaymentConfirmationException {

		return getPersistence().remove(pharmaPaymentId);
	}

	public static PharmaPaymentConfirmation updateImpl(
		PharmaPaymentConfirmation pharmaPaymentConfirmation) {

		return getPersistence().updateImpl(pharmaPaymentConfirmation);
	}

	/**
	 * Returns the pharma payment confirmation with the primary key or throws a <code>NoSuchPharmaPaymentConfirmationException</code> if it could not be found.
	 *
	 * @param pharmaPaymentId the primary key of the pharma payment confirmation
	 * @return the pharma payment confirmation
	 * @throws NoSuchPharmaPaymentConfirmationException if a pharma payment confirmation with the primary key could not be found
	 */
	public static PharmaPaymentConfirmation findByPrimaryKey(
			long pharmaPaymentId)
		throws com.nbp.pharmaceutical.stages.services.exception.
			NoSuchPharmaPaymentConfirmationException {

		return getPersistence().findByPrimaryKey(pharmaPaymentId);
	}

	/**
	 * Returns the pharma payment confirmation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param pharmaPaymentId the primary key of the pharma payment confirmation
	 * @return the pharma payment confirmation, or <code>null</code> if a pharma payment confirmation with the primary key could not be found
	 */
	public static PharmaPaymentConfirmation fetchByPrimaryKey(
		long pharmaPaymentId) {

		return getPersistence().fetchByPrimaryKey(pharmaPaymentId);
	}

	/**
	 * Returns all the pharma payment confirmations.
	 *
	 * @return the pharma payment confirmations
	 */
	public static List<PharmaPaymentConfirmation> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the pharma payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma payment confirmations
	 * @param end the upper bound of the range of pharma payment confirmations (not inclusive)
	 * @return the range of pharma payment confirmations
	 */
	public static List<PharmaPaymentConfirmation> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the pharma payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma payment confirmations
	 * @param end the upper bound of the range of pharma payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of pharma payment confirmations
	 */
	public static List<PharmaPaymentConfirmation> findAll(
		int start, int end,
		OrderByComparator<PharmaPaymentConfirmation> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the pharma payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma payment confirmations
	 * @param end the upper bound of the range of pharma payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of pharma payment confirmations
	 */
	public static List<PharmaPaymentConfirmation> findAll(
		int start, int end,
		OrderByComparator<PharmaPaymentConfirmation> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the pharma payment confirmations from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of pharma payment confirmations.
	 *
	 * @return the number of pharma payment confirmations
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static PharmaPaymentConfirmationPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		PharmaPaymentConfirmationPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile PharmaPaymentConfirmationPersistence _persistence;

}