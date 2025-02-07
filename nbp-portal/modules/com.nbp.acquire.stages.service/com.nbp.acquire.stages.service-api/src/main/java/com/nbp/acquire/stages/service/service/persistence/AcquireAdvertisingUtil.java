/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.stages.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.acquire.stages.service.model.AcquireAdvertising;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the acquire advertising service. This utility wraps <code>com.nbp.acquire.stages.service.service.persistence.impl.AcquireAdvertisingPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AcquireAdvertisingPersistence
 * @generated
 */
public class AcquireAdvertisingUtil {

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
	public static void clearCache(AcquireAdvertising acquireAdvertising) {
		getPersistence().clearCache(acquireAdvertising);
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
	public static Map<Serializable, AcquireAdvertising> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AcquireAdvertising> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AcquireAdvertising> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AcquireAdvertising> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AcquireAdvertising> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AcquireAdvertising update(
		AcquireAdvertising acquireAdvertising) {

		return getPersistence().update(acquireAdvertising);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AcquireAdvertising update(
		AcquireAdvertising acquireAdvertising, ServiceContext serviceContext) {

		return getPersistence().update(acquireAdvertising, serviceContext);
	}

	/**
	 * Returns the acquire advertising where caseId = &#63; or throws a <code>NoSuchAcquireAdvertisingException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching acquire advertising
	 * @throws NoSuchAcquireAdvertisingException if a matching acquire advertising could not be found
	 */
	public static AcquireAdvertising findBygetAcquireAdvertisingBy_CaseId(
			String caseId)
		throws com.nbp.acquire.stages.service.exception.
			NoSuchAcquireAdvertisingException {

		return getPersistence().findBygetAcquireAdvertisingBy_CaseId(caseId);
	}

	/**
	 * Returns the acquire advertising where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching acquire advertising, or <code>null</code> if a matching acquire advertising could not be found
	 */
	public static AcquireAdvertising fetchBygetAcquireAdvertisingBy_CaseId(
		String caseId) {

		return getPersistence().fetchBygetAcquireAdvertisingBy_CaseId(caseId);
	}

	/**
	 * Returns the acquire advertising where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acquire advertising, or <code>null</code> if a matching acquire advertising could not be found
	 */
	public static AcquireAdvertising fetchBygetAcquireAdvertisingBy_CaseId(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetAcquireAdvertisingBy_CaseId(
			caseId, useFinderCache);
	}

	/**
	 * Removes the acquire advertising where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the acquire advertising that was removed
	 */
	public static AcquireAdvertising removeBygetAcquireAdvertisingBy_CaseId(
			String caseId)
		throws com.nbp.acquire.stages.service.exception.
			NoSuchAcquireAdvertisingException {

		return getPersistence().removeBygetAcquireAdvertisingBy_CaseId(caseId);
	}

	/**
	 * Returns the number of acquire advertisings where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching acquire advertisings
	 */
	public static int countBygetAcquireAdvertisingBy_CaseId(String caseId) {
		return getPersistence().countBygetAcquireAdvertisingBy_CaseId(caseId);
	}

	/**
	 * Caches the acquire advertising in the entity cache if it is enabled.
	 *
	 * @param acquireAdvertising the acquire advertising
	 */
	public static void cacheResult(AcquireAdvertising acquireAdvertising) {
		getPersistence().cacheResult(acquireAdvertising);
	}

	/**
	 * Caches the acquire advertisings in the entity cache if it is enabled.
	 *
	 * @param acquireAdvertisings the acquire advertisings
	 */
	public static void cacheResult(
		List<AcquireAdvertising> acquireAdvertisings) {

		getPersistence().cacheResult(acquireAdvertisings);
	}

	/**
	 * Creates a new acquire advertising with the primary key. Does not add the acquire advertising to the database.
	 *
	 * @param acquireAdvertisingId the primary key for the new acquire advertising
	 * @return the new acquire advertising
	 */
	public static AcquireAdvertising create(long acquireAdvertisingId) {
		return getPersistence().create(acquireAdvertisingId);
	}

	/**
	 * Removes the acquire advertising with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param acquireAdvertisingId the primary key of the acquire advertising
	 * @return the acquire advertising that was removed
	 * @throws NoSuchAcquireAdvertisingException if a acquire advertising with the primary key could not be found
	 */
	public static AcquireAdvertising remove(long acquireAdvertisingId)
		throws com.nbp.acquire.stages.service.exception.
			NoSuchAcquireAdvertisingException {

		return getPersistence().remove(acquireAdvertisingId);
	}

	public static AcquireAdvertising updateImpl(
		AcquireAdvertising acquireAdvertising) {

		return getPersistence().updateImpl(acquireAdvertising);
	}

	/**
	 * Returns the acquire advertising with the primary key or throws a <code>NoSuchAcquireAdvertisingException</code> if it could not be found.
	 *
	 * @param acquireAdvertisingId the primary key of the acquire advertising
	 * @return the acquire advertising
	 * @throws NoSuchAcquireAdvertisingException if a acquire advertising with the primary key could not be found
	 */
	public static AcquireAdvertising findByPrimaryKey(long acquireAdvertisingId)
		throws com.nbp.acquire.stages.service.exception.
			NoSuchAcquireAdvertisingException {

		return getPersistence().findByPrimaryKey(acquireAdvertisingId);
	}

	/**
	 * Returns the acquire advertising with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param acquireAdvertisingId the primary key of the acquire advertising
	 * @return the acquire advertising, or <code>null</code> if a acquire advertising with the primary key could not be found
	 */
	public static AcquireAdvertising fetchByPrimaryKey(
		long acquireAdvertisingId) {

		return getPersistence().fetchByPrimaryKey(acquireAdvertisingId);
	}

	/**
	 * Returns all the acquire advertisings.
	 *
	 * @return the acquire advertisings
	 */
	public static List<AcquireAdvertising> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the acquire advertisings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireAdvertisingModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire advertisings
	 * @param end the upper bound of the range of acquire advertisings (not inclusive)
	 * @return the range of acquire advertisings
	 */
	public static List<AcquireAdvertising> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the acquire advertisings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireAdvertisingModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire advertisings
	 * @param end the upper bound of the range of acquire advertisings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of acquire advertisings
	 */
	public static List<AcquireAdvertising> findAll(
		int start, int end,
		OrderByComparator<AcquireAdvertising> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the acquire advertisings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireAdvertisingModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire advertisings
	 * @param end the upper bound of the range of acquire advertisings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of acquire advertisings
	 */
	public static List<AcquireAdvertising> findAll(
		int start, int end,
		OrderByComparator<AcquireAdvertising> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the acquire advertisings from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of acquire advertisings.
	 *
	 * @return the number of acquire advertisings
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AcquireAdvertisingPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		AcquireAdvertisingPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile AcquireAdvertisingPersistence _persistence;

}