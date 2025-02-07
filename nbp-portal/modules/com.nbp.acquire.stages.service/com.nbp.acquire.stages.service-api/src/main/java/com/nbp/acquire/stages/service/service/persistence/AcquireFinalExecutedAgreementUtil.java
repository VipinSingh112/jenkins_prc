/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.stages.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.acquire.stages.service.model.AcquireFinalExecutedAgreement;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the acquire final executed agreement service. This utility wraps <code>com.nbp.acquire.stages.service.service.persistence.impl.AcquireFinalExecutedAgreementPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AcquireFinalExecutedAgreementPersistence
 * @generated
 */
public class AcquireFinalExecutedAgreementUtil {

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
		AcquireFinalExecutedAgreement acquireFinalExecutedAgreement) {

		getPersistence().clearCache(acquireFinalExecutedAgreement);
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
	public static Map<Serializable, AcquireFinalExecutedAgreement>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AcquireFinalExecutedAgreement> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AcquireFinalExecutedAgreement> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AcquireFinalExecutedAgreement> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AcquireFinalExecutedAgreement> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AcquireFinalExecutedAgreement update(
		AcquireFinalExecutedAgreement acquireFinalExecutedAgreement) {

		return getPersistence().update(acquireFinalExecutedAgreement);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AcquireFinalExecutedAgreement update(
		AcquireFinalExecutedAgreement acquireFinalExecutedAgreement,
		ServiceContext serviceContext) {

		return getPersistence().update(
			acquireFinalExecutedAgreement, serviceContext);
	}

	/**
	 * Returns the acquire final executed agreement where caseId = &#63; or throws a <code>NoSuchAcquireFinalExecutedAgreementException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching acquire final executed agreement
	 * @throws NoSuchAcquireFinalExecutedAgreementException if a matching acquire final executed agreement could not be found
	 */
	public static AcquireFinalExecutedAgreement findBygetAcquire_FEA_By_CI(
			String caseId)
		throws com.nbp.acquire.stages.service.exception.
			NoSuchAcquireFinalExecutedAgreementException {

		return getPersistence().findBygetAcquire_FEA_By_CI(caseId);
	}

	/**
	 * Returns the acquire final executed agreement where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching acquire final executed agreement, or <code>null</code> if a matching acquire final executed agreement could not be found
	 */
	public static AcquireFinalExecutedAgreement fetchBygetAcquire_FEA_By_CI(
		String caseId) {

		return getPersistence().fetchBygetAcquire_FEA_By_CI(caseId);
	}

	/**
	 * Returns the acquire final executed agreement where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acquire final executed agreement, or <code>null</code> if a matching acquire final executed agreement could not be found
	 */
	public static AcquireFinalExecutedAgreement fetchBygetAcquire_FEA_By_CI(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetAcquire_FEA_By_CI(
			caseId, useFinderCache);
	}

	/**
	 * Removes the acquire final executed agreement where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the acquire final executed agreement that was removed
	 */
	public static AcquireFinalExecutedAgreement removeBygetAcquire_FEA_By_CI(
			String caseId)
		throws com.nbp.acquire.stages.service.exception.
			NoSuchAcquireFinalExecutedAgreementException {

		return getPersistence().removeBygetAcquire_FEA_By_CI(caseId);
	}

	/**
	 * Returns the number of acquire final executed agreements where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching acquire final executed agreements
	 */
	public static int countBygetAcquire_FEA_By_CI(String caseId) {
		return getPersistence().countBygetAcquire_FEA_By_CI(caseId);
	}

	/**
	 * Caches the acquire final executed agreement in the entity cache if it is enabled.
	 *
	 * @param acquireFinalExecutedAgreement the acquire final executed agreement
	 */
	public static void cacheResult(
		AcquireFinalExecutedAgreement acquireFinalExecutedAgreement) {

		getPersistence().cacheResult(acquireFinalExecutedAgreement);
	}

	/**
	 * Caches the acquire final executed agreements in the entity cache if it is enabled.
	 *
	 * @param acquireFinalExecutedAgreements the acquire final executed agreements
	 */
	public static void cacheResult(
		List<AcquireFinalExecutedAgreement> acquireFinalExecutedAgreements) {

		getPersistence().cacheResult(acquireFinalExecutedAgreements);
	}

	/**
	 * Creates a new acquire final executed agreement with the primary key. Does not add the acquire final executed agreement to the database.
	 *
	 * @param acquirefinalId the primary key for the new acquire final executed agreement
	 * @return the new acquire final executed agreement
	 */
	public static AcquireFinalExecutedAgreement create(long acquirefinalId) {
		return getPersistence().create(acquirefinalId);
	}

	/**
	 * Removes the acquire final executed agreement with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param acquirefinalId the primary key of the acquire final executed agreement
	 * @return the acquire final executed agreement that was removed
	 * @throws NoSuchAcquireFinalExecutedAgreementException if a acquire final executed agreement with the primary key could not be found
	 */
	public static AcquireFinalExecutedAgreement remove(long acquirefinalId)
		throws com.nbp.acquire.stages.service.exception.
			NoSuchAcquireFinalExecutedAgreementException {

		return getPersistence().remove(acquirefinalId);
	}

	public static AcquireFinalExecutedAgreement updateImpl(
		AcquireFinalExecutedAgreement acquireFinalExecutedAgreement) {

		return getPersistence().updateImpl(acquireFinalExecutedAgreement);
	}

	/**
	 * Returns the acquire final executed agreement with the primary key or throws a <code>NoSuchAcquireFinalExecutedAgreementException</code> if it could not be found.
	 *
	 * @param acquirefinalId the primary key of the acquire final executed agreement
	 * @return the acquire final executed agreement
	 * @throws NoSuchAcquireFinalExecutedAgreementException if a acquire final executed agreement with the primary key could not be found
	 */
	public static AcquireFinalExecutedAgreement findByPrimaryKey(
			long acquirefinalId)
		throws com.nbp.acquire.stages.service.exception.
			NoSuchAcquireFinalExecutedAgreementException {

		return getPersistence().findByPrimaryKey(acquirefinalId);
	}

	/**
	 * Returns the acquire final executed agreement with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param acquirefinalId the primary key of the acquire final executed agreement
	 * @return the acquire final executed agreement, or <code>null</code> if a acquire final executed agreement with the primary key could not be found
	 */
	public static AcquireFinalExecutedAgreement fetchByPrimaryKey(
		long acquirefinalId) {

		return getPersistence().fetchByPrimaryKey(acquirefinalId);
	}

	/**
	 * Returns all the acquire final executed agreements.
	 *
	 * @return the acquire final executed agreements
	 */
	public static List<AcquireFinalExecutedAgreement> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the acquire final executed agreements.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireFinalExecutedAgreementModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire final executed agreements
	 * @param end the upper bound of the range of acquire final executed agreements (not inclusive)
	 * @return the range of acquire final executed agreements
	 */
	public static List<AcquireFinalExecutedAgreement> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the acquire final executed agreements.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireFinalExecutedAgreementModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire final executed agreements
	 * @param end the upper bound of the range of acquire final executed agreements (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of acquire final executed agreements
	 */
	public static List<AcquireFinalExecutedAgreement> findAll(
		int start, int end,
		OrderByComparator<AcquireFinalExecutedAgreement> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the acquire final executed agreements.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireFinalExecutedAgreementModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire final executed agreements
	 * @param end the upper bound of the range of acquire final executed agreements (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of acquire final executed agreements
	 */
	public static List<AcquireFinalExecutedAgreement> findAll(
		int start, int end,
		OrderByComparator<AcquireFinalExecutedAgreement> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the acquire final executed agreements from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of acquire final executed agreements.
	 *
	 * @return the number of acquire final executed agreements
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AcquireFinalExecutedAgreementPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		AcquireFinalExecutedAgreementPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile AcquireFinalExecutedAgreementPersistence
		_persistence;

}