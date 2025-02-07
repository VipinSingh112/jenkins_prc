/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.stage.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.osi.insolvency.stage.services.model.OsiInsolvencyPaymentConfirmation;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the osi insolvency payment confirmation service. This utility wraps <code>com.nbp.osi.insolvency.stage.services.service.persistence.impl.OsiInsolvencyPaymentConfirmationPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OsiInsolvencyPaymentConfirmationPersistence
 * @generated
 */
public class OsiInsolvencyPaymentConfirmationUtil {

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
		OsiInsolvencyPaymentConfirmation osiInsolvencyPaymentConfirmation) {

		getPersistence().clearCache(osiInsolvencyPaymentConfirmation);
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
	public static Map<Serializable, OsiInsolvencyPaymentConfirmation>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<OsiInsolvencyPaymentConfirmation> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<OsiInsolvencyPaymentConfirmation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<OsiInsolvencyPaymentConfirmation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<OsiInsolvencyPaymentConfirmation> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static OsiInsolvencyPaymentConfirmation update(
		OsiInsolvencyPaymentConfirmation osiInsolvencyPaymentConfirmation) {

		return getPersistence().update(osiInsolvencyPaymentConfirmation);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static OsiInsolvencyPaymentConfirmation update(
		OsiInsolvencyPaymentConfirmation osiInsolvencyPaymentConfirmation,
		ServiceContext serviceContext) {

		return getPersistence().update(
			osiInsolvencyPaymentConfirmation, serviceContext);
	}

	/**
	 * Returns the osi insolvency payment confirmation where caseId = &#63; or throws a <code>NoSuchOsiInsolvencyPaymentConfirmationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching osi insolvency payment confirmation
	 * @throws NoSuchOsiInsolvencyPaymentConfirmationException if a matching osi insolvency payment confirmation could not be found
	 */
	public static OsiInsolvencyPaymentConfirmation
			findBygetOSIIRPaymentConfirmationBy_CI(String caseId)
		throws com.nbp.osi.insolvency.stage.services.exception.
			NoSuchOsiInsolvencyPaymentConfirmationException {

		return getPersistence().findBygetOSIIRPaymentConfirmationBy_CI(caseId);
	}

	/**
	 * Returns the osi insolvency payment confirmation where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching osi insolvency payment confirmation, or <code>null</code> if a matching osi insolvency payment confirmation could not be found
	 */
	public static OsiInsolvencyPaymentConfirmation
		fetchBygetOSIIRPaymentConfirmationBy_CI(String caseId) {

		return getPersistence().fetchBygetOSIIRPaymentConfirmationBy_CI(caseId);
	}

	/**
	 * Returns the osi insolvency payment confirmation where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi insolvency payment confirmation, or <code>null</code> if a matching osi insolvency payment confirmation could not be found
	 */
	public static OsiInsolvencyPaymentConfirmation
		fetchBygetOSIIRPaymentConfirmationBy_CI(
			String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetOSIIRPaymentConfirmationBy_CI(
			caseId, useFinderCache);
	}

	/**
	 * Removes the osi insolvency payment confirmation where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the osi insolvency payment confirmation that was removed
	 */
	public static OsiInsolvencyPaymentConfirmation
			removeBygetOSIIRPaymentConfirmationBy_CI(String caseId)
		throws com.nbp.osi.insolvency.stage.services.exception.
			NoSuchOsiInsolvencyPaymentConfirmationException {

		return getPersistence().removeBygetOSIIRPaymentConfirmationBy_CI(
			caseId);
	}

	/**
	 * Returns the number of osi insolvency payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching osi insolvency payment confirmations
	 */
	public static int countBygetOSIIRPaymentConfirmationBy_CI(String caseId) {
		return getPersistence().countBygetOSIIRPaymentConfirmationBy_CI(caseId);
	}

	/**
	 * Returns all the osi insolvency payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching osi insolvency payment confirmations
	 */
	public static List<OsiInsolvencyPaymentConfirmation>
		findBygetOSIIRPaymentConfirmations_By_CI(String caseId) {

		return getPersistence().findBygetOSIIRPaymentConfirmations_By_CI(
			caseId);
	}

	/**
	 * Returns a range of all the osi insolvency payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of osi insolvency payment confirmations
	 * @param end the upper bound of the range of osi insolvency payment confirmations (not inclusive)
	 * @return the range of matching osi insolvency payment confirmations
	 */
	public static List<OsiInsolvencyPaymentConfirmation>
		findBygetOSIIRPaymentConfirmations_By_CI(
			String caseId, int start, int end) {

		return getPersistence().findBygetOSIIRPaymentConfirmations_By_CI(
			caseId, start, end);
	}

	/**
	 * Returns an ordered range of all the osi insolvency payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of osi insolvency payment confirmations
	 * @param end the upper bound of the range of osi insolvency payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi insolvency payment confirmations
	 */
	public static List<OsiInsolvencyPaymentConfirmation>
		findBygetOSIIRPaymentConfirmations_By_CI(
			String caseId, int start, int end,
			OrderByComparator<OsiInsolvencyPaymentConfirmation>
				orderByComparator) {

		return getPersistence().findBygetOSIIRPaymentConfirmations_By_CI(
			caseId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the osi insolvency payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of osi insolvency payment confirmations
	 * @param end the upper bound of the range of osi insolvency payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi insolvency payment confirmations
	 */
	public static List<OsiInsolvencyPaymentConfirmation>
		findBygetOSIIRPaymentConfirmations_By_CI(
			String caseId, int start, int end,
			OrderByComparator<OsiInsolvencyPaymentConfirmation>
				orderByComparator,
			boolean useFinderCache) {

		return getPersistence().findBygetOSIIRPaymentConfirmations_By_CI(
			caseId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first osi insolvency payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi insolvency payment confirmation
	 * @throws NoSuchOsiInsolvencyPaymentConfirmationException if a matching osi insolvency payment confirmation could not be found
	 */
	public static OsiInsolvencyPaymentConfirmation
			findBygetOSIIRPaymentConfirmations_By_CI_First(
				String caseId,
				OrderByComparator<OsiInsolvencyPaymentConfirmation>
					orderByComparator)
		throws com.nbp.osi.insolvency.stage.services.exception.
			NoSuchOsiInsolvencyPaymentConfirmationException {

		return getPersistence().findBygetOSIIRPaymentConfirmations_By_CI_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the first osi insolvency payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi insolvency payment confirmation, or <code>null</code> if a matching osi insolvency payment confirmation could not be found
	 */
	public static OsiInsolvencyPaymentConfirmation
		fetchBygetOSIIRPaymentConfirmations_By_CI_First(
			String caseId,
			OrderByComparator<OsiInsolvencyPaymentConfirmation>
				orderByComparator) {

		return getPersistence().fetchBygetOSIIRPaymentConfirmations_By_CI_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last osi insolvency payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi insolvency payment confirmation
	 * @throws NoSuchOsiInsolvencyPaymentConfirmationException if a matching osi insolvency payment confirmation could not be found
	 */
	public static OsiInsolvencyPaymentConfirmation
			findBygetOSIIRPaymentConfirmations_By_CI_Last(
				String caseId,
				OrderByComparator<OsiInsolvencyPaymentConfirmation>
					orderByComparator)
		throws com.nbp.osi.insolvency.stage.services.exception.
			NoSuchOsiInsolvencyPaymentConfirmationException {

		return getPersistence().findBygetOSIIRPaymentConfirmations_By_CI_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last osi insolvency payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi insolvency payment confirmation, or <code>null</code> if a matching osi insolvency payment confirmation could not be found
	 */
	public static OsiInsolvencyPaymentConfirmation
		fetchBygetOSIIRPaymentConfirmations_By_CI_Last(
			String caseId,
			OrderByComparator<OsiInsolvencyPaymentConfirmation>
				orderByComparator) {

		return getPersistence().fetchBygetOSIIRPaymentConfirmations_By_CI_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the osi insolvency payment confirmations before and after the current osi insolvency payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param osiIRPaymentId the primary key of the current osi insolvency payment confirmation
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi insolvency payment confirmation
	 * @throws NoSuchOsiInsolvencyPaymentConfirmationException if a osi insolvency payment confirmation with the primary key could not be found
	 */
	public static OsiInsolvencyPaymentConfirmation[]
			findBygetOSIIRPaymentConfirmations_By_CI_PrevAndNext(
				long osiIRPaymentId, String caseId,
				OrderByComparator<OsiInsolvencyPaymentConfirmation>
					orderByComparator)
		throws com.nbp.osi.insolvency.stage.services.exception.
			NoSuchOsiInsolvencyPaymentConfirmationException {

		return getPersistence().
			findBygetOSIIRPaymentConfirmations_By_CI_PrevAndNext(
				osiIRPaymentId, caseId, orderByComparator);
	}

	/**
	 * Removes all the osi insolvency payment confirmations where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public static void removeBygetOSIIRPaymentConfirmations_By_CI(
		String caseId) {

		getPersistence().removeBygetOSIIRPaymentConfirmations_By_CI(caseId);
	}

	/**
	 * Returns the number of osi insolvency payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching osi insolvency payment confirmations
	 */
	public static int countBygetOSIIRPaymentConfirmations_By_CI(String caseId) {
		return getPersistence().countBygetOSIIRPaymentConfirmations_By_CI(
			caseId);
	}

	/**
	 * Caches the osi insolvency payment confirmation in the entity cache if it is enabled.
	 *
	 * @param osiInsolvencyPaymentConfirmation the osi insolvency payment confirmation
	 */
	public static void cacheResult(
		OsiInsolvencyPaymentConfirmation osiInsolvencyPaymentConfirmation) {

		getPersistence().cacheResult(osiInsolvencyPaymentConfirmation);
	}

	/**
	 * Caches the osi insolvency payment confirmations in the entity cache if it is enabled.
	 *
	 * @param osiInsolvencyPaymentConfirmations the osi insolvency payment confirmations
	 */
	public static void cacheResult(
		List<OsiInsolvencyPaymentConfirmation>
			osiInsolvencyPaymentConfirmations) {

		getPersistence().cacheResult(osiInsolvencyPaymentConfirmations);
	}

	/**
	 * Creates a new osi insolvency payment confirmation with the primary key. Does not add the osi insolvency payment confirmation to the database.
	 *
	 * @param osiIRPaymentId the primary key for the new osi insolvency payment confirmation
	 * @return the new osi insolvency payment confirmation
	 */
	public static OsiInsolvencyPaymentConfirmation create(long osiIRPaymentId) {
		return getPersistence().create(osiIRPaymentId);
	}

	/**
	 * Removes the osi insolvency payment confirmation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param osiIRPaymentId the primary key of the osi insolvency payment confirmation
	 * @return the osi insolvency payment confirmation that was removed
	 * @throws NoSuchOsiInsolvencyPaymentConfirmationException if a osi insolvency payment confirmation with the primary key could not be found
	 */
	public static OsiInsolvencyPaymentConfirmation remove(long osiIRPaymentId)
		throws com.nbp.osi.insolvency.stage.services.exception.
			NoSuchOsiInsolvencyPaymentConfirmationException {

		return getPersistence().remove(osiIRPaymentId);
	}

	public static OsiInsolvencyPaymentConfirmation updateImpl(
		OsiInsolvencyPaymentConfirmation osiInsolvencyPaymentConfirmation) {

		return getPersistence().updateImpl(osiInsolvencyPaymentConfirmation);
	}

	/**
	 * Returns the osi insolvency payment confirmation with the primary key or throws a <code>NoSuchOsiInsolvencyPaymentConfirmationException</code> if it could not be found.
	 *
	 * @param osiIRPaymentId the primary key of the osi insolvency payment confirmation
	 * @return the osi insolvency payment confirmation
	 * @throws NoSuchOsiInsolvencyPaymentConfirmationException if a osi insolvency payment confirmation with the primary key could not be found
	 */
	public static OsiInsolvencyPaymentConfirmation findByPrimaryKey(
			long osiIRPaymentId)
		throws com.nbp.osi.insolvency.stage.services.exception.
			NoSuchOsiInsolvencyPaymentConfirmationException {

		return getPersistence().findByPrimaryKey(osiIRPaymentId);
	}

	/**
	 * Returns the osi insolvency payment confirmation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param osiIRPaymentId the primary key of the osi insolvency payment confirmation
	 * @return the osi insolvency payment confirmation, or <code>null</code> if a osi insolvency payment confirmation with the primary key could not be found
	 */
	public static OsiInsolvencyPaymentConfirmation fetchByPrimaryKey(
		long osiIRPaymentId) {

		return getPersistence().fetchByPrimaryKey(osiIRPaymentId);
	}

	/**
	 * Returns all the osi insolvency payment confirmations.
	 *
	 * @return the osi insolvency payment confirmations
	 */
	public static List<OsiInsolvencyPaymentConfirmation> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the osi insolvency payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi insolvency payment confirmations
	 * @param end the upper bound of the range of osi insolvency payment confirmations (not inclusive)
	 * @return the range of osi insolvency payment confirmations
	 */
	public static List<OsiInsolvencyPaymentConfirmation> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the osi insolvency payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi insolvency payment confirmations
	 * @param end the upper bound of the range of osi insolvency payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of osi insolvency payment confirmations
	 */
	public static List<OsiInsolvencyPaymentConfirmation> findAll(
		int start, int end,
		OrderByComparator<OsiInsolvencyPaymentConfirmation> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the osi insolvency payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi insolvency payment confirmations
	 * @param end the upper bound of the range of osi insolvency payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of osi insolvency payment confirmations
	 */
	public static List<OsiInsolvencyPaymentConfirmation> findAll(
		int start, int end,
		OrderByComparator<OsiInsolvencyPaymentConfirmation> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the osi insolvency payment confirmations from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of osi insolvency payment confirmations.
	 *
	 * @return the number of osi insolvency payment confirmations
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static OsiInsolvencyPaymentConfirmationPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		OsiInsolvencyPaymentConfirmationPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile OsiInsolvencyPaymentConfirmationPersistence
		_persistence;

}