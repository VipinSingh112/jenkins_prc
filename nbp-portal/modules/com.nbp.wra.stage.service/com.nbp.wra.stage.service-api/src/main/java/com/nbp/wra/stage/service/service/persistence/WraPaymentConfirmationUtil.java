/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.stage.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.wra.stage.service.model.WraPaymentConfirmation;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the wra payment confirmation service. This utility wraps <code>com.nbp.wra.stage.service.service.persistence.impl.WraPaymentConfirmationPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see WraPaymentConfirmationPersistence
 * @generated
 */
public class WraPaymentConfirmationUtil {

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
		WraPaymentConfirmation wraPaymentConfirmation) {

		getPersistence().clearCache(wraPaymentConfirmation);
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
	public static Map<Serializable, WraPaymentConfirmation> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<WraPaymentConfirmation> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<WraPaymentConfirmation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<WraPaymentConfirmation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<WraPaymentConfirmation> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static WraPaymentConfirmation update(
		WraPaymentConfirmation wraPaymentConfirmation) {

		return getPersistence().update(wraPaymentConfirmation);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static WraPaymentConfirmation update(
		WraPaymentConfirmation wraPaymentConfirmation,
		ServiceContext serviceContext) {

		return getPersistence().update(wraPaymentConfirmation, serviceContext);
	}

	/**
	 * Returns the wra payment confirmation where caseId = &#63; or throws a <code>NoSuchWraPaymentConfirmationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching wra payment confirmation
	 * @throws NoSuchWraPaymentConfirmationException if a matching wra payment confirmation could not be found
	 */
	public static WraPaymentConfirmation findBygetWraPaymentConfBy_CI(
			String caseId)
		throws com.nbp.wra.stage.service.exception.
			NoSuchWraPaymentConfirmationException {

		return getPersistence().findBygetWraPaymentConfBy_CI(caseId);
	}

	/**
	 * Returns the wra payment confirmation where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching wra payment confirmation, or <code>null</code> if a matching wra payment confirmation could not be found
	 */
	public static WraPaymentConfirmation fetchBygetWraPaymentConfBy_CI(
		String caseId) {

		return getPersistence().fetchBygetWraPaymentConfBy_CI(caseId);
	}

	/**
	 * Returns the wra payment confirmation where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching wra payment confirmation, or <code>null</code> if a matching wra payment confirmation could not be found
	 */
	public static WraPaymentConfirmation fetchBygetWraPaymentConfBy_CI(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetWraPaymentConfBy_CI(
			caseId, useFinderCache);
	}

	/**
	 * Removes the wra payment confirmation where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the wra payment confirmation that was removed
	 */
	public static WraPaymentConfirmation removeBygetWraPaymentConfBy_CI(
			String caseId)
		throws com.nbp.wra.stage.service.exception.
			NoSuchWraPaymentConfirmationException {

		return getPersistence().removeBygetWraPaymentConfBy_CI(caseId);
	}

	/**
	 * Returns the number of wra payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching wra payment confirmations
	 */
	public static int countBygetWraPaymentConfBy_CI(String caseId) {
		return getPersistence().countBygetWraPaymentConfBy_CI(caseId);
	}

	/**
	 * Returns all the wra payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching wra payment confirmations
	 */
	public static List<WraPaymentConfirmation> findBygetWraPayConfBy_CI(
		String caseId) {

		return getPersistence().findBygetWraPayConfBy_CI(caseId);
	}

	/**
	 * Returns a range of all the wra payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of wra payment confirmations
	 * @param end the upper bound of the range of wra payment confirmations (not inclusive)
	 * @return the range of matching wra payment confirmations
	 */
	public static List<WraPaymentConfirmation> findBygetWraPayConfBy_CI(
		String caseId, int start, int end) {

		return getPersistence().findBygetWraPayConfBy_CI(caseId, start, end);
	}

	/**
	 * Returns an ordered range of all the wra payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of wra payment confirmations
	 * @param end the upper bound of the range of wra payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching wra payment confirmations
	 */
	public static List<WraPaymentConfirmation> findBygetWraPayConfBy_CI(
		String caseId, int start, int end,
		OrderByComparator<WraPaymentConfirmation> orderByComparator) {

		return getPersistence().findBygetWraPayConfBy_CI(
			caseId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the wra payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of wra payment confirmations
	 * @param end the upper bound of the range of wra payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching wra payment confirmations
	 */
	public static List<WraPaymentConfirmation> findBygetWraPayConfBy_CI(
		String caseId, int start, int end,
		OrderByComparator<WraPaymentConfirmation> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetWraPayConfBy_CI(
			caseId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first wra payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra payment confirmation
	 * @throws NoSuchWraPaymentConfirmationException if a matching wra payment confirmation could not be found
	 */
	public static WraPaymentConfirmation findBygetWraPayConfBy_CI_First(
			String caseId,
			OrderByComparator<WraPaymentConfirmation> orderByComparator)
		throws com.nbp.wra.stage.service.exception.
			NoSuchWraPaymentConfirmationException {

		return getPersistence().findBygetWraPayConfBy_CI_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the first wra payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra payment confirmation, or <code>null</code> if a matching wra payment confirmation could not be found
	 */
	public static WraPaymentConfirmation fetchBygetWraPayConfBy_CI_First(
		String caseId,
		OrderByComparator<WraPaymentConfirmation> orderByComparator) {

		return getPersistence().fetchBygetWraPayConfBy_CI_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last wra payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra payment confirmation
	 * @throws NoSuchWraPaymentConfirmationException if a matching wra payment confirmation could not be found
	 */
	public static WraPaymentConfirmation findBygetWraPayConfBy_CI_Last(
			String caseId,
			OrderByComparator<WraPaymentConfirmation> orderByComparator)
		throws com.nbp.wra.stage.service.exception.
			NoSuchWraPaymentConfirmationException {

		return getPersistence().findBygetWraPayConfBy_CI_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last wra payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra payment confirmation, or <code>null</code> if a matching wra payment confirmation could not be found
	 */
	public static WraPaymentConfirmation fetchBygetWraPayConfBy_CI_Last(
		String caseId,
		OrderByComparator<WraPaymentConfirmation> orderByComparator) {

		return getPersistence().fetchBygetWraPayConfBy_CI_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the wra payment confirmations before and after the current wra payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param wraPaymentConfirmationId the primary key of the current wra payment confirmation
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next wra payment confirmation
	 * @throws NoSuchWraPaymentConfirmationException if a wra payment confirmation with the primary key could not be found
	 */
	public static WraPaymentConfirmation[] findBygetWraPayConfBy_CI_PrevAndNext(
			long wraPaymentConfirmationId, String caseId,
			OrderByComparator<WraPaymentConfirmation> orderByComparator)
		throws com.nbp.wra.stage.service.exception.
			NoSuchWraPaymentConfirmationException {

		return getPersistence().findBygetWraPayConfBy_CI_PrevAndNext(
			wraPaymentConfirmationId, caseId, orderByComparator);
	}

	/**
	 * Removes all the wra payment confirmations where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public static void removeBygetWraPayConfBy_CI(String caseId) {
		getPersistence().removeBygetWraPayConfBy_CI(caseId);
	}

	/**
	 * Returns the number of wra payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching wra payment confirmations
	 */
	public static int countBygetWraPayConfBy_CI(String caseId) {
		return getPersistence().countBygetWraPayConfBy_CI(caseId);
	}

	/**
	 * Caches the wra payment confirmation in the entity cache if it is enabled.
	 *
	 * @param wraPaymentConfirmation the wra payment confirmation
	 */
	public static void cacheResult(
		WraPaymentConfirmation wraPaymentConfirmation) {

		getPersistence().cacheResult(wraPaymentConfirmation);
	}

	/**
	 * Caches the wra payment confirmations in the entity cache if it is enabled.
	 *
	 * @param wraPaymentConfirmations the wra payment confirmations
	 */
	public static void cacheResult(
		List<WraPaymentConfirmation> wraPaymentConfirmations) {

		getPersistence().cacheResult(wraPaymentConfirmations);
	}

	/**
	 * Creates a new wra payment confirmation with the primary key. Does not add the wra payment confirmation to the database.
	 *
	 * @param wraPaymentConfirmationId the primary key for the new wra payment confirmation
	 * @return the new wra payment confirmation
	 */
	public static WraPaymentConfirmation create(long wraPaymentConfirmationId) {
		return getPersistence().create(wraPaymentConfirmationId);
	}

	/**
	 * Removes the wra payment confirmation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param wraPaymentConfirmationId the primary key of the wra payment confirmation
	 * @return the wra payment confirmation that was removed
	 * @throws NoSuchWraPaymentConfirmationException if a wra payment confirmation with the primary key could not be found
	 */
	public static WraPaymentConfirmation remove(long wraPaymentConfirmationId)
		throws com.nbp.wra.stage.service.exception.
			NoSuchWraPaymentConfirmationException {

		return getPersistence().remove(wraPaymentConfirmationId);
	}

	public static WraPaymentConfirmation updateImpl(
		WraPaymentConfirmation wraPaymentConfirmation) {

		return getPersistence().updateImpl(wraPaymentConfirmation);
	}

	/**
	 * Returns the wra payment confirmation with the primary key or throws a <code>NoSuchWraPaymentConfirmationException</code> if it could not be found.
	 *
	 * @param wraPaymentConfirmationId the primary key of the wra payment confirmation
	 * @return the wra payment confirmation
	 * @throws NoSuchWraPaymentConfirmationException if a wra payment confirmation with the primary key could not be found
	 */
	public static WraPaymentConfirmation findByPrimaryKey(
			long wraPaymentConfirmationId)
		throws com.nbp.wra.stage.service.exception.
			NoSuchWraPaymentConfirmationException {

		return getPersistence().findByPrimaryKey(wraPaymentConfirmationId);
	}

	/**
	 * Returns the wra payment confirmation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param wraPaymentConfirmationId the primary key of the wra payment confirmation
	 * @return the wra payment confirmation, or <code>null</code> if a wra payment confirmation with the primary key could not be found
	 */
	public static WraPaymentConfirmation fetchByPrimaryKey(
		long wraPaymentConfirmationId) {

		return getPersistence().fetchByPrimaryKey(wraPaymentConfirmationId);
	}

	/**
	 * Returns all the wra payment confirmations.
	 *
	 * @return the wra payment confirmations
	 */
	public static List<WraPaymentConfirmation> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the wra payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of wra payment confirmations
	 * @param end the upper bound of the range of wra payment confirmations (not inclusive)
	 * @return the range of wra payment confirmations
	 */
	public static List<WraPaymentConfirmation> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the wra payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of wra payment confirmations
	 * @param end the upper bound of the range of wra payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of wra payment confirmations
	 */
	public static List<WraPaymentConfirmation> findAll(
		int start, int end,
		OrderByComparator<WraPaymentConfirmation> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the wra payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of wra payment confirmations
	 * @param end the upper bound of the range of wra payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of wra payment confirmations
	 */
	public static List<WraPaymentConfirmation> findAll(
		int start, int end,
		OrderByComparator<WraPaymentConfirmation> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the wra payment confirmations from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of wra payment confirmations.
	 *
	 * @return the number of wra payment confirmations
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static WraPaymentConfirmationPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		WraPaymentConfirmationPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile WraPaymentConfirmationPersistence _persistence;

}