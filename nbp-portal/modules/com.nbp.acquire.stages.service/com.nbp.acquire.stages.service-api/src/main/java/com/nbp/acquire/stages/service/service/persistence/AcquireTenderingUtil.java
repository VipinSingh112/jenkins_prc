/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.stages.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.acquire.stages.service.model.AcquireTendering;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the acquire tendering service. This utility wraps <code>com.nbp.acquire.stages.service.service.persistence.impl.AcquireTenderingPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AcquireTenderingPersistence
 * @generated
 */
public class AcquireTenderingUtil {

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
	public static void clearCache(AcquireTendering acquireTendering) {
		getPersistence().clearCache(acquireTendering);
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
	public static Map<Serializable, AcquireTendering> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AcquireTendering> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AcquireTendering> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AcquireTendering> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AcquireTendering> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AcquireTendering update(AcquireTendering acquireTendering) {
		return getPersistence().update(acquireTendering);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AcquireTendering update(
		AcquireTendering acquireTendering, ServiceContext serviceContext) {

		return getPersistence().update(acquireTendering, serviceContext);
	}

	/**
	 * Returns the acquire tendering where caseId = &#63; or throws a <code>NoSuchAcquireTenderingException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching acquire tendering
	 * @throws NoSuchAcquireTenderingException if a matching acquire tendering could not be found
	 */
	public static AcquireTendering findBygetAcquireTenderingBy_CaseId(
			String caseId)
		throws com.nbp.acquire.stages.service.exception.
			NoSuchAcquireTenderingException {

		return getPersistence().findBygetAcquireTenderingBy_CaseId(caseId);
	}

	/**
	 * Returns the acquire tendering where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching acquire tendering, or <code>null</code> if a matching acquire tendering could not be found
	 */
	public static AcquireTendering fetchBygetAcquireTenderingBy_CaseId(
		String caseId) {

		return getPersistence().fetchBygetAcquireTenderingBy_CaseId(caseId);
	}

	/**
	 * Returns the acquire tendering where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acquire tendering, or <code>null</code> if a matching acquire tendering could not be found
	 */
	public static AcquireTendering fetchBygetAcquireTenderingBy_CaseId(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetAcquireTenderingBy_CaseId(
			caseId, useFinderCache);
	}

	/**
	 * Removes the acquire tendering where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the acquire tendering that was removed
	 */
	public static AcquireTendering removeBygetAcquireTenderingBy_CaseId(
			String caseId)
		throws com.nbp.acquire.stages.service.exception.
			NoSuchAcquireTenderingException {

		return getPersistence().removeBygetAcquireTenderingBy_CaseId(caseId);
	}

	/**
	 * Returns the number of acquire tenderings where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching acquire tenderings
	 */
	public static int countBygetAcquireTenderingBy_CaseId(String caseId) {
		return getPersistence().countBygetAcquireTenderingBy_CaseId(caseId);
	}

	/**
	 * Returns all the acquire tenderings where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching acquire tenderings
	 */
	public static List<AcquireTendering> findBygetAcquireTenderingBy_CI(
		String caseId) {

		return getPersistence().findBygetAcquireTenderingBy_CI(caseId);
	}

	/**
	 * Returns a range of all the acquire tenderings where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireTenderingModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of acquire tenderings
	 * @param end the upper bound of the range of acquire tenderings (not inclusive)
	 * @return the range of matching acquire tenderings
	 */
	public static List<AcquireTendering> findBygetAcquireTenderingBy_CI(
		String caseId, int start, int end) {

		return getPersistence().findBygetAcquireTenderingBy_CI(
			caseId, start, end);
	}

	/**
	 * Returns an ordered range of all the acquire tenderings where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireTenderingModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of acquire tenderings
	 * @param end the upper bound of the range of acquire tenderings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acquire tenderings
	 */
	public static List<AcquireTendering> findBygetAcquireTenderingBy_CI(
		String caseId, int start, int end,
		OrderByComparator<AcquireTendering> orderByComparator) {

		return getPersistence().findBygetAcquireTenderingBy_CI(
			caseId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the acquire tenderings where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireTenderingModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of acquire tenderings
	 * @param end the upper bound of the range of acquire tenderings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acquire tenderings
	 */
	public static List<AcquireTendering> findBygetAcquireTenderingBy_CI(
		String caseId, int start, int end,
		OrderByComparator<AcquireTendering> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetAcquireTenderingBy_CI(
			caseId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first acquire tendering in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acquire tendering
	 * @throws NoSuchAcquireTenderingException if a matching acquire tendering could not be found
	 */
	public static AcquireTendering findBygetAcquireTenderingBy_CI_First(
			String caseId,
			OrderByComparator<AcquireTendering> orderByComparator)
		throws com.nbp.acquire.stages.service.exception.
			NoSuchAcquireTenderingException {

		return getPersistence().findBygetAcquireTenderingBy_CI_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the first acquire tendering in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acquire tendering, or <code>null</code> if a matching acquire tendering could not be found
	 */
	public static AcquireTendering fetchBygetAcquireTenderingBy_CI_First(
		String caseId, OrderByComparator<AcquireTendering> orderByComparator) {

		return getPersistence().fetchBygetAcquireTenderingBy_CI_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last acquire tendering in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acquire tendering
	 * @throws NoSuchAcquireTenderingException if a matching acquire tendering could not be found
	 */
	public static AcquireTendering findBygetAcquireTenderingBy_CI_Last(
			String caseId,
			OrderByComparator<AcquireTendering> orderByComparator)
		throws com.nbp.acquire.stages.service.exception.
			NoSuchAcquireTenderingException {

		return getPersistence().findBygetAcquireTenderingBy_CI_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last acquire tendering in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acquire tendering, or <code>null</code> if a matching acquire tendering could not be found
	 */
	public static AcquireTendering fetchBygetAcquireTenderingBy_CI_Last(
		String caseId, OrderByComparator<AcquireTendering> orderByComparator) {

		return getPersistence().fetchBygetAcquireTenderingBy_CI_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the acquire tenderings before and after the current acquire tendering in the ordered set where caseId = &#63;.
	 *
	 * @param acquireTenderingId the primary key of the current acquire tendering
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acquire tendering
	 * @throws NoSuchAcquireTenderingException if a acquire tendering with the primary key could not be found
	 */
	public static AcquireTendering[] findBygetAcquireTenderingBy_CI_PrevAndNext(
			long acquireTenderingId, String caseId,
			OrderByComparator<AcquireTendering> orderByComparator)
		throws com.nbp.acquire.stages.service.exception.
			NoSuchAcquireTenderingException {

		return getPersistence().findBygetAcquireTenderingBy_CI_PrevAndNext(
			acquireTenderingId, caseId, orderByComparator);
	}

	/**
	 * Removes all the acquire tenderings where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public static void removeBygetAcquireTenderingBy_CI(String caseId) {
		getPersistence().removeBygetAcquireTenderingBy_CI(caseId);
	}

	/**
	 * Returns the number of acquire tenderings where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching acquire tenderings
	 */
	public static int countBygetAcquireTenderingBy_CI(String caseId) {
		return getPersistence().countBygetAcquireTenderingBy_CI(caseId);
	}

	/**
	 * Caches the acquire tendering in the entity cache if it is enabled.
	 *
	 * @param acquireTendering the acquire tendering
	 */
	public static void cacheResult(AcquireTendering acquireTendering) {
		getPersistence().cacheResult(acquireTendering);
	}

	/**
	 * Caches the acquire tenderings in the entity cache if it is enabled.
	 *
	 * @param acquireTenderings the acquire tenderings
	 */
	public static void cacheResult(List<AcquireTendering> acquireTenderings) {
		getPersistence().cacheResult(acquireTenderings);
	}

	/**
	 * Creates a new acquire tendering with the primary key. Does not add the acquire tendering to the database.
	 *
	 * @param acquireTenderingId the primary key for the new acquire tendering
	 * @return the new acquire tendering
	 */
	public static AcquireTendering create(long acquireTenderingId) {
		return getPersistence().create(acquireTenderingId);
	}

	/**
	 * Removes the acquire tendering with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param acquireTenderingId the primary key of the acquire tendering
	 * @return the acquire tendering that was removed
	 * @throws NoSuchAcquireTenderingException if a acquire tendering with the primary key could not be found
	 */
	public static AcquireTendering remove(long acquireTenderingId)
		throws com.nbp.acquire.stages.service.exception.
			NoSuchAcquireTenderingException {

		return getPersistence().remove(acquireTenderingId);
	}

	public static AcquireTendering updateImpl(
		AcquireTendering acquireTendering) {

		return getPersistence().updateImpl(acquireTendering);
	}

	/**
	 * Returns the acquire tendering with the primary key or throws a <code>NoSuchAcquireTenderingException</code> if it could not be found.
	 *
	 * @param acquireTenderingId the primary key of the acquire tendering
	 * @return the acquire tendering
	 * @throws NoSuchAcquireTenderingException if a acquire tendering with the primary key could not be found
	 */
	public static AcquireTendering findByPrimaryKey(long acquireTenderingId)
		throws com.nbp.acquire.stages.service.exception.
			NoSuchAcquireTenderingException {

		return getPersistence().findByPrimaryKey(acquireTenderingId);
	}

	/**
	 * Returns the acquire tendering with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param acquireTenderingId the primary key of the acquire tendering
	 * @return the acquire tendering, or <code>null</code> if a acquire tendering with the primary key could not be found
	 */
	public static AcquireTendering fetchByPrimaryKey(long acquireTenderingId) {
		return getPersistence().fetchByPrimaryKey(acquireTenderingId);
	}

	/**
	 * Returns all the acquire tenderings.
	 *
	 * @return the acquire tenderings
	 */
	public static List<AcquireTendering> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the acquire tenderings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireTenderingModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire tenderings
	 * @param end the upper bound of the range of acquire tenderings (not inclusive)
	 * @return the range of acquire tenderings
	 */
	public static List<AcquireTendering> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the acquire tenderings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireTenderingModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire tenderings
	 * @param end the upper bound of the range of acquire tenderings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of acquire tenderings
	 */
	public static List<AcquireTendering> findAll(
		int start, int end,
		OrderByComparator<AcquireTendering> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the acquire tenderings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireTenderingModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire tenderings
	 * @param end the upper bound of the range of acquire tenderings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of acquire tenderings
	 */
	public static List<AcquireTendering> findAll(
		int start, int end,
		OrderByComparator<AcquireTendering> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the acquire tenderings from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of acquire tenderings.
	 *
	 * @return the number of acquire tenderings
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AcquireTenderingPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(AcquireTenderingPersistence persistence) {
		_persistence = persistence;
	}

	private static volatile AcquireTenderingPersistence _persistence;

}