/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.stages.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.acquire.stages.service.model.AcquireValuation;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the acquire valuation service. This utility wraps <code>com.nbp.acquire.stages.service.service.persistence.impl.AcquireValuationPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AcquireValuationPersistence
 * @generated
 */
public class AcquireValuationUtil {

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
	public static void clearCache(AcquireValuation acquireValuation) {
		getPersistence().clearCache(acquireValuation);
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
	public static Map<Serializable, AcquireValuation> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AcquireValuation> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AcquireValuation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AcquireValuation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AcquireValuation> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AcquireValuation update(AcquireValuation acquireValuation) {
		return getPersistence().update(acquireValuation);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AcquireValuation update(
		AcquireValuation acquireValuation, ServiceContext serviceContext) {

		return getPersistence().update(acquireValuation, serviceContext);
	}

	/**
	 * Returns the acquire valuation where caseId = &#63; or throws a <code>NoSuchAcquireValuationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching acquire valuation
	 * @throws NoSuchAcquireValuationException if a matching acquire valuation could not be found
	 */
	public static AcquireValuation findBygetAcquireValuationBy_CaseId(
			String caseId)
		throws com.nbp.acquire.stages.service.exception.
			NoSuchAcquireValuationException {

		return getPersistence().findBygetAcquireValuationBy_CaseId(caseId);
	}

	/**
	 * Returns the acquire valuation where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching acquire valuation, or <code>null</code> if a matching acquire valuation could not be found
	 */
	public static AcquireValuation fetchBygetAcquireValuationBy_CaseId(
		String caseId) {

		return getPersistence().fetchBygetAcquireValuationBy_CaseId(caseId);
	}

	/**
	 * Returns the acquire valuation where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acquire valuation, or <code>null</code> if a matching acquire valuation could not be found
	 */
	public static AcquireValuation fetchBygetAcquireValuationBy_CaseId(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetAcquireValuationBy_CaseId(
			caseId, useFinderCache);
	}

	/**
	 * Removes the acquire valuation where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the acquire valuation that was removed
	 */
	public static AcquireValuation removeBygetAcquireValuationBy_CaseId(
			String caseId)
		throws com.nbp.acquire.stages.service.exception.
			NoSuchAcquireValuationException {

		return getPersistence().removeBygetAcquireValuationBy_CaseId(caseId);
	}

	/**
	 * Returns the number of acquire valuations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching acquire valuations
	 */
	public static int countBygetAcquireValuationBy_CaseId(String caseId) {
		return getPersistence().countBygetAcquireValuationBy_CaseId(caseId);
	}

	/**
	 * Caches the acquire valuation in the entity cache if it is enabled.
	 *
	 * @param acquireValuation the acquire valuation
	 */
	public static void cacheResult(AcquireValuation acquireValuation) {
		getPersistence().cacheResult(acquireValuation);
	}

	/**
	 * Caches the acquire valuations in the entity cache if it is enabled.
	 *
	 * @param acquireValuations the acquire valuations
	 */
	public static void cacheResult(List<AcquireValuation> acquireValuations) {
		getPersistence().cacheResult(acquireValuations);
	}

	/**
	 * Creates a new acquire valuation with the primary key. Does not add the acquire valuation to the database.
	 *
	 * @param acquireValuationId the primary key for the new acquire valuation
	 * @return the new acquire valuation
	 */
	public static AcquireValuation create(long acquireValuationId) {
		return getPersistence().create(acquireValuationId);
	}

	/**
	 * Removes the acquire valuation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param acquireValuationId the primary key of the acquire valuation
	 * @return the acquire valuation that was removed
	 * @throws NoSuchAcquireValuationException if a acquire valuation with the primary key could not be found
	 */
	public static AcquireValuation remove(long acquireValuationId)
		throws com.nbp.acquire.stages.service.exception.
			NoSuchAcquireValuationException {

		return getPersistence().remove(acquireValuationId);
	}

	public static AcquireValuation updateImpl(
		AcquireValuation acquireValuation) {

		return getPersistence().updateImpl(acquireValuation);
	}

	/**
	 * Returns the acquire valuation with the primary key or throws a <code>NoSuchAcquireValuationException</code> if it could not be found.
	 *
	 * @param acquireValuationId the primary key of the acquire valuation
	 * @return the acquire valuation
	 * @throws NoSuchAcquireValuationException if a acquire valuation with the primary key could not be found
	 */
	public static AcquireValuation findByPrimaryKey(long acquireValuationId)
		throws com.nbp.acquire.stages.service.exception.
			NoSuchAcquireValuationException {

		return getPersistence().findByPrimaryKey(acquireValuationId);
	}

	/**
	 * Returns the acquire valuation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param acquireValuationId the primary key of the acquire valuation
	 * @return the acquire valuation, or <code>null</code> if a acquire valuation with the primary key could not be found
	 */
	public static AcquireValuation fetchByPrimaryKey(long acquireValuationId) {
		return getPersistence().fetchByPrimaryKey(acquireValuationId);
	}

	/**
	 * Returns all the acquire valuations.
	 *
	 * @return the acquire valuations
	 */
	public static List<AcquireValuation> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the acquire valuations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireValuationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire valuations
	 * @param end the upper bound of the range of acquire valuations (not inclusive)
	 * @return the range of acquire valuations
	 */
	public static List<AcquireValuation> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the acquire valuations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireValuationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire valuations
	 * @param end the upper bound of the range of acquire valuations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of acquire valuations
	 */
	public static List<AcquireValuation> findAll(
		int start, int end,
		OrderByComparator<AcquireValuation> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the acquire valuations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireValuationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire valuations
	 * @param end the upper bound of the range of acquire valuations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of acquire valuations
	 */
	public static List<AcquireValuation> findAll(
		int start, int end,
		OrderByComparator<AcquireValuation> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the acquire valuations from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of acquire valuations.
	 *
	 * @return the number of acquire valuations
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AcquireValuationPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(AcquireValuationPersistence persistence) {
		_persistence = persistence;
	}

	private static volatile AcquireValuationPersistence _persistence;

}