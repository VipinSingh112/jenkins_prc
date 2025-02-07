/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.stages.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.acquire.stages.service.model.AcquireDraftAgreement;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the acquire draft agreement service. This utility wraps <code>com.nbp.acquire.stages.service.service.persistence.impl.AcquireDraftAgreementPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AcquireDraftAgreementPersistence
 * @generated
 */
public class AcquireDraftAgreementUtil {

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
	public static void clearCache(AcquireDraftAgreement acquireDraftAgreement) {
		getPersistence().clearCache(acquireDraftAgreement);
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
	public static Map<Serializable, AcquireDraftAgreement> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AcquireDraftAgreement> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AcquireDraftAgreement> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AcquireDraftAgreement> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AcquireDraftAgreement> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AcquireDraftAgreement update(
		AcquireDraftAgreement acquireDraftAgreement) {

		return getPersistence().update(acquireDraftAgreement);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AcquireDraftAgreement update(
		AcquireDraftAgreement acquireDraftAgreement,
		ServiceContext serviceContext) {

		return getPersistence().update(acquireDraftAgreement, serviceContext);
	}

	/**
	 * Returns the acquire draft agreement where caseId = &#63; or throws a <code>NoSuchAcquireDraftAgreementException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching acquire draft agreement
	 * @throws NoSuchAcquireDraftAgreementException if a matching acquire draft agreement could not be found
	 */
	public static AcquireDraftAgreement findBygetAcquire_DA_By_CI(String caseId)
		throws com.nbp.acquire.stages.service.exception.
			NoSuchAcquireDraftAgreementException {

		return getPersistence().findBygetAcquire_DA_By_CI(caseId);
	}

	/**
	 * Returns the acquire draft agreement where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching acquire draft agreement, or <code>null</code> if a matching acquire draft agreement could not be found
	 */
	public static AcquireDraftAgreement fetchBygetAcquire_DA_By_CI(
		String caseId) {

		return getPersistence().fetchBygetAcquire_DA_By_CI(caseId);
	}

	/**
	 * Returns the acquire draft agreement where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acquire draft agreement, or <code>null</code> if a matching acquire draft agreement could not be found
	 */
	public static AcquireDraftAgreement fetchBygetAcquire_DA_By_CI(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetAcquire_DA_By_CI(
			caseId, useFinderCache);
	}

	/**
	 * Removes the acquire draft agreement where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the acquire draft agreement that was removed
	 */
	public static AcquireDraftAgreement removeBygetAcquire_DA_By_CI(
			String caseId)
		throws com.nbp.acquire.stages.service.exception.
			NoSuchAcquireDraftAgreementException {

		return getPersistence().removeBygetAcquire_DA_By_CI(caseId);
	}

	/**
	 * Returns the number of acquire draft agreements where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching acquire draft agreements
	 */
	public static int countBygetAcquire_DA_By_CI(String caseId) {
		return getPersistence().countBygetAcquire_DA_By_CI(caseId);
	}

	/**
	 * Caches the acquire draft agreement in the entity cache if it is enabled.
	 *
	 * @param acquireDraftAgreement the acquire draft agreement
	 */
	public static void cacheResult(
		AcquireDraftAgreement acquireDraftAgreement) {

		getPersistence().cacheResult(acquireDraftAgreement);
	}

	/**
	 * Caches the acquire draft agreements in the entity cache if it is enabled.
	 *
	 * @param acquireDraftAgreements the acquire draft agreements
	 */
	public static void cacheResult(
		List<AcquireDraftAgreement> acquireDraftAgreements) {

		getPersistence().cacheResult(acquireDraftAgreements);
	}

	/**
	 * Creates a new acquire draft agreement with the primary key. Does not add the acquire draft agreement to the database.
	 *
	 * @param acquireDraftId the primary key for the new acquire draft agreement
	 * @return the new acquire draft agreement
	 */
	public static AcquireDraftAgreement create(long acquireDraftId) {
		return getPersistence().create(acquireDraftId);
	}

	/**
	 * Removes the acquire draft agreement with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param acquireDraftId the primary key of the acquire draft agreement
	 * @return the acquire draft agreement that was removed
	 * @throws NoSuchAcquireDraftAgreementException if a acquire draft agreement with the primary key could not be found
	 */
	public static AcquireDraftAgreement remove(long acquireDraftId)
		throws com.nbp.acquire.stages.service.exception.
			NoSuchAcquireDraftAgreementException {

		return getPersistence().remove(acquireDraftId);
	}

	public static AcquireDraftAgreement updateImpl(
		AcquireDraftAgreement acquireDraftAgreement) {

		return getPersistence().updateImpl(acquireDraftAgreement);
	}

	/**
	 * Returns the acquire draft agreement with the primary key or throws a <code>NoSuchAcquireDraftAgreementException</code> if it could not be found.
	 *
	 * @param acquireDraftId the primary key of the acquire draft agreement
	 * @return the acquire draft agreement
	 * @throws NoSuchAcquireDraftAgreementException if a acquire draft agreement with the primary key could not be found
	 */
	public static AcquireDraftAgreement findByPrimaryKey(long acquireDraftId)
		throws com.nbp.acquire.stages.service.exception.
			NoSuchAcquireDraftAgreementException {

		return getPersistence().findByPrimaryKey(acquireDraftId);
	}

	/**
	 * Returns the acquire draft agreement with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param acquireDraftId the primary key of the acquire draft agreement
	 * @return the acquire draft agreement, or <code>null</code> if a acquire draft agreement with the primary key could not be found
	 */
	public static AcquireDraftAgreement fetchByPrimaryKey(long acquireDraftId) {
		return getPersistence().fetchByPrimaryKey(acquireDraftId);
	}

	/**
	 * Returns all the acquire draft agreements.
	 *
	 * @return the acquire draft agreements
	 */
	public static List<AcquireDraftAgreement> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the acquire draft agreements.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireDraftAgreementModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire draft agreements
	 * @param end the upper bound of the range of acquire draft agreements (not inclusive)
	 * @return the range of acquire draft agreements
	 */
	public static List<AcquireDraftAgreement> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the acquire draft agreements.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireDraftAgreementModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire draft agreements
	 * @param end the upper bound of the range of acquire draft agreements (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of acquire draft agreements
	 */
	public static List<AcquireDraftAgreement> findAll(
		int start, int end,
		OrderByComparator<AcquireDraftAgreement> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the acquire draft agreements.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireDraftAgreementModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire draft agreements
	 * @param end the upper bound of the range of acquire draft agreements (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of acquire draft agreements
	 */
	public static List<AcquireDraftAgreement> findAll(
		int start, int end,
		OrderByComparator<AcquireDraftAgreement> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the acquire draft agreements from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of acquire draft agreements.
	 *
	 * @return the number of acquire draft agreements
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AcquireDraftAgreementPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		AcquireDraftAgreementPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile AcquireDraftAgreementPersistence _persistence;

}